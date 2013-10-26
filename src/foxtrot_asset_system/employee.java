package foxtrot_asset_system;

public class employee extends BusinessObject{
	
	private String first;
	private String last;
	private String ssn;
	private String buildingId;
	private String id;
	private String department;
	
	public employee(String id) {
		super(id);
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
		setDirty();
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
		setDirty();
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
		setDirty();
	}

	public String getBuildingId() {
		return buildingId;
	}

	public void setBuildingId(String buildingId) {
		this.buildingId = buildingId;
		setDirty();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
		setDirty();
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
		setDirty();
	}

}
