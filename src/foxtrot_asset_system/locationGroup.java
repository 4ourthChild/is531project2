package foxtrot_asset_system;

public class locationGroup extends BusinessObject{

	private String id;
	private String name;
	private String address;
	private String location_id;
	
	public locationGroup(String id)
	{
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
