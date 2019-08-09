public class Convert {
    public static String Go(int num) {
        String s = "";
        while(num>0){
            s += "-" ;
            num--;
        }
        return s;
    }
}
