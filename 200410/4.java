import java.util.Scanner;

class Search{
	public static void main(String [] args){
		String line, a;
		int length, k=0;
		Scanner s = new Scanner(System.in);
		
		System.out.print("���ڿ� : ");
		line = s.nextLine();
		System.out.print("���� ���� : ");
		a = s.next();
		length = line.length();
		
		for(int i=0;i<length;i++){
			String j = line.substring(i,i+1);
			if(j.equals(a)){
				System.out.printf("%d��° ", i+1);
				k+=1;
			}
		}
		System.out.printf("\n���ڿ� \"%s\"���� ���� %s�� %d�� �˻��Ǿ����ϴ�.", line, a, k);
	}
}