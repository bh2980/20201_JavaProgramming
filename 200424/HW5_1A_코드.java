import java.util.Scanner;

class Commend{
	public static void main(String [] args){
		char [] vowel = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		int m=0;
		
		while(true){
			if(args.length!=1){
				System.out.print("[입력오류]하나의 문자열을 입력하지 않아 프로그램을 종료합니다.");
				return;
			}
			break;
		}
		
		String sen = args[0];
		
		for(int i=0;i<sen.length();i++){
			for(int j=0;j<vowel.length;j++){
				if(sen.charAt(i)==vowel[j]){
					m++;
				}
			}
		}
		
		System.out.printf("자음 개수 : %d\n모음개수 : %d", sen.length()-m, m);
	}
}