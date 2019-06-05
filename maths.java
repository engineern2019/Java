class maths{
    public void addition(int A, int B){
        int result;
        result=A+B;
        System.out.println("Result : "+result);
    }
    public int subtract(int A, int B){
        int answer;
        answer=A-B;
        return answer;
    }
}

class test{
    public static void main(String xyz[]){
        maths x;
        x = new maths();
        x = addition(2,10);
        System.out.println("Result is"+ x.subtract(100,5));
    }
}