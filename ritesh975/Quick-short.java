class Main {
    public static void main(String[] args) {
        int arr[] = {5, 6, 2, 3, 1, 8};
      
      System.out.println("unsorted array");
      for(int element:arr)
      {
          System.out.println(element);
      }
       


   quickshort(arr, 0, arr.length - 1);

        System.out.println("Sorted array by quickshort");
        for (int element : arr) {
            System.out.println(element);
        }
    }

    
    
    public static void quickshort(int[]arr,int lb,int ub)
    {
        if(lb<ub)
        {
            int loc =partion(arr,lb,ub);
            quickshort(arr,lb,loc-1);
             quickshort(arr,loc+1,ub);
            
        }
    }
    
    public static int partion(int []arr,int lb,int ub)
    {
        int pivotelement= arr[lb];
        int start = lb+1;
        int end=ub;
        int temp;
     
        while(start<end)
        {
            while(start <= ub && arr[start] <= pivotelement)
            {
                start++;
            }
          while (end >= lb && arr[end] > pivotelement)
            {
                end--;
            }
            if(start<end)
            {
                temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
        }
        temp=arr[lb];
        arr[lb]=arr[end];
        arr[end]=temp;
        return end;
    }
        
    }
