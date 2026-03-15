package static2.ex;

public class MathArrayUtils {
    private MathArrayUtils() {

    }

    public static int sum(int[] array) {
        int result = 0;

        for (int i : array) {
            result += i;
        }

        return result;
    }

    public static double average(int[] array) {
        isArrayEmpty(array);
        int result = sum(array);

        return (double) result / array.length;
    }

    public static int min(int[] array) {
        isArrayEmpty(array);

        int result = array[0];

        for (int i = 1; i < array.length; i++) {
            result = (result > array[i]) ? array[i] : result;
        }

        return result;
    }

    public static int max(int[] array) {
        isArrayEmpty(array);

        int result = array[0];

        for (int i = 1; i < array.length; i++) {
            result = (result < array[i]) ? array[i] : result;
        }

        return result;
    }

    private static void isArrayEmpty(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("array is empty");
        }
    }
}

