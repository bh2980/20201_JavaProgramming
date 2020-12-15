class FigureTest{
	public static void main(String [] args){
		
		Circle c = new Circle(3);
		Circle c2 = new Circle(1);
		EquilateralTriangle t = new EquilateralTriangle(3);
		
		System.out.println(t);
		System.out.println(c);
		System.out.println(c2);

		System.out.printf("위 두 원은 합동이 %s", c.equals(c2)?"맞습니다":"아닙니다");
	}
}

class Figure{
	final double PI = Math.PI;
	
	private double s, d;
	
	Figure(double r){
		s = PI*Math.pow(r, 2);
		d = 2*PI*r;
	}
	
	Figure(double l, double h){
		s = l*h/2;
		d = 3*l;
	}
	
	public String toString(Object a){
		return String.format("이 도형은 %s이고, 둘레는 %.2f, 넓이는 %.2f입니다.\n", a.getClass().getName(), d, s);
	}
}

class Circle extends Figure{//반지름
	
	double r;
	
	Circle(double r){
		super(r);
		this.r = r;
	}
	
	@Override
	public String toString(){
		return String.format("%s또, 반지름은 %.2f입니다.\n", super.toString(this), r);
	}
	
	public boolean equals(Circle c){
		if(this.r == c.r) return true;
		else return false;
	}
}

class EquilateralTriangle extends Figure{//한변의 길이
	
	double l, h;
	
	EquilateralTriangle(double l){
		super(l, l/2*Math.sqrt(3));
		this.l = l;
		h = l/2*Math.sqrt(3);
	}
	
	@Override
	public String toString(){
		return String.format("%s이 삼각형의 한변의 길이는 %.2f이고, 높이는 %.2f입니다.\n", super.toString(this), l, h);
	}
}