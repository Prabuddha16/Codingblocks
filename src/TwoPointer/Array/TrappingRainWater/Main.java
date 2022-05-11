package TwoPointer.Array.TrappingRainWater;
//t=o(n) s=o(1)
public class Main {
    public static int trap(int[] arr) {
        int result = 0;
        int n=arr.length;
        int left_max = 0, right_max = 0;
        int lo = 0, hi = n - 1;
        while (lo <= hi) {
            if (arr[lo] < arr[hi]) {
                if (arr[lo] > left_max)
                    left_max = arr[lo];
                else
                    result += left_max - arr[lo];
                lo++;
            }
            else {
                if (arr[hi] > right_max)
                    right_max = arr[hi];
                else
                    result += right_max - arr[hi];
                hi--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] height = {4,2,0,3,2,5};
        System.out.println(trap(height));
    }
}

