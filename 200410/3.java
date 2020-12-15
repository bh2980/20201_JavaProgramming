import java.util.Scanner;

class Yak{
	public static void main(String [] args){
		int a, b, tmp;
		Scanner s = new Scanner(System.in);
		
		System.out.print("a b : ");
		a = s.nextInt();
		b = s.nextInt();
		
		if(b<a){
			tmp = a;
			a = b;
			b = tmp;
		}
		
		for(int i=a; i<=b; i++){
			System.out.printf("%dÀÇ ¾à¼ö : ", i);
			for(int j=1; j<=i; j++){
				if(j==i) System.out.printf("%d", j);
				else{
					if((i%j)==0) System.out.printf("%d, ", j);
				}
			}
			System.out.printf("\n");
		}
	}
}