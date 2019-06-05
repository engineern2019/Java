class mathamatics{
    public void add(int a, int b){
        int result=a+b;
        System.out.println(" Result is = "+result);
    }
    public void subtract(int a, int b){
        int result=a-b;
        System.out.println(" Result is = "+result);
    }
}
class claculator extends mathamatics{
    public void multiplication(int x, int y){
        int result=x*y;
        System.out.println(" Result is = "+result);
    }
    public void subtraction(int f, int g,){
        int result=f/g;
        System.out.println(" Result is = "+result);
    }
}

class testint{
    public static void main(String xyz[]){
        claculator.x=new calculator();
    }
}