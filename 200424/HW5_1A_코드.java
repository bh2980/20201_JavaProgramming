import java.util.Scanner;

class Commend{
	public static void main(String [] args){
		char [] vowel = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		int m=0;
		
		while(true){
			if(args.length!=1){
				System.out.print("[�Է¿���]�ϳ��� ���ڿ��� �Է����� �ʾ� ���α׷��� �����մϴ�.");
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
		
		System.out.printf("���� ���� : %d\n�������� : %d", sen.length()-m, m);
	}
}