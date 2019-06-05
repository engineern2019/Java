abstract class draws{
    abstract public void drawing();
}

class line extends draws{
    public void drawing(){
        System.out.println("drawing line");
    }
}

class circle extends draws{
    public void drawing(){
        System.out.println("drawing circle");
    }
}

class testing{
    public static void main(String xyz[]){
        line x= new line();
        letsdraw(x);
        circle c=new circle();
        letsdraw(c);
    }
    public static void letsdraw(draws d){
        d.drawing();
    }
}