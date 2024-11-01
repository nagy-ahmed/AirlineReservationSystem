# Airline Reservation System Project

> Developed a robust Airline Reservation System in Console Java. The project supports role-based access for Admins, Employees, and Passengers, featuring secure login, user management, and airport data handling. The system integrates a simulated database for managing users, airports, and flights.

### Project Overview

- **Technologies**: Java

- **Key Features**:
  - **Role-Based User Management**: 
    - **Admin**: Manages system users and settings.
    - **Employee**: Handles operational tasks (details not fully specified in the file).
    - **Passenger**: Can book flights and view schedules.
  - **Airport Management**: 
    - Each airport has attributes such as `name`, `code`, and `location`.
  - **Database Simulation**: 
    - A `DB` class mimics database functions with collections for passengers, admins, employees, airports, flights, and scheduled flights.
  - **Authentication**: 
    - Role-based login methods allow user-specific operations.
  - **Application Flow**: 
    - The `App` class contains two main views:
      - **View1**: Manages user authentication.
      - **View2**: Directs users to appropriate operations based on their role.
