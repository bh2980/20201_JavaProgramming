import java.util.Scanner;

class Sen{
	public static void main(String [] args){
		
		Scanner s = new Scanner(System.in);
		String sentence, word;
		int time=0, bunjje=1;
		
		System.out.print("문장 : ");
		sentence = s.nextLine();
		System.out.print("검색할 단어 : ");
		word = s.nextLine();
		
		for(int i=0;i<sentence.length();i++){
			
			String cor = sentence.substring(i, i+1);
			
			if(cor.equals(" ")) bunjje++;
			
			if(cor.equalsIgnoreCase(word.substring(0, 1))){
				if((i+word.length())<=(sentence.length())){
					cor = sentence.substring(i, i+word.length());
					if(cor.equalsIgnoreCase(word)){
						time++;
						System.out.print(bunjje+"번째, ");
					}
				}
			}
		}
		if(time==0){
			System.out.printf("총 %d회 검색되었습니다.", time);
		}
		else{
			System.out.print("\b\b ");
			System.out.printf("어절에서 \"%s\"(이)가 검색되어, 총 %d회 검색되었습니다.", word, time);
		}
	}
}
