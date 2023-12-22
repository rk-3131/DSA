package com.company;

import java.util.Map;

public class MathsForDSA {
    public static void main(String[] args) {
        System.out.println(findSetBits(7));
    }

    static int findSetBits(int n){
        int ans = 0;
        while (n > 0){
            if ((n & 1) == 1){
                ans++;
            }
            n = n >> 1;
        }

        return ans;
    }

    static int aRaisedTob(int a, int b){
//        finding the power of a number is quite simple if we use the concept of bits

        int ans = 1;
        int base = a;
        int power = b;

        while (power > 0){
            if ((power & 1) == 1){
                ans *= base;
            }
            base *= base;
            power = power >> 1;
        }
        return ans;
    }

    static boolean isPowerOf2(int n){
        int i = 1;

        while (i < n){
            i = i << 1;
        }
        return i == n;
    }

    static int sumInithRowOfPascalTriangle(int row){
        return 1 << (row - 1);
    }

    static String binaryRepresentation(int n){
        StringBuilder sb = new StringBuilder();

        while (n > 0){
            int temp = n % 2;
            n /= 2;
            sb.append(Integer.toString(temp));
        }
        return sb.reverse().toString();
    }

    static int countDigitsInOther(int n, int k){
        int ans = 0;

        while (n > 0){
            ans++;
            n /= k;
        }

        return ans;
    }

    static int countDigitInBinary2(int n){
        int ans = 0;

        while (n > 0){
            ans++;
            n /= 2;
        }

        return ans;
    }

    static int countDigitInBinary(int n){
        int ans = 0;

        while (n > 0){
            ans++;
            n = n >> 1;
        }

        return ans;
    }

    static int nthMagicNumber(int n){
//        return the binary number i.e 0 or 1 into power of 5 from the LSB of a given number

        int temp = 1;
        int ans = 0;
        int power = 1;

        while (temp <= n){
            if ((n & temp) == temp){
                ans +=  (int)Math.pow(5, power);
            }
            temp *= 2;
            power++;
        }

        return ans;
    }

    static public int maxScore(String s) {
//        the string consists of 0 and 1 only
//        we have to make sure that the number is such that the sum of 0 from left and sum of 1 from right has to be maximum and we have to return that sum
        int [] arrZero = new int[s.length()];
        int [] arrOne = new int[s.length()];

        int cntZero = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '0'){
                cntZero++;
            }
            arrZero[i] = cntZero;
        }

        int cntOne = 0;
        for (int i = s.length() - 1; i >= 0; i--){
            if (s.charAt(i) == '1'){
                cntOne++;
            }
            arrOne[i] = cntOne;
        }

        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < s.length(); i++){
            ans = Math.max(ans, arrZero[i] + arrOne[i]);
        }

        return ans;
    }

    static int singleNumber3(int[] nums) {
        int [] arr = new int[32];

        for (int i = 0; i < nums.length; i++){
            String bString = Integer.toBinaryString(nums[i]);

            int index = 31;
            for (int j = bString.length() - 1; j >= 0; j--){
                if (Character.getNumericValue(bString.charAt(j)) == 1){
                    arr[index] += 1;
                }
                index--;
            }
        }
        int ans = 0;

        double power = 0;
        for (int i = 31; i >= 0; i--){
            if (arr[i] % 3 != 0){
                ans += Math.pow(2, power);
            }
            power++;
        }
        return ans;
    }

    static int findCompliment(int n){
//        Size of the integer in java is something 4 bytes hence we have to make sure that we all the leading values of zero are not inverted to 1
//        If they get inverted then the value of the number that we might get will not be what we wanted

        int intSize = Integer.SIZE;
        int zeroCount = Integer.numberOfLeadingZeros(n);

//        Now the actual number of bits will be the bits which are intSize - zeroCount
//        And only those values need to be changed

        int mask = (1 << intSize - zeroCount) - 1;

        return mask ^ n;
    }

    static long convertEvenBitToZero(long n) {
        int i = 1;
        int count = 0;

        while (i <= n){
            if (count % 2 == 0){
                n = (n & i);
            }
            count++;
            i = i * 2;
        }

        return n;
    }

    static int setBit(int N){
//        https://practice.geeksforgeeks.org/problems/set-the-rightmost-unset-bit4436/1
        int i = 1;

        while (i < N && (i & N) != 0){
            i = i * 2;
        }

        return N | i;
    }

    public static int getFirstSetBit(int n){
//        https://practice.geeksforgeeks.org/problems/find-first-set-bit-1587115620/1
        int ans = 0;
        int i = 1;

        while ((i & n) != i){
            i = i * 2;
            ans++;
        }

        return ans + 1;
    }
    static int findPosition(int N) {
//        https://practice.geeksforgeeks.org/problems/find-position-of-set-bit3706/1
        int i = 1;
        int count = 1;

        int ans = 0;

        while (i < N){
            i = i * 2;
            count++;
        }

        if (i == N){
            return count;
        }

        return -1;
    }

    static int ithBitOfnumber(int n, int i){
//        https://practice.geeksforgeeks.org/problems/check-whether-k-th-bit-is-set-or-not-1587115620/1
//        Above question is same but the indexing there is done using 0 indexed system
//        But the solution here is adjusted according to the 1 indexed indexing system.
        int cover = 1 << (i - 1);

        if ((n & cover) == cover){
            return 1;
        }
        return 0;
    }
    static String findOddEven(int n){
//        we know the numbers binary representation is given in the form of 1 0 1 0 1 0
//        Here all the terms except first term from the right are in the power of 2
//        we all know that sum of even number will always be declared as the even
//        Hence it the last set bit that will determine if the number is odd or even
//        Hence if the last bit is 1 the number is odd and if it is 0 the number is even

        if ((n & 1) == 0){
            return "Even";
        }
        return "Odd";
    }

    static int singleNumber(int [] arr){
//        https://leetcode.com/problems/single-number/description/

        int ans = 0;

        for (int n : arr) {
            ans ^= n;
        }

        return ans;
    }

    static int singleNumber2(int [] nums){

        return -1;
    }
}
