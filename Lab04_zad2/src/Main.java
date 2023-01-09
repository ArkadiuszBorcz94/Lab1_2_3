public class Main {

    public static void main(String[] args) {

        int[] array1;
        array1 = new int[]{1, 2, 3, 4, 5};
        int[] array2 = new int[]{1, 2, 3, 4};
        displayArray(array1, array2);

    }

    public static void displayArray(int[] a, int[] b) {
        System.out.println("wyświetlam");
        for (int i = 0; i < a.length; i += 2) {
            System.out.println("Co drugi element array1: " + a[i]);

        }
        for (int i = 0; i < b.length; i += 2) {
            System.out.println("Co drugi element array2: " + b[i]);

        }


    }
}


