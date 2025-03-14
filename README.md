# Survey Web Application

A simple survey web application using Java Spring Boot for the backend, PostgreSQL as the database, and HTML/CSS for the frontend.

## Features
1. **Homepage**
   - Contains two buttons:
     - Redirects to the survey form.
     - Displays the survey details so far.
2. **Survey Form**
   - Collects user details:
     - Full Name
     - Phone Number
     - Email
     - Address
     - Current Company
     - Years of Experience
3. **Survey Details Page**
   - Shows the collected survey responses.

## Technologies Used
- **Backend**: Java Spring Boot
- **Frontend**: HTML, CSS
- **Database**: PostgreSQL

## Database Schema
```sql
CREATE TABLE survey (
    id SERIAL PRIMARY KEY,
    full_name VARCHAR(100),
    phone_number INT,
    email VARCHAR(100),
    address VARCHAR(254),
    current_company VARCHAR(100),
    years_of_experience INT
);
```

## Installation & Setup
1. Clone the repository:
   ```sh
   git clone <repository_url>
   cd survey-web-app
   ```

2. Set up PostgreSQL:
   - Create a database named `survey_db`
   - Run the provided SQL schema to create the `survey` table

3. Configure the application:
   - Update `application.properties` in `src/main/resources/`:
     ```properties
     spring.datasource.url=jdbc:postgresql://localhost:5432/survey_db
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     spring.jpa.hibernate.ddl-auto=update
     ```

4. Build and run the application:
   ```sh
   mvn spring-boot:run
   ```

5. Open the application:
   - Visit `http://localhost:8080/` in your browser.

## API Endpoints
| Endpoint | Method | Description |
|----------|--------|-------------|
| `/` | GET | Homepage |
| `/survey/form.html` | GET | Displays the survey form |
| `/survey/submitSurvey` | POST | Submits the survey form |
| `/survey/getAll` | GET | Shows all survey responses |

## Future Enhancements
- Add frontend validation for form inputs.
- Implement Bootstrap for better UI/UX.

