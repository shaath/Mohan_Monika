package methods;

public class TestSuite {

	public static void main(String[] args) throws InterruptedException {
		OrgHRmLib om=new OrgHRmLib();
		
		String res=om.Org_Launch("firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res=om.Org_Login("Admin", "Qedge123!@#");
		System.out.println("Application Login "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Application Closed Successfully");
		
		
		res=om.Org_Launch("firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res=om.Org_Login("Admin", "Qedge123!@#");
		System.out.println("Application Login "+res);
		
		res=om.Org_EmpReg("Monika123", "V123", "MV74547");
		System.out.println("Employee Reg "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Application Closed Successfully");
		
		
		res=om.Org_Launch("firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res=om.Org_Login("Admin", "Qedge123!@#");
		System.out.println("Application Login "+res);
		
		res=om.Org_UserReg("Monika123 V123", "Monika123V123985741", "MonikaV@98513656674123000", "MonikaV@98513656674123000");
		System.out.println("User Registration "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Application Closed Successfully");
		
		res=om.Org_Launch("firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res=om.Org_Login("Monika123V123985741", "MonikaV@98513656674123000");
		System.out.println("Application Login "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Application Closed Successfully");

	}

}
