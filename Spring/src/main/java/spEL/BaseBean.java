package spEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class BaseBean {
	 
    private String name="BaseBean";
 
    public  BaseBean(@Value("#{'SqEL Name'}")String name){
        this.name = name;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
}

