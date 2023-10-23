# TPRMI
# RMI and Hibernate-based Room and Machine Management

This repository contains a Java project for managing rooms and machines using Java RMI (Remote Method Invocation) and Hibernate. The project consists of two main components: a server project that handles data storage and retrieval, and a client project that provides a user interface for interacting with the system. This README provides an overview of the project, its structure, and instructions for running it.

## Overview

The project's main goal is to facilitate the management of rooms and machines. It allows users to perform the following operations:

- Create, read, update, and delete (CRUD) machines and rooms.
- Search for available machines in each room.

## Project Structure

The project is divided into two main parts:

1. *ServerRMI*: This server-side project is responsible for handling data storage and retrieval. It includes the following packages and classes:
   - `entities`: Contains the entity classes (`Machine` and `Room`) with appropriate Hibernate annotations.
   - `util`: Includes `HibernateUtil` class for managing Hibernate's `SessionFactory`.
   - `service`: Contains service classes (`MachineService` and `RoomService`) for CRUD operations.
   - `config`: Holds the Hibernate configuration file (`hibernate.cfg.xml`).
   - `dao`: Defines the `IDao` interface for data access.
   - `server`: Contains the `Server` class to start the RMI server.

2. *ClientRMI*: This client-side project provides a Swing-based user interface for interacting with the server. It includes the following components:
   - `entities`: Contains the same entity classes (`Machine` and `Room`) used on the server side.
   - `dao`: Includes the `IDao` interface for remote communication.
   - `config`: Contains the `Config` class to configure the RMI server's address and port, and a `configuration.properties` file to store the configuration settings.
   - `ui`: Contains Swing user interface classes, including `MachineForm`, `RoomForm`, and `SearchForm`.

## Prerequisites

Before running the project, make sure you have the following prerequisites installed:

- Java SE Development Kit (JDK)
- MySQL database
- MySQL Connector/J (JDBC Driver) for database connectivity

## Running the Project

Follow these steps to run the project:

1. Clone this repository to your local machine.

2. Configure your MySQL database with the appropriate settings, and ensure the configuration matches what's defined in the Hibernate configuration file (`hibernate.cfg.xml`).

3. Start the RMI server by running the `Server` class in the `ServerRMI` project.

4. Run the main class of the Swing-based UI in the `ClientRMI` project. This will launch the application's user interface.

## Contributing

Contributions are welcome! If you'd like to improve or extend this project, feel free to create a pull request or open an issue.

## Author

- [BAJEDDI]

For questions or assistance, please contact [nassimabajeddi2020@gmail.com].
## Screenshots
Main menu
![image](https://github.com/BAJEDDI/TPRMI/assets/147507670/17fe07eb-6d9c-40dc-99fa-1fc6398d4494)
Machines
![image](https://github.com/BAJEDDI/TPRMI/assets/147507670/3aa8bd8f-1824-4071-97eb-7d399f591b79)
![image](https://github.com/BAJEDDI/TPRMI/assets/147507670/70dd8646-78ad-48cd-a043-4b1fd95a1ae5)

