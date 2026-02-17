

public class q1 {
    public static void main(String[] args) {
       int n =19;
       int sum=0;
       while(n>0){
        int digit=n%10;
        sum=sum+(digit*digit);
        n=n/10;

       }
       System.out.println(sum);
    }
}
