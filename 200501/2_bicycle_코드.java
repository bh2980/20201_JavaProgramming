class BicycleTest{
	public static void main(String [] args){
		Bicycle b = new Bicycle();
		String [] bstate = new String[2];
		
		bstate = b.State();
		System.out.print("이 자전거는 "+bstate[0]+"에서 만들었으며, "+bstate[1]+"색이고, "+((b.gear!=0)?b.gear+"단이고, ":"")+(b.run==true?"달리는 중입니다\n":"멈춰있습니다\n"));
		b.Run();
		System.out.print("이 자전거는 "+bstate[0]+"에서 만들었으며, "+bstate[1]+"색이고, "+(b.run==true?"달리는 중입니다\n":"멈춰있습니다\n"));
		b.Stop();
		System.out.print("이 자전거는 "+bstate[0]+"에서 만들었으며, "+bstate[1]+"색이고, "+(b.run==true?"달리는 중입니다\n":"멈춰있습니다\n"));
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
	String [] color = {"빨간", "노란", "파란", "초록", "핫핑크"};
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
		System.out.println("자전거는 달리는 중입니다.");
	}
	
	void Stop(){
		run = false;
		System.out.println("자전거는 멈춰있습니다.");
	}
	
	void GearUp(){
		if(run==false) System.out.println("주행중에만 기어를 바꿀 수 있습니다.");
		else{
			if(gear==4) System.out.println("더이상 높일 수 없습니다.");
			else{
				gear++;
				System.out.println("기어를 한단계 높였습니다. 현재 기어는 "+(gear)+"단입니다.");
			}
		}
	}
	
	void GearDown(){
		if(run==false) System.out.println("주행중에만 기어를 바꿀 수 있습니다.");
		else{
			if(gear==1) System.out.println("더이상 낮출 수 없습니다.");
			else{
				gear--;
				System.out.println("기어를 한단계 낮췄습니다. 현재 기어는 "+(gear)+"단입니다.");
			}
		}
	}
	
	void twokick(){
		if(run == false) System.out.println("자전거(은)는 달리기만을 벼르고있다.");
		else{
			System.out.println("자전거(이)가 이단옆차기(을)를 시전하였다.\n");
			System.exit(1);
		}
	}
}