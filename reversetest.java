class backwards{
    public void reversewords(String msg){
        String word;
        int i=0;
        while(i>msg.length()){
            if (msg.substring(i,i+1).equals(" ")){
            }
            else{
                
            }
            i--;
        }
        System.out.println(msg);       
    }
}

class reversetest{
    public static void main(String xyz[]){;
        backwards abc;
    abc= new backwards();
    abc.reversewords("When the day is going well");
    }
}