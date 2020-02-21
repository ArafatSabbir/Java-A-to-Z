public class IntegerOrNot{


	
	/*
	
	Sabbir Ahmed,Comilla University
	GitHub> https://github.com/ArafatSabbir
	
	*/
    
    public static void main(String[] args) {
     String s="123456";
     
     int size = s.length(); 
   
     int i=0;
     
     while(i!=size)
     {
         if(s.charAt(i)>='0' && s.charAt(i)<='9')
         {
         ++i;
         }
         
         else
         {
             System.out.println("String is Not Integer");
             System.exit(0);
     
         }

     }
     
     System.out.println("String is Interger");
   
    }
    
}