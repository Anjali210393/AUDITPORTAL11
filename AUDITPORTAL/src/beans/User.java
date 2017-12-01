package beans;

public class User {
	private static int uid;          // INT(5) NOT NULL AUTO_INCREMENT UNIQUE,
	private static String uloginid;  // varchar(12) NOT NULL AUTO_INCREMENT UNIQUE,
	private static String uemailid;  //varchar(50) NOT NULL UNIQUE,
	private static String Ulocation; //varchar(20) NOT NULL,
	private static String Ucreated;  //DATETIME NOT NULL,
	private static String Ucreatedby;// varchar(12) NOT NULL,
	private static String Ureviewer; //varchar(12) NOT NULL,
	private static String Utype;     //varchar(2) NOT NULL,
	private static String Uactive;   //varchar(2) NOT NULL,
	private static String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUloginid() {
		return uloginid;
	}
	public void setUloginid(String uloginid) {
		this.uloginid = uloginid;
	}
	public String getUemailid() {
		return uemailid;
	}
	public void setUemailid(String uemailid) {
		this.uemailid = uemailid;
	}
	public String getUlocation() {
		return Ulocation;
	}
	public void setUlocation(String ulocation) {
		Ulocation = ulocation;
	}
	public String getUcreated() {
		return Ucreated;
	}
	public void setUcreated(String ucreated) {
		Ucreated = ucreated;
	}
	public String getUcreatedby() {
		return Ucreatedby;
	}
	public void setUcreatedby(String ucreatedby) {
		Ucreatedby = ucreatedby;
	}
	public String getUreviewer() {
		return Ureviewer;
	}
	public void setUreviewer(String ureviewer) {
		Ureviewer = ureviewer;
	}
	public String getUtype() {
		return Utype;
	}
	public void setUtype(String utype) {
		Utype = utype;
	}
	public String getUactive() {
		return Uactive;
	}
	public void setUactive(String uactive) {
		Uactive = uactive;
	}
	
	
	
}
