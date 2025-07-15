This repository showcases advanced techniques and best practices for building robust and scalable Selenium WebDriver automation frameworks.

✨ Key Capabilities
This framework explores crucial areas to elevate your automation strategy:

1. Custom Maven Commands
Purpose: Streamline test execution and build processes.

Usage: Define profiles/goals in pom.xml, execute with mvn <command>.


mvn clean install -Psmoke-tests

2. Docker for Cross-Browser Testing
Purpose: Achieve consistent, isolated, and scalable browser environments.

Usage: Run browser containers (Chrome/Firefox) with Selenium Grid.

docker run -d -p 4444:4444 selenium/standalone-chrome

3. Docker Compose for Environment Orchestration
Purpose: Easily manage multi-container test environments (Hub + Nodes).

Usage: Define services in docker-compose.yml, spin up with a single command.

YAML

# Example snippet for docker-compose.yml
services:
  selenium-hub:
    image: selenium/hub
  chrome-node:
    image: selenium/node-chrome

docker-compose up -d

4. Structural vs. Functional Page Object Model
Structural POM: Maps directly to UI elements on a page (LoginPage.enterUsername()).

Functional POM: Encapsulates user workflows across pages (LoginFlow.performLogin()).

Benefit: Choose the right abstraction for maintainability and readability.

5. Fluent Interface for Code Readability
Purpose: Create expressive, chainable methods for cleaner test steps.

Benefit: Reduces verbosity and duplication.

// Example: Chaining actions
homePage.navigateToLogin()
        .enterCredentials("user", "pass")
        .submitForm();


#  Assignment: 

Automate the E2E flow discussed in the video
Use Java Faker library to create dynamic data and use it Test Case
Create new page classes 
Create Utility classes for better for readability and maintenance
Create POJO class if required
