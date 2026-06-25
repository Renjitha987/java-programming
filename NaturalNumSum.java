import java.util.Scanner;
public class NaturalNumSum {
    public static void main(String[] args){
        Scanner Sc =new Scanner(System.in);
        System.out.print("enter the no to find the sum of N natural num");
        int num =Sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println("sum="+sum);
    }
}
