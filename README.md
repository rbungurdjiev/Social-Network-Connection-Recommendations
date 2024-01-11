# Social Network Connection Recommendations

This Java project comprises three main classes: `User`, `Interest`, and `Connection`, providing a framework for managing users, their interests, and social network connections. The design promotes modularity and encapsulation for organized code structure.

## User Class
The `User` class represents a user in the social network, identified by a unique `userID` and a set of interests managed by an `Interest` object. The class includes methods to add interests (`addInterest`), retrieve the user's ID (`getUserID`), and obtain a copy of the user's interests (`getInterests`).

## Interest Class
The `Interest` class manages a user's interests using a `HashSet`. It includes methods to add and remove interests, as well as a method to retrieve a copy of the user's interests, promoting encapsulation.

## Connection Class
The `Connection` class acts as a social network connection manager, utilizing a graph structure represented by the `Graph` class. It includes methods to add nodes and edges, and a `suggestConnections` method recommends potential connections for a user based on shared interests. Debugging outputs assist in tracking user comparisons and provide a message if a user is not found.

## Graph Class
The generic `Graph` class represents an undirected graph using an adjacency list. It includes methods to add nodes, add edges, get adjacent nodes, and retrieve all nodes in the graph. This class offers a flexible and modular implementation of an undirected graph.

## Main Class
The `Main` class serves as the entry point, showcasing the usage of the above classes. It creates users, assigns interests, establishes connections, and suggests potential connections based on shared interests.

This project aims to provide a robust foundation for managing users and connections in a social network, fostering code organization, and readability.