class 과목{
	private int 점수;
	
	과목(){
		점수 = (int)(Math.random()*101);
	}
	
	int get점수(){
		return 점수;
	}
}

class 국어 extends 과목{}

class 수학 extends 과목{}

class 영어 extends 과목{}

class 과학 extends 과목{}

class 학생{
	void report(Object o){
		if(o instanceof 과목){
			과목 s = (과목)o;
			System.out.println(s.getClass().getName()+" 점수 : "+s.get점수());
		}
		else System.out.println("과목이 아닙니다");
	}
}

class SubjectTest{
	public static void main(String [] args){
		국어 국어 = new 국어();
		수학 수학 = new 수학();
		영어 영어 = new 영어();
		과학 과학 = new 과학();
		학생 학생 = new 학생();
		
		학생.report(국어);
		학생.report(수학);
		학생.report(영어);
		학생.report(과학);
		학생.report(학생);
	}
}