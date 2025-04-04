package com.tdd.DataDrivenTesting;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestExcel003
{

    public static void main(String[] args) throws IOException {

        //create a cell at specific position

        XSSFWorkbook workbook= new XSSFWorkbook();
        XSSFSheet sheet= workbook.createSheet("Main");

        Row row=sheet.createRow(1);
        Cell cell=row.createCell(1);
        cell.setCellValue("Asha");

        FileOutputStream outputStream=new FileOutputStream("SELLSPECIFIC.xlsx");
        workbook.write(outputStream);
        outputStream.close();

    }
}
