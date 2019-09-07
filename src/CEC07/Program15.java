package CEC07;

public class Program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str[] = {
				"Leo",
				"Kshitij",
				"Prabhjot",
				"Sumit",
				"Aditya",
				"Hardik"
		};
		System.out.println("Quick Sorting...");
        long startTime = System.nanoTime();
        String[] quickStr = quickSort(str,0,str.length-1);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Time: "+duration+" ns");
        print_output(quickStr);
		
	}
	
	public static String[] quickSort(String[] strArr, int p, int r)
    {
        if(p<r)
        {
            int q=partition(strArr,p,r);
            quickSort(strArr,p,q);
            quickSort(strArr,q+1,r);
        }
        
        return strArr;
    }
    
    private static int partition(String[] strArr, int p, int r) {

        String x = strArr[p];
        int i = p-1 ;
        int j = r+1 ;

        while (true) 
        {
            i++;
            while ( i< r && strArr[i].compareTo(x) < 0)
                i++;
            j--;
            while (j>p && strArr[j].compareTo(x) > 0)
                j--;

            if (i < j)
                swap(strArr, i, j);
            else
                return j;
        }
    }
    
    private static void swap(String[] strArr, int i, int j) 
    {
        String temp = strArr[i];
        strArr[i] = strArr[j];
        strArr[j] = temp;
    }
    
    public static void print_output(String[] strArr)
    {
       String temp = "";
       
       for(int i=0; i < strArr.length; i++) 
           temp+=strArr[i] + "\n";

       System.out.println("Output: \n" + temp);
    }

}
