import java.util.Scanner;

class Inverse{
	public static void main(String [] args){
		String sentence;
		Scanner s = new Scanner(System.in);
		
		System.out.print("���ڿ�: ");
		sentence = s.nextLine();
		
		System.out.println();
		System.out.print("���Ӹ�: "+sentence.substring(0, 1));
		
		String [] sen = new String[sentence.length()];
		
		for(int i=0;i<sentence.length();i++){
			if(i+1<sentence.length()) sen[i] = sentence.substring(i, i+1);
			else sen[i] = sentence.substring(i);
		}
		
		for(int i=0;i<sentence.length();i++){
			if(sen[i].equals(" ")) System.out.print(sen[i+1]);
		}
		
		System.out.println();
		System.out.print("��������: ");
		
		for(int i=sentence.length()-1;i>=0;i--){
			System.out.print(sen[i]);
		}
	}
}