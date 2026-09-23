public class Exercise4{
    public static boolean teenNumberChecker(int x,int y,int z){
        if(13<=x && x<=19|| 13<=y && y<=19 || 13<=z && z<=19){return true;}
        else{return false;}
    }
    public static void teenNumberChecker1(int a){
        if(13<=a && a<=19){return true;}
        else{return false;}
    }
    public static void main(String[] args){
        int x=1;
        int y=1;
        int z=1;
        System.out.println(teenNumberChecker(x,y,z));

    }
}