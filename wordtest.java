class StringProcessing{
    public void wordcount(String msg){
        int word=1;
        int i=0;
        while(i<msg.length()){
            if (msg.substring(i,i+1).equals(" ")){
                word++;
            }
            i++;
        }
        System.out.println(word);       
    }
}

class wordtest{
    public static void main(String xyz[]){;
        StringProcessing  abc;
    abc= new StringProcessing();
    abc.wordcount("hello y friend");
    }
}