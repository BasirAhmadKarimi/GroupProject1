public class Project3OddEvenNum {
    public static void main(String[] args) {
        /* 3. Create a 2D array or integer type where you will store odd and even
    numbers. Develop a program which will identify/print the even numbers
    only.*/
        int[][] number={{55,44,88,66,33,22,12,11},
        {14,54,23,18,17,77,100,555,}
        };

        for(int i=0; i<number.length; i++) {
          for(int j=0; j<number[i].length; j++){
              if(number[i][j]%2==0){
                  System.out.print(number[i][j]+" ");
              }


           }

            }
        }

    }


