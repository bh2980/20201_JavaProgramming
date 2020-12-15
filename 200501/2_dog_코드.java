import java.util.Scanner;

class DogTest{
	public static void main(String [] args){
		Dog d = new Dog();
		String [] bstate = new String[3];
	
		bstate = d.State();
		System.out.printf("%s(이)는 %s이며 %s인 %s입니다.\n", d.Name(), bstate[1], bstate[2], bstate[0]);
		d.HandUp();
		d.Come();
		d.HandUp();
		d.HandUp();
		d.HandUp();
		d.HandDown();
		d.HandDown();
		d.HandDown();		
	}
}

class Dog{
	
	String dname;
	String [] kind = {"골든 리트리버", "말라뮤트", "허스키", "진돗개", "치와와", "삽살개", "시바", "닥스훈트"};
	String [] sex = {"수컷", "암컷"};
	String [] color = {"갈색", "검은색", "흰색", "누런색"};
	int hand;
	double come=-1;
	
	String Name(){
		Scanner s = new Scanner(System.in);
		
		System.out.print("이름을 지어주세요 : ");
		dname = s.nextLine();
		
		return dname;
	}
	
	void Come(){
		System.out.println(dname+"(이)를 불렀습니다.");
		
		while(true){
			System.out.println("\""+dname+"!\"");
			come = Math.random()*8;
			if(come>3){
				System.out.println(dname+"(이)가 당신에게 달려옵니다.");
				break;
			}
			else{
				System.out.println("아...못 들었나보네요. 다시 불러볼까요?");
			}
		}
	}
	
	String[] State(){
		String [] state = new String[3];
		
		state[0] = kind[(int)(Math.random()*8)];
		state[1] = sex[(int)(Math.random()*2)];
		state[2] = color[(int)(Math.random()*4)];
		
		return state;
	}
	
	void HandUp(){
		System.out.println("\"손!\"");
		if(come<0) System.out.println("가까이 와야 가능합니다.");
		else{
			if(hand==2) System.out.println(dname+"(이)는 뒷발도 올려야 하는지 고민하는 표정이다.");
			else if(hand==1){
				System.out.println(dname+"(이)는 왼발도 내밀었다.");
				hand++;
			}
			else{
				System.out.println(dname+"(이)는 오른발을 내밀었다.");
				hand++;
			}
		}
	}
	
	void HandDown(){
		System.out.println("\"손내려!\"");
		if(come<0) System.out.println("가까이 와야 가능합니다.");
		else{
			if(hand==2){
				System.out.println(dname+"(이)는 왼발을 내렸다.");
				hand--;
			}
			else if(hand==1){
				System.out.println(dname+"(이)는 오른발을 마저 내렸다.");
				hand--;
			}
			else{
				System.out.println(dname+"(이)는 멀뚱히 나를 쳐다보고있다.");
			}
		}
	}
}