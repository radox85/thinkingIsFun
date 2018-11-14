import arrays.are.fun.ArraysAreFun;
import printing.is.fun.PrintingIsFun;
import strings.are.fun.StringsAreFun;

public class Runner {
    public static void main(String[] args) {


        PrintingIsFun.printBox(10, 5);
        PrintingIsFun.printRectangle(5, 5);
        PrintingIsFun.printTriangle(5);
        PrintingIsFun.printTree(5);


        Integer[] merge = ArraysAreFun.merge(new Integer[]{3, 4, 6, 12}, new Integer[]{1, 2, 6, 15,100});
        System.out.println("\nMerage array: "); ArraysAreFun.printArray(merge);

        Integer[] reverse = ArraysAreFun.reverse(new Integer[]{1, 2, 3, 4, 0});
        System.out.println("\nReversed array:");
        ArraysAreFun.printArray(reverse);

        Integer[] roll = ArraysAreFun.roll(new Integer[]{9, 8, 7, 6, 5, 4, 3, 2, 1}, 4);
        System.out.println("\nRoll array:");
        ArraysAreFun.printArray(roll);

        String palindrome = "kajak";
        System.out.println("\n"+palindrome+ " is palindrome?: " + StringsAreFun.isPalindrome(palindrome));

        System.out.println("\nNumber of occurence: ");
        System.out.println(StringsAreFun.countOccurrences("Radekdedee", "de"));

        System.out.println("Rot13 coded string: "+StringsAreFun.rot13("kiedys wystarczal szyfr Cezara"));
    }
}
