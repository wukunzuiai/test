package spEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SonBean {
    private String sonName="sonName";
    public SonBean(@Value("#{baseBean.name}") String sonName){
        this.sonName = sonName;
    }
    /*public SonBean(@Value("#{baseBean.getName())}") String sonName){
        this.sonName = sonName;
    }*/
	public String getSonName() {
		return sonName;
	}
	public void setSonName(String sonName) {
		this.sonName = sonName;
	}
    
}

