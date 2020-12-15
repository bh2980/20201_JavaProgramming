class Car{
	private int mileage;
	
	void goStraight(int distance){
		System.out.println(distance+"m 직진했습니다.");
		mileage += distance;
	}
	
	void turnLeft(){
		System.out.print("우회전 후 ");
	}
	
	void turnRight(){
		System.out.print("좌회전 후 ");
	}
	
	int getMileage(){
		return mileage;
	}
}

class Drive{
	public static void main(String [] args){
		Car c = new Car();
		
		c.goStraight(40-15);
		c.turnLeft();
		c.goStraight(50-20);
		c.turnRight();
		c.goStraight(15);
		c.turnLeft();
		c.goStraight(20);
		
		System.out.print("총 주행거리는 "+c.getMileage()+"입니다.");
	}
}