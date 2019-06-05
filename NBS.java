class Banks{
    private int amount;
    public void deposit(int money){
        amount+=money;
    }
    public void withdraw(int money){
        if(money<amount){
            amount-=money;
        }
        else{
            System.out.println("Insufficent Funds");
        }
    }
    public void balance(){
        System.out.println("Your Balance Is"+amount);
    }
}
class NBS{
    public static void main(String xyz[]){
        Banks ref;
        ref= new Banks();
    }
}