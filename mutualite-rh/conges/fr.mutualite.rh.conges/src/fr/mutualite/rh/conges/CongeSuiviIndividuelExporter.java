package fr.mutualite.rh.conges;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;
//import org.apache.poi.xssf.usermodel.XSSFPalette;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.poi.xssf.util.XSSFColor;

import fr.mutualite.rh.model.Etablissement;
import fr.mutualite.rh.webapp.CdoServlet;

public class CongeSuiviIndividuelExporter {

	// public XSSFColor setColor(XSSFWorkbook workbook, byte r,byte g, byte b){
	// XSSFPalette palette = workbook.getCustomPalette();
	// XSSFColor XSSFColor = null;
	// XSSFColor= palette.findColor(r, g, b);
	// if (XSSFColor == null ){
	// palette.setColorAtIndex(XSSFColor.LAVENDER.index, r, g,b);
	// XSSFColor = palette.getColor(XSSFColor.LAVENDER.index);
	// }
	//
	// return XSSFColor;
	// }

	private String numEtablissement(Float mat) {
		return ("" + mat).replaceFirst("\\.0+$", "");
	}

	private String nomEtablissement(Float mat) {
		String label = CdoServlet.getMutualite().getEtablissements().getEtablissements().stream().filter(etab -> etab.getId() == mat.intValue()).map(Etablissement::getNom)
				.findAny().orElse("");
		return label;
	}

	public void export(List<Employe> employes, int exercice, File dir, Predicate<? super Employe> empFilter) throws IOException {
		Stream<Employe> emps = employes.stream();
		if (null != empFilter) {
			emps = emps.filter(empFilter);
		}

		Map<Float, Set<Employe>> byEtablissement = emps.collect(Collectors.toMap(Employe::getEtablissement, e -> new HashSet(Arrays.asList(e)), (l1, l2) -> {
			l1.addAll(l2);
			return l1;
		}));

		byEtablissement.keySet().stream().sorted().forEach(etablissement -> {
			Set<Employe> salaries = byEtablissement.get(etablissement);

			String labelEtablissement = nomEtablissement(etablissement);

			XSSFWorkbook wb = new XSSFWorkbook();
			CellStyle dateStyle = wb.createCellStyle();
			CreationHelper createHelper = wb.getCreationHelper();
			dateStyle.setDataFormat(createHelper.createDataFormat().getFormat("d mmm yyyy"));

			XSSFFont titleFont = wb.createFont();
			titleFont.setBold(true);
			titleFont.setFontHeight(24);

			CellStyle titreStyle = wb.createCellStyle();
			// anneePairStyle.setFillBackgroundColor(IndexedColors.BLUE.index);
			// XSSFColor lightGray = setColor(wb,(byte) 0x12, (byte)0xE0,(byte) 0x50);
			// anneePairStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.index);
			// anneePairStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
			// titreStyle.setAlignment(HorizontalAlignment.CENTER);
			titreStyle.setFont(titleFont);

			XSSFFont legendFont = wb.createFont();
			legendFont.setItalic(true);

			CellStyle legendStyle = wb.createCellStyle();
			// anneePairStyle.setFillBackgroundColor(IndexedColors.BLUE.index);
			// XSSFColor lightGray = setColor(wb,(byte) 0x12, (byte)0xE0,(byte) 0x50);
			// anneePairStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.index);
			// anneePairStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
			legendStyle.setAlignment(HorizontalAlignment.RIGHT);
			legendStyle.setFont(legendFont);

			XSSFFont bold = wb.createFont();
			bold.setBold(true);

			XSSFFont boldWhite = wb.createFont();
			boldWhite.setBold(true);
			boldWhite.setColor(IndexedColors.WHITE.index);

			CellStyle tableHeaderStyle = wb.createCellStyle();
			tableHeaderStyle.setFillBackgroundColor(IndexedColors.LIGHT_YELLOW.index);
			// XSSFColor lightGray = setColor(wb,(byte) 0x12, (byte)0xE0,(byte) 0x50);
			tableHeaderStyle.setFillForegroundColor(IndexedColors.GREY_80_PERCENT.index);
			tableHeaderStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
			tableHeaderStyle.setAlignment(HorizontalAlignment.LEFT);
			tableHeaderStyle.setFont(boldWhite);

			CellStyle semainePairStyle = wb.createCellStyle();
			// semainePairStyle.setFillBackgroundColor(IndexedColors.LIGHT_YELLOW.index);
			// XSSFColor lightGray = setColor(wb,(byte) 0x12, (byte)0xE0,(byte) 0x50);
			// semainePairStyle.setFillForegroundColor(IndexedColors.LIGHT_CORNFLOWER_BLUE.index);
			// semainePairStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
			semainePairStyle.setAlignment(HorizontalAlignment.CENTER);
			semainePairStyle.setFont(bold);

			CellStyle moisImpairStyle = wb.createCellStyle();
			moisImpairStyle.setFillBackgroundColor(IndexedColors.LIGHT_YELLOW.index);
			// XSSFColor lightGray = setColor(wb,(byte) 0x12, (byte)0xE0,(byte) 0x50);
			moisImpairStyle.setFillForegroundColor(IndexedColors.GREY_50_PERCENT.index);
			moisImpairStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
			moisImpairStyle.setAlignment(HorizontalAlignment.CENTER);
			moisImpairStyle.setFont(bold);

			CellStyle tableTitleStyle = wb.createCellStyle();
			// moisPairStyle.setFillBackgroundColor(IndexedColors.LIGHT_YELLOW.index);
			// XSSFColor lightGray = setColor(wb,(byte) 0x12, (byte)0xE0,(byte) 0x50);
			// moisPairStyle.setFillForegroundColor(IndexedColors.GREY_80_PERCENT.index);
			// moisPairStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
			tableTitleStyle.setAlignment(HorizontalAlignment.LEFT);
			tableTitleStyle.setFont(bold);

			CellStyle anneeImpairStyle = wb.createCellStyle();
			anneeImpairStyle.setFillBackgroundColor(IndexedColors.BLUE.index);
			// XSSFColor lightGray = setColor(wb,(byte) 0x12, (byte)0xE0,(byte) 0x50);
			anneeImpairStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.index);
			anneeImpairStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
			anneeImpairStyle.setAlignment(HorizontalAlignment.CENTER);
			anneeImpairStyle.setFont(bold);
			;

			CellStyle anneePairStyle = wb.createCellStyle();
			// anneePairStyle.setFillBackgroundColor(IndexedColors.BLUE.index);
			// XSSFColor lightGray = setColor(wb,(byte) 0x12, (byte)0xE0,(byte) 0x50);
			// anneePairStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.index);
			// anneePairStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
			anneePairStyle.setAlignment(HorizontalAlignment.CENTER);
			anneePairStyle.setFont(bold);
			;

			// XSSFCellStyle weekStartStyle=wb.createCellStyle();
			// weekStartStyle.setBorderBottom(BorderStyle.THICK);
			// weekStartStyle.setBorderTop(BorderStyle.THICK);
			// weekStartStyle.setBorderRight(BorderStyle.THIN);
			// weekStartStyle.setBorderLeft(BorderStyle.THICK);
			//
			// XSSFCellStyle weekMiddleStyle=wb.createCellStyle();
			// weekMiddleStyle.setBorderBottom(BorderStyle.THICK);
			// weekMiddleStyle.setBorderTop(BorderStyle.THICK);
			// weekMiddleStyle.setBorderRight(BorderStyle.THIN);
			// weekMiddleStyle.setBorderLeft(BorderStyle.THIN);

			// XSSFCellStyle weekEndStyle=wb.createCellStyle();
			// weekEndStyle.setBorderBottom(BorderStyle.THICK);
			// weekEndStyle.setBorderTop(BorderStyle.THICK);
			// weekEndStyle.setBorderRight(BorderStyle.THICK);
			// weekEndStyle.setBorderLeft(BorderStyle.THIN);

			/*
			 * { XSSFRow row = sheet.createRow(sheet.getLastRowNum() + 1); int i = -1; // row.createCell(++i).setCellValue("Matricule"); row.createCell(++i).setCellValue("Nom"); //
			 * row.createCell(++i).setCellValue("Prénom"); Calendar cal = Calendar.getInstance(); cal.setTime(debut); if (!debut.before(fin)) { throw new
			 * IllegalArgumentException("La date de début doit être antérieure à la date de fin!!"); }
			 * 
			 * cal.add(Calendar.DAY_OF_YEAR, -1); Calendar calBefore = Calendar.getInstance(); calBefore.setTime(cal.getTime()); while (cal.getTime().before(fin)) {
			 * cal.add(Calendar.DAY_OF_YEAR, 1); if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) { continue; } // System.out.println(df.format(cal.getTime())); XSSFCell cell
			 * = row.createCell(++i); // cell.setCellValue(cal.getTime()); cell.setCellStyle(dateStyle); // if(calBefore.get(Calendar.WEEK_OF_YEAR)!=cal.get(Calendar.WEEK_OF_YEAR))
			 * { // cell.setCellStyle(weekStartStyle); // } else { // cell.setCellStyle(weekMiddleStyle); // } calBefore.setTime(cal.getTime()); } }
			 */

			salaries.stream().sorted((e1, e2) -> e1.getNom().compareTo(e2.getNom())).forEachOrdered(e -> {

				XSSFSheet sheet = wb.createSheet();

				wb.setSheetName(wb.getSheetIndex(sheet), e.getNom());

				{
					XSSFRow row = sheet.createRow(sheet.getLastRowNum());
					row.setHeight((short) 500);
					XSSFCell titleCell = row.createCell(0);
					titleCell.setCellStyle(titreStyle);
					titleCell.setCellValue("Congés " + exercice + "/" + (exercice+1) + " - " + e.getNom());
 
					sheet.addMergedRegion(new CellRangeAddress(row.getRowNum(), row.getRowNum(), 0, 7));
				}

				{
					int line = sheet.getLastRowNum() + 2;
					TypeConge[] types = TypeConge.values();
					for (int i = 0; i < types.length; i++) {
						if(i%2==0) {
							line = sheet.getLastRowNum() + 2;
						}
						int row = 0 + (i%2)*4;
						generateTable(exercice, dateStyle, tableHeaderStyle, tableTitleStyle, e, sheet, line, row, types[i]);						
					}

				}

				// TODO cloner weekStartStyle et weekEndStyle et leur appliquer une couleur choisie pour ce salarié, pour remplacer conges style!

				System.out.println(" " + labelEtablissement + " " + e.getNom() + " " + sheet.getLastRowNum());

//				XSSFRow row = sheet.createRow(sheet.getLastRowNum() + 1);
//				int i = -1;
//				// Cell cellMat = row.createCell(++i);
//				// cellMat.setCellValue(e.getMatricule());
//				// cellMat.setCellStyle(getCellStyle(wb, true, false, row.getRowNum()));
//				Cell cellNom = row.createCell(++i);
//				cellNom.setCellValue(e.getNom());
//				cellNom.setCellStyle(getCellStyle(wb, true, false, false, row.getRowNum()));
//				// row.createCell(++i).setCellValue(e.getPrenom());

				for(int i=0;i<sheet.getLastRowNum();++i) {
					sheet.autoSizeColumn(i);
				}
//				sheet.autoSizeColumn(1);
				// sheet.autoSizeColumn(2);

				// sheet.setColumnWidth(1, -10);
				// sheet.setColumnWidth(2, 0);
				// sheet.setColumnWidth(3, 100);

			});

			try {
				wb.write(new FileOutputStream(new File(dir,
						"suivi-conges-" + labelEtablissement.trim().toLowerCase().replaceAll("[\\s\\(]+", "-").replaceAll("-+", "-").replaceAll("\\)", "") + ".xlsx")));
			} catch (IOException e3) {
				throw new RuntimeException(e3);
			}
		});

		Desktop.getDesktop().open(dir);

	}
	public void generateTable(int exercice, CellStyle dateStyle, CellStyle tableHeaderStyle, CellStyle tableTitleStyle, Employe e, XSSFSheet sheet, int line, int offset,
			TypeConge type) {
		XSSFRow row = getOrCreateRow(sheet, line);
		XSSFCell cell = row.createCell(offset);
		cell.setCellValue(type.getLiteral());
		cell.setCellStyle(tableTitleStyle);
		sheet.addMergedRegion(new CellRangeAddress(row.getRowNum(), row.getRowNum(), offset, offset+2));

		XSSFRow rowTitle = getOrCreateRow(sheet, line+1);
		XSSFCell cellT1 = rowTitle.createCell(offset);

		cellT1.setCellStyle(tableHeaderStyle);
		cellT1.setCellValue("Du");
		XSSFCell cellT2 = rowTitle.createCell(offset + 1);
		cellT2.setCellStyle(tableHeaderStyle);
		cellT2.setCellValue("Au");
		XSSFCell cellT3 = rowTitle.createCell(offset + 2);
		cellT3.setCellValue("Total pris");
		cellT3.setCellStyle(tableHeaderStyle);

		int[] pLine = { line+1 };

		//Les ponts sont du 1er janvier au 31 déc
		//les autres congés du 1er mai au 30 avril...
		Date start;
		Date end;

		switch(type) {
		case PONT:
			start = new Date(exercice - 1900, 0, 1);
			end = new Date(exercice - 1900 + 1, 11, 31);

			break;
		default:
			start = new Date(exercice - 1900, 04, 01);
			end = new Date(exercice - 1900 + 1, 03, 30);
		}
		
		
		e.getConges().stream().filter(c -> {
			return c.getType().equals(type) && start.before(c.getDebut())
					&& end.after(c.getDebut());
		}).forEach(conge -> {

			XSSFRow rowConge = getOrCreateRow(sheet, ++pLine[0]);
			XSSFCell cellC1 = rowConge.createCell(offset);
			cellC1.setCellValue(conge.getDebut());
			cellC1.setCellStyle(dateStyle);
			XSSFCell cellC2 = rowConge.createCell(offset + 1);
			cellC2.setCellValue(conge.getFin());
			cellC2.setCellStyle(dateStyle);
			XSSFCell cellC3 = rowConge.createCell(offset + 2);
			cellC3.setCellValue(conge.getDecompte());
//						cellC3.setCellStyle(dateStyle);
		});
	}

	public XSSFRow getOrCreateRow(XSSFSheet sheet, int line) {
		XSSFRow row = sheet.getRow(line);
		if(row==null) {
			row = sheet.createRow(line);
		}
		return row;
	}

	private Predicate<? super Conge> congesFinder(Date time) {
		return c -> (c.getDebut().equals(time) || c.getDebut().before(time)) && (c.getFin().equals(time) || c.getFin().after(time));
	}

	private Map<String, CellStyle> styles = new HashMap<>();

	private CellStyle getCellStyle(XSSFWorkbook wb, boolean conge, boolean pont, boolean weekStart, int empIndex) {
		String key = "" + empIndex + "_" + conge + "_" + pont + "_" + weekStart;
		CellStyle style = styles.get(key);
		if (style != null) {
			return style;
		}
		style = wb.createCellStyle();

		// XSSFColor lightGray = setColor(wb,(byte) 0x12, (byte)0xE0,(byte) 0x50);
		if (conge) {
			// style.setFillBackgroundColor(IndexedColors.GREY_25_PERCENT.index);
			style.setFillForegroundColor(IndexedColors.values()[((empIndex % 6) + 31)].index);
			style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		}

		if (pont) {
			style.setFillForegroundColor(IndexedColors.LAVENDER.index);
			style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		}
		style.setBottomBorderColor(IndexedColors.GREY_80_PERCENT.index);
		if (weekStart) {

			style.setBorderBottom(BorderStyle.MEDIUM);
			style.setBorderTop(BorderStyle.MEDIUM);
			style.setBorderRight(BorderStyle.THIN);
			style.setBorderLeft(BorderStyle.MEDIUM);
		} else {
			style.setBorderBottom(BorderStyle.MEDIUM);
			style.setBorderTop(BorderStyle.MEDIUM);
			style.setBorderRight(BorderStyle.THIN);
			style.setBorderLeft(BorderStyle.THIN);
		}

		return style;
	}

}
