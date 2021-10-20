package Syntax32;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWritingDemo3 {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\masou\\Desktop\\MyOwnFile.xlsx";
        // To create a new excel file

        XSSFWorkbook xssfWorkbook=new XSSFWorkbook();
        Sheet mysheet=xssfWorkbook.createSheet("MySheet");
        Row row=mysheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("My First File");
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        xssfWorkbook.write(fileOutputStream);



    }
}
