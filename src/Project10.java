public class Project10 {
    public static void main(String[] args) {

        //10.Write a program to print out duplicate elements from an Array of Strings?
        String[] names = {"Maria", "Naqibullah", "Maria", "Jerry", "Maria", "Mike"};
        int count = 0;

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Maria")) {
                count++;
            }
        }

        System.out.println("Maria appeared " + count + " times");
    }
}
