public class rec{

    public static double factorial(double n){
        if(n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args){
double number=10;
double result=factorial(number);
System.out.println(result);
    }


}