
import java.util.Scanner;

class pal{
    
    public static void main(String[] args) {
        
        Scanner a= new Scanner(System.in);
        System.out.println("Enter The Number");
        int n=a.nextInt();
        a.close();

        if(n==0){
            System.out.println("Enter Valid number");
        }
        int x=n;
int revnum=0;
        while(x>0){
int d=x%10;
revnum=revnum*10+d;
x=x/10;
        }

if(revnum==n){
    System.out.println("Pallindrome"+" "+revnum);
}
else {
    System.out.println("Not Pallindrome"+" "+revnum);
}
    }
    
}
