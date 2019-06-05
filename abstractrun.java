abstract class institute{
    abstract public void tax(int salary);
    public void msg(){
        System.out.println(" Presentation ");
    }
}

class institute2 extends institute{
    public void tax(int salary){
        float result;
        result=salary*21/100;
        System.out.println(result);
    }
}

class institute3 extends institute2{
    public void total(){
        float result2;
        result2=result-salary;
        System.out.println(result2);
    }
}

class abstractrun{
    public static void main(String xyz[]){
        institute m=new institute2();
        institute3 h=new institute3();
        m.tax(200);
        h.total();
    }
}