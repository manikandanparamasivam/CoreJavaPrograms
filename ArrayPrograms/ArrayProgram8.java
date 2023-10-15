package CoreJava.Array;

public class ArrayProgram8 {
    public static int maxValue(int[] arr1,int[] arr2) {
        int sum = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (sum > arr1[i]) {
                sum = sum;
            } else {
                sum = arr1[i];
            }
        }
            for (int i = 0; i < arr2.length; i++)
            {
                if (sum > arr2[i]) {
                    sum = sum;
                } else {
                    sum = arr2[i];
                }

            }

        return sum;
    }


    public static void main(String[] args) {
        int[] arr1 = {10, 23, 43, 15};
        int[] arr2 = {24, 5, 75, 1};
        System.out.println(ArrayProgram8.maxValue(arr1, arr2));
    }
}

   /* public static int maxValueFromArrays(int[] arr1, int[] arr2) {
        int max = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            max = max > arr1[i] ? max : arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            if(max > arr2[i]) {
                max = max;
            } else {
                max = arr2[i];
            }
        }

    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static int findAverage(int[] arr, int[] arr2) {
        int sum = findSum(arr);
        sum = sum + findSum(arr2);
        int noOfElements = arr.length + arr2.length;
        return sum / noOfElements;
    }
}*/
