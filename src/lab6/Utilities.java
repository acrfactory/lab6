package lab6;

/*
 * Requirements:
 * - Any use of Java library classes or methods (e.g., ArrayList) is forbidden.
 * 	 (That is, there must not be an import statement in the beginning of this class.)
 * Violation of this requirement will result in a 50% penalty of your marks.
 *
 * - Use only if-statements and/or loops to manipulate primitive arrays (e.g., int[], String[]).
 */

public class Utilities {
    /*
     * Input parameters:
     * 	- `numbers` : an array of integers
     *
     * Refer to you lab instructions for what the method should return.
     */

    public static int[] getMultiplesOf3(int[] numbers) {

        /* TODO: Your implementation ends here. */
        /* Your implementation of this method starts here.
         * 1. No System.out.println statements should appear here.
         * 	  Instead, you need to return the result.
         * 2. No Scanner operations should appear here (e.g., input.nextInt()).
         *    Instead, refer to the input parameters of this method.
         */

        int[] returnArr = new int[0];

        for (int i = 0; i <numbers.length ; i++) {
            if (numbers[i]%3 == 0) {
                int a = numbers[i];
                int[] copyArr = returnArr;
                returnArr = new int [returnArr.length + 1];
                for (int j = 0; j < copyArr.length; j++) {
                  returnArr[j] = copyArr[j];
                }
                returnArr[returnArr.length - 1] = a;
            }
        }
        return returnArr; // You need to replace this line by returning the proper result.
    }
    /*
     * Input parameters:
     * 	- `numbers` : an array of integers
     *
     * Assumptions:
     * 	- numbers.length >= 1
     *
     * Refer to you lab instructions for what the method should return.
     */
    public static String[] getAllPrefixes(int[] numbers) {

        /* TODO: Your implementation ends here. */

        /* Your implementation of this method starts here.
         * 1. No System.out.println statements should appear here.
         * 	  Instead, you need to return the result.
         * 2. No Scanner operations should appear here (e.g., input.nextInt()).
         *    Instead, refer to the input parameters of this method.
         */





        int length = numbers.length;
        String[] returnArr2 = new String[length];

        for (int i = 0; i < numbers.length; i++) {
            returnArr2[i] = "[";
            int j= 0;
            for (j = 0; j <= i - 1 ; j++) {
                returnArr2[i] += numbers[j] + ", ";
            }
            returnArr2[i] += numbers[j] + "]";
        }

            // You need to replace this line by returning the proper result.
        return returnArr2;
    }
    /*
     * Input parameters:
     * 	- `numbers` : an array of integers
     *
     * Refer to you lab instructions for what the method should return.
     */
    public static int[] getGroupedNumbers(int[] numbers) {

        /* TODO: Your implementation ends here. */

        /* Your implementation of this method starts here.
         * 1. No System.out.println statements should appear here.
         * 	  Instead, you need to return the result.
         * 2. No Scanner operations should appear here (e.g., input.nextInt()).
         *    Instead, refer to the input parameters of this method.
         */
        int[] returnArr = new int[numbers.length];
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;


         for (int k = 0; k < numbers.length; k++) {
        if(numbers[k]%3 == 0) {
            returnArr[count1] = numbers[k];
            count1++;
        }
    }
        for (int j = 0; j < numbers.length; j++)  {

        if (numbers[j] % 3 == 1) {
            returnArr[count1 + count2] = numbers[j];
            count2++;
        }
    }

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] % 3 == 2) {
                returnArr[count1 + count2 + count3] = numbers[i];
                count3++;
            }

        }
        return returnArr; // You need to replace this line by returning the proper result.
    }

    /*
     * Input parameters:
     * 	- `twoDimArray` : a 2D array of integers
     *
     * Note: the sub-arrays may have different sizes.
     *
     * Refer to you lab instructions for what the method should return.
     */
    public static int[] zigZagFlatten(int[][] twoDimArray) {

        /* TODO: Your implementation ends here. */

        /* Your implementation of this method starts here.
         * 1. No System.out.println statements should appear here.
         * 	  Instead, you need to return the result.
         * 2. No Scanner operations should appear here (e.g., input.nextInt()).
         *    Instead, refer to the input parameters of this method.
         */

        int count = 0;
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                count++;
            }
        }
        int [] returnArr = new int[count];
        int count1 = 0;
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if ((i + 1)%2 == 0) {
                    returnArr[count1] = twoDimArray[i][twoDimArray[i].length - j - 1];
                    count1++;
                } else {
                    returnArr[count1] = twoDimArray[i][j];
                    count1++;
                }
            }
        }
        return returnArr; // You need to replace this line by returning the proper result.
    }
}
