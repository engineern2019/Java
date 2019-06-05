class results{
    int Phy, Che, Mat;
    public void showresults(){
        int total;
        total = Phy+Che+Mat;
        System.out.println("total results"+total);
        if(total>300){
            System.out.println("Pass");
        }
        else{
            System.out.println("failed");
            }
        }
    }

    class school{
        public static void main(String xyz[]){
            results peter, james;
            peter=new results();
            james=new results();
            peter.Mat=55;
            peter.Che=100;
            peter.Phy=90;
            peter.showresults();
        }
    }