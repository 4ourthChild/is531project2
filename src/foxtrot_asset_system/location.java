package foxtrot_asset_system;

public class location extends BusinessObject{


	private String id;
	private String name;
	private String description;
	private String number;
	
	public location(String id){
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
		setDirty();
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
		setDirty();
	}
	
}
