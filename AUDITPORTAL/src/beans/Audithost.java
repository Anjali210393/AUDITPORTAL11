package beans;

public class Audithost {
	private String AuditID; //varchar(9) NOT NULL UNIQUE,
	private String AuditDate; //DATE NOT NULL,
	private String Preparedby; //varchar(12) NOT NULL,
	private String Reviewedby; //varchar(12) NOT NULL,
	private String ReviewDate; //DATETIME NOT NULL,
	private String Auditedhostname; //varchar(15) NOT NULL,
	private String hosttype; //varchar(2) NOT NULL,
	private String Loginuser; //varchar(12) NOT NULL,
	private String Location; //varchar(12) NOT NULL,
	private String Building; //varchar(12) NOT NULL,
	private String Floor; //varchar(6) NOT NULL,
	private String ODC; // varchar(6) NOT NULL,
	private String Workstation; // varchar(6) NOT NULL
	public String getAuditID() {
		return AuditID;
	}
	public void setAuditID(String auditID) {
		AuditID = auditID;
	}
	public String getAuditDate() {
		return AuditDate;
	}
	public void setAuditDate(String auditDate) {
		AuditDate = auditDate;
	}
	public String getPreparedby() {
		return Preparedby;
	}
	public void setPreparedby(String preparedby) {
		Preparedby = preparedby;
	}
	public String getReviewedby() {
		return Reviewedby;
	}
	public void setReviewedby(String reviewedby) {
		Reviewedby = reviewedby;
	}
	public String getReviewDate() {
		return ReviewDate;
	}
	public void setReviewDate(String reviewDate) {
		ReviewDate = reviewDate;
	}
	public String getAuditedhostname() {
		return Auditedhostname;
	}
	public void setAuditedhostname(String auditedhostname) {
		Auditedhostname = auditedhostname;
	}
	public String getHosttype() {
		return hosttype;
	}
	public void setHosttype(String hosttype) {
		this.hosttype = hosttype;
	}
	public String getLoginuser() {
		return Loginuser;
	}
	public void setLoginuser(String loginuser) {
		Loginuser = loginuser;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getBuilding() {
		return Building;
	}
	public void setBuilding(String building) {
		Building = building;
	}
	public String getFloor() {
		return Floor;
	}
	public void setFloor(String floor) {
		Floor = floor;
	}
	public String getODC() {
		return ODC;
	}
	public void setODC(String oDC) {
		ODC = oDC;
	}
	public String getWorkstation() {
		return Workstation;
	}
	public void setWorkstation(String workstation) {
		Workstation = workstation;
	}
	
	
	
	
}
