package jdk;

public class Bird implements Fly {

	public void gotoFly() {
		System.out.println("鸟儿张开翅膀要飞起来了。。。。");
	}

	public void stopFly() {
		System.out.println("准备降落。。。。");
	}

	public void eatBug(){
		System.out.println("鸟要吃虫子，补充体力。。。");
	}
}
