class Main{
	public static void main(String [] args){
		Animal [] animals = {new Cat(), new Dolphin(), new Dove()};
		
		for(Animal a : animals) a.move();
		
	}
}

class Animal{
	void move(){
		System.out.print("나는 "+getClass().getName()+"이고,");
	}
}

class Cat extends Animal{
	void move(){
		super.move();
		System.out.println(" 달립니다.");
	}
}

class Dolphin extends Animal{
	void move(){
		super.move();
		System.out.println(" 수영합니다.");
	}
}

class Dove extends Animal{
	void move(){
		super.move();
		System.out.println(" 날아다닙니다.");
	}
}