package edu.lessons.day92.io.excel;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

public class Read_XLS {	
	public  String filelocation;
	public  FileInputStream ipstr = null;
	public  FileOutputStream opstr =null;
//	private HSSFWorkbook wb = null;
//	private HSSFSheet ws = null;	
	
	public Read_XLS(String filelocation) throws IOException {		
//		this.filelocation=filelocation;
//		try {
//			ipstr = new FileInputStream(filelocation);
//			wb = new HSSFWorkbook(ipstr);
//			ws = wb.getSheetAt(0);
//			
//		} catch (Exception e) {			
//			e.printStackTrace();
//		} 
//		finally
//		{
//			ipstr.close();
//		}
		
	}
	
	//To retrieve No Of Rows from .xls file's sheets.
	private int retrieveNoOfRows(String wsName){		
//		int sheetIndex=wb.getSheetIndex(wsName);
//		if(sheetIndex==-1)
//			return 0;
//		else{
//			ws = wb.getSheetAt(sheetIndex);
//			int rowCount=ws.getLastRowNum()+1;		
//			return rowCount;		
//		}
	}
	
	//To retrieve No Of Columns from .cls file's sheets.
	private int retrieveNoOfCols(String wsName){
//		int sheetIndex=wb.getSheetIndex(wsName);
//		if(sheetIndex==-1)
//			return 0;
//		else{
//			ws = wb.getSheetAt(sheetIndex);
//			int colCount=ws.getRow(0).getLastCellNum();			
//			return colCount;
//		}
		return 0;
	}
	//To retrieve test data from test case data sheets.
	public Object[][] retrieveTestData(String wsName){
//		int sheetIndex=wb.getSheetIndex(wsName);
//		if(sheetIndex==-1)
//			return null;
//		else{
//				int rowNum = retrieveNoOfRows(wsName);
//				int colNum = retrieveNoOfCols(wsName);
//				//System.out.println("rows "+rowNum+" cols "+colNum);
//				Object data[][] = new Object[rowNum-1][colNum-1];
//		
//				for (int i=0; i<rowNum-1; i++){
//					HSSFRow row = ws.getRow(i+1);//skip 1st ROW
//					for(int j=0; j< colNum-1; j++)
//					{					
//						if(row==null){
//							data[i][j] = "";
//						}
//						else
//						{
//							HSSFCell cell = row.getCell(j+1);//skip 1st col	
//					
//							if(cell==null){
//								data[i][j] = "";							
//							}
//							else
//							{
//								int value = (int) cell.getNumericCellValue();
//								data[i][j] = value;						
//							}
//						}
//					}
//				}			
		  //return data;
//		}
		return null;
	}		
}