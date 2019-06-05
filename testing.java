abstract class draws{
    abstract public void drawing();
}

class line extends draws{
    public void drawing(){
        System.out.println("drawing line");
    }
}

class circle extends draw{
    public void drawings(){
        System.out.println("drawing circle");
    }
}

class testing{
    public static void main(String x[]){
        line x= new line();
        letsdraw(x);
        circle c=new circle();
        letsdraw(c);
    }
    public static void letsdraw(draw d){
        d.drawing();
    }
}