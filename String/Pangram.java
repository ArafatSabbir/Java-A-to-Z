public class Pangram{

	
	/*
	
	Sabbir Ahmed,Comilla University
	GitHub> https://github.com/ArafatSabbir
	
	*/
    
    public static void main(String[] args) {
     String s="The quick brown fox jumps over the lazy dog";
    
     s=s.replace(" ","");	 // to remove white space
     s=s.toUpperCase();  	 //to convert lowercase
 
     char a[]=s.toCharArray();
     int size =a.length;
     
     int b[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; //26 size array.
     
     
     int i=0;
     
     while(i!=size)
     {
         int index=a[i]-65;       //ascii value down to array index
         b[index]=1;
         ++i;
     }
     
     int j=0;
     
     while(j!=26)
     {
         if(b[j]!=1)
        {
             System.out.println("Sring is not Pangram");
             System.exit(0);
        }
         ++j;
     }
     System.out.println("String is Pangram");
   
    }
    
}