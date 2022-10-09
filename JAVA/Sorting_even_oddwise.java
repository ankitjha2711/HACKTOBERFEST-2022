import java.util.*;
import java.util.Arrays;
public class Disp1109evenoddsort
{
    public static void main()
    {
        int arr[]={1,9,0,2,5,7,8};
        System.out.println("Input Array: ");
        System.out.println(Arrays.toString(arr));
        int odd=0;
        int even=arr.length-1;
        for (int i = 0; i < arr.length; i++) 
        {
            while(arr[even]%2==0)
            {
                even--;
            } 
            while(arr[odd]%2==1)
            {
                odd++;
            }
            if(even>odd)
            {    
                int temp=arr[odd];
                arr[odd]=arr[even];
                arr[even]=temp;
            }
        }
        System.out.println("After doing swapping:");
        System.out.println(Arrays.toString(arr));
    }
}
