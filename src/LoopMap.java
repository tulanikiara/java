import java.util.*;

public class LoopMap {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner nums = new Scanner(System.in);
        System.out.println("Type 5 numbers please");
        int first = nums.nextInt();
        int second = nums.nextInt();
        int third = nums.nextInt();
        int fourth = nums.nextInt();
        int fifth = nums.nextInt();
    
    List<Integer> numbers = new ArrayList<Integer>();
    
         numbers.add(first);
         numbers.add(second);
         numbers.add(third);
         numbers.add(fourth);
         numbers.add(fifth);
    
         System.out.println(numbers);
    // Asks the user for 5 numbers
    // Stores them in an array list
    // Finds the sum, product, largest, and smallest of those numbers
    //loop?
    int sum = fifth + first + second + third + fourth;
    int product = fifth * first * second * third * fourth;
    int largest = Collections.max(numbers);
    int smallest = Collections.min(numbers);
    
    System.out.println("The sum of all numbers is " + sum);
    System.out.println("The product of all numbers is " + product);
    System.out.println("The highest number is " + largest);
    System.out.println("The lowest number is " + smallest);
   

    // You are a car dealer. Create a hash map of vehicles.
    // The model is the Key, the make is the Value.
    // Ask the customer what car (model) they are looking for. Use the Hash Map to determine if you have that vehicle, and what make it is.
    // (e.g. "Oh, you're looking for a Civic? Our Honda selection is right over here...")
    HashMap<String, String> carDealer = new HashMap<String, String>();
        carDealer.put("Honda", "Civic");
        carDealer.put("Kia","Soul");
        carDealer.put("Chevy","Sonic" );
        carDealer.put("GMC", "Yukon");
        carDealer.put("Volkswagen", "Beetle");
        carDealer.put("Beetle", "S70");

        System.out.println("What car model are you looking for?");
        String car = nums.nextLine();

        if (carDealer.containsKey(car) == true) {
            System.out.println("We have a " + car + ". Its a " + car + " " + carDealer.get(car));
        }else {
            System.out.println("This car is not available.");
        }
        nums.close();
    }
}
