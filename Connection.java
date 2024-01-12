import java.util.*;

// This class represents a social network connection manager that uses a graph structure to model relationships between users
public class Connection {

    // The graph to store connections between users
    private final Graph<String> graph;
    
    // List of users in the network
    private final List<User> userList;

    // Constructor initializes the graph and user list
    public Connection(List<User> userList) {
        this.graph = new Graph<>();
        this.userList = userList;
    }

    // Adds a new user node to the graph
    public void addNode(String userID) {
        graph.addNode(userID);
    }

    // Adds a connection (edge) between two users in the graph
    public void addEdge(String userID1, String userID2) {
        graph.addEdge(userID1, userID2);
    }

    // Recommends potential connections for a given user based on shared interests
    public Set<String> suggestConnections(User user) {

        // Set to store suggested connections
        Set<String> suggestedConnections = new HashSet<>();

        // Get interests of the given user
        Set<String> userInterests = user.getInterests();

        // Traverse the graph to find connections with shared interests
        for (String connection : graph.getAllNodes()) {

            // Skip comparing the user with itself
            if (!connection.equals(user.getUserID())) {

                // Retrieve the user object for the connection
                User connectionUser = getUserByUserID(connection);

                // Debugging output
                System.out.println("Comparing " + user.getUserID() + " and " + connectionUser.getUserID());

                // Get interests of the connection user
                Set<String> connectionInterests = connectionUser.getInterests();

                // Check for shared interests
                if (!Collections.disjoint(userInterests, connectionInterests)) {
                    suggestedConnections.add(connection);
                }
            }
        }

        // Return the set of suggested connections
        return suggestedConnections;
    }

    // Helper method to retrieve a user object based on its userID
    private User getUserByUserID(String userID) {

        // Iterate through the user list to find the matching user
        for (User user : userList) {
            if (user.getUserID().equals(userID)) {
                return user;
            }
        }
        // Print a message if the user is not found (for debugging purposes)
        System.out.println("User not found for userID: " + userID);
        return null;
    }
}


/*
                                Theoretical Performance
   The time complexity of the "suggestConnections" method in the Connection class is O(V * (E + V)),
   where V is the number of users and E is the number of connections
   
   - Outer Loop: Iterating through each user in the graph has a time complexity of O(V)

   - Inner Loop: Within each iteration, the method traverses the entire graph to find connections
     with shared interests, resulting in a time complexity of O(E + V)
   
   - Overall: Multiplying the time complexities of the outer and inner loops gives O(V * (E + V))
   
*/
