import java.util.Scanner;

class ArrHW{
	public static void main(String [] args){
		int [][] arr = new int[3][2];
		
		initArr(arr);
		System.out.print("\n배열 성분:\n");
		printArr(arr);
		System.out.printf("\n모든 성분의 합 : %d\n", sumArr(arr));
		System.out.print("배열의 열 별 합 : ");
		
		int [] colsum = new int[arr[0].length];
		colsum = colSumArr(arr);
		for(int x : colsum){
			System.out.print(x+" ");
		}
		System.out.printf(" 행 별 합의 최댓값 : %d\n", rowSumMaxArr(arr));
		
		System.out.print("배열의 최댓값의 인덱스 : ");
		int [] indexmax = new int[2];
		indexmax = indexMaxArr(arr);
		System.out.printf("(%d, %d)\n", indexmax[0], indexmax[1]);
		
		System.out.print("\n셔플 후 배열 성분:\n");
		shuffleArr(arr);
		printArr(arr);
	}
	
	static void initArr(int [][] arr){
		Scanner s = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.printf("%d행 %d열 성분 : ", i+1, j+1);
				arr[i][j] = s.nextInt();
			}
		}
		return;
	}
	
	static void printArr(int [][] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}
		return;
	}
	
	static int sumArr(int [][] arr){
		int sum = 0;
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				sum += arr[i][j];
			}
		}
		return sum;
	}
	
	static int[] colSumArr(int [][] arr){
		int sum = 0;
		int [] colsum = new int[arr[0].length];
		
		for(int i=0;i<arr[0].length;i++){
			for(int j=0;j<arr.length;j++){
				sum += arr[j][i];
			}
			colsum[i] = sum;
			sum = 0;
		}
		return colsum;
	}
	
	static int rowSumMaxArr(int [][] arr){
		int max = 0, sum = 0;
		int [] rowsum = new int[arr.length];
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				sum += arr[i][j];
			}
			rowsum[i] = sum;
			sum = 0;
		}
		
		for(int x : rowsum){
			if(x>max) max = x;
		}
		return max;
	}
	
	static int[] indexMaxArr(int [][] arr){
		int max = 0;
		int [] index = new int[2];
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(arr[i][j]>max){
					max = arr[i][j];
					index[0] = i+1;
					index[1] = j+1;
				}
			}
		}
		
		return index;
	}
	
	static void shuffleArr(int [][] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				int nbr1 = (int)(Math.random()*3);
				int nbr2 = (int)(Math.random()*2);
				int tmp;
				
				tmp = arr[i][j];
				arr[i][j] = arr[nbr1][nbr2];
				arr[nbr1][nbr2] = tmp;
			}
		}
		
		return;
	}
}