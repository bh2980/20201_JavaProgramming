class Member{
	String name;
	int age;
	static int membernumber;
	
	Member(String name, int age){
		this.name = name;
		this.age = age;
		++membernumber;
		System.out.println("이름과 나이가 존재하는 동호회 멤버 생성");
	}
	
	Member(){
		++membernumber;
		System.out.println("디폴트 생성자를 통해 동호회 멤버 생성");
	}
}

class MemberTest{
	public static void main(String [] args){
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member("인간사람", 24);
		
		System.out.printf("이 동호회 멤버의 수는 %d명 입니다", Member.membernumber);
	}
}