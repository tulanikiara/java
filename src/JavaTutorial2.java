import java.util.Scanner;
import java.util.ArrayList;

public class JavaTutorial2 {
    public static void main(String[] args) throws Exception {
     //12
      Scanner scanner = new Scanner(System.in);
       
      /* System.out.println("Enter a number: ");
       int value = scanner.nextInt();
       while (value != 5) {
           System.out.println("Enter a number: ");
           value = scanner.nextInt();
       }
       */
      /*
      int value = 0;
      do {
        System.out.println("Enter a number: ");
        value = scanner.nextInt();
      }
      while (value != 5);
       System.out.println("Got 5!");
       scanner.close();
    */
    //13
    /*
    System.out.println("Please enter a command");
    String text = scanner.nextLine();
      switch (text) {
        case "start":
        System.out.println("Machine started!");
        break;

        case "stop":
        System.out.println("Machine stopped!");
        break;

        default:
          System.out.println("Command not recognized!");
      }
 */
      scanner.close();
     /*
     //14
      //int value = 7;
      int[] values;
      values = new int[3];

      System.out.println(values[0]);

      values[0] = 10;
      values[1] = 20;
      values[2] = 30;

      System.out.println(values[0]);
      System.out.println(values[1]);
      System.out.println(values[2]);

      for (int i=0; i < values.length; i++) {
        System.out.println(values[i]);
      }

      int[] numbers = {5, 6, 7};

      for (int i=0; i < values.length; i++) {
        System.out.println(numbers[i]);
      }
      */
/*
      //15
      String[] words = new String[3];

      words[0] = "Hello";
      words[1] = "to";
      words[2] = "you";

      System.out.println(words[2]);

      String[] fruits = {"apple", "persimmon", "jackfruit", "kiwi", "mango", "strawberry"};
      for (String fruit: fruits) {
        System.out.println(fruit);
      }
  
      int value = 0;
      String text = null;
      System.out.println(text);

      String[] texts = new String[2];
      System.out.println(texts[0]);

      texts[0] = "one";*/
      ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(10);
    numbers.add(100);
    numbers.add(40);

    System.out.println(numbers.get(0));

    for(int i=0; i < numbers.size(); i++) {
      System.out.println(numbers.get(i));
    }
    for (Integer value:numbers) {
      System.out.println(value);
    }
    numbers.remove(numbers.size()-1);
//slow to remove from beginnig
    numbers.remove(0);

    //List<String> values = new ArrayList<String>();
    } 

}
