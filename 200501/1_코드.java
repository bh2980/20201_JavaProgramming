class Dictionary{
	public static void main(String [] args){
		
		while(true){
			if(args.length==0){
				System.out.print("[사용법] Java Dictionary 문자열1 문자열2 문자열3");
				return;
			}
			break;
		}
		
		for(int i=0; i<args.length; i++){
			for(int j=0; j<args.length; j++){
				if(args[i].compareToIgnoreCase(args[j])<0){//i-j
					String tmp;
					
					tmp = args[i];
					args[i] = args[j];
					args[j] = tmp;
				}
			}
		}
		
		for(String x : args){
			System.out.print(x+" ");
		}
	}
}