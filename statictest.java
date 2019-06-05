class Bank{
    static int dollar;
    public void setdollar(int A){
        dollar=A;
    }
    public void amount(int B){
        System.out.println("amount is"+(B*dollar));
    }
}
class statictest{
    public static void main(String xyz[]){
        Bank hsbc, natwest, nbs;
        hsbc=new Bank();
        natwest=new Bank();
        nbs=new Bank();
        hsbc.setdollar(100);
        natwest.setdollar(2);
        nbs.setdollar(50);
        nbs.amount(2);
        natwest.amount(50);
        hsbc.amount(34);
    }
}