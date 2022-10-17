import java.util.*;

public class TextAdventure {
  FancyConsole console;
  Scanner inScanner;
  Player ourHero;

  public TextAdventure() {
    console = new FancyConsole("Great Text Adventure!", 600, 600);
    inScanner = new Scanner(System.in);

    // feel free to change the player's starting values
    ourHero = new Player("Bob", 100, 0);
  }

  public void play() {
    String input;
    // start of adventure. You can change this if you like
    console.setImage("distantcity.jpg");

    // ask the user for their name.
    System.out.println("What is your name?\n");
    input = inScanner.nextLine();

    // Change ourHero's name
    // ADD CODE HERE
    ourHero.changeName(input);

    // describe the starting situation. Feel free to change this
    System.out.println(
        "You wake up to find yourself on the edge of a shadowy forest with the sun nearly set. \nYou see what looks like a city in the distance. \nWhat would you like to do? \ncity: go towards the city\nforest: turn around and re-enter the forest\nnap: go back to sleep\n"
            + ourHero.getName() + ": \n");

    // get user input and go to the appropriate zone based on their input
    // ADD CODE HERE

    input = inScanner.nextLine();
    if (input == "city") {
      enterZone1();
    }

  }

  private void enterZone1() {

    // ADD CODE HERE
    console.setImage("graveyard.jpg");

    // describe the area/situation to the user.
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println(
        "You are met with the entrance to a dark, foggy graveyard. You hear a wailing noise inside the cemetary. ");

    // Take action or go to another zone based on their choice
    // ADD CODE HERE

  }

  private void enterZone2() {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user.
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE

  }

  private void enterZone3() {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user.
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE

  }

  private void enterZone4() {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user.
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE

  }

  private void enterZone5() {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user.
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE

  }

  private void enterZone6() {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user.
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE

  }

  private void gameEnd() {
    // ADD CODE HERE

    inScanner.close();
  }
}