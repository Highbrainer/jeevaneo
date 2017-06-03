mysql> create USER 'userDB_RH_GIC'@'localhost' IDENTIFIED BY 'C.,HV@%mi31lA1X\',AU6';
Query OK, 0 rows affected (0,01 sec)

mysql> create database _RH_GIC;
Query OK, 1 row affected (0,00 sec)

mysql> GRANT ALL PRIVILEGES ON _RH_GIC.* TO 'userDB_RH_GIC'@'localhost';
Query OK, 0 rows affected (0,00 sec)
