package jtdl;

public class People implements RichPeople{
	private String name;
	
	public People(){}
	
	public People(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void zufang() {
		System.out.println(this.name+"自己招租客。。。好累。。。");
	}

	public void getmoney() {
		System.out.println(this.name+"自己收租金。。。有钱拿累一点不是事儿。。。");
	}

}
