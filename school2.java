class results{
    private int phy,che,mat;
    public void physics(int p){
        if (p>=0&&p<150){
            phy=p;
        }
        else{
            phy=-1;
            System.out.println("Invalid Physics Marks");
        }
    }
    public void chemistry(int t){
        if (t>=0 && t<150){
            che=t;
        }
        else{
            che=-1;
            System.out.println("Invalid Chemistry Marks");
        }
    }
    public void maths(int h){
        if (h>=0 && h<150){
            mat=h;
        }
        else{
            mat=-1;
            System.out.println("Invalid Maths Marks");
        }
    }
    public void showresults(){
        int total;
        if(phy==-1||che==-1||mat==-1){
            System.out.println("No Results");
        }
        else{
            total=phy+che+mat;
            System.out.println("Result Is"+total);
        }
    }
}
    
class school2{
    public static void main(String xyz[]){
        results peter;
        peter=new results();
        peter.physics(50);
        peter.chemistry(90);
        peter.maths(1000);

        peter.showresults();
    }
}