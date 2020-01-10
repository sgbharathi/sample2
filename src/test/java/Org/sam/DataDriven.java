package Org.sam;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
public static String getData(int rowNo,int cellNo) throws Throwable {
	String value=null;
	File loc = new File("C:\\Users\\USER\\eclipse-workspace sgbharathi\\Int\\testdata\\Book1.xlsx");
FileInputStream stream=new FileInputStream(loc);

Workbook w = new XSSFWorkbook(stream);
Sheet s = w.getSheet("Sheet1");
Row r = s.getRow(rowNo);
Cell c = r.getCell(cellNo);

int type = c.getCellType();
if(type==1) {
	  value = c.getStringCellValue();
}

else if(type==0){
	if(DateUtil.isCellDateFormatted(c));
	Date dateCellValue = c.getDateCellValue();
	SimpleDateFormat sim = new SimpleDateFormat("dd-MMM-yy");
	value = sim.format(dateCellValue);
}

else {
	double numericCellValue = c.getNumericCellValue();
	long l=(long)numericCellValue;
 value = String.valueOf(l);
}

return value;
	
}
}
