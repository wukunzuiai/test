package PropertySource;

public class BaseBean {
	private String name = "daniel";
	public BaseBean(){
		
	}
	public BaseBean(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
