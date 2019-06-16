class StringProcessing{
    public void wordcount(String message){
        int word=1;
        int i=0;
        while(i<message.length()){
            if (message.substring(i,i+1).equals(" ")){
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
    abc.wordcount("Programming is very hard and requires me to master through practice");
    }
}