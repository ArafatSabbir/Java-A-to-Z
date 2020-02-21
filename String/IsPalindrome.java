public class IsPalindrome{

	
	/*
	
	Sabbir Ahmed,Comilla University
	GitHub> https://github.com/ArafatSabbir
	
	*/
	
	
    public static void main(String[] args) {
     String s="RADAR";
  
     s=s.replace(" ","");	 // to remove white space
     s=s.toLowerCase();   	 //to convert lowercase
	 
     char ch[]= s.toCharArray();
     int size = ch.length;
     char ch2[] = new char[size];
     
     int i=0;
     
     while(i!=size)
     {
         ch2[size-1-i]=ch[i];
         ++i;
     }
     
     int j=0;
     while(j!=size)
     {
        if(ch[j]!=ch2[j])
        {
         System.out.println("Not Palindrome");
         System.exit(0);
        }
         else
        {
         ++j;
         continue;
        }
     }
     System.out.println("Palindrome");

    }
    
}