import java.util.Scanner;

class Uc{
	public static void main(String [] args){
		int x, y, tmp = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.print("x y : ");
		x = s.nextInt();
		y = s.nextInt();
		
		if(y>x){
			tmp = x;
			x = y;
			y = tmp;
		}
		
		if(y == 0) System.out.printf("최대 공약수는 %d입니다.", x);
		else{
			while(y != 0){
				tmp = x % y;
				x = y;
				y = tmp;
				
			}	
			System.out.printf("최대 공약수는 %d입니다.", x);
		}
	}
}