public class StringReverse {

	
	/*
	
	Sabbir Ahmed,Comilla University
	GitHub> https://github.com/ArafatSabbir
	
	*/
    
    public static void main(String[] args) {
     String s="Bangladesh";
     char ch[]= s.toCharArray();
     int size = ch.length;
     char ch2[] = new char[size];
     
     int i=0;
     
     while(i!=size)
     {
         ch2[size-1-i]=ch[i];
         ++i;
     }
     
     System.out.println(ch);
     System.out.println(ch2);
     
    }
    
}
