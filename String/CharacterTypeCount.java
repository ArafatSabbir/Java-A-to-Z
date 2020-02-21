public class CharacterTypeCount{

	
	/*
	
	Sabbir Ahmed,Comilla University
	GitHub> https://github.com/ArafatSabbir
	
	*/
    
    public static void main(String[] args) {
     String s="Happy Programming!";
     
     String s2=s.toUpperCase();
     char ch[]= s2.toCharArray();
     
     int size = ch.length; 
     
     int vowCount =0;
     int conCount =0;
     int spcCount =0;
     
     int i=0;
     
     while(i!=size)
     {
         if(ch[i]>='A' && ch[i]<='Z')
         {
             if(ch[i]=='A' ||ch[i]=='E' ||ch[i]=='I' ||ch[i]=='O' ||ch[i]=='U')
             {
              vowCount++;
             }
             else
             {
             conCount++;
             }
         
         }
         
         else
         {
             spcCount++;
         }
         
       ++i;
     }
     
     System.out.println("My string is : "+ s);
     System.out.println("Number of vowels is : "+ vowCount);
     System.out.println("Number of Consonants is : "+ conCount);
     System.out.println("Number of Special Characters is : "+ spcCount);
       
  
    }
    
}