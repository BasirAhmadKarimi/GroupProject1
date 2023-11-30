public class Project4SumOddEven {
    public static void main(String[] args) {
       /* 4. Create a 2D array of integers. Develop a program which will calculate the
        sum of even and odd numbers for that array.*/

        int [][] number1={{2,5,55,66,77},
                {88,74,200,300,301},
                {66,44,33,22,16}
        };
        int sumOdd=0,sumEven=0;

        for(int i=0; i<number1.length; i++){
            for(int j=0; j<number1[i].length; j++){
                if(number1[i][j]%2==0){
                    sumEven=sumEven+number1[i][j];
                }else{
                    sumOdd=sumOdd+number1[i][j];
                }
            }
        }
        System.out.println("sum of even numbers is "+sumEven);
        System.out.println("sum of odd numbers is "+sumOdd);
    }
}
