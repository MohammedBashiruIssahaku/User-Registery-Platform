The User Registry Platform is a Spring Boot backend application designed to manage user data with full CRUD (Create, Read, Update, Delete) functionality. It provides a foundational system for storing, retrieving, updating, and deleting user information, demonstrating an organized backend structure and essential database operations.

 Core Features

- User Management: Create, read, update, and delete user profiles with details such as name, email, and address.
- CRUD Operations: Modular endpoints for each operation, with robust error handling for smooth performance.
- Database Integration: Uses a relational database with Spring Data JPA for seamless data interaction.
- API Design: RESTful endpoints following best practices, accessible for frontend or further development.

 Technologies Used

- Spring Boot for backend logic
- Spring Data JPA for database management
- MySQL/PostgreSQL/H2 for data storage
- Maven for dependency management
- Postman for API testing

### Running the Application

To run the application locally without Docker, make sure **Maven** is installed.

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/user-registry-platform.git
   cd user-registry-platform
   ```

2. Configure Database Connection:
   Update the `application.properties` file in the `src/main/resources` directory with your database details:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/yourdatabase
   spring.datasource.username=yourusername
   spring.datasource.password=yourpassword
   ```

3. Build and Run the Application:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

4. Access the Application:
   Open `http://localhost:8080` in your browser or use Postman to interact with the API.

