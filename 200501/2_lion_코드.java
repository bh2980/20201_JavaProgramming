import java.util.Scanner;

class LionTest{
	public static void main(String [] args){
		Lion l = new Lion();
		
		String name = l.Name();
		System.out.println(name+"은 "+l.State()[0]+" "+l.State()[2]+" "+l.State()[1]+" 사자입니다.");
		l.Come();
		l.HandUp();
		l.HandUp();
		l.HandUp();
		l.HandUp();
		l.HandDown();
		l.HandDown();
		l.HandDown();
		l.HandDown();
	}
}

class Lion{
	
	String name;
	int hand;
	double come;
	
	String Name(){
		Scanner s = new Scanner(System.in);
		
		System.out.print("이름을 지어주세요 : ");
		name = s.nextLine();
		
		return name;
	}
	
	void Come(){
		System.out.println(name+"(이)를 불렀습니다.");
		
		while(true){
			System.out.println("\""+name+"!\"");
			come = Math.random()*8;
			if(come>4){
				System.out.println(name+"(이)가 귀찮은 듯 걸어옵니다.");
				break;
			}
			else if(come>7){
				System.out.println(name+"(이)가 맹렬히 뛰어옵니다.");
				System.out.println(name+"(이)에게 물려 사망하셨습니다.");
				System.exit(1);
			}
			else{
				System.out.println("아...못 들었나보네요. 다시 불러볼까요?");
			}
		}
	}
	
	String[] State(){
		String [] spec = {"갈기가 멋진", "우두머리인", "낮잠을 자고 있는", "비만인"};
		String [] sex = {"수컷", "암컷"};
		String [] body = {"다리가 긴", "작은", "큰", "얼굴이 큰"};
		String [] state = new String[3];
		
		state[0] = spec[(int)(Math.random()*4)];
		state[1] = sex[(int)(Math.random()*2)];
		state[2] = body[(int)(Math.random()*4)];
		
		return state;
	}
	
	void HandUp(){
		System.out.println("\"손!\"");
		if(hand==2){
			come = Math.random()*8;
			if(come<7) System.out.println(name+"(이)는 잡아먹을지 말지 고민하는 표정이다.");
			else{
				System.out.println(name+"(이)가 갑자기 입을 벌리고 달려듭니다!");
				System.out.println(name+"(이)에게 물려 사망하셨습니다.");
				System.exit(1);
			}
		}
		else if(hand==1){
			come = Math.random()*8;
			if(come<7){
				System.out.println(name+"(이)는 왼발도 내밀었다.");
				hand++;
			}
			else{
				System.out.println(name+"(이)가 갑자기 입을 벌리고 달려듭니다!");
				System.out.println(name+"(이)에게 물려 사망하셨습니다.");
				System.exit(1);
			}
		}
		else{
			come = Math.random()*8;
			if(come<7){
				System.out.println(name+"(이)는 오른발을 내밀었다.");
				hand++;
			}
			else{
				System.out.println(name+"(이)가 갑자기 입을 벌리고 달려듭니다!");
				System.out.println(name+"(이)에게 물려 사망하셨습니다.");
				System.exit(1);
			}
		}
	}
	
	void HandDown(){
		System.out.println("\"손내려!\"");
		if(hand==2){
			come = Math.random()*8;
			if(come<7){
				System.out.println(name+"(이)는 왼발을 내렸다.");
				hand--;
			}
			else{
				System.out.println(name+"(이)가 갑자기 입을 벌리고 달려듭니다!");
				System.out.println(name+"(이)에게 물려 사망하셨습니다.");
				System.exit(1);
			}
		}
		else if(hand==1){
			come = Math.random()*8;
			if(come<7){
				System.out.println(name+"(이)는 오른발을 마저 내렸다.");
				hand--;
			}
			else{
				System.out.println(name+"(이)가 갑자기 입을 벌리고 달려듭니다!");
				System.out.println(name+"(이)에게 물려 사망하셨습니다.");
				System.exit(1);
			}
		}
		else{
			come = Math.random()*8;
			if(come<7){
				System.out.println(name+"(이)는 입맛을 다시고 있다.");
			}
			else{
				System.out.println(name+"(이)가 갑자기 입을 벌리고 달려듭니다!");
				System.out.println(name+"(이)에게 물려 사망하셨습니다.");
				System.exit(1);
			}
		}
	}
}