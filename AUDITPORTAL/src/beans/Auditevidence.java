package beans;

public class Auditevidence {
	private String auditid; //varchar(9) NOT NULL,
	private String Evidenceof; //varchar(15) NOT NULL,
	private String Evidencefilename; //varchar(30) NOT NULL,
	private String Evidencenote; //varchar(100) NOT NULL
	public String getAuditid() {
		return auditid;
	}
	public void setAuditid(String auditid) {
		this.auditid = auditid;
	}
	public String getEvidenceof() {
		return Evidenceof;
	}
	public void setEvidenceof(String evidenceof) {
		Evidenceof = evidenceof;
	}
	public String getEvidencefilename() {
		return Evidencefilename;
	}
	public void setEvidencefilename(String evidencefilename) {
		Evidencefilename = evidencefilename;
	}
	public String getEvidencenote() {
		return Evidencenote;
	}
	public void setEvidencenote(String evidencenote) {
		Evidencenote = evidencenote;
	}
	
	
	
	
}

