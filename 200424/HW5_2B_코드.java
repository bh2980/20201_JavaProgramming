import java.util.Scanner;

class ToUpward{
	public static void main(String [] args){
		int [] upward;
		
		while(true){
			if(args.length==0){
				System.out.print("[����]java WhatIsEven ����1 ����2...");
				return;
			}
			break;
		}
		
		upward = new int[args.length];
		
		for(int i=0;i<args.length;i++){
			upward[i]=Integer.parseInt(args[i]);
		}
		
		for(int i=0;i<upward.length;i++){
			for(int j=i;j<upward.length;j++){
				if(upward[i]>upward[j]){
					int tmp;
					tmp = upward[i];
					upward[i] = upward[j];
					upward[j] = tmp;
				}
			}
		}
		
		System.out.print("Ŀ�ǵ� ���� ���ڵ� �������� ����: \n");
		
		for(int i=0;i<upward.length;i++){
			System.out.printf("%d ", upward[i]);
		}
	}
}