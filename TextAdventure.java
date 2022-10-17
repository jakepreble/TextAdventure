import java.util.*;

public class TextAdventure 
{
  FancyConsole console;
  Scanner inScanner;
  Player ourHero;

  public TextAdventure()
  {
    console = new FancyConsole("Great Text Adventure!", 600, 600);
    inScanner = new Scanner(System.in);

    // feel free to change the player's starting values
    ourHero = new Player("Jake", 100, 0);
  }

  public void play()
  {
    String input;
    // start of adventure. You can change this if you like
    console.setImage("distantcity.jpg");

    // ask the user for their name.
    System.out.println("What is your name?\n");
    input = inScanner.nextLine();

    // Change ourHero's name
   
    ourHero.changeName(input);
    // describe the starting situation. Feel free to change this
    System.out.println("\nYou wake up to find yourself on the edge of a shadowy forest with the sun nearly set. \nYou see what looks like a city in the distance. \nWhat would you like to do? \ncity: go towards the city\nforest: turn around and re-enter the forest\nnap: go back to sleep\n\n" + ourHero.getName() + ": ");

    // get user input and go to the appropriate zone based on their input
    // ADD CODE HERE
    input = inScanner.nextLine();
    if (input.equals("city")){
        enterZone1();
    }
    else if (input.equals("forest")){
        enterZone2();
    }
    else if (input.equals("nap")){
        enterZone3();
    }
  }

  private void enterZone1()
  {
    console.setImage("graveyard.jpg");
    // ADD CODE HERE

    System.out.println("\nYou come across the entrance to a dark, foggy graveyard.\nYou hear someone wailing from within the cemetary.");
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("What would you like to do?\nenter: go inside the graveyard.\nlook: look for a way around the graveyard\n\n" + ourHero.getName() + ": ");
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    String input = inScanner.nextLine();
    if (input.equals("enter")){
      enterZone4();
    }
    else if (input.equals("look")){
      enterZone5();
    }
    
  }

  private void enterZone2()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("\n You walk a ways into the dark, misty forest.\nYou hear leaves rustling to your left.\n What would you like to do? \ninvestigate: go towards the noise\ncontinue: ignore the sounds and keep trekking.\n\n" + ourHero.getName() + ": ");

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    String input = inScanner.nextLine();
    if (input.equals("investigate")){
      enterZone6();
    }
    if (input.equals("continue")){
      enterZone7();

    }
    
  }

  private void enterZone3()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone4()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone5()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone6()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }
  private void enterZone7() 
  {

  }
  private void enterZone8() 
  {
    
  }
  private void enterZone9() 
  {
    
  }
  private void enterZone10() 
  {
    
  }
  private void gameEnd()
  {
    // ADD CODE HERE

    inScanner.close();
  }
}