class college{
    private int phy, total;
    flout per;
    private void calculation(){
        total=phy;
        per=total*100/300;
    }
    public void physics(int p){
        if(p>=0 && p<=150){
            phy=p;
        }
        else{
            phy=-1;
            System.out.pointln("invalid marks");
        }
    }
    public void showresults(){
        if(phy==-1){
            System.out.println("invalid Results");
        }
        else{
            calculation();
            System.out.println("total = "+ total);
            System.out.println("percentage = "+per);
        }
    }
}
class test3{
    public static void main(string xyz[]){;
    college abc;
    abc= new college();
    abc.physics(100);

    abc.showresults();
    }
}