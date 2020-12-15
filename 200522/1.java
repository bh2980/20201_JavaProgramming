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
		this("ȫ�浿", 20, 3.0);
	}
	
	Student(String name, int age, double grade){
		setName(name);
		setAge(age);
		setGrade(grade);
	}
	
	public String toString(){
		return String.format("�л�����\n�̸� : %s, ���� : %d, ���� : %.1f", name, age, grade);
	}
	
}

class StudentTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		String name = "";
		int age = 0;
		double grade = 0;
		
		System.out.print("�̸� : ");
		name = s.nextLine();
		System.out.print("���� : ");
		age = s.nextInt();
		System.out.print("���� : ");
		grade = s.nextDouble();
		
		Student s1 = new Student(name, age, grade);
		
		System.out.println("������ 4.3���� �����մϴ�.");
		s1.setGrade(4.3);
		
		System.out.print(s1);
	}
}