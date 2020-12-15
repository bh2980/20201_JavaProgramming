import java.util.Scanner;

class gugudan{
	public static void main(String [] args){
		
		int a;
		Scanner s = new Scanner(System.in);
		
		System.out.print("¸î ´Ü : ");
		a = s.nextInt();
		
		for(int i=1; i<10; i++)
			System.out.printf("%d X %d = %d\n", a, i, a*i);
	}
}