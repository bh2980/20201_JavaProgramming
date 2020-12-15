class BicycleTest{
	public static void main(String [] args){
		Bicycle b = new Bicycle();
		String [] bstate = new String[2];
		
		bstate = b.State();
		System.out.print("�� �����Ŵ� "+bstate[0]+"���� ���������, "+bstate[1]+"���̰�, "+((b.gear!=0)?b.gear+"���̰�, ":"")+(b.run==true?"�޸��� ���Դϴ�\n":"�����ֽ��ϴ�\n"));
		b.Run();
		System.out.print("�� �����Ŵ� "+bstate[0]+"���� ���������, "+bstate[1]+"���̰�, "+(b.run==true?"�޸��� ���Դϴ�\n":"�����ֽ��ϴ�\n"));
		b.Stop();
		System.out.print("�� �����Ŵ� "+bstate[0]+"���� ���������, "+bstate[1]+"���̰�, "+(b.run==true?"�޸��� ���Դϴ�\n":"�����ֽ��ϴ�\n"));
		b.Run();
		b.GearUp();
		b.GearUp();
		b.GearUp();
		b.GearUp();
		b.GearDown();
		b.GearDown();
		b.GearDown();
		b.GearDown();
		b.Stop();
		b.twokick();
	}
}

class Bicycle{
	boolean run;
	String [] color = {"����", "���", "�Ķ�", "�ʷ�", "����ũ"};
	String [] company = {"KNU", "JAVA", "C++"};
	int gear=1;
	
	String[] State(){
		String [] state = new String[2];
		state [0] = company[(int)(Math.random()*3)];
		state [1] = color[(int)(Math.random()*5)];
		
		return state;
	}
	
	void Run(){
		run = true;
		System.out.println("�����Ŵ� �޸��� ���Դϴ�.");
	}
	
	void Stop(){
		run = false;
		System.out.println("�����Ŵ� �����ֽ��ϴ�.");
	}
	
	void GearUp(){
		if(run==false) System.out.println("�����߿��� �� �ٲ� �� �ֽ��ϴ�.");
		else{
			if(gear==4) System.out.println("���̻� ���� �� �����ϴ�.");
			else{
				gear++;
				System.out.println("�� �Ѵܰ� �������ϴ�. ���� ���� "+(gear)+"���Դϴ�.");
			}
		}
	}
	
	void GearDown(){
		if(run==false) System.out.println("�����߿��� �� �ٲ� �� �ֽ��ϴ�.");
		else{
			if(gear==1) System.out.println("���̻� ���� �� �����ϴ�.");
			else{
				gear--;
				System.out.println("�� �Ѵܰ� ������ϴ�. ���� ���� "+(gear)+"���Դϴ�.");
			}
		}
	}
	
	void twokick(){
		if(run == false) System.out.println("������(��)�� �޸��⸸�� �������ִ�.");
		else{
			System.out.println("������(��)�� �̴ܿ�����(��)�� �����Ͽ���.\n");
			System.exit(1);
		}
	}
}