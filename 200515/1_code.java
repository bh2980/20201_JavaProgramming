class Car{
	private int mileage;
	
	void goStraight(int distance){
		System.out.println(distance+"m �����߽��ϴ�.");
		mileage += distance;
	}
	
	void turnLeft(){
		System.out.print("��ȸ�� �� ");
	}
	
	void turnRight(){
		System.out.print("��ȸ�� �� ");
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
		
		System.out.print("�� ����Ÿ��� "+c.getMileage()+"�Դϴ�.");
	}
}