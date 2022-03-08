import java.util.Arrays;

class ArrayHW {
    public static void main(String[] args){

  //  Write a program to sum all the values of a given Array in Java.

              int[ ] array = {1,5,6,5,4,1};
              System.out.println("Power Array: " + Arrays.toString(toPower(6,2)));
               System.out.println("Sum of numbers in Array: " + arraySum(array));

    }
    /*Write a public static method called "toPower" that takes in as parameters two integers called size and power.
     The method should return an array of size "size" with each array index raised to the value of "power." 
     So, for example, if we passed in "size = 4" and "power = 2" to the "toPower," the method should return the following result: [0,1,4,9].
*/
          public static int[] toPower(int size, int power) {
               int[] numArray = new int[size];

               double p = power;
              // double s = size;
               for ( int i = 0; i < size; i++){
                    numArray[i]= i;
               }
              // System.out.println(numArray);

               int[] result = new int[size];
               for (int i = 0; i < size; i++) {
                    int o = (int)Math.pow(numArray[i], p);
                    result[i] = o;
               }
               return result;
          }

          public static int arraySum(int[] array) {
               int sum = 0;
    
               for (int i = 0; i<array.length-1; i++){
     
                sum += array[i];     
           }
           
    
           //System.out.println("Sum of array numbers = " + sum);
           return sum;
          }
}
