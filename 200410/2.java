import java.util.Scanner;

class npack{
	public static void main(String [] args){
		
		int n, i, pack=1, pack2=1;
		Scanner s = new Scanner(System.in);
		
		System.out.print("n : ");
		n = s.nextInt();
		
		for(i=1; i<=n; i++){
			
			pack2 = pack;
			pack *= i;
			
			if(pack/i != pack2){
				System.out.print(n+"! ��� �Ұ�"+"\n"+i+"!�� ���ϴ� �������� overflow �߻�");
			break;
			}
		}
		if(pack/n == pack2) System.out.print(n+"! = "+pack);
	}
}