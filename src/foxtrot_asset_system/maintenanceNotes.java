package foxtrot_asset_system;

public class maintenanceNotes extends BusinessObject{

	private String id;
	private String asset_id;
	private String title;
	private String note;
	private String serviceDate;
	private String serviceEmployeeId;
	
	public maintenanceNotes(String id){
		super(id);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAsset_id() {
		return asset_id;
	}

	public void setAsset_id(String asset_id) {
		this.asset_id = asset_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getServiceDate() {
		return serviceDate;
	}

	public void setServiceDate(String serviceDate) {
		this.serviceDate = serviceDate;
	}

	public String getServiceEmployeeId() {
		return serviceEmployeeId;
	}

	public void setServiceEmployeeId(String serviceEmployeeId) {
		this.serviceEmployeeId = serviceEmployeeId;
	}
	
}
