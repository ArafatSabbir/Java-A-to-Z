public class StringCopy {

    
    public static void main(String[] args) {
	
     String s="Bangladesh";
     char ch[]= s.toCharArray();
     int size = ch.length;
     char ch2[] = new char[size];
     
     int i=0;
     
     while(i!=size)
     {
         ch[i]=ch2[i];
         ++i;
     }
     
     System.out.println(ch);
     System.out.println(ch2);
     
    }
    
}