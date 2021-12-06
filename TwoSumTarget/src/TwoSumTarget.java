import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSumTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int size,target;

        System.out.println("Enter number of elements");
        size = sc.nextInt();
        arr = new int[size];

        System.out.println("Enter elements");
        for(int i=0;i < size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target");
        target = sc.nextInt();

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i=0;i<size;i++) {
            if(map.containsKey(target - arr[i])){
                System.out.println(Arrays.toString(new int[]{i, map.get(target - arr[i])}));
                break;
            }
            map.put(arr[i],i);
        }
    }
}
