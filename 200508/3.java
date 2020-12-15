import java.util.Scanner;

class Bindo{
	public static void main(String [] args){
		String sentence;
		int n;
		Scanner s = new Scanner(System.in);
		
		System.out.print("πÆ¿Â: ");
		sentence = s.nextLine();
		
		for(char i='A'; i<='Z'; i++){
			n = 0;
			for(int j=1; j<sentence.length(); j++){
				char a = sentence.charAt(j);
				a = Character.toUpperCase(a);
				
				if(a == i){
					n++;
				}
			}
			if(n!=0) System.out.printf("%c: %d\n", i, n);
		}
	}
}