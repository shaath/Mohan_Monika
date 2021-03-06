package driverScripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import methods.OrgHRmLib;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Hybrid 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		String res=null;
		String xlpath="E:\\Mohan_Monika_Recordings\\Workspace\\SeleniumProject\\src\\testdata\\Hybrid.xlsx";
		String xlout="E:\\Mohan_Monika_Recordings\\Workspace\\SeleniumProject\\src\\results\\HybridRes.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		
		XSSFSheet ws=wb.getSheet("Testcase");
		XSSFSheet ws1=wb.getSheet("Teststeps");
		XSSFSheet ws2=wb.getSheet("TestData");
		XSSFSheet ws3=wb.getSheet("EmpReg");
		
		int TC_RC=ws.getLastRowNum();
		int TS_RC=ws1.getLastRowNum();
		int Emp_Rc=ws3.getLastRowNum();
		
		OrgHRmLib om=new OrgHRmLib();
		
		for (int i = 1; i <= TC_RC; i++) 
		{
			ws.getRow(i).createCell(3);
			String Exe=ws.getRow(i).getCell(2).getStringCellValue();
			
			if (Exe.equalsIgnoreCase("Y"))
			{
				String Tc_TcID=ws.getRow(i).getCell(0).getStringCellValue();
				
				for (int j = 1; j <= TS_RC; j++) 
				{
					String Ts_TcId=ws1.getRow(j).getCell(0).getStringCellValue();
					
					if (Tc_TcID.equalsIgnoreCase(Ts_TcId))
					{
						String key=ws1.getRow(j).getCell(3).getStringCellValue();
						
						switch (key)
						{
						case "Launch":
							String br=ws2.getRow(1).getCell(0).getStringCellValue();
							String url=ws2.getRow(1).getCell(1).getStringCellValue();
							res=om.Org_Launch(br, url);
							break;
						case "login":
							String u=ws2.getRow(1).getCell(2).getStringCellValue();
							String p=ws2.getRow(1).getCell(3).getStringCellValue();
							res=om.Org_Login(u, p);
							break;
						case "logout":
							res=om.Org_Logout();
							om.Org_Close();
							break;
						case "Empreg":
							for (int k = 1; k <= Emp_Rc; k++) 
							{
								String f=ws3.getRow(k).getCell(0).getStringCellValue();
								String l=ws3.getRow(k).getCell(1).getStringCellValue();
								String Eid=ws3.getRow(k).getCell(2).getStringCellValue();
								res=om.Org_EmpReg(f, l, Eid);
								ws3.getRow(k).createCell(3).setCellValue(res);
							}
							break;
						case "Usereg":
							String ename=ws2.getRow(1).getCell(7).getStringCellValue();
							String uname=ws2.getRow(1).getCell(8).getStringCellValue();
							String pswd=ws2.getRow(1).getCell(9).getStringCellValue();
							String cpswd=ws2.getRow(1).getCell(10).getStringCellValue();
							res=om.Org_UserReg(ename, uname, pswd, cpswd);
							break;
						case "Ulogin":
							String un=ws2.getRow(1).getCell(8).getStringCellValue();
							String ps=ws2.getRow(1).getCell(9).getStringCellValue();
							res=om.Org_Login(un, ps);
							break;
						default:
							System.out.println("Selected a proper keyword");
							break;
						}
						//Writing the results into test steps sheet
						ws1.getRow(j).createCell(4).setCellValue(res);
						//Writing the data into Test case sheet
						if (!ws.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail"))
						{
							ws.getRow(i).getCell(3).setCellValue(res);
						}
					}
				}
			}
			else
			{
				ws.getRow(i).getCell(3).setCellValue("Blocked");
			}
		}
		
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		
	}

}
