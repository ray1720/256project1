
import java.util.*; 


public class Project1 {

  public static void main(String[] args) {


    Scanner user_input = new Scanner(System.in);
   

    System.out.println("MadLibs\n\n");

    System.out.println("Enter an adjective");
    String adjective1 = user_input.nextLine();

    System.out.println("Enter an adjective");
    String adjective2 = user_input.nextLine();

    System.out.println("Enter a type of bird");
    String bird = user_input.nextLine();

    System.out.println("Enter a room in a house");
    String room = user_input.nextLine();

    System.out.println("Enter a past tense verb");
    String verb1 = user_input.nextLine();

    System.out.println("Enter a verb");
    String verb2 = user_input.nextLine();

    System.out.println("Enter a relative's name");
    String name = user_input.nextLine();

    System.out.println("Enter a noun");
    String noun1 = user_input.nextLine();

    System.out.println("Enter a liquid");
    String liquid = user_input.nextLine();

    System.out.println("Enter a verb ending in -ing");
    String verb3 = user_input.nextLine();

    System.out.println("Enter a part of the body (plural)");
    String bodypart = user_input.nextLine();

    System.out.println("Enter a plural noun");
    String noun2 = user_input.nextLine();

    System.out.println("Enter a verb ending in -ing");
    String verb4 = user_input.nextLine();

    System.out.println("Enter a noun");
    String noun3 = user_input.nextLine();
    System.out.println("\n\n\n\n");

    System.out.println("It was a " + adjective1 + ", cold November day.");
    System.out.println("I woke up to the " + adjective2 + " smell of " + bird + " roasting in the " + room + " downstairs.");
    System.out.println("I " + verb1 + " down the stairs to see if I could help " + verb2 + " the dinner.");
    System.out.println("My mom said, 'See if " + name + " needs a fresh " + noun1 + "'.");
    System.out.println("So I carried a tray of glasses full of " + liquid + " into the " + verb3 + " room.");
    System.out.println("When I got there, I couldn't believe my " + bodypart + "!");
    System.out.println("There were " + noun2 + " " + verb4 + " on the " + noun3 + "!");

    }
  }

