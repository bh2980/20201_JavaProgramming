import java.util.Scanner;

class Sen{
	public static void main(String [] args){
		
		Scanner s = new Scanner(System.in);
		String sentence, word;
		int time=0, bunjje=1;
		
		System.out.print("���� : ");
		sentence = s.nextLine();
		System.out.print("�˻��� �ܾ� : ");
		word = s.nextLine();
		
		for(int i=0;i<sentence.length();i++){
			
			String cor = sentence.substring(i, i+1);
			
			if(cor.equals(" ")) bunjje++;
			
			if(cor.equalsIgnoreCase(word.substring(0, 1))){
				if((i+word.length())<=(sentence.length())){
					cor = sentence.substring(i, i+word.length());
					if(cor.equalsIgnoreCase(word)){
						time++;
						System.out.print(bunjje+"��°, ");
					}
				}
			}
		}
		if(time==0){
			System.out.printf("�� %dȸ �˻��Ǿ����ϴ�.", time);
		}
		else{
			System.out.print("\b\b ");
			System.out.printf("�������� \"%s\"(��)�� �˻��Ǿ�, �� %dȸ �˻��Ǿ����ϴ�.", word, time);
		}
	}
}
