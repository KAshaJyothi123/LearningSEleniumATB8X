package com.tdd.DataDrivenTesting;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;


public class TestExcel001
{

    public static  void main(String[] args) throws IOException {

        //Workbook
        //sheet
        //Row ,cell
        //XSSF Workbook ->xslx -->
        //HSSF Workbook -->xls  -->2008


        //creating a Excel file and Add data
        Map<String, Object> data=new TreeMap<>();
        data.put("1",new Object[]{"LoginId","email","password"});
        data.put("2",new Object[]{"1","asha75k@gmail.con","asha@8713"});
        data.put("3",new Object[]{"3","test123@gmail.com","test@123"});

        Set<String>keyset=data.keySet();

        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("Main");


        int rownum=0;

        for(String key: keyset)
        {
            Row r=sheet.createRow(rownum++);
            Object[] objectA=(Object[]) data.get(key);
            int cellnum=0;
            for (Object o :objectA )
            {
                Cell cell = r.createCell(cellnum++);

                cell.setCellValue((String) o);
            }
        }

        FileOutputStream outputStreamutputStream=new FileOutputStream(new File("CTO.xlsx"));
        workbook.write(outputStreamutputStream);
        outputStreamutputStream.close();

    }

}
