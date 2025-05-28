# OrangeHRM Selenium Test Automation Framework

## Overview
This project is a robust, scalable Selenium automation framework for [OrangeHRM Demo](https://opensource-demo.orangehrmlive.com/web/index.php/auth/login), built with Java, Maven, TestNG, and Log4J2. It follows the Page Object Model (POM) and Singleton design pattern, and demonstrates advanced TestNG features and OOP principles.

---

## Project Structure
```
orangehrm-selenium/
├── pom.xml
├── testng.xml
├── README.md
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── pages/         # Page Object classes (LoginPage, BasePage, etc.)
│   │   │   └── utils/         # Utilities (DriverManager, Log)
│   │   └── resources/
│   │       └── log4j2.xml     # Log4J2 configuration
│   └── test/
│       └── java/
│           ├── tests/         # Test classes (tests.LoginTest, AdvancedTestNGDemo, BaseTest, TestListener)
│           └── ...
└── logs/                      # Log files (created at runtime)
```

---

## Key Features
- **Page Object Model (POM):** Clean separation of page structure and test logic.
- **Singleton WebDriver with ThreadLocal:** Supports parallel execution and resource safety.
- **TestNG Integration:**
  - Data Providers (data-driven tests)
  - Priorities, Groups, Dependencies
  - Timeouts, Invocation Count
  - Listeners (custom logging)
  - Parallel execution (via `testng.xml`)
  - Inclusion/Exclusion of groups
- **Log4J2 Logging:** Console and rolling file logging for all actions and test events.
- **Data-Driven Testing:** Example with TestNG DataProvider.
- **OOP Principles:** Encapsulation, Inheritance, Abstraction, Polymorphism, Singleton, Constructors.

---

## OOP Concepts in Practice
- **Encapsulation:** Page classes encapsulate web elements and actions.
- **Inheritance:** `LoginPage` extends `BasePage`; all tests extend `BaseTest`.
- **Abstraction:** Test classes interact with high-level page methods, not low-level Selenium code.
- **Polymorphism:** TestNG listeners and method overriding.
- **Singleton:** `DriverManager` ensures one WebDriver per thread.
- **Constructors:** Used for initializing page objects and enforcing Singleton.

---

## How to Run
1. **Install Java 17+ and Maven.**
2. **Clone the repository.**
3. **Run tests:**
   - From terminal: `mvn test`
   - Or use your IDE with `testng.xml`.
4. **View logs:**
   - Console output
   - Rolling log files in `logs/`

---

## Customization
- **Add new page objects:** Extend `BasePage` and follow the POM pattern.
- **Add new tests:** Extend `BaseTest` and use TestNG annotations.
- **Configure logging:** Edit `src/main/resources/log4j2.xml`.
- **Change browser:** Update `DriverManager` to support other browsers.

---

## Example TestNG Features
- Data-driven login test with valid/invalid users
- Grouped and prioritized tests
- Dependent and skipped tests
- Parallel execution
- Custom listener for logging

---

## Credits
- [Selenium](https://www.selenium.dev/)
- [TestNG](https://testng.org/)
- [Log4J2](https://logging.apache.org/log4j/2.x/)
- [WebDriverManager](https://github.com/bonigarcia/webdrivermanager)

---

## License
This project is for educational and demonstration purposes. 