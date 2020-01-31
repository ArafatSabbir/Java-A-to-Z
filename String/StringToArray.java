import java.util.*;

public class StringToArray {

    public static void main(String[] args) {
       
    String s="sabbir";
    String s2=s.concat("\0");
    char ch[]=s2.toCharArray();
    System.out.println("My string is "+ s2);
    System.out.println("My string 5th plache is "+ ch[4]);
    }
    
}
