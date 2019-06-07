class Devision{
    public static void main(String data[]){
        int fst,scn,rsl;
        fst=scn=rsl=0;
        try{
            fst=Integer.parseInt(data[0]);
            scn=Integer.parseInt(data[1]);
            rsl=fst/scn;
            System.out.println("Result - = "+rsl);
        }
        catch(NumberFormatException u1){
            System.out.println("Only Digits");
        }
        catch(IndexOutOfBoundsException u2){
            System.out.println("More Values");
        }
        catch(ArithmeticException u3){
            System.out.println("No -0-'s Please'");
        }
    }
}