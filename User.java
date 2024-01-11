import java.util.Set;

// This class represents a user in the social network, storing a unique identifier (userID) and a set of interests
public class User {

    // Unique identifier for the user
    private String userID;

    // Object to manage the user's interests
    private Interest userInterests;

    // Constructor to initialize the user with a given userID
    public User(String userID) {
        this.userID = userID;
        this.userInterests = new Interest();
    }

    // Getter method to retrieve the user's unique identifier
    public String getUserID() {
        return userID;
    }

    // Method to add a new interest to the user's set of interests
    public void addInterest(String interest) {
        userInterests.addInterest(interest);
    }

    // Method to retrieve a copy of the set containing the user's interests
    public Set<String> getInterests() {
        return userInterests.getInterests();
    }
}

