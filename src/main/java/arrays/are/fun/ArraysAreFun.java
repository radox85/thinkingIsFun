package arrays.are.fun;

public class ArraysAreFun {

    public static void printArray(Integer[] array) {
        for (Integer i : array) {
            System.out.print("[" + i + "]");
        }
    }

    /* public static Integer[] merge(Integer[] first, Integer[] second) {
         System.out.println("Merge two Integer arrays:");
         System.out.println("First:");
         for (Integer i : first) {
             System.out.print("[" + i + "]");
         }
         System.out.println("\nSecond:");
         for (Integer i : second) {
             System.out.print("[" + i + "]");
         }

         Integer[] result = new Integer[first.length + second.length];

         for (int i = 0; i < result.length; i++) {

         }

         return result;
     }
     */
    public static Integer[] reverse(Integer[] array) {
        System.out.println("Array to revers: ");
        for (Integer i : array) {
            System.out.print("[" + i + "]");
        }

        Integer[] result = new Integer[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }

        return result;
    }

    public static Integer[] roll(Integer[] array, int amount) {
        System.out.println("\n Array to roll: ");
        ArraysAreFun.printArray(array);
        Integer[] result = new Integer[array.length];
        for (int i = amount, j = 0; i < array.length; i++, j++) {
            result[j] = array[i];
        }
        for (int i = amount + 1, j = 0; i < array.length; i++, j++) {
            result[i] = array[j];
        }

        return result;
    }

    public static Integer[] longestGrowingTrent(Integer[] array) {


        for (int i = 1; i < array.length - 1; i++) {

            int start = 0;
            if (array[i] > array[i - 1]) {
                start = i;
            }

        }
        return null;
    }


}
