public class ArrayRotation {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int rotate = 4;
        printArray(arr);
        leftRotate(arr,rotate);
        System.out.println("**************************");
        printArray(arr);
        rightRotate(arr,rotate);


    }

    private static void leftRotate(int[] arr, int rotate) {
        while (rotate > 0) {
            int temp = arr[0];
            System.arraycopy(arr, 1, arr, 0, arr.length - 1);
            arr[arr.length - 1] = temp;
            printArray(arr);
            rotate--;
        }
    }

    private static void rightRotate(int[] arr, int rotate) {
        while (rotate > 0) {
            int temp = arr[arr.length - 1];
            System.arraycopy(arr, 0, arr, 1, arr.length - 1);
            arr[0] = temp;
            printArray(arr);
            rotate--;
        }
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(" " + arr[i]);
        System.out.println("");
    }

}
