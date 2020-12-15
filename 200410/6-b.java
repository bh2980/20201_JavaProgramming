class ACTri{
	public static void main(String [] args){
		for(int i=5;i>0;i--){
			for(int k=0;k<5-i;k++) System.out.print(" ");
			for(int j=i;j>0;j--) System.out.print("*");
			System.out.print("\n");
		}
	}
}