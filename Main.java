import java.lang.Math;

public class Main
{
    static void primeNumber(int start,int end){
        int i,num,j;
        int flag=0;
        for(i=start;i<=end;i++){
            flag=0;
            num=(int)Math.sqrt(i);
            for(j=2;j<=num;j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.print(i+" ");
            }
        }
    }
	public static void main(String[] args) {
		int start=20,end=100;
		primeNumber(start,end);
// 		System.out.println("Hello World");
	}
}
