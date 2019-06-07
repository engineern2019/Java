class exceptionh{
    public static void main(String xys[]){
    int A,B,C;
    A=B=C=0;
    try{
        A=5;
        B=0;
        C=A/B;
        System.out.println("Result :"+C);
    }
    catch(NumberFormatException exp1){
        System.out.println("Unacceptable Format");
    }
    catch(ArithmeticException exp2){
        System.out.println("Unable to divide by 0, please try again");
    }
}
}