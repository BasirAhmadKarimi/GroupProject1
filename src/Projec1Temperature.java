public class Projec1Temperature {
    public static void main(String[] args) {
       // Create a program that uses an array to store a list of temperatures for a week,
        //and then uses a loop to find the highest and lowest temperature for the week.

        double[] temp=new double[7];

        temp[0]=99;
        temp[1]=88;
        temp[2]=75;
        temp[3]=69;
        temp[4]=58;
        temp[5]=45;
        temp[6]=27;

        double highestTem=temp[0];
        double lowestTem=temp[0];

        for (int i=0; i<temp.length; i++){
            if(temp[i]>highestTem){
                highestTem=temp[i];
            }
            if(temp[i]<lowestTem){
                lowestTem=temp[i];
            }

        }
        System.out.println("The Hightest Temerature for the week"+" "+highestTem);
        System.out.println("The lowest Temperature for the week is"+" "+lowestTem);


    }
}
