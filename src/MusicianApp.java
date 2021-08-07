public class MusicianApp {

    // INITIAL TALKING POINTS
    // To reiterate concepts just covered -
    // discuss the structure of the Musician class and
    // purpose of the situational constructors

    // Introduce general overview of methods we might need and
    // introduce the idea behind the switch statement

    // CONTINUALLY ASK QUESTIONS/STUDENT EXPECTATIONS TO FOSTER ENGAGEMENT

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println(returnMenuDisplay());

            int response = promptUserForChoice();
            running = executeUserChoice(response);
        }
    }


    // Discuss structure of this method and introduce structure of switch case

    // LATER: discuss and demo new features of switch case
    // ie.
    // Multiple cases that need the same output
    // Arrow syntax
    // Show yield keyword that eliminates need for break;
    private static boolean executeUserChoice(int choice) {
        boolean continueRunningApp = true;

        switch (choice) {
            case 0:
                System.out.println("Good bye \\m/");
                continueRunningApp = false;
                break;
            case 1: //View all movies
                System.out.println("\n");
                for(Musician musician : MusiciansArray.findAll()) {
                    System.out.printf("%s -- %s\n", musician.getFirstName(), musician.getGenre());
                }
                System.out.println("\n");
                break;
            case 2: //jazz
                System.out.println("\n");
                viewMusiciansByGenre("jazz");
                System.out.println("\n");
                break;
            case 3: //blues
                System.out.println("\n");
                viewMusiciansByGenre("blues");
                System.out.println("\n");
                break;
            case 4: //rock
                System.out.println("\n");
                viewMusiciansByGenre("rock");
                System.out.println("\n");
                break;
            case 5: //pop
                System.out.println("\n");
                viewMusiciansByGenre("pop");
                System.out.println("\n");
                break;
            case 6: //hip-hop/rap
                System.out.println("\n");
                viewMusiciansByGenre("hip-hop/rap");
                System.out.println("\n");
                break;
        }

        return continueRunningApp;
    }

    private static void viewMusiciansByGenre(String genre) {
        for(Musician musician : MusiciansArray.findAll()) {
            if(musician.getGenre().equalsIgnoreCase(genre)) {
                //Display the movie.
                System.out.printf("%s -- %s\n", musician.getFirstName(), musician.getGenre());
            }
        }
    }

    // Talk about how this method allows us to bring up the menu anytime we choose in the sequence of the app
    private static String returnMenuDisplay() {
        String choices = "What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all musicians\n" +
                "2 - view musicians of the jazz genre\n" +
                "3 - view musicians of the blues genre\n" +
                "4 - view musicians of the rock genre\n" +
                "5 - view musicians of the pop genre\n" +
                "6 - view musicians of the hip-hop/rap genre";

        return choices;
    }

    // Talk about implementation of Input class and the change made to fit this app (remove sout from getInt)
    private static int promptUserForChoice() {
        Input input = new Input();
        System.out.println("Enter your choice: ");
        int response = input.getInt(0, 6);

        return response;
    }

}
