package com.MVNProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven {

	static void particularDataDriven() throws IOException {

		File f = new File("C:\\Users\\Desktop\\chitrsNew\\MVNProject\\Excel Path\\DataDriver_ExcelData.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet st = wb.getSheetAt(0);
		Row R = st.getRow(4);
		Cell C = R.getCell(1);
		CellType CT = C.getCellType();
		if (CT.equals(CellType.STRING)) {
			String CellValue = C.getStringCellValue();
			System.out.println(CellValue);
		}
		else if (CT.equals(CellType.NUMERIC)) {
			double Cellvalue1 = C.getNumericCellValue();
//			Narrowing Type Casting done here
			int Value =(int) Cellvalue1;
			System.out.println(Value);
		}
	}
	static void Alldatadriven() throws IOException {
		File f = new File("C:\\Users\\Desktop\\chitrsNew\\MVNProject\\Excel Path\\DataDriver_ExcelData.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet st = wb.getSheetAt(0);
		int allrow = st.getPhysicalNumberOfRows();
		for (int i = 0; i < allrow; i++) {
			Row row = st.getRow(i);
			int allcell = row.getPhysicalNumberOfCells();
			for (int j = 0; j < allcell ; j++) {
				Cell cell = row.getCell(j);
			
			CellType alldata = cell.getCellType();
			if (alldata.equals(CellType.STRING)) {
				String cellvalue = cell.getStringCellValue();
				System.out.println(cellvalue);
			}
			else if (alldata.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int value = (int) numericCellValue;
				System.out.println(value);
			}
			}
		}
		
	}
	static void writeDatadriven() throws IOException {
		File f = new File("C:\\Users\\Desktop\\chitrsNew\\MVNProject\\Excel Path\\DataDriver_ExcelData.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		wb.createSheet("Demo").createRow(0).createCell(0).setCellValue("Name");
		wb.getSheet("Demo").getRow(0).createCell(1).setCellValue("Age");
		wb.getSheet("Demo").createRow(1).createCell(0).setCellValue("Chitra");
		wb.getSheet("Demo").getRow(1).createCell(1).setCellValue("27");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		System.out.println("DemoSheet Printed");
	}
	public static void main(String[] args) throws IOException {
//	particularDataDriven();
//	Alldatadriven();
		writeDatadriven();
}
}
