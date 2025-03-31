### 📋 Project Summary: Teacher Management System

The project you should continue working on is the **Teacher Management System** built with **Spring Boot** and *
*Thymeleaf**. The application allows users to perform **CRUD operations** (Create, Read, Update, Delete) on teacher
records. It uses **Spring Data JPA** for database interactions and connects to a MySQL database. The frontend is
designed with **Thymeleaf** templates to display teacher information and forms for adding and updating teachers.

#### Features Implemented:

1. **Teacher Entity**: Defined a `Teacher` entity with fields like `id`, `firstName`, `lastName`, and `email`.
2. **Teacher Repository**: Created a `TeacherRepository` to interact with the database and perform CRUD operations.
3. **Service Layer**: Implemented a `TeacherService` class to handle the business logic.
4. **Controller**: A `TeacherController` to manage HTTP requests, including listing, adding, updating, and deleting
   teachers.
5. **Thymeleaf Templates**:
    - `get-teachers.html` for displaying teacher data.
    - `teacher-form.html` for adding and updating teacher information.

### 🔐 New Instructions: Adding Spring Security with Roles and Validations

Now, you will enhance the project by integrating **Spring Security** to handle user authentication and role-based
authorization, and implement form validations for better user experience and security.

---

#### ✅ Task 1: **Add Spring Security Dependency**

- Add the Spring Security dependency to your `pom.xml`. 🔒

#### ✅ Task 2: **Configure Spring Security**

- **Authentication & Authorization**: Set up **in-memory authentication** with two roles:
    - `ADMIN`: Full access to all pages and operations. 👨‍💻
    - `USER`: Restricted access, can view teacher records but cannot perform CRUD operations. 👀

- **Authorization Rules**:
    - The `ADMIN` role should have full access to the application (create, update, delete teachers). 🛠️
    - The `USER` role should only have access to view the list of teachers. 👓
    - Implement login and logout functionality.

#### ✅ Task 3: **Add Roles to Teacher Data (Optional)**

- Consider adding a `role` field to the `Teacher` entity for scenarios where you might want teachers to have different
  access levels within the system.

#### ✅ Task 4: **Implement Form Validation**

- **Validate Teacher Data**: Add validations for the teacher's `firstName`, `lastName`, and `email` fields in the form (
  e.g., check if the email is properly formatted and if the fields are not empty). 📋✅

#### ✅ Task 5: **Exception Handling**

- **Exception Handling**: Implement exception handling.
    - For example, handle exceptions related to unauthorized actions or invalid data input. ⚠️
    - Ensure that relevant error messages are shown when a user tries to perform actions they don't have permission for
      or when something goes wrong with data operations.

- **Custom Error Pages**: Optionally, create custom error pages for different types of errors. These pages should
  display user-friendly messages indicating that something went wrong, helping users navigate the error gracefully. 🚫

#### ✅ Task 6: **Update Thymeleaf Templates**

- Modify the `teacher-form.html` template to show validation error messages. ✍️
- Ensure that the `get-teachers.html` template displays data according to the user's role. 🔑

#### ✅ Task 7: **Test the Application**

- Ensure the application works by testing different user roles:
    - `ADMIN` should be able to add, update, and delete teacher records. 🔧
    - `USER` should only be able to view teacher records. 👀

