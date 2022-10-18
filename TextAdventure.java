import java.util.*;
import java.util.concurrent.TimeUnit;

public class TextAdventure {
  FancyConsole console;
  Scanner inScanner;
  Player ourHero;

  public TextAdventure() {
    console = new FancyConsole("Great Text Adventure!", 600, 600);
    inScanner = new Scanner(System.in);

    // feel free to change the player's starting values
    ourHero = new Player("Jake", 100, 0);
  }

  public void play() throws InterruptedException {
    String input;
    // start of adventure. You can change this if you like
    console.setImage("distantcity.jpg");

    // ask the user for their name.
    System.out.println("What is your name?\n\n");
    input = inScanner.nextLine();

    // Change ourHero's name

    ourHero.changeName(input);
    // describe the starting situation. Feel free to change this
    System.out.println(
        "\nYou wake up to find yourself on the edge of a shadowy forest with the sun nearly set. \nYou see what looks like a city in the distance. \nWhat would you like to do? \ncity: go towards the city\nforest: turn around and re-enter the forest\nnap: go back to sleep\n\n"
            + ourHero.getName() + ": ");

    // get user input and go to the appropriate zone based on their input
    // ADD CODE HERE
    input = inScanner.nextLine();
    if (input.equals("city")) {
      enterZone1();
    } else if (input.equals("forest")) {
      enterZone2();
    } else if (input.equals("nap")) {
      enterZone3();
    }
  }

  private void enterZone1() throws InterruptedException {
    console.setImage("graveyard.jpg");
    // ADD CODE HERE

    System.out.println(
        "\nYou come across the entrance to a dark, foggy graveyard.\nIt looks haunted but you know it's the fastest way to the city.");
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println(
        "What would you like to do?\nenter: go inside the graveyard.\nlook: look for a way around the graveyard\n\n"
            + ourHero.getName() + ": ");
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    String input = inScanner.nextLine();
    if (input.equals("enter")) {
      enterZone4();
    } else if (input.equals("look")) {
      enterZone5();
    }

  }

  private void enterZone2() throws InterruptedException {
    
    console.setImage("forest.jpg");
    
    System.out.println(
        "\n You walk a ways into the dark, misty forest.\nYou hear leaves rustling to your right.\n What would you like to do? \ninvestigate: go towards the noise\ncontinue: ignore the sounds and keep trekking.\n\n"
            + ourHero.getName() + ": ");

    String input = inScanner.nextLine();
    if (input.equals("investigate")) {
      enterZone6();
    }
    if (input.equals("continue")) {
      enterZone7();

    }

  }

  private void enterZone3() throws InterruptedException {
    // change image
    // ADD CODE HERE
    console.setImage("distantcitysleep.jpg");
    // describe the area/situation to the user.
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("You decide that it is best to fall back asleep and hope that it was all just a dream.");
    TimeUnit.SECONDS.sleep(8);
    enterZone10();
    // Take action or go to another zone based on their choice
    // ADD CODE HERE

  }

  private void enterZone4() throws InterruptedException {

    System.out.println(
        "\nYou slowly creep into the cemetery. \nThe gate doors squeak as you close them behind you. \nYou continue to advance into the cemetery.");
    TimeUnit.SECONDS.sleep(5);
    console.setImage("cemetary-ghost.jpg");
    System.out.println(
        "\nThe ghost of a young woman appears right in front of you! The ghost slowly approaches you.\nWhat do you do?\nattack: attack the ghost to defeat it\nrun: run to the other side of the graveyard to get around it\n\n"
            + ourHero.getName() + ": ");

    String input = inScanner.nextLine();

    if (input.equals("attack")) {
      System.out.println("\nYou idiot it's a ghost! Your attack goes straight through the ghost and you fall over.\nThe ghost hovers right over you and you close your eyes.\n");
      TimeUnit.SECONDS.sleep(5);
      System.out.println("You blackout.\n");
      console.setImage("black.jpg");
      ourHero.setHealth(41);
      TimeUnit.SECONDS.sleep(4);
      console.setImage("cemtarygate2.jpg");
      System.out.println("You wake up right outside the cemetery.\n Your health is " + ourHero.getHealth() + ".\nHow did we get here?"
      );
      TimeUnit.SECONDS.sleep(4);
      enterZone8();
    }


    //Run from ghost; find zombie

    else if (input.equals("run")) {
      System.out.println("\nYou run to the west side of the graveyard, hoping to escape the ghost.");
      TimeUnit.SECONDS.sleep(4);
      console.setImage("cemeteryzombie.jpg");
      System.out.println(
          "You come face to face with a zombie!\nThere is now way around it; you have to fight.\nWhere do you attack?\nlegs: sweep the legs\nface: sucker punch the zombie in the jaw\n\n"
              + ourHero.getName() + ": ");
      input = inScanner.nextLine();

      //Attack zombie in legs

      if (input.equals("legs")) {
        System.out.println(
            "\nYou sweep the legs and run past the zombie, however it grabs your ankle and takes you down with it!\nYou break your ankle and cannot get back up.\nThe zombie starts eating your leg and you close your eyes.\n");
            TimeUnit.SECONDS.sleep(5);
        System.out.println("You blackout.\n");
        console.setImage("black.jpg");
        ourHero.setHealth(39);
        TimeUnit.SECONDS.sleep(4);
        console.setImage("cemtarygate2.jpg");
        System.out.println("You wake up right outside the cemetery.\n Your health is " + ourHero.getHealth() + ".\nHow did we get here?");
        enterZone8();
      }

      //Attack zombie in face 

      if (input.equals("face")) {
        System.out.println(
            "\nYou sucker punch the zombie right in the jaw, instantly knocking it over!\nYou keep running until you find the exit of the cemetery.");
        TimeUnit.SECONDS.sleep(4);
        console.setImage("cemtarygate2.jpg");
        ourHero.defeatMonster();
        ourHero.setHealth(85);
        System.out.println(
            "You defeated your first monster!\nLet's hope there aren't any more.\nYour health slightly dimished during the fight and currently remains at "
                + ourHero.getHealth() + ".\n");
                enterZone8();
      }
    }
  }

  private void enterZone5() throws InterruptedException {
    
    console.setImage("cabin.jpg");

    System.out.println("You come across an old, haunted cabin just oustide the cemetery.\nWould you like to:\ncemetery: go back to the cemetery\ncabin: investigate the cabin\n\n" + ourHero.getName() + ": ");
    String input = inScanner.nextLine();
    if (input.equals("cemetery")){
      enterZone1();
    }
    else {
      System.out.println("\nYou enter the cabin.\nYou see something shiny in the edge of your eye.\nIt's gold!\nYou bend down to pick it up and you trip.");
      TimeUnit.SECONDS.sleep(4);
      System.out.println("It's a monster!\n There is nothing you can do except accept your fate.\nYou close your eyes.");
      console.setImage("insidecabin.jpg");
      TimeUnit.SECONDS.sleep(4);
      System.out.println("You blackout.\n");
      console.setImage("black.jpg");
      ourHero.setHealth(14);
      TimeUnit.SECONDS.sleep(4);
      System.out.println("You wake up outside the cemetery you previously ignored.\n Your health is " + ourHero.getHealth() + ".\n How did we get here?");
      enterZone8();

    }
    

  }

  private void enterZone6() throws InterruptedException {
    console.setImage("forestmonster.jpg");
    System.out.println("A forest monster lurks behind a tree!\n It looks hungry for blood.\nYou see a sword on the ground.\nWhat do you do?\nattack: grab the sword and attack the monster\nrun: keep running through the forest\n\n" + ourHero.getName() + ": ");
    
    String input = inScanner.nextLine();
    if (input.equals("attack")){
      System.out.println("\nYou grab the sword and run towards the monster.\nWhere do you attack?\nlegs: slice the legs\nface: jump up and slash the monster's face\n\n" + ourHero.getName() + ": ");
      input = inScanner.nextLine();

      if (input.equals("legs")){
        ourHero.setHealth(64);
        System.out.println("You slice the monster's front legs straight through.\n It lets out a cry, and falls over on you.\n You defeated the monster, but you hurt your back doing so.\n Your health stands at " + ourHero.getHealth() + ".\n");
        ourHero.defeatMonster();
        System.out.println("You continue walking through the forest\n");
        enterZone7();
      }
      else if (input.equals("face")){
        System.out.println("Sword in hand, you jump to try and slash the monster's face.\n However, the monster jumps on you first!\nYou fall back on the forest ground and everything starts spinning.\n");
        ourHero.setHealth(17);
        TimeUnit.SECONDS.sleep(5);
        console.setImage("black.jpg");
        System.out.println("You blackout.");
        enterZone7();
        System.out.println("You wake up somewhere new. Your health is at " + ourHero.getHealth() + ".\n How did we get here?");
      }
    }
    else if (input.equals("run")){
      enterZone7();
    }

  }

  private void enterZone7() throws InterruptedException {

    console.setImage("river.jpg");
    System.out.println("You come across a misty river with a boat near the edge. \nWhere will the boat take you? \nYou decide to find out. \n");
    TimeUnit.SECONDS.sleep(5);
    enterZone9();

  }

  private void enterZone8() throws InterruptedException {
    console.setImage("river.jpg");
    System.out.println("Outside the cemetary, you wonder how all of this happened.\nYou decide that the distant city must have answer.\nIn front of you, a river with a boat on the bank, looks to head downstream.\nYou decide to hop on the boat towards the city.\n");
    enterZone9();
  }

  private void enterZone9() throws InterruptedException {
    console.setImage("rivermonsters.jpg");
    System.out.println("The river becomes swarmed with monsters!\n The boat has a different weapons.\nWhich one do you choose?\nbow: a bow and arrow that can damage monsters from afar\nmace: a heavy weapon with spikes that can destroy monsters with a single swing\n\n" + ourHero.getName() + ": ");
    String input = inScanner.nextLine();
    if (input.equals("bow")){
      System.out.println("You pick up the bow and start shooting all the monsters.\nYou take out a few of them, but there are too many for just you to take on with a simple bow.\nThey swarm the boat.\n");
      TimeUnit.SECONDS.sleep(8);
      System.out.println("You blackout.");
      console.setImage("black.jpg");
      enterZone10();
      
    }
    if (input.equals("mace")){
      System.out.println("You grab the mace and start swinging at the monsters.\n There are far too many for just you to take on with a mace.\nThey swarm the boat.\n");
      TimeUnit.SECONDS.sleep(7);
      System.out.println("You blackout.");
      console.setImage("black.jpg");
      enterZone10();
    }
    
    
  }

  private void enterZone10() {
    console.setImage("abandoned.jpg");
    System.out.println(
        "You wake up in the city that you saw in the distance just a few hours ago. \nOr was it a few days ago? \nYour memory is blurry.\nAll of your cuts and bruises are healed.\nYou look around.\nThe city is abandoned. Not a soul in sight.\nWhere to go next?\n\n THE END.");
  }

  private void gameEnd() {
    // ADD CODE HERE

    inScanner.close();
  }
}