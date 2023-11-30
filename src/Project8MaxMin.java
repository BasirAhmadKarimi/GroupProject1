public class Project8MaxMin {
    public static void main(String[] args) {
        // 8. Maximum and minimum number in the array?
        int[] numbers = {5, 2, 9, 1, 7, 3, 8, 4, 6};

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Maximum number in the array: " + max);
        System.out.println("Minimum number in the array: " + min);
    }
}


