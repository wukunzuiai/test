package hunhe;

import cn.daniel.CDPlayer;

public class CDPlayerImpl implements CDPlayer {
	 
    private CDBean cdBean;
    
    public CDPlayerImpl(){
    	
    }
    
	public CDPlayerImpl(CDBean cdBean) {
		this.cdBean = cdBean;
	}

	public void setCdBean(CDBean cdBean) {
		this.cdBean = cdBean;
	}

	public void playCD() {
        System.out.println("正在播放："+cdBean.getTitle()+" by "+cdBean.getAuthor());
    }
}

