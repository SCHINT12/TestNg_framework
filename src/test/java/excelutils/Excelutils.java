package excelutils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
	static String val;
	static int rowNum;
	static int colNum;

	public static int  getrownumber(String tcnum,String sheetname) throws IOException
	{
		File file=new File(".");
		String excelpath=file.getCanonicalPath();
		FileInputStream fis=new FileInputStream(excelpath+"\\Testdata\\TestData.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet(sheetname);
		int rowno=sheet.getLastRowNum()-sheet.getFirstRowNum()+1;


		for(int i=0;i<rowno;i++)
		{
			XSSFRow row=sheet.getRow(i);
			int colno=row.getLastCellNum();
			for(int j=0;j<colno;j++)	
			{
				if(row.getCell(j).getStringCellValue().equals(tcnum))
				{
					rowNum=i;
				}
				
			}
		}
		return rowNum;

	}
	
	public static int  getcolnumber(String colname,String sheetname) throws IOException
	{
		File file=new File(".");
		String excelpath=file.getCanonicalPath();
		FileInputStream fis=new FileInputStream(excelpath+"\\Testdata\\TestData.xlsx");		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet(sheetname);
		int rowno=sheet.getLastRowNum()-sheet.getFirstRowNum()+1;


		for(int i=0;i<rowno;i++)
		{
			XSSFRow row=sheet.getRow(i);
			int colno=row.getLastCellNum();
			for(int j=0;j<colno;j++)	
			{
				if(row.getCell(j).getStringCellValue().equals(colname))
				{
					colNum=j;
				}
				
			}
		}
		return colNum;

	}
	
	public static String  getcelldata(int rownum,String colname,String sheetname) throws IOException
	{
		File file=new File(".");
		String excelpath=file.getCanonicalPath();
		FileInputStream fis=new FileInputStream(excelpath+"\\Testdata\\TestData.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Testdata");
		int colnum=getcolnumber(colname,sheetname);
			XSSFRow row=sheet.getRow(rownum);
			String val=row.getCell(colnum).getStringCellValue();
			return val;
	}
	
	public static String getenvironmentcredentials(String colname,String sheetname) throws IOException
	{
		File file=new File(".");
		String excelpath=file.getCanonicalPath();
		FileInputStream fis=new FileInputStream(excelpath+"\\Testdata\\TestData.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet(sheetname);
		int colnum=getcolnumber(colname,sheetname);
			XSSFRow row=sheet.getRow(1);
			String val=row.getCell(colnum).getStringCellValue();
			return val;
	}

	public static String getdata(String colname,String sheetname,int rownum) throws IOException
	{
		File file=new File(".");
		String excelpath=file.getCanonicalPath();
		FileInputStream fis=new FileInputStream(excelpath+"\\Testdata\\TestData.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet(sheetname);
		int colnum=getcolnumber(colname,sheetname);
			XSSFRow row=sheet.getRow(rownum);
			String val=row.getCell(colnum).getStringCellValue();
			return val;
	}




public static boolean  getexecutionstatus(String status,int rownum) throws IOException
{
	File file=new File(".");
	String excelpath=file.getCanonicalPath();
	FileInputStream fis=new FileInputStream(excelpath+"\\Testdata\\TestData.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheet("Testdata");
	int rowno=sheet.getLastRowNum()-sheet.getFirstRowNum()+1;
	boolean flag=false;



		XSSFRow row=sheet.getRow(rownum);
		int colno=row.getLastCellNum();
		for(int j=0;j<colno;j++)	
		{
			if(row.getCell(j).getStringCellValue().equals(status))
			{
				flag=true;
			}
			
		}
	return flag;

}

}


//	public void getTestCaseNumberFromSuite(String test) throws IOException
//	{
//		FileInputStream fis=new FileInputStream("C:\\Users\\upender\\Desktop\\TestData.xlsx");
//		XSSFWorkbook wb=new XSSFWorkbook(fis);
//		XSSFSheet sheet=wb.getSheet("Testdata");
//		int rowno=sheet.getLastRowNum()-sheet.getFirstRowNum()+1;
//		int rowNum;
//		int colNum;
//		for(int i=0;i<rowno;i++)
//		{
//			XSSFRow row=sheet.getRow(i);
//			int colno=row.getLastCellNum();
//            for(int j=0;j<colno;j++)	
//            {
//            	if(row.getCell(j).getStringCellValue().equals(test))
//            	{
//            		rowNum=i;
//            		colNum=j;
//            		if(row.getCell(1).getStringCellValue().equals("Y"))
//            		{
//            			System.out.println(rowNum);
//            			System.out.println(colNum);
//                		break;
//            		}
//            	}
//            }
//			
//		}
//
//	}


//}
