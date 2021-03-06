package foxtrot_asset_system;

public class asset extends BusinessObject{

	@BusinessObjectField
	private String id;
	@BusinessObjectField
	private String name;
	@BusinessObjectField
	private String manufacturer_part_id;
	@BusinessObjectField
	private String employee_id;
	@BusinessObjectField
	private String installdate;
	@BusinessObjectField
	private String date_depreciated_by;
	@BusinessObjectField
	private String tag;
	@BusinessObjectField
	private String note;
	@BusinessObjectField
	private String location_id;
	
	public asset(String id){
		super(id);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
		setDirty();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		setDirty();
	}

	public String getManufacturer_part_id() {
		return manufacturer_part_id;
	}

	public void setManufacturer_part_id(String manufacturer_part_id) {
		this.manufacturer_part_id = manufacturer_part_id;
		setDirty();
	}

	public String getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = "thisishardcoded";
		setDirty();
	}

	public String getInstallDate() {
		return installdate;
	}

	public void setInstallDate(String installDate) {
		this.installdate = installDate;
		setDirty();
	}

	public String getDate_depreciated_by() {
		return date_depreciated_by;
	}

	public void setDate_depreciated_by(String date_depreciated_by) {
		this.date_depreciated_by = date_depreciated_by;
		setDirty();
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
		setDirty();
	}

	public String getNote() {
		return note;
	}

	public void setNotes(String notes) {
		this.note = notes;
		setDirty();
	}

	public String getLocation_id() {
		return location_id;
	}

	public void setLocation_id(String location_id) {
		this.location_id = location_id;
		setDirty();
	}
	
}
