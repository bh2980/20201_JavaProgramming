class Member{
	String name;
	int age;
	static int membernumber;
	
	Member(String name, int age){
		this.name = name;
		this.age = age;
		++membernumber;
		System.out.println("�̸��� ���̰� �����ϴ� ��ȣȸ ��� ����");
	}
	
	Member(){
		++membernumber;
		System.out.println("����Ʈ �����ڸ� ���� ��ȣȸ ��� ����");
	}
}

class MemberTest{
	public static void main(String [] args){
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member("�ΰ����", 24);
		
		System.out.printf("�� ��ȣȸ ����� ���� %d�� �Դϴ�", Member.membernumber);
	}
}