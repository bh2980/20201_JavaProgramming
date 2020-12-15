class ParkTest{
	public static void main(String [] args){
		Trans [] trans = {new Car(), new Car(), new Bike(), new Car(), new Bike()};
		Garage g = new Garage();
		
		trans[0].run(30);
		trans[2].run(30);
		trans[0].run(60);
		
		for(Trans x : trans){
			g.park(x);
		}
		g.park(new Stone());
	}
}

class Trans{
	protected int wheel, distance;
	
	Trans(){};
	
	Trans(int wheel){
		this.wheel = wheel;
	}
	
	protected void run(int inputdis){
		distance += inputdis;
		System.out.printf("나는 %s이고, %d만큼 직진합니다. 이제까지 총 %d만큼 직진했습니다.\n", getClass().getName(), inputdis, distance);
	}

}

class Car extends Trans{
	protected String madeby;
	
	Car(){
		super(4);
		madeby = "현대";
	}
	
	Car(int wheel, String madeby){
		super(wheel);
		this.madeby = madeby;
	}
}

class Bike extends Trans{
	
	Bike(){
		super(2);
	}
	
	Bike(int wheel){
		super(wheel);
	}
}

class Garage{
	protected int parknbr;
	
	protected void park(Object o){
		
		if(o instanceof Trans){
			
			parknbr++;
			
			if(o instanceof Car){
				Car c = (Car)o;
				
				System.out.println(c.getClass().getName()+"를 차고에 주차했습니다."+"(총 "+parknbr+"대 주차됨)");
			}
			
			else{
				Bike b = (Bike)o;
				
				System.out.println(b.getClass().getName()+"를 차고에 주차했습니다."+"(총 "+parknbr+"대 주차됨)");
			}
		}
		
		else System.out.println(o.getClass().getName()+"은 주차 불가합니다."+"(총 "+parknbr+"대 주차됨)");
	}
}

class Stone{}