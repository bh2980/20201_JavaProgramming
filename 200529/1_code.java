class FigureTest{
	public static void main(String [] args){
		
		Circle c = new Circle(3);
		Circle c2 = new Circle(1);
		EquilateralTriangle t = new EquilateralTriangle(3);
		
		System.out.println(t);
		System.out.println(c);
		System.out.println(c2);

		System.out.printf("�� �� ���� �յ��� %s", c.equals(c2)?"�½��ϴ�":"�ƴմϴ�");
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
		return String.format("�� ������ %s�̰�, �ѷ��� %.2f, ���̴� %.2f�Դϴ�.\n", a.getClass().getName(), d, s);
	}
}

class Circle extends Figure{//������
	
	double r;
	
	Circle(double r){
		super(r);
		this.r = r;
	}
	
	@Override
	public String toString(){
		return String.format("%s��, �������� %.2f�Դϴ�.\n", super.toString(this), r);
	}
	
	public boolean equals(Circle c){
		if(this.r == c.r) return true;
		else return false;
	}
}

class EquilateralTriangle extends Figure{//�Ѻ��� ����
	
	double l, h;
	
	EquilateralTriangle(double l){
		super(l, l/2*Math.sqrt(3));
		this.l = l;
		h = l/2*Math.sqrt(3);
	}
	
	@Override
	public String toString(){
		return String.format("%s�� �ﰢ���� �Ѻ��� ���̴� %.2f�̰�, ���̴� %.2f�Դϴ�.\n", super.toString(this), l, h);
	}
}