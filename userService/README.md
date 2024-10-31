# User Service CRUD Application

This application provides a set of RESTful APIs to manage user profiles.

## Getting Started

To run this application, you need to set up a `.env` file in the root directory of the `userService` folder. This file should include the following configurations:


### Step : Create the `.env` File

1. Navigate to the root directory of the `userService` project.
2. Create a new file named `.env`.
3. Copy and paste the following configuration into the `.env` file:

   ```plaintext
   SERVER_PORT=9191
   MYSQL_URL=jdbc:mysql://localhost:3306/user_profile
   MYSQL_USERNAME=root
   MYSQL_PASSWORD=password

#### All API calls will be directed towards the /user endpoint. Below are the available API calls:

POST /user/addUserProfile: Add a new user profile.
POST /user/addUserProfiles: Add multiple user profiles.
GET /user/getAllUserProfiles: Retrieve all user profiles.
GET /user/getUserProfileByUsername/{username}: Retrieve a user profile by username.
PUT /user/updateUserProfile: Update an existing user profile.
DELETE /user/deleteUserProfile/{id}: Delete a user profile by ID


##### Step : Running the Application
Make sure you have the necessary dependencies installed and your database is set up correctly.
Start the application by running the main class or using your preferred build tool (e.g., Maven).
The application will be available at http://localhost:9191/user.