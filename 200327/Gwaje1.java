import java.util.Scanner;

class Gwaje1{
	public static void main(String [] args){
		int a, b;
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� a�� �Է����ּ���. : ");
		a = s.nextInt();
		System.out.print("���� b�� �Է����ּ���. : ");
		b = s.nextInt();
		
		System.out.printf("a+b : %+15d\n", a+b);
		System.out.printf("a*b : %#-15o\n", a*b);
		System.out.printf("a-b : %#15x\n", a-b);
	}
}