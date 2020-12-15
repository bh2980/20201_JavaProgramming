import java.util.*;

class ExceptionTest{
	public static void main(String [] args){
		ExceptionTest et = new ExceptionTest();
		
		try{
			et.after10();
		}catch(InputMismatchException e){
			System.out.println("���̸� �ƶ��� ���ڷ� �Է����� ���� ���� ���ο��� �ذ�");
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
		System.out.print("���� : ");
		age = s.nextInt();
		
		if(age<0) throw new NegativeAgeException();
		else if(age>=200) throw new TooOldException();
		
		System.out.format("10�� ���� ���̴� %d���Դϴ�.", age+10);
	}
}

class NegativeAgeException extends Exception{
	NegativeAgeException(){
		super("[�������̿���] ���̸� ������ ������ �� �����ϴ�.");
	}
}

class TooOldException extends Exception{
	TooOldException(){
		super("[�������̿���] ���̰� 200�� �̻��� �� �����ϴ�.");
	}
}