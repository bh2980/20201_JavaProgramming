class TexttoInt{
	public static void main(String [] args){
		
		String[] s = {"123", "45", "��"};
		
		try{
			for(int i=0;i<s.length;i++){
				System.out.println(transInt(s[i]));
			}
		}catch(NumberFormatException nfe){
			System.out.println("�迭���� �����ø� �� �� �ֽ��ϴ�.");
		}
	}
	
	static int transInt(String s) throws NumberFormatException{
		
		int in = 0;
		
		in = Integer.parseInt(s);
		
		return in;
	}
}