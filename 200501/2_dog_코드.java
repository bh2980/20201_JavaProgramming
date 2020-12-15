import java.util.Scanner;

class DogTest{
	public static void main(String [] args){
		Dog d = new Dog();
		String [] bstate = new String[3];
	
		bstate = d.State();
		System.out.printf("%s(��)�� %s�̸� %s�� %s�Դϴ�.\n", d.Name(), bstate[1], bstate[2], bstate[0]);
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
	String [] kind = {"��� ��Ʈ����", "�����Ʈ", "�㽺Ű", "������", "ġ�Ϳ�", "��찳", "�ù�", "�ڽ���Ʈ"};
	String [] sex = {"����", "����"};
	String [] color = {"����", "������", "���", "������"};
	int hand;
	double come=-1;
	
	String Name(){
		Scanner s = new Scanner(System.in);
		
		System.out.print("�̸��� �����ּ��� : ");
		dname = s.nextLine();
		
		return dname;
	}
	
	void Come(){
		System.out.println(dname+"(��)�� �ҷ����ϴ�.");
		
		while(true){
			System.out.println("\""+dname+"!\"");
			come = Math.random()*8;
			if(come>3){
				System.out.println(dname+"(��)�� ��ſ��� �޷��ɴϴ�.");
				break;
			}
			else{
				System.out.println("��...�� ��������׿�. �ٽ� �ҷ������?");
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
		System.out.println("\"��!\"");
		if(come<0) System.out.println("������ �;� �����մϴ�.");
		else{
			if(hand==2) System.out.println(dname+"(��)�� �޹ߵ� �÷��� �ϴ��� ����ϴ� ǥ���̴�.");
			else if(hand==1){
				System.out.println(dname+"(��)�� �޹ߵ� ���о���.");
				hand++;
			}
			else{
				System.out.println(dname+"(��)�� �������� ���о���.");
				hand++;
			}
		}
	}
	
	void HandDown(){
		System.out.println("\"�ճ���!\"");
		if(come<0) System.out.println("������ �;� �����մϴ�.");
		else{
			if(hand==2){
				System.out.println(dname+"(��)�� �޹��� ���ȴ�.");
				hand--;
			}
			else if(hand==1){
				System.out.println(dname+"(��)�� �������� ���� ���ȴ�.");
				hand--;
			}
			else{
				System.out.println(dname+"(��)�� �ֶ��� ���� �Ĵٺ����ִ�.");
			}
		}
	}
}