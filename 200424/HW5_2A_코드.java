import java.util.Scanner;

class WhatIsEven{
	public static void main(String [] args){
		
		while(true){
			if(args.length==0){
				System.out.print("[����]java WhatIsEven ����1 ����2...");
				return;
			}
			break;
		}
		
		System.out.println("Ŀ�ǵ� ���� ���ڵ� �� ¦�� : ");
		
		for(int i=0;i<args.length;i++){
			if(Integer.parseInt(args[i])%2==0) System.out.print(args[i]+" ");
		}
	}
}