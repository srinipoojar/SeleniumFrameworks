package com.LinkedIn.TestData;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	public static String getCellValue(String pathOfFile, String sheetName, int rowNum, int cellNum) throws InvalidFormatException {
        FileInputStream fis = null;
        Workbook wb = null;
        String value="";
        
        
		try {
			fis = new FileInputStream(pathOfFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		System.out.println("Xl sheet is not present");
		}
        
try {
			wb = WorkbookFactory.create(fis);
} catch (IOException e ) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
		value=wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
//		/*
//		 * int type =
//		 * wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getCellType(); String
//		 * value = ""; if(type==Cell.CELL_TYPE_STRING){ value =
//		 * wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
//		 * }else if(type==Cell.CELL_TYPE_NUMERIC){ int numValue = (int)
//		 * wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getNumericCellValue();
//		 * value = ""+numValue; }else if(type==Cell.CELL_TYPE_BOOLEAN){ boolean
//		 * boolValue =
//		 * wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getBooleanCellValue();
//		 * value = ""+boolValue;
//		 */
//        }
//        
//		}
//		
//		catch(NullPointerException e)
//		{
//			value="";	
//		}
//        catch(Exception e)
//        {
//        	e.printStackTrace();
//        }
        return value;
    }
    
    public static void writeData(String pathOfFile, String sheetName, int rowNum, int cellNum, String value) throws InvalidFormatException, IOException{
        FileInputStream fis = new FileInputStream(pathOfFile);
        Workbook wb = WorkbookFactory.create(fis);
        wb.getSheet(sheetName).getRow(rowNum).createCell(cellNum).setCellValue(value);
        FileOutputStream fos = new FileOutputStream(pathOfFile);
        wb.write(fos);
    }
}
