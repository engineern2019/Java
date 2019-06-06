class one{
    public one(){
     System.out.println(1);
    }
    public one(int a){
        System.out.println(1100);
    }
}

class two extends one{
    public two(int a){
        
        System.out.println(2);
    }
    public two(){
        System.out.println(3);
    }
}

class first extends two{
    public first(){
        System.out.println(6);
    }
}

class construct_test{
    public static void main(String XYZ[]){
        first x=new first();
    }
}