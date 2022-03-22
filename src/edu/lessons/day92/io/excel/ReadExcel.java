package edu.lessons.day92.io.excel;

import java.io.BufferedInputStream; 
import java.io.FileInputStream; 
import java.io.IOException; 
import java.io.InputStream; 
import java.util.Iterator; 
import org.apache.poi.poifs.filesystem.POIFSFileSystem; 
import org.apache.poi.hssf.usermodel.HSSFCell; 
import org.apache.poi.hssf.usermodel.HSSFSheet; 
import org.apache.poi.hssf.usermodel.HSSFWorkbook; 
import org.apache.poi.hssf.usermodel.HSSFRow;

public class ReadExcel
{
	public static void main( String [] args ) 
	{ 
		m2();
	}
	public static void m1()
	{
		String fname="c:\\temp\\sample.xls";
		Read_XLS rxls=null;
		String wsName="sheet1";		
		try {
			rxls=new Read_XLS(fname);
			Object[][] data=rxls.retrieveTestData(wsName);
			for(int i=0;i<data.length;i++ )
			{
				System.out.println(data[i][0]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void m2()
	{
		InputStream input=null;
		try 
		{ 
			input = new BufferedInputStream( 
					new FileInputStream("c:\\temp\\sample.xls"));
			POIFSFileSystem fs = new POIFSFileSystem( input );
			HSSFWorkbook wb = new HSSFWorkbook(fs); 
			HSSFSheet sheet = wb.getSheetAt(0);
			Iterator rows = sheet.rowIterator();
			while( rows.hasNext() ) 
			{
				HSSFRow row = (HSSFRow) rows.next();
				System.out.println("\n");
				Iterator cells = row.cellIterator();
				while( cells.hasNext() ) 
				{
					HSSFCell cell = (HSSFCell) cells.next();
					if(HSSFCell.CELL_TYPE_NUMERIC==cell.getCellType())
						System.out.print( cell.getNumericCellValue()+" " );
					else if(HSSFCell.CELL_TYPE_STRING==cell.getCellType())
						System.out.print( cell.getStringCellValue()+" " );
					else if(HSSFCell.CELL_TYPE_BOOLEAN==cell.getCellType())
						System.out.print( cell.getBooleanCellValue()+" " );
					else if(HSSFCell.CELL_TYPE_BLANK==cell.getCellType())
						System.out.print( "BLANK " );
					else 
						System.out.print("Unknown cell type");
				}
			}
	    } catch ( IOException ex ) 
		{
		   ex.printStackTrace(); 
		} 
		finally
		{
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
