import java.util.HashSet;
import java.util.Set;

// This class represents a user's interests and provides methods for managing them
public class Interest {
    
    // Set to store the user's interests
    private Set<String> interests;

    // Constructor initializes the interests set
    public Interest() {
        this.interests = new HashSet<>();
    }

    // Adds a new interest to the set
    public void addInterest(String interest) {
        interests.add(interest);
    }

    // Removes an interest from the set
    public void removeInterest(String interest) {
        interests.remove(interest);
    }

    // Retrieves a copy of the set containing the user's interests
    public Set<String> getInterests() {

        // Returning a new HashSet to prevent direct modification of internal state
        return new HashSet<>(interests);
    }
}

