package CoreJava.Array;

public class ArrayProgram11 {
    public static int[] findDuplicte(int[] arr1, int[] arr2) {
        int[] array = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            array[i] = arr1[i];
        }
        int count = arr1.length;
        for (int i = 0; i < arr2.length; i++) {
            array[count] = arr2[i];
            count++;
        }
        int[] dub = new int[array.length];
        int index = 0;
        outer:
        for (int i = 0; i < array.length; i++)
            if (i == 0) {
                dub[index] = array[0];
                index++;
            } else {
                inner:
                for (int j = 0; j < i; j++) {
                    if (array[i] == array[j]) {
                        continue outer;
                    }
                }
                dub[index] = array[i];
                index++;
            }
        int[] result=new int[index];
        for (int i = 0; i < result.length; i++) {
            result[i]=dub[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 2, 5};
        int[] arr2 = {3, 6, 1, 5};

        int[] value = findDuplicte(arr1, arr2);
        for (int x : value) {
            System.out.println(x);
        }

    }
}
