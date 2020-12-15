import java.util.Scanner;

class WhatIsEven{
	public static void main(String [] args){
		
		while(true){
			if(args.length==0){
				System.out.print("[사용법]java WhatIsEven 정수1 정수2...");
				return;
			}
			break;
		}
		
		System.out.println("커맨드 라인 인자들 중 짝수 : ");
		
		for(int i=0;i<args.length;i++){
			if(Integer.parseInt(args[i])%2==0) System.out.print(args[i]+" ");
		}
	}
}