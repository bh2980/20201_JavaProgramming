class Pattern{
	public static void main(String [] args){
		if(args.length==0) System.out.print("[����]java Pattern 3�̻�������");
		else if(Integer.parseInt(args[0])<3) System.out.print("������ ����� �� �����ϴ�. ������ Ȯ�����ּ���.");
		
		int a = Integer.parseInt(args[0]);
		
		if(a%2 == 0){
			for(int i=0; i<a; i++){
				for(int k=0;k<2*(a-i)-2;k++) System.out.print(" ");
				for(int j=0; j<(4*i+1);j++) System.out.print("*");
				System.out.println();
			}
		}
		else{
			for(int i=0; i<(a/2)+1; i++){
				for(int k=(a/2)-i;k>0;k--) System.out.print(" ");
				for(int j=0; j<i+1;j++) System.out.printf("%d", a%10);
				System.out.println();
			}
			for(int i=(a/2)-1; i>=0; i--){
				for(int j=i+1; j>0;j--) System.out.printf("%d", a%10);
				System.out.println();
			}
		}
	}
}