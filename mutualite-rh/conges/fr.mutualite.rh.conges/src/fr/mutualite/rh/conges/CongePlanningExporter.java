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

public class CongePlanningExporter {

	public static void main(String[] args) {
	}
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

	private String nomEtablissement(Float mat) {
		return ("" + mat).replaceFirst("\\.0+$", "");
	}

	public void export(List<Employe> employes, Date debut, Date fin, File out, Predicate<? super Employe> empFilter) throws IOException {
		Stream<Employe> emps = employes.stream();
		if (null != empFilter) {
			emps = emps.filter(empFilter);
		}

		Map<Float, Set<Employe>> byEtablissement = emps.collect(Collectors.toMap(Employe::getEtablissement, e -> new HashSet(Arrays.asList(e)), (l1, l2) -> {
			l1.addAll(l2);
			return l1;
		}));

		XSSFWorkbook wb = new XSSFWorkbook();
		CellStyle dateStyle = wb.createCellStyle();
		CreationHelper createHelper = wb.getCreationHelper();
		dateStyle.setDataFormat(createHelper.createDataFormat().getFormat("d mmm"));

		XSSFFont bold = wb.createFont();
		bold.setBold(true);
		
		XSSFFont boldWhite = wb.createFont();
		boldWhite.setBold(true);
		boldWhite.setColor(IndexedColors.WHITE.index);

		CellStyle semaineImpairStyle = wb.createCellStyle();
		semaineImpairStyle.setFillBackgroundColor(IndexedColors.LIGHT_YELLOW.index);
		// XSSFColor lightGray = setColor(wb,(byte) 0x12, (byte)0xE0,(byte) 0x50);
		semaineImpairStyle.setFillForegroundColor(IndexedColors.GREY_80_PERCENT.index);
		semaineImpairStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
		semaineImpairStyle.setAlignment(HorizontalAlignment.CENTER);
		semaineImpairStyle.setFont(boldWhite);

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

		CellStyle moisPairStyle = wb.createCellStyle();
		// moisPairStyle.setFillBackgroundColor(IndexedColors.LIGHT_YELLOW.index);
		// XSSFColor lightGray = setColor(wb,(byte) 0x12, (byte)0xE0,(byte) 0x50);
		// moisPairStyle.setFillForegroundColor(IndexedColors.GREY_80_PERCENT.index);
		// moisPairStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
		moisPairStyle.setAlignment(HorizontalAlignment.CENTER);
		moisPairStyle.setFont(bold);
		
		CellStyle anneeImpairStyle = wb.createCellStyle();
		anneeImpairStyle.setFillBackgroundColor(IndexedColors.BLUE.index);
		// XSSFColor lightGray = setColor(wb,(byte) 0x12, (byte)0xE0,(byte) 0x50);
		anneeImpairStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.index);
		anneeImpairStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
		anneeImpairStyle.setAlignment(HorizontalAlignment.CENTER);
		anneeImpairStyle.setFont(bold);;
		
		CellStyle anneePairStyle = wb.createCellStyle();
		// anneePairStyle.setFillBackgroundColor(IndexedColors.BLUE.index);
		// XSSFColor lightGray = setColor(wb,(byte) 0x12, (byte)0xE0,(byte) 0x50);
		// anneePairStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.index);
		// anneePairStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
		anneePairStyle.setAlignment(HorizontalAlignment.CENTER);
		anneePairStyle.setFont(bold);;
		
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

		byEtablissement.keySet().stream().sorted().forEach(etablissement -> {
			Set<Employe> salaries = byEtablissement.get(etablissement);

			XSSFSheet sheet = wb.createSheet();
			String labelEtablissement = "" /* + wb.getSheetIndex(sheet) + " " */ + nomEtablissement(etablissement);
			wb.setSheetName(wb.getSheetIndex(sheet), labelEtablissement);

			{
				XSSFRow row = sheet.createRow(sheet.getLastRowNum() + 1);
				row.createCell(0).setCellValue("Congés - " + labelEtablissement);

				sheet.addMergedRegion(new CellRangeAddress(row.getRowNum(), row.getRowNum(), 0, 1));
			}

			{ // ANNEES
				XSSFRow row = sheet.createRow(sheet.getLastRowNum() + 1);
				int i = -1;
				// row.createCell(++i).setCellValue(" ");
				row.createCell(++i).setCellValue(" ");
				// row.createCell(++i).setCellValue(" ");
				Calendar cal = Calendar.getInstance();
				cal.setTime(debut);
				if (!debut.before(fin)) {
					throw new IllegalArgumentException("La date de début doit être antérieure à la date de fin!!");
				}

				int startCol = i + 1;
				int prevYear = cal.get(Calendar.YEAR);
				cal.add(Calendar.DAY_OF_YEAR, -1);
				while (cal.getTime().before(fin)) {
					cal.add(Calendar.DAY_OF_YEAR, 1);
					if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
						continue;
					}
					// System.out.println(df.format(cal.getTime()));
					XSSFCell cell = row.createCell(++i);
					cell.setCellValue("" + cal.get(Calendar.YEAR));
					// cell.setCellStyle(dateStyle);

					int year = cal.get(Calendar.YEAR);
					cell.setCellStyle(year % 2 == 1 ? anneeImpairStyle : anneePairStyle);
					if (prevYear != year) {
						int endCol = i - 1;
						sheet.addMergedRegion(new CellRangeAddress(row.getRowNum(), row.getRowNum(), startCol, endCol));
						prevYear = year;
						startCol = i;
					}
				}
				int endCol = i;
				sheet.addMergedRegion(new CellRangeAddress(row.getRowNum(), row.getRowNum(), startCol, endCol));
			}

			DateFormat monthDf = new SimpleDateFormat("MMMM");

			{ // MOIS
				XSSFRow row = sheet.createRow(sheet.getLastRowNum() + 1);
				int i = -1;
				// row.createCell(++i).setCellValue(" ");
				row.createCell(++i).setCellValue(" ");
				// row.createCell(++i).setCellValue(" ");
				Calendar cal = Calendar.getInstance();
				cal.setTime(debut);
				if (!debut.before(fin)) {
					throw new IllegalArgumentException("La date de début doit être antérieure à la date de fin!!");
				}

				int startCol = i + 1;
				int prevMonth = cal.get(Calendar.MONTH);
				cal.add(Calendar.DAY_OF_YEAR, -1);
				while (cal.getTime().before(fin)) {
					cal.add(Calendar.DAY_OF_YEAR, 1);
					if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
						continue;
					}
					// System.out.println(df.format(cal.getTime()));
					XSSFCell cell = row.createCell(++i);
					cell.setCellValue(monthDf.format(cal.getTime()));
					// cell.setCellStyle(dateStyle);

					int month = cal.get(Calendar.MONTH);
						cell.setCellStyle(month % 2 == 1?moisImpairStyle:moisPairStyle);
					if (prevMonth != month) {
						int endCol = i - 1;
						sheet.addMergedRegion(new CellRangeAddress(row.getRowNum(), row.getRowNum(), startCol, endCol));
						prevMonth = month;
						startCol = i;
					}
				}
				int endCol = i;
				sheet.addMergedRegion(new CellRangeAddress(row.getRowNum(), row.getRowNum(), startCol, endCol));
			}

			// DateFormat monthDf = new SimpleDateFormat("MMM");

			{ // WEEK
				XSSFRow row = sheet.createRow(sheet.getLastRowNum() + 1);
				int i = -1;
				// row.createCell(++i).setCellValue(" ");
				row.createCell(++i).setCellValue(" ");
				// row.createCell(++i).setCellValue(" ");
				Calendar cal = Calendar.getInstance();
				cal.setTime(debut);
				if (!debut.before(fin)) {
					throw new IllegalArgumentException("La date de début doit être antérieure à la date de fin!!");
				}

				int startCol = i;
				int prevWeek = cal.get(Calendar.YEAR);
				cal.add(Calendar.DAY_OF_YEAR, -1);
				while (cal.getTime().before(fin)) {
					cal.add(Calendar.DAY_OF_YEAR, 1);
					if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
						continue;
					}
					// System.out.println(df.format(cal.getTime()));
					XSSFCell cell = row.createCell(++i);
					int week = cal.get(Calendar.WEEK_OF_YEAR);
					cell.setCellValue("s" + week);
					// cell.setCellStyle(dateStyle);

						cell.setCellStyle(week % 2 == 1?semaineImpairStyle:semainePairStyle);
					if (prevWeek != week) {
						int endCol = i - 1;
						if (endCol > startCol) {
							sheet.addMergedRegion(new CellRangeAddress(row.getRowNum(), row.getRowNum(), startCol, endCol));
						}
						prevWeek = week;
						startCol = i;
					}
				}
				int endCol = i;
				if (endCol > startCol) {
					sheet.addMergedRegion(new CellRangeAddress(row.getRowNum(), row.getRowNum(), startCol, endCol));
				}
			}

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

				// TODO cloner weekStartStyle et weekEndStyle et leur appliquer une couleur choisie pour ce salarié, pour remplacer conges style!

				System.out.println(" " + labelEtablissement + " " + e.getNom() + " " + sheet.getLastRowNum());

				XSSFRow row = sheet.createRow(sheet.getLastRowNum() + 1);
				int i = -1;
				// Cell cellMat = row.createCell(++i);
				// cellMat.setCellValue(e.getMatricule());
				// cellMat.setCellStyle(getCellStyle(wb, true, false, row.getRowNum()));
				Cell cellNom = row.createCell(++i);
				cellNom.setCellValue(e.getNom());
				cellNom.setCellStyle(getCellStyle(wb, true, false, row.getRowNum()));
				// row.createCell(++i).setCellValue(e.getPrenom());
				Calendar cal = Calendar.getInstance();
				cal.setTime(debut);
				if (!debut.before(fin)) {
					throw new IllegalArgumentException("La date de début doit être antérieure à la date de fin!!");
				}

				cal.add(Calendar.DAY_OF_YEAR, -1);
				Calendar calBefore = Calendar.getInstance();
				calBefore.setTime(cal.getTime());
				while (cal.getTime().before(fin)) {
					cal.add(Calendar.DAY_OF_YEAR, 1);
					if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
						continue;
					}
					Date time = cal.getTime();
					XSSFCell cell = row.createCell(++i);
					cell.setCellValue("");

					boolean newWeek = calBefore.get(Calendar.WEEK_OF_YEAR) != cal.get(Calendar.WEEK_OF_YEAR);
					boolean conge = e.getConges().stream()
							.anyMatch(c -> (c.getDebut().equals(time) || c.getDebut().before(time)) && (c.getFin().equals(time) || c.getFin().after(time)));
					cell.setCellStyle(getCellStyle(wb, conge, newWeek, row.getRowNum()));
					calBefore.setTime(cal.getTime());

				}

			});

			sheet.autoSizeColumn(0);
			sheet.autoSizeColumn(1);
			// sheet.autoSizeColumn(2);

			// sheet.setColumnWidth(1, -10);
			// sheet.setColumnWidth(2, 0);
			// sheet.setColumnWidth(3, 100);

			short lastCellNum = sheet.getRow(2).getLastCellNum();
			for (short i = 2; i < lastCellNum; ++i) {
				sheet.setColumnWidth(i, 256);
			}

		});

		wb.write(new FileOutputStream(out));

		Desktop.getDesktop().open(out);

	}

	private Map<String, CellStyle> styles = new HashMap<>();

	private CellStyle getCellStyle(XSSFWorkbook wb, boolean conge, boolean weekStart, int empIndex) {
		String key = "" + empIndex + "_" + conge + "_" + weekStart;
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
