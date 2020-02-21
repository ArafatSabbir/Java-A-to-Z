import java.util.Arrays;

public class IsAnagram {


	
	/*
	
	Sabbir Ahmed,Comilla University
	GitHub> https://github.com/ArafatSabbir
	
	*/
    
    public static void main(String[] args) {
     String s="SI LENT";
     String s2="LIS TEN";
     
     
     s=s.replace(" ","");	 // to remove white space
     s=s.toLowerCase();   	 //to convert lowercase
     
     s2=s2.replace(" ","");	 // to remove white space
     s2=s2.toLowerCase();   	 //to convert lowercase
     
     char a[]=s.toCharArray();
     char b[]=s2.toCharArray();
     
     Arrays.sort(a);
     Arrays.sort(b);
     
     Boolean res=Arrays.equals(a,b);
     
     if(res==true)
     {
         System.out.println("String is Anagram");
     
     }
     
     else
     {
         System.out.println("String is Not Anagram");
     }
   
    }
    
}
