package Mock;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Baseclass.Dwsbaseclass;
import com.crm.pom.Dwsloginout;
@Listeners(com.crm.listeners.Dwslisteners.class)
public class Task4 extends Dwsbaseclass{

	@Test
	public void twitter() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("D:\\AutmationTask4\\src\\main\\resources\\dws.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		String  tname =sheet.getRow(0).getCell(0).toString();
		String email = sheet.getRow(0).getCell(1).toString();
		
		Dwsloginout ref = new Dwsloginout(driver);
		ref.twitter();
		ref.createAccount();
		ref.name(tname);
		ref.mail(email);
		ref.dateOfBirth();
		ref.next();
		
		
		
	}
}
