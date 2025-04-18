package com.tdd.DataDrivenTesting;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class TestExcel002
{
     //File open
    //Read Data
    //Read Excel file

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream= new FileInputStream("CDA2.xlsx");

        XSSFWorkbook workbook=new XSSFWorkbook(inputStream);
        XSSFSheet sheet=workbook.getSheetAt(0);//main

        Iterator<Row> rowIterator=sheet.iterator();

        while (rowIterator.hasNext())
        {
            Row row=rowIterator.next();
            Iterator<Cell>  cellIterator=row.cellIterator();

            while (cellIterator.hasNext())
            {
                Cell cell = cellIterator.next();
                if(cell.getCellType() == CellType.NUMERIC) {
                    System.out.println(cell.getStringCellValue());
                }
                if(cell.getCellType()==CellType.STRING)
                {
                    System.out.println(cell.getStringCellValue());
                }

            }
        }



    }
}
