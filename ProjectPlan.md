# Project Plan

## Week 8 - Checkpoint 1 and Checkpoint 2

### Checkpoint 1
- [x] Finalize problem statement
- [x] Finalize user stories
- [x] Clearly identify MVP user stories
- [x] Complete project plan
- [x] Create screen designs
- [x] Add timelog
- [x] Push all Checkpoint 1 work to GitHub

### Checkpoint 2
- [ ] Finalize database design
- [ ] Create database tables in MySQL
- [ ] Create Hibernate entity classes
- [ ] Configure Hibernate
- [ ] Implement one DAO with full CRUD
- [ ] Unit test the DAO
- [ ] Implement Log4J2
- [ ] Push all Checkpoint 2 work to GitHub

## Week 9 - Checkpoint 3

### User Stories: Sign Up, Sign In, Password Reset
- [ ] Create AWS Cognito user pool
- [ ] Configure Cognito hosted login, signup, and password reset
- [ ] Configure Cognito app client and callback URLs
- [ ] Add login and logout links to the application
- [ ] Implement authentication callback handling
- [ ] Validate authentication tokens
- [ ] Connect authenticated users to application user records
- [ ] Test signup, login, logout, and password reset

### JSP and com.jackerickson.musiclessonfinder.test.util.Database Integration
- [ ] Create `InstrumentServlet` to retrieve instruments using `InstrumentDao`
- [ ] Create `instruments.jsp` to display instruments from MySQL
- [ ] Test JSP and Hibernate integration

### AWS Deployment
- [ ] Research AWS hosting requirements
- [ ] Set up AWS server (EC2 with Tomcat, if approved)
- [ ] Create MySQL database on AWS (RDS or course-provided database)
- [ ] Configure database security groups and connections
- [ ] Configure production database and Hibernate settings
- [ ] Configure Cognito settings for deployed application
- [ ] Build WAR file using Maven
- [ ] Deploy application to AWS server
- [ ] Test database connection, JSP, and authentication on AWS
- [ ] Add deployed application URL to student repository
- [ ] Push Checkpoint 3 work to GitHub

**Checkpoint 3 Due: Week 9**

## Week 10 - Teacher Profiles

### User Stories: Create Teacher Profile, Edit Teacher Profile
- [ ] Create `Teacher` and `Location` entities
- [ ] Create `TeacherDao` and `LocationDao`
- [ ] Implement CRUD operations for teacher profiles
- [ ] Create `TeacherServlet` to handle profile requests
- [ ] Create `teacherForm.jsp` for creating and editing profiles
- [ ] Add fields for bio, experience, and location
- [ ] Associate teacher profiles with authenticated Cognito users
- [ ] Add form validation
- [ ] Write DAO unit tests
- [ ] Update weekly reflection

## Week 11 - Lesson Management

### User Stories: Add Lesson, Edit Lesson, Delete Lesson
- [ ] Create `Lesson` entity with teacher and instrument relationships
- [ ] Create `LessonDao` with CRUD operations
- [ ] Create `LessonServlet` to handle lesson management
- [ ] Create `lessonForm.jsp` for adding and editing lessons
- [ ] Create `teacherDashboard.jsp` to display a teacher's lessons
- [ ] Implement create, update, and delete functionality
- [ ] Ensure teachers can only modify their own lessons
- [ ] Add validation for lesson fields
- [ ] Write DAO unit tests
- [ ] Update weekly reflection

## Week 12 - Lesson Search and External API

### User Stories: Search by Instrument, Search by Location
- [ ] Research ZIP code REST APIs and document selected API
- [ ] Test Zippopotam.us API responses
- [ ] Create `ZipCodeService` to call the external API using Java
- [ ] Parse latitude and longitude from JSON responses
- [ ] Store teacher location coordinates in MySQL
- [ ] Create `SearchServlet` to handle search requests
- [ ] Create `search.jsp` with instrument and ZIP code fields
- [ ] Add instrument filtering to `LessonDao`
- [ ] Display matching lessons on the search page
- [ ] Test API integration and search functionality
- [ ] Update weekly reflection

## Week 13 - Radius Search and Sorting

### User Stories: Filter by Distance, Sort Search Results
- [ ] Add radius dropdown to `search.jsp`
- [ ] Implement distance calculations using MySQL
- [ ] Update `LessonDao` to filter results by distance
- [ ] Add sorting by distance and price
- [ ] Update `SearchServlet` to process search filters
- [ ] Display lesson results with distance and pricing
- [ ] Test search queries and filtering
- [ ] Update weekly reflection

## Week 14 - Teacher and Lesson Details

### User Stories: View Teacher Profile, View Lesson Details
- [ ] Create `teacherProfile.jsp` to display teacher information
- [ ] Create `lessonDetails.jsp` to display lesson information
- [ ] Create or update servlets to retrieve individual teacher and lesson records
- [ ] Display teacher bio, experience, and available lessons
- [ ] Display lesson instrument, price, duration, and description
- [ ] Add navigation between search results, lessons, and teacher profiles
- [ ] Test all MVP features together
- [ ] Fix bugs and improve page layouts
- [ ] Update weekly reflection

## Week 15 - Final Testing and Documentation

- [ ] Complete end-to-end testing of MVP user stories
- [ ] Test Cognito authentication and teacher authorization
- [ ] Test lesson management and search functionality
- [ ] Review Hibernate queries and error handling
- [ ] Verify Log4j2 logging
- [ ] Fix bugs and improve UI
- [ ] Verify AWS deployment works correctly
- [ ] Update README.md to describe the completed application
- [ ] Finalize project documentation
- [ ] Record demonstration video
- [ ] Prepare final presentation
- [ ] Update weekly reflection

## Week 16 - Final Submission

- [ ] Complete final bug fixes
- [ ] Verify all MVP requirements are met
- [ ] Confirm deployed application is accessible
- [ ] Verify GitHub repository is up to date
- [ ] Complete final reflection and time log
- [ ] Submit final project