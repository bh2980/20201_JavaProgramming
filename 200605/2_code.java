class ����{
	private int ����;
	
	����(){
		���� = (int)(Math.random()*101);
	}
	
	int get����(){
		return ����;
	}
}

class ���� extends ����{}

class ���� extends ����{}

class ���� extends ����{}

class ���� extends ����{}

class �л�{
	void report(Object o){
		if(o instanceof ����){
			���� s = (����)o;
			System.out.println(s.getClass().getName()+" ���� : "+s.get����());
		}
		else System.out.println("������ �ƴմϴ�");
	}
}

class SubjectTest{
	public static void main(String [] args){
		���� ���� = new ����();
		���� ���� = new ����();
		���� ���� = new ����();
		���� ���� = new ����();
		�л� �л� = new �л�();
		
		�л�.report(����);
		�л�.report(����);
		�л�.report(����);
		�л�.report(����);
		�л�.report(�л�);
	}
}