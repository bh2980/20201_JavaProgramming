class TexttoInt{
	public static void main(String [] args){
		
		String[] s = {"123", "45", "백"};
		
		try{
			for(int i=0;i<s.length;i++){
				System.out.println(transInt(s[i]));
			}
		}catch(NumberFormatException nfe){
			System.out.println("배열에는 정수꼴만 들어갈 수 있습니다.");
		}
	}
	
	static int transInt(String s) throws NumberFormatException{
		
		int in = 0;
		
		in = Integer.parseInt(s);
		
		return in;
	}
}