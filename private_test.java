class private{
    protected int B;
    private int A;
    public void msg(){
        System.out.println("Understanding");
    }
    public void msg2(){
        A++;
        System.out.println(A);
    }
}
class private_two extends private{
    public void institute(){
        System.out.println("Leicster");
    }
}
class private_test{
    public static void main(String View[]){
        private_two m=new private_two;
        m.institute();
        m.msg2();
        m.msg();
    }
}