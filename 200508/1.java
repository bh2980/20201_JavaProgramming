class Password{
	public static void main(String [] args){
		System.out.print("비밀번호:\n");
		
		for(int i=0;i<6;i++){
			System.out.print((int)(Math.random()*10));
		}
	}
}