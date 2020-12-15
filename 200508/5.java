import java.util.Scanner;

class DogTest{
	public static void main(String [] args){
		Dog d = new Dog();
	
		System.out.printf("�� �������� �̸��� %s, �������� %d�Դϴ�.\n", d.name, d.hung);
		
		d.play();
	}
}

class Dog{
	String name = "������";
	int hung = (int)(Math.random()*11);
	Scanner s = new Scanner(System.in);
	
	String name(){
		
		return name;
	}
	
	int hung(){
		
		return hung;
	}
	
	void eat(){
		int feed=0;
		
		System.out.print("���� ����: ");
		feed = s.nextInt();
		
		if(feed<0){
			System.out.print("�����ɷ� �峭ġ�� ������~!");
			System.exit(1);
		}
		else{
			if(hung + feed<10){
				System.out.printf("�� �Ծ����ϴ�. ^__^. �������� %d�� �Ǿ����ϴ�.", hung+feed);
			}
			else if(hung + feed>10){
				System.out.printf("������ �� �Ծ����ϴ�. ^__^. �������� 10�� �Ǿ����ϴ�.");
			}
		}
	}
	
	void play(){
		if(hung>=7){
			System.out.print("����ֳ׿�");
		}
		else{
			eat();
		}
	}
}