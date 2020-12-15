import java.util.*;

class ExceptionTest{
	public static void main(String [] args){
		ExceptionTest et = new ExceptionTest();
		
		try{
			et.after10();
		}catch(InputMismatchException e){
			System.out.println("나이를 아라비아 숫자로 입력하지 않은 문제 메인에서 해결");
		}catch(NegativeAgeException nae){
			System.out.println(nae.getMessage());
			nae.printStackTrace();
		}catch(TooOldException toe){
			System.out.println(toe.getMessage());
		}
	}
	
	void after10() throws InputMismatchException, NegativeAgeException, TooOldException{
		Scanner s = new Scanner(System.in);
		
		int age;
		System.out.print("나이 : ");
		age = s.nextInt();
		
		if(age<0) throw new NegativeAgeException();
		else if(age>=200) throw new TooOldException();
		
		System.out.format("10년 후의 나이는 %d세입니다.", age+10);
	}
}

class NegativeAgeException extends Exception{
	NegativeAgeException(){
		super("[음수나이예외] 나이를 음수로 설정할 수 없습니다.");
	}
}

class TooOldException extends Exception{
	TooOldException(){
		super("[비정상나이예외] 나이가 200세 이상일 수 없습니다.");
	}
}