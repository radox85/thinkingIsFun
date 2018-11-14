package arrays.are.fun;

public class ArraysAreFun {

    public static void printArray(Integer[] array) {
        for (Integer i : array) {
            System.out.print("[" + i + "]");
        }
    }

    public static Integer[] merge(Integer[] first, Integer[] second) {
        System.out.println("Merge two Integer arrays:");
        System.out.println("First:");
        ArraysAreFun.printArray(first);
        System.out.println("\nSecond:");
        ArraysAreFun.printArray(second);

        Integer[] result = new Integer[first.length + second.length];
        int i = 0, j = 0, k = 0;
        while (i < first.length && j < second.length)
            result[k++] = first[i] < second[j] ? first[i++] : second[j++];
        while (i < first.length)
            result[k++] = first[i++];
        while (j < second.length)
            result[k++] = second[j++];

        return result;
    }

    public static Integer[] reverse(Integer[] array) {
        System.out.println("\nArray to revers: ");
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

        int numerOfTrent = 0;
        int endIndex = 0;

        for (int i = 1; i < array.length - 1; i++) {

            if (array[i] > array[i - 1]) {
                endIndex=i-1;
                numerOfTrent++;
            }else{

            }

        }
        return null;
    }


}
