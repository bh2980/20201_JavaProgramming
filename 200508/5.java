import java.util.Scanner;

class DogTest{
	public static void main(String [] args){
		Dog d = new Dog();
	
		System.out.printf("내 강아지의 이름은 %s, 포만감은 %d입니다.\n", d.name, d.hung);
		
		d.play();
	}
}

class Dog{
	String name = "개똥이";
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
		
		System.out.print("먹이 개수: ");
		feed = s.nextInt();
		
		if(feed<0){
			System.out.print("먹을걸로 장난치지 마세요~!");
			System.exit(1);
		}
		else{
			if(hung + feed<10){
				System.out.printf("잘 먹었습니다. ^__^. 포만감이 %d이 되었습니다.", hung+feed);
			}
			else if(hung + feed>10){
				System.out.printf("적당히 잘 먹었습니다. ^__^. 포만감이 10이 되었습니다.");
			}
		}
	}
	
	void play(){
		if(hung>=7){
			System.out.print("재미있네요");
		}
		else{
			eat();
		}
	}
}