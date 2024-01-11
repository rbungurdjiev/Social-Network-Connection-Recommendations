import java.util.List;
import java.util.Set;

// The Main class serves as the entry point for the program, demonstrating the usage of the User, Interest, and Connection classes
public class Main {

    public static void main(String[] args) {
        // Create users
        User user1 = new User("Sophia Johnson");
        User user2 = new User("Ethan Smith");
        User user3 = new User("Olivia Davis");
        User user4 = new User("Jackson Williams");
        User user5 = new User("Emma Brown");
        User user6 = new User("Liam Miller");
        User user7 = new User("Ava Wilson");
        User user8 = new User("Aiden Moore");
        User user9 = new User("Mia Anderson");
        User user10 = new User("Noah Taylor");
        
        // Create a list of users
        List<User> userList = List.of(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10);

        // Create a Connection instance with the list of users
        Connection connection1 = new Connection(userList);

        // Add interests for users
        user1.addInterest("Sports");
        user1.addInterest("Music");

        user2.addInterest("Music");
        user2.addInterest("Movies");

        user3.addInterest("Sports");
        user3.addInterest("Books");

        user4.addInterest("Movies");
        user4.addInterest("Technology");

        user5.addInterest("Technology");
        user5.addInterest("Books");

        user6.addInterest("Sports");
        user6.addInterest("Movies");

        user7.addInterest("Music");
        user7.addInterest("Books");

        user8.addInterest("Sports");
        user8.addInterest("Technology");
        
        user9.addInterest("Sports");
        user9.addInterest("Movies");
        
        user10.addInterest("Music");
        user10.addInterest("Technology");

        // Create connections between users in the Connection instance
        connection1.addNode(user1.getUserID());
        connection1.addNode(user2.getUserID());
        connection1.addNode(user3.getUserID());
        connection1.addNode(user4.getUserID());
        connection1.addNode(user5.getUserID());
        connection1.addNode(user6.getUserID());
        connection1.addNode(user7.getUserID());
        connection1.addNode(user8.getUserID());
        connection1.addNode(user9.getUserID());
        connection1.addNode(user10.getUserID());

        connection1.addEdge(user1.getUserID(), user2.getUserID());
        connection1.addEdge(user2.getUserID(), user3.getUserID());
        connection1.addEdge(user3.getUserID(), user4.getUserID());
        connection1.addEdge(user4.getUserID(), user5.getUserID());
        connection1.addEdge(user5.getUserID(), user6.getUserID());
        connection1.addEdge(user6.getUserID(), user7.getUserID());
        connection1.addEdge(user7.getUserID(), user8.getUserID());
        connection1.addEdge(user8.getUserID(), user9.getUserID());
        connection1.addEdge(user9.getUserID(), user10.getUserID());
        
        // Iterate through each user in the userList
        for (User user : userList) {

            //  Display the interests of the current user
            System.out.println("Interests for " + user.getUserID() + ": " + user.getInterests());

            // Retrieve suggested connections for the current user from the Connection instance
            Set<String> suggestedConnections = connection1.suggestConnections(user);

            // Display the suggested connections for the current user
            System.out.println("Suggested connections for " + user.getUserID() + ": " + suggestedConnections);
        }

    }
}

