package printing.is.fun;

public class PrintingIsFun {

    public static void printRectangle(int width, int height) {
        System.out.println("Printing rectangle....\n");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void printBox(int width, int height) {
        System.out.println("Printing box....\n");
        for (int i = 0; i < height; i++) {
            System.out.print('*');
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println('*');
        }
    }

    public static void printTriangle(int height) {
        System.out.println("Printing reversed triangle....\n");
        for (int i = 0; i < height; i++) {
            for (int j = height; j > i; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void printTree(int height) {
        System.out.println("Printing tree....\n");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(' ');
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

}
