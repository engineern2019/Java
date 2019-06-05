class Second{
    int phy, che;
    public void message(){
    System.out.println("Hello");
    System.out.println("My Freind");
    }
}
class test2{
    public static void main(String xyz[]){
        Second x;
        x=new Second();
        x.phy=75;
        x.che=89;
        System.out.println("Result for PHY & CHE ="+x.phy+x.che);
        x.message();
    }
}