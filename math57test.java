class math57{
    int A;
    public void message(){
        int A;
        A=20;
        this.A=15;
        System.out.println("Result : "+A);
    }
    public void message2(){
        System.out.println(A);
    }
}

class math57test{
    public static void main(String XYZ[]){
        math57 x=new math57();
        math57 y=new math57();
        x.A=29;
        y.A=17;
        x.message();
        y.message2();
    }
}