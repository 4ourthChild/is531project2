package foxtrot_asset_system;

public class manufacturer extends BusinessObject{
	
	private String id;
	private String name;
	
	public manufacturer(String id){
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
	

}
