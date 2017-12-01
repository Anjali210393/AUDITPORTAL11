package beans;

public class Metadata {
	private int Id; //INT(4) NOT NULL,
	private String type; //varchar(10) NOT NULL,
	private String value; //varchar(30) NOT NULL
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
