class one{
    int a;
    public void msg1(){
        System.out.println("hello");
    }
}

class two extends one{
    int b;
    public void msg2(){
        System.out.println();
    }
}

class inheritedtest{
    public static void main(String xzy[]){
        one ref;
        ref= new two();
        ref.msg2();
        ref.b=15;
    }
}