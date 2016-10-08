package Handler;

/**
 * Created by Alexander_Demidovich on 10/8/2016.
 */
public class Handler {
    static int max = 1;
    public static int findMinCountElemToAbort(int[] array, int i, int last, int cur_max)
    {
        if (array.length==0 || array.length==1)  return 0;
        if(i == array.length-1){
            if (max < cur_max)
                max = cur_max;
        }
        else
        {
            if(last<array[i+1])
                findMinCountElemToAbort(array, i+1, array[i+1], cur_max+1);
            findMinCountElemToAbort(array, i+1, last, cur_max);
            findMinCountElemToAbort(array, i+1, array[i+1], 1);
        }
        return array.length - max;
    }
}
