//Radio, dog, Bicycle, Lion

class RadioTest{
	public static void main(String [] args){
		Radio r = new Radio();
		String [] rstate = new String[2];
		
		rstate = r.State();
		System.out.print("�� ������ "+rstate[0]+"���� ���������, "+rstate[1]+"���̰�, "+(r.power==true?"�����ֽ��ϴ�.\n":"�����ֽ��ϴ�\n"));
		r.On();
		System.out.print("�� ������ "+rstate[0]+"���� ���������, "+rstate[1]+"���̰�, "+(r.power==true?"�����ֽ��ϴ�.\n":"�����ֽ��ϴ�\n"));
		r.On();
		r.Off();
		r.Off();
		r.On();
		r.ChannelUp();
		r.ChannelUp();
		r.ChannelUp();
		r.ChannelUp();
		r.ChannelUp();
		r.ChannelUp();
		r.ChannelUp();
		r.ChannelUp();
		r.ChannelUp();
		r.ChannelUp();
		r.ChannelDown();
		r.ChannelDown();
		r.ChannelDown();
		r.ChannelDown();
		r.ChannelDown();
		r.ChannelDown();
		r.ChannelDown();
		r.twokick();
	}
}

class Radio{
	
	boolean power;
	String [] color = {"����", "���", "�Ķ�", "�ʷ�", "�γ�γ�"};
	String [] company = {"�Ｚ", "LG", "����", "��Ű��", "����ζ�", "Ž��Ž��"};
	int channel;
	
	String[] State(){
		String [] state = new String[2];
		state [0] = company[(int)(Math.random()*6)];
		state [1] = color[(int)(Math.random()*5)];
		
		return state;
	}
	
	void On(){
		if(power==true) System.out.println("�̹� ���� �����Դϴ�.");
		else{
			power = true; 
			System.out.println("������ �׽��ϴ�.");
		}
	}
	
	void Off(){
		if(power == false) System.out.println("�̹� ���� �����Դϴ�.");
		else{
			power = false; 
			System.out.println("������ �����ϴ�.");
		}
	}
	
	void ChannelUp(){
		if(power == false) System.out.println("������ ���ּ���.");
		else{
			channel++;
			
			String [] name = {"KBS", "SBS", "MBC", "JTBC", "TvN", "Mnet", "KNU"};
			
			System.out.print(name[channel%7]+"��� ��...\n");
		}
	}
	
	void ChannelDown(){
		if(power == false) System.out.println("������ ���ּ���.");
		else{
			channel--;
			
			if(channel<0) channel += 8;
			
			String [] name = {"KBS", "SBS", "MBC", "JTBC", "TvN", "Mnet", "KNU"};
			
			System.out.print(name[channel%7]+"��� ��...\n");
		}
	}
	
	void twokick(){
		if(power == false) System.out.println("��� �ѹ� ������ �Ѻ�����");
		else{
			System.out.print("����(��)�� �̴ܿ�����(��)�� �����Ͽ���.\n");
			System.exit(1);
		}
	}
}