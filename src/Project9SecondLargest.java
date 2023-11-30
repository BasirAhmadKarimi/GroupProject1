public class Project9SecondLargest {
    public static void main(String[] args) {

        //9. Write a java program to find the second largest number in the array?
        int[] numbers = {10, 5, 8, 20, 15};
        int largest = numbers[0];
        int secondLargest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        System.out.println("The second largest number in the array: " + secondLargest);

    }
}
