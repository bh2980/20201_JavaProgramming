import java.util.Scanner;

class InverseCommend{
	public static void main(String [] args){
		char [] exsen;
		int m=0;
		
		while(true){
			if(args.length!=1){
				System.out.print("[입력오류]하나의 문자열을 입력하지 않아 프로그램을 종료합니다.");
				return;
			}
			break;
		}
		
		String sen = args[0];
		exsen = new char[sen.length()];
		
		for(int i=0;i<sen.length();i++){
			exsen[i] = sen.charAt(sen.length()-1-i);
		}
		
		for(int i=0;i<exsen.length;i++){
			System.out.printf("%c", exsen[i]);
		}
	}
}