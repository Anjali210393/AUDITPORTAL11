package beans;

public class AuditChecklist {

	String Servicepack; //varchar(3) NOT NULL,
	String Windowspatch; //varchar(3) NOT NULL,
	String AVpatch; //varchar(3) NOT NULL,
	String Sharepath; //varchar(3) NOT NULL,
	String Adminaccess; //varchar(3) NOT NULL,
	String USBaccess; //varchar(3) NOT NULL,
	String Bootuppassword; //varchar(3) NOT NULL,
	String unauthorizedSoftware; //varchar(3) NOT NULL,
	String nonprojectdata; //varchar(3) NOT NULL,
	String CleanDesktop; //varchar(3) NOT NULL,
	String Systemencrypted; //varchar(3) NOT NULL,
	String RemoteWipe; //varchar(3) NOT NULL,
	String auditID; //varchar(9) NOT NULL,
	String Observations; //varchar(300),
	String correctiveactions; //varchar(300)
	
	
	
	
}
