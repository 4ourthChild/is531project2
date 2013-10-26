package foxtrot_asset_system;

public class manufacturerPart extends BusinessObject{
	
	private String id;
	private String manufacturerId;
	private String name;
	private String description;
	private String type;
	private String weight;
	
	public manufacturerPart(String id){
		super(id);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
		setDirty();
	}

	public String getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(String manufacturerId) {
		this.manufacturerId = manufacturerId;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
		setDirty();
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
		setDirty();
	}

	
}
