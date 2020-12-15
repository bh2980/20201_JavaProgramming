import java.util.Scanner;

//length, charAt만 사용가능.

class StringManipulate{
	
	String concat(String s1, String s2){
		String s3 = s1+s2;
		
		return s3;
	}

	String toUpper(String s){
		String a = "";
		String [] sentence = new String[s.length()];
		String [] upper = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)>90) sentence[i] = upper[s.charAt(i)-97];//a=97
			else sentence[i] = upper[s.charAt(i)-65];//A=65
		}
		
		for(String x : sentence){
			a += x;
		}
		
		return a;
	}
	
	boolean equals(String s1, String s2){
		boolean same = false;
		int i=0;
		
		if(s1.length() == s2.length()){
			for(i=0; i<s1.length(); i++){
				if(s1.charAt(i) != s2.charAt(i)) break;
			}
			if(i == s1.length()) same = true;
		}
		
		return same;
	}
}

class HW8_1{
	
	public static void main(String [] args){
		
		Scanner s = new Scanner(System.in);
		StringManipulate m = new StringManipulate();
		String s1, s2;
		
		System.out.print("문장 1: ");
		s1 = s.nextLine();
		System.out.print("문장 2: ");
		s2 = s.nextLine();
		
		System.out.println("문장 1과 문장 2 연결 결과: "+m.concat(s1, s2));
		System.out.println("문장 1 대문자 변환 결과: "+m.toUpper(s1));
		System.out.println("문장 1과 문장2의 일치 여부: "+m.equals(s1, s2));
	}
}