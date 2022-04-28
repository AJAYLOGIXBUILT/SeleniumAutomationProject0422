package PakagesC6pro;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadWriteExcelSheet
{
    public static  void main(String args[]) throws IOException
    {
    	// HSSFWorkbook- These class methods are used to read/write data to Microsoft Excel file in .xls format. It is compatible with MS-Office versions 97–2003.
        // HSSFSheet - This class is used to create a new sheet in the HSSFWorkbook, ie, the older format of Excel.
        // HSSFRow - This represents a row in the HSSFSheet.
        // HSSFCell - We use it to work with cells of HSSFRow.
         
        // XSSFWorkbook- These class methods are used to read-write data to Microsoft Excel in .xls or .xlsx format. It is compatible with MS-Office versions 2007 or later.
        // XSSFSheet - This class is used to create a new sheet in the XSSFWorkbook., ie, the new format of Excel
        // XSSFRow - This represents a row in the XSSFSheet.
        // XSSFCell - We use it to work with cells of XSSFRow.
         
         //creating workbook instance that refers to .xls file
         //HSSFWorkbook wb=new HSSFWorkbook(inputStream);
    	
    	    	
    	//Create an object of File class to open xlsx file
        File file =    new File("E:\\A\\LoginList2.xlsx");

        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);
        
       //creating workbook instance that refers to .xlsx file
        XSSFWorkbook wb=new XSSFWorkbook(inputStream);
               
        //creating a Sheet object
        XSSFSheet sheet=wb.getSheet("Logins");
        
        //get all rows in the sheet
        int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
        
        System.out.println("TOTAL ROW ="+rowCount); //3
        
        //iterate over all the row to print the data present in each cell.
        for(int i=0;i<=rowCount;i++){
            
            //get cell count in a row
            int cellcount=sheet.getRow(i).getLastCellNum();
            
            //iterate over each cell to print its value
            System.out.print("Row "+i +" data is :");
            
            for(int j=0;j<cellcount;j++)
            {
                System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() +",");
            }
            System.out.println();
        }        
    }
}