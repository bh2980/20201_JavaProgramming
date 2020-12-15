import java.util.Scanner;

class XY{
	public static void main(String [] args){
		int a, b;
		Scanner s = new Scanner(System.in);
		
		System.out.print("a:");
		a = s.nextInt();
		System.out.print("b:");
		b = s.nextInt();
		
		if(a>b){
			int tmp;
			
			tmp = a;
			a = b;
			b = tmp;
		}
		
		for(int i=a; i<b+1; i++){
			if(i<0){
				int tmp2 = i*(-1);
				if((tmp2%2)==1) System.out.printf("(%d, %.2f)\n", i, Math.sin(i)*3);
			}
			else if((i>0) && (i<5)){
				if((i%2)==1) System.out.printf("(%d, %.2f)\n", i, Math.sin(i)*3);
			}
			else{
				if((i%2)==1) System.out.printf("(%d, %.2f)\n", i, Math.sqrt(i*i-5*i+4));
			}
		}
	}
}