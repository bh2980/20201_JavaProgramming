import java.util.Scanner;

class Student{
	private String name;
	private int age;
	private double grade;
	
	void setName(String name){
		this.name = name;
	}
	
	String getName(){
		return name;
	}
	
	void setAge(int age){
		if(0<=age && age<200)
			this.age = age;
	}
	
	int getAge(){
		return age;
	}
	
	void setGrade(double grade){
		if(0<=grade && grade<=4.3)
			this.grade = grade; 
	}
	
	double getGrade(){
		return grade;
	}
	
	Student(){
		this("홍길동", 20, 3.0);
	}
	
	Student(String name, int age, double grade){
		setName(name);
		setAge(age);
		setGrade(grade);
	}
	
	public String toString(){
		return String.format("학생정보\n이름 : %s, 나이 : %d, 학점 : %.1f", name, age, grade);
	}
	
}

class StudentTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		String name = "";
		int age = 0;
		double grade = 0;
		
		System.out.print("이름 : ");
		name = s.nextLine();
		System.out.print("나이 : ");
		age = s.nextInt();
		System.out.print("학점 : ");
		grade = s.nextDouble();
		
		Student s1 = new Student(name, age, grade);
		
		System.out.println("학점을 4.3으로 변경합니다.");
		s1.setGrade(4.3);
		
		System.out.print(s1);
	}
}