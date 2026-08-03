#Project : Selenium Hybrid Automation Framework

1. A robust and scalable Hybrid Test Automation Framework developed using 
Java, Selenium WebDriver 4, TestNG, and Maven. 
2. The framework follows industry best practices such as Page Object Model (POM), ThreadLocal WebDriver, reusable utilities and detailed reporting.
----------------------------------------------------------------------------------

# Features

- ✅ Selenium WebDriver 4
- ✅ Java 21
- ✅ TestNG Framework
- ✅ Maven Project
- ✅ Hybrid Framework Architecture
- ✅ Page Object Model (POM)
- ✅ ThreadLocal DriverFactory
- ✅ Cross Browser Testing
  - Chrome
  - Edge
  - Firefox
- ✅ Parallel Excution
- ✅ Explicit Waits
- ✅ JavaScript Utilities
- ✅ Screenshot Capture
- ✅ Extent Reports
- ✅ Log4j2 Logging
- ✅ WebDriverListener for Element Highlighting
- ✅ Reusable Utility Classes
- ✅ Browser Configuration using ChromeOptions, EdgeOptions & FirefoxOptions

----------------------------------------------------------------------------------

# 🛠 Tech Stack

| Technology | Version |
|------------|----------|
| Java | 21 |
| Selenium | 4.x |
| TestNG | 7.x |
| Maven | Latest |
| ChromeDriver | Latest |
| EdgeDriver | Latest |
| FirefoxDriver | Latest |
| Log4j2 | Latest |
| Extent Reports | Latest |

----------------------------------------------------------------------------------

# 📂 Project Structure

```
SeleniumHybridFramework
│
├── src
│   ├── main
│   │   └── java
│   │       ├── drivers
│   │       ├── utilities
│   │       ├── listeners
│   │       ├── reports
│   │       └── pages
│   │
│   └── test
│       └── java
│           ├── testScripts
│           └── testData
│
├── screenshots
├── reports
├── logs
├── testng.xml
├── pom.xml
└── README.md
```

----------------------------------------------------------------------------------

# 🏗 Framework Design

The framework follows the Hybrid Framework architecture by combining:

- Page Object Model (POM)
- Reusable Utilities
- Driver Factory
- Centralized Configuration
- TestNG
- Extent Reports
- Logging

----------------------------------------------------------------------------------

# ⚙ Driver Management

The framework uses a **ThreadLocal DriverFactory** for thread-safe WebDriver management.

Supported Browsers:

- Chrome
- Edge
- Firefox
- Chrome Headless

----------------------------------------------------------------------------------

# ✨ Element Highlighting

Implemented using Selenium 4 **WebDriverListener**.

Every element is automatically highlighted before Selenium performs actions like:

- Click
- SendKeys
- Clear

This greatly simplifies debugging during automation execution.

----------------------------------------------------------------------------------

# 📊 Reporting

The framework automatically generates:

- HTML Extent Reports
- Execution Status
- Pass/Fail Statistics
- Screenshots for Failed Tests
- Execution Time

----------------------------------------------------------------------------------

# 📝 Logging

Logging is implemented using **Log4j2**.

Logs include:

- Browser Launch
- Test Execution
- Pass/Fail Status
- Exceptions
- Debug Information

----------------------------------------------------------------------------------

# ▶ Running the Tests

Clone the repository

```bash
git clone https://github.com/yourusername/SeleniumHybridFramework.git
```

Navigate to project

```bash
cd SeleniumHybridFramework
```

Run tests

```bash
mvn clean test
```

Or execute using TestNG Suite

```
testng.xml
```

----------------------------------------------------------------------------------

# 🌐 Cross Browser Execution

The framework supports execution on

- Chrome
- Edge
- Firefox

Browser can be selected from DriverFactory or configuration.

----------------------------------------------------------------------------------

# 📸 Sample Framework Features

✔ Page Object Model

✔ ThreadLocal DriverFactory

✔ Selenium 4

✔ TestNG

✔ Extent Reports

✔ Screenshot Utility

✔ Log4j2

✔ Cross Browser Testing

✔ WebDriverListener

✔ JavaScript Executor

✔ Explicit Waits

✔ Reusable Utilities

----------------------------------------------------------------------------------

# 📈 Future Enhancements

- Parallel Execution
- Data Driven Testing using Excel
- Database Validation
- API Testing Integration
- Jenkins CI/CD Integration
- Docker Execution
- Selenium Grid
- Allure Reporting
- GitHub Actions Workflow

----------------------------------------------------------------------------------

# 👨‍💻 Author

Name: Sanjay Hiraman Ughada
Role: Quality Assurance Executive
Company: UFO Movies India Limited, Andheri, Mumbai
Since: Apr-2025 - Present
Email: sanjay.ughada.123@gmail.com
Mobile No.: +91 8208124249
