class AbsentiesException extends exception{}

class AccountsNBS{
    public float tax(int Salary, int Absenties)throws AbsentiesException{
        float t;
        if (Absenties>=7){
            AbsentiesException l=new AbsentiesException();
            throw l;
        }
        else{
            t = salary*21/100;
        }
        return t;
    }
}

class AccountsHR{
    public static void main(String xyz[]){
        AccountsNBS x=new AccountsNBS();
        try{
            flout netsalary=2000-x.tax(2000,3);
        }
        catch(AbsentiesException h){
            System.out.println("Sorry too many absences");
        }
    }
}