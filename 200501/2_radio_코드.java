//Radio, dog, Bicycle, Lion

class RadioTest{
	public static void main(String [] args){
		Radio r = new Radio();
		String [] rstate = new String[2];
		
		rstate = r.State();
		System.out.print("이 라디오는 "+rstate[0]+"에서 만들었으며, "+rstate[1]+"색이고, "+(r.power==true?"켜져있습니다.\n":"꺼져있습니다\n"));
		r.On();
		System.out.print("이 라디오는 "+rstate[0]+"에서 만들었으며, "+rstate[1]+"색이고, "+(r.power==true?"켜져있습니다.\n":"꺼져있습니다\n"));
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
	String [] color = {"빨간", "노란", "파란", "초록", "부농부농"};
	String [] company = {"삼성", "LG", "애플", "노키아", "모토로라", "탐앤탐스"};
	int channel;
	
	String[] State(){
		String [] state = new String[2];
		state [0] = company[(int)(Math.random()*6)];
		state [1] = color[(int)(Math.random()*5)];
		
		return state;
	}
	
	void On(){
		if(power==true) System.out.println("이미 켜진 상태입니다.");
		else{
			power = true; 
			System.out.println("라디오를 켰습니다.");
		}
	}
	
	void Off(){
		if(power == false) System.out.println("이미 꺼진 상태입니다.");
		else{
			power = false; 
			System.out.println("라디오를 껐습니다.");
		}
	}
	
	void ChannelUp(){
		if(power == false) System.out.println("라디오를 켜주세요.");
		else{
			channel++;
			
			String [] name = {"KBS", "SBS", "MBC", "JTBC", "TvN", "Mnet", "KNU"};
			
			System.out.print(name[channel%7]+"재생 중...\n");
		}
	}
	
	void ChannelDown(){
		if(power == false) System.out.println("라디오를 켜주세요.");
		else{
			channel--;
			
			if(channel<0) channel += 8;
			
			String [] name = {"KBS", "SBS", "MBC", "JTBC", "TvN", "Mnet", "KNU"};
			
			System.out.print(name[channel%7]+"재생 중...\n");
		}
	}
	
	void twokick(){
		if(power == false) System.out.println("어디 한번 전원을 켜보세요");
		else{
			System.out.print("라디오(이)가 이단옆차기(을)를 시전하였다.\n");
			System.exit(1);
		}
	}
}