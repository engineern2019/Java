class words2numbers{
    private String one(int num){
        String pho="";
        switch (num){
            case 1:pho="one";break;
            case 2:pho="two";break;
            case 3:pho="three";break;
            case 4:pho="four";break;
            case 5:pho="five";break;
            case 6:pho="six";break;
            case 7:pho="seven";break;
            case 8:pho="eight";break;
            case 9:pho="nine";break;
            case 10:pho="ten";break;
            case 11:pho="eleven";break;
            case 12:pho="twelve";break;
            case 13:pho="thirteen";break;
            case 14:pho="fourteen";break;
            case 15:pho="fifteen";break;
            case 16:pho="sixteen";break;
            case 17:pho="seventeen";break;
            case 18:pho="eighteen";break;
            case 19:pho="ninteen";break;
        }
        return pho;
    }
    private String ten(int num){
        String pho="";
        switch(num){
            case 20:pho="twenty";break;
            case 30:pho="thirty";break;
            case 40:pho="forty";break;
            case 50:pho="fifty";break;
            case 60:pho="sixty";break;
            case 70:pho="seventy";break;
            case 80:pho="eighty";break;
            case 90:pho="ninty";break;
        }
        return pho;
    }
        public void convert(int num){
            String answer="";
            if(num>=1000 && num<=9999){
                answer=one(num/1000)+" thousand ";
                num=num%1000;
            }
            if(num>=100){
                answer+=one(num/100)+" hundred ";
                num=num%100;            
            }
            if(num>=20 && num<=99){
                answer+=ten(num);
            }
            if(num>=1 && num<=19){
                answer+=one(num);
            }
            System.out.println("Phonatic Value is = "+answer);
        }
}
class words2numbersresults{
    public static void main(String xyz[]){
        words2numbers c=new words2numbers();
        c.convert(2191);
    }
}