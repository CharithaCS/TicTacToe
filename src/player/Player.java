package player;

public class Player {
    private String name;
    private char symbol;
    private String address;
    private long mobileNumber;
    private String emailID;
    private int age;
    
    public void setPlayerDetails(String name, char symbol, String address, long mobileNumber, String emailID, int age) {
        this.name = name;
        this.symbol = symbol;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.emailID = emailID;
        this.age = age;
    }
    
    public void setPlayerNameAndAge(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void setPlayerNameAndSymbol (String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }
    
    public void setSymbol (char symbol) {
        this.symbol = symbol;
    }
    
    public String getPlayerName() {
        return this.name;
    }
    
    public char getPlayerSymbol() {
        return this.symbol;
    }
    
    public void getPlayerDetails() {
        System.out.println("Player Name: " + this.name);
        System.out.println("Player Symbol: " + this.symbol);
        System.out.println("Player EmailID: " + this.emailID);
        System.out.println("Player Age: " + this.age);
        System.out.println("Player Mobile Number: " + this.mobileNumber);
        System.out.println("Player Address: " + this.address);
        System.out.println("Player Age: " + this.age);
    }
    
    public void getPlayerNameAndAge() {
        System.out.println("Player Name: " + this.name);
        System.out.println("Player Age: " + this.age);
    }
}
