public class Project2Sum {
    public static void main(String[] args) {
       // 2. Create an array of integer values. After the array is created, calculate the
       // sum of all stored elements in that array.

        int[] numbers={15,20,36,65,89,500};
        int sum=0;
        for(int i=0; i<numbers.length;i++){
            sum=sum+numbers[i];
        }
        System.out.println(sum);
    }
}
