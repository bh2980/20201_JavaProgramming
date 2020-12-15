class Main{
	public static void main(String [] args){
		Animal [] animals = {new Cat(), new Dolphin(), new Dove()};
		
		for(Animal a : animals) a.move();
		
	}
}

class Animal{
	void move(){
		System.out.print("���� "+getClass().getName()+"�̰�,");
	}
}

class Cat extends Animal{
	void move(){
		super.move();
		System.out.println(" �޸��ϴ�.");
	}
}

class Dolphin extends Animal{
	void move(){
		super.move();
		System.out.println(" �����մϴ�.");
	}
}

class Dove extends Animal{
	void move(){
		super.move();
		System.out.println(" ���ƴٴմϴ�.");
	}
}