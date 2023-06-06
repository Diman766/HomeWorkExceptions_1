public class Task1 {
    public static void main(String[] args) {
        // ArithmeticException();
        // ArrayIndexOutOfBoundsException();
        // NullPointerException();
        int[] arr1 = new int[] { 3 };
        int[] arr2 = new int[] { 1 };
        System.out.println(division(arr1, arr2)[0]);
    }

    public static void ArithmeticException() {
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }

    public static void ArrayIndexOutOfBoundsException() {
        int[] a = new int[3];
        System.out.println(a[6]);
    }

    public static void NullPointerException() {
        String b = null;
        System.out.println(b.length());
    }

    public static int sum2d(String[][] arr) {
        // 1 Ошибка - уход за пределы массива в 34 строке.
        // 2 Ошибка - не возможность перевести в строке 35 - String в Integer(невалидные
        //   данные например слово)
        // 3 Ошибка - возможно превышение размера типа int в 36 строке.
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

    public static int[] division(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Массивы не равны !");
        } else {
            for (int index = 0; index < arr1.length; index++) {
                if (arr2[index] == 0) {
                    throw new RuntimeException("На ноль делить нельзя !");
                } else {
                    result[index] = arr1[index] / arr2[index];
                }
            }
        }
        return result;
    }
}
