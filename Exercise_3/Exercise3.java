public class Exercise3{
    public static boolean EqualSumChecker(int a,int b,int c){
        if((a+b)==c) {return true;}
        else{return false;}
    }
    public static void main(String[] args){
        int a=1;
        int b=2;
        int c=1;
        System.out.println(EqualSumChecker(a,b,c));
    }
}