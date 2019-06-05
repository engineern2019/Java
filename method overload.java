class account{
    public void Tax{
        system.out.println("Tax Rate = " +22.7);
    }
    public void tax(int salary){
        flout T;
        T=salary*22.7/100
        System.out.println("Your Tax = ");
    }
    public void tax(int salary, flout tax.rate){
        flout T;
        T=salary*tax.rate+T;
        system.out.println("Your Tax Is"+T)
    }
}
class method overload{
    public static void main(String xyz[]){
        account x= new account();
        ref.tax();
        ref.tax(2000);
        ref.tax(2000,19);
    }
}