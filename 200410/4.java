import java.util.Scanner;

class Search{
	public static void main(String [] args){
		String line, a;
		int length, k=0;
		Scanner s = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		line = s.nextLine();
		System.out.print("추출 문자 : ");
		a = s.next();
		length = line.length();
		
		for(int i=0;i<length;i++){
			String j = line.substring(i,i+1);
			if(j.equals(a)){
				System.out.printf("%d번째 ", i+1);
				k+=1;
			}
		}
		System.out.printf("\n문자열 \"%s\"에서 문자 %s는 %d번 검색되었습니다.", line, a, k);
	}
}