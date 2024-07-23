import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class DP {
	
//	@DataProvider(name = "dp")
//	public Object[][] dp()
//	{
//		return new Object[][] {{1,2},{3,4},{4,78}};
//		}
	
	
	
	@DataProvider(name = "workorderTestData")
	  public Object[][] workOrderDataSupplier() throws IOException {
	    //String currentDir = System.getProperty("user.dir");
	    //String localPath = "/src/test/resources/ExcelData/InventoryTestData.xlsx";
		String path="C:\\Users\\upender\\Desktop\\TestDataa.xlsx";
		Object[][] obj=null;
		Map<Object, Object> datamap = null;

	    File file = new File(path);
	    FileInputStream fis = new FileInputStream(file);
	    XSSFWorkbook wb = new XSSFWorkbook(fis);
	    
	    for(int k=0;k<=1;k++)
	    {
	    //XSSFSheet sheet = wb.getSheetAt(0);
	    XSSFSheet sheet = wb.getSheetAt(k);

	    wb.close();
	    int lastRowNum = sheet.getLastRowNum();
	    int lastCellNum = sheet.getRow(0).getLastCellNum();
	    obj = new Object[lastRowNum][1];
	    for (int i = 0; i < lastRowNum; i++) {
	      datamap = new LinkedHashMap<Object, Object>();
	      for (int j = 0; j < lastCellNum; j++) {

	        DataFormatter formatter = new DataFormatter();
	        String key = formatter.formatCellValue(sheet.getRow(0).getCell(j));
	        String cell = formatter.formatCellValue(sheet.getRow(i + 1).getCell(j));
	        datamap.put(key, cell);

	      }

	      obj[i][0] = datamap;
	    }
	    }
		return obj;
	    }

	  
	
//	@DataProvider(name = "workorderTestData1")
//	  public Object[][] workOrderDataSupplier1() throws IOException {
//	    //String currentDir = System.getProperty("user.dir");
//	    //String localPath = "/src/test/resources/ExcelData/InventoryTestData.xlsx";
//		String path="C:\\Users\\upender\\Desktop\\TestDataa.xlsx";
//
//	    File file = new File(path);
//	    FileInputStream fis = new FileInputStream(file);
//	    XSSFWorkbook wb = new XSSFWorkbook(fis);
//	    XSSFSheet sheet = wb.getSheetAt(1);
//	    wb.close();
//	    int lastRowNum = sheet.getLastRowNum();
//	    int lastCellNum = sheet.getRow(0).getLastCellNum();
//	    Object[][] obj = new Object[lastRowNum][1];
//	    for (int i = 0; i < lastRowNum; i++) {
//	      Map<Object, Object> datamap = new LinkedHashMap<Object, Object>();
//	      for (int j = 0; j < lastCellNum; j++) {
//
//	        DataFormatter formatter = new DataFormatter();
//	        String key = formatter.formatCellValue(sheet.getRow(0).getCell(j));
//	        String cell = formatter.formatCellValue(sheet.getRow(i + 1).getCell(j));
//	        datamap.put(key, cell);
//
//	      }
//
//	      obj[i][0] = datamap;
//	    }
//	    return obj;
//	  }


	}

