package businessMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class excelSheet {
private static final int flag = 0;

	String firstname="";
	String lasttname="";
	String mail="";
	String password="";
	String Repassword="";
	
	

	public  void fetchexcel() throws IOException {
		
		
				
	FileInputStream fis = new FileInputStream
			(System.getProperty("user.dir")+"/Datasheet.xlsx");


	HSSFWorkbook wb = new HSSFWorkbook(fis);
	HSSFSheet sheet1 = wb.getSheetAt(0);
	
	
	this.firstname = sheet1.getRow(1).getCell(0).toString();
	System.out.println("firstname");
	this.lasttname = sheet1.getRow(1).getCell(1).toString();
	this.mail = sheet1.getRow(1).getCell(2).toString();
	this.password = sheet1.getRow(1).getCell(3).toString();
	this.Repassword = sheet1.getRow(1).getCell(4).toString();

	
	}

	
	
	
}
