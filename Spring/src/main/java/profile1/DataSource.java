package profile1;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class DataSource {
 
    /**
     * 定义名称
     */
    private String name;
 
    public DataSource(){
        super();
    }
 
    public DataSource(String name){
       this.name = name;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
}
