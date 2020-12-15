import java.util.Scanner;

class Gwaje2{
  public static void main(String [] args){
    double nbr;
    long a, b;
    Scanner s = new Scanner(System.in);
    
    System.out.printf("실수를 입력해주세요 : ");
    nbr = s.nextDouble();
    
    a = (long)nbr>>>63;
    b = (a==0)?(long)nbr:~(long)nbr+1;
    
    System.out.printf("\n절댓값 : %d\n곱한 값 : %d\n몫 : %d\n나머지 : %d\n", b, b<<3, b&7);
  }
}
