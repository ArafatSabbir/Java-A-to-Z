public class ArrayCopy {
    
    /*
	
	Sabbir Ahmed,Comilla University
	GitHub> https://github.com/ArafatSabbir
	
	*/

    public static void main(String[] args) {
       int arr[]={9,8,7,6,5,4,3,2,1,0};
       int arr2[]=new int[10];
       
       System.arraycopy(arr, 3, arr2, 2, 5);   // arr is 1st array,3 is index of arr, arr2 2nd arry, 2 index of arr2, 5 numbers of elements. 
       for(int a:arr2)                         // for each loop to print values of 2nd array.
       {
       System.out.print(" "+ a);
       }
    }
}

// output is :  0 0 6 5 4 3 2 0 0
