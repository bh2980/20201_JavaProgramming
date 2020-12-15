import java.util.Scanner;

class LionTest{
	public static void main(String [] args){
		Lion l = new Lion();
		
		String name = l.Name();
		System.out.println(name+"�� "+l.State()[0]+" "+l.State()[2]+" "+l.State()[1]+" �����Դϴ�.");
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
		
		System.out.print("�̸��� �����ּ��� : ");
		name = s.nextLine();
		
		return name;
	}
	
	void Come(){
		System.out.println(name+"(��)�� �ҷ����ϴ�.");
		
		while(true){
			System.out.println("\""+name+"!\"");
			come = Math.random()*8;
			if(come>4){
				System.out.println(name+"(��)�� ������ �� �ɾ�ɴϴ�.");
				break;
			}
			else if(come>7){
				System.out.println(name+"(��)�� �ͷ��� �پ�ɴϴ�.");
				System.out.println(name+"(��)���� ���� ����ϼ̽��ϴ�.");
				System.exit(1);
			}
			else{
				System.out.println("��...�� ��������׿�. �ٽ� �ҷ������?");
			}
		}
	}
	
	String[] State(){
		String [] spec = {"���Ⱑ ����", "��θӸ���", "������ �ڰ� �ִ�", "����"};
		String [] sex = {"����", "����"};
		String [] body = {"�ٸ��� ��", "����", "ū", "���� ū"};
		String [] state = new String[3];
		
		state[0] = spec[(int)(Math.random()*4)];
		state[1] = sex[(int)(Math.random()*2)];
		state[2] = body[(int)(Math.random()*4)];
		
		return state;
	}
	
	void HandUp(){
		System.out.println("\"��!\"");
		if(hand==2){
			come = Math.random()*8;
			if(come<7) System.out.println(name+"(��)�� ��Ƹ����� ���� ����ϴ� ǥ���̴�.");
			else{
				System.out.println(name+"(��)�� ���ڱ� ���� ������ �޷���ϴ�!");
				System.out.println(name+"(��)���� ���� ����ϼ̽��ϴ�.");
				System.exit(1);
			}
		}
		else if(hand==1){
			come = Math.random()*8;
			if(come<7){
				System.out.println(name+"(��)�� �޹ߵ� ���о���.");
				hand++;
			}
			else{
				System.out.println(name+"(��)�� ���ڱ� ���� ������ �޷���ϴ�!");
				System.out.println(name+"(��)���� ���� ����ϼ̽��ϴ�.");
				System.exit(1);
			}
		}
		else{
			come = Math.random()*8;
			if(come<7){
				System.out.println(name+"(��)�� �������� ���о���.");
				hand++;
			}
			else{
				System.out.println(name+"(��)�� ���ڱ� ���� ������ �޷���ϴ�!");
				System.out.println(name+"(��)���� ���� ����ϼ̽��ϴ�.");
				System.exit(1);
			}
		}
	}
	
	void HandDown(){
		System.out.println("\"�ճ���!\"");
		if(hand==2){
			come = Math.random()*8;
			if(come<7){
				System.out.println(name+"(��)�� �޹��� ���ȴ�.");
				hand--;
			}
			else{
				System.out.println(name+"(��)�� ���ڱ� ���� ������ �޷���ϴ�!");
				System.out.println(name+"(��)���� ���� ����ϼ̽��ϴ�.");
				System.exit(1);
			}
		}
		else if(hand==1){
			come = Math.random()*8;
			if(come<7){
				System.out.println(name+"(��)�� �������� ���� ���ȴ�.");
				hand--;
			}
			else{
				System.out.println(name+"(��)�� ���ڱ� ���� ������ �޷���ϴ�!");
				System.out.println(name+"(��)���� ���� ����ϼ̽��ϴ�.");
				System.exit(1);
			}
		}
		else{
			come = Math.random()*8;
			if(come<7){
				System.out.println(name+"(��)�� �Ը��� �ٽð� �ִ�.");
			}
			else{
				System.out.println(name+"(��)�� ���ڱ� ���� ������ �޷���ϴ�!");
				System.out.println(name+"(��)���� ���� ����ϼ̽��ϴ�.");
				System.exit(1);
			}
		}
	}
}