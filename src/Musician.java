public class Musician {

    // ON MAIN BRANCH WE WILL REMOVE THIS CLASS AND REVERSE ENGINEER USING ARRAY AS A GUIDE
    private String firstName;
    private String lastName;
    private String genre;
    private String instrument;
    private boolean isAlive;
    private int age;

    // MUSICIANS THAT GO BY ONE NAME AND ARE DEAD
    public Musician(String firstName, String genre, String instrument, boolean isAlive) {
        this.firstName = firstName;
        this.genre = genre;
        this.instrument = instrument;
        this.isAlive = isAlive;
    }

    // MUSICIANS THAT GO BY ONE NAME AND ARE ALIVE
    public Musician(String firstName, String genre, String instrument, boolean isAlive, int age) {
        this.firstName = firstName;
        this.genre = genre;
        this.instrument = instrument;
        this.isAlive = isAlive;
        this.age = age;
    }


    // MUSICIANS THAT ARE DEAD
    public Musician(String firstName, String lastName, String genre, String instrument, boolean isAlive) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
        this.instrument = instrument;
        this.isAlive = isAlive;
    }

    // MUSICIANS THAT ARE ALIVE
    public Musician(String firstName, String lastName, String genre, String instrument, boolean isAlive, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
        this.instrument = instrument;
        this.isAlive = isAlive;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
