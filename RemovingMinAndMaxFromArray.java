package com.company;

public class RemovingMinAndMaxFromArray {
    public static void main(String[] args) {
        int [] arr = {-1, -53, 93, -42, 37, 94, 97, 82, 46, 42, -99, 56, -76, -66, -67, -13, 10, 66, 85, -28};
        System.out.println(minimumDeletions(arr));
    }

    static public int minimumDeletions(int[] nums) {
        if (nums.length == 1) {
            return 0;  // If there is only one element, no deletions are needed.
        }

        int length = nums.length;

        int maxElement = Integer.MIN_VALUE;
        int maxIndex = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxElement) {
                maxElement = nums[i];
                maxIndex = i;
            }
        }

        int minElement = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minElement) {
                minElement = nums[i];
                minIndex = i;
            }
        }

        int ans = 0;

        String f = leftRight(maxIndex, nums);
        String s = leftRight(minIndex, nums);

        if (s.equals("left") && f.equals("left")) {
            return Math.max(maxIndex, minIndex) + 1;
        } else if (s.equals("right") && f.equals("right")) {
            return nums.length - Math.min(maxIndex, minIndex);
        } else {
            // one is left and one is right
            if (f.equals("left")) {
                ans += (maxIndex + 1);
                ans += (nums.length - minIndex);
                return ans;
            } else {
                ans += (minIndex + 1);
                ans += (nums.length - maxIndex);
                return ans;
            }
        }
    }

    static String leftRight(int index, int[] nums) {
        if (nums.length - index > (nums.length / 2)) {
            return "left";
        }
        return "right";
    }
}
