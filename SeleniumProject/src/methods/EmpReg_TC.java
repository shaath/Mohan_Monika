package methods;

public class EmpReg_TC {

	public static void main(String[] args) throws InterruptedException 
	{
		OrgHRmLib om=new OrgHRmLib();
		
		String res=om.Org_Launch("firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res=om.Org_Login("Admin", "Qedge123!@#");
		System.out.println("Application Login "+res);
		
		res=om.Org_EmpReg("Monika", "V", "MV78547");
		System.out.println("Employee Reg "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Application Closed Successfully");

	}

}
