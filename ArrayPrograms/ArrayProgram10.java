package CoreJava.Array;

//import static java.lang.Integer.MIN_VALUE;

public class ArrayProgram10 {

    public static void main(String[] args) {
        int[] arr1 = {10, 23, 43, 15};
        int[] arr2 = {24, 55, 75, 14};
        int[] ints = singleArr(arr1, arr2);
        System.out.println(findSecondMax(ints));
    }

    public static int findSecondMax(int[] arr) {
        int maxValue = arr[0];
        int secondMaxValue = arr[1];
        if (secondMaxValue > maxValue) {
            int temp = maxValue;
            maxValue = secondMaxValue;
            secondMaxValue = temp;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                secondMaxValue = maxValue;
                maxValue = arr[i];
            } else {
                if (arr[i] > secondMaxValue) {
                    secondMaxValue = arr[i];
                }
            }

        }
      /*  for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > maxValue) {
                secondMaxValue = maxValue;
                maxValue = arr1[i];
            } else {
                if (arr1[i] > secondMaxValue) {
                    secondMaxValue = arr1[i];
                }
            }

        }*/
        return secondMaxValue;
    }


    public static int[] singleArr(int[] arr1, int[] arr2) {
        int[] single=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            single[i]=arr1[i];
        }
        int j=0;
        for(int i=arr1.length;i<single.length;i++){
            single[i]=arr2[j];
            j++;
        }
        return single;
    }
}

