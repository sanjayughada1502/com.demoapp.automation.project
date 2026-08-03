# 🚀 Selenium Hybrid Automation Framework

A robust and scalable **Hybrid Test Automation Framework** developed using **Java, Selenium WebDriver 4, TestNG, and Maven**.

The framework is designed by following industry best practices, including the **Page Object Model (POM)**, **ThreadLocal WebDriver**, reusable utility classes, centralized driver management, and comprehensive test reporting. It provides a modular, maintainable, and scalable solution for web application automation.

---

# ✨ Features

* ✅ Selenium WebDriver 4
* ✅ Java 21
* ✅ TestNG Framework
* ✅ Maven Build Management
* ✅ Hybrid Automation Framework Architecture
* ✅ Page Object Model (POM)
* ✅ ThreadLocal DriverFactory
* ✅ Cross-Browser Testing

  * Chrome
  * Edge
  * Firefox
* ✅ Parallel Test Execution
* ✅ Explicit Waits
* ✅ JavaScript Utility Methods
* ✅ Screenshot Capture
* ✅ Extent Reports
* ✅ Log4j2 Logging
* ✅ Selenium 4 WebDriverListener for Element Highlighting
* ✅ Reusable Utility Classes
* ✅ Browser Configuration using ChromeOptions, EdgeOptions, and FirefoxOptions

---

# 🛠 Tech Stack

| Technology         | Version |
| ------------------ | ------- |
| Java               | 21      |
| Selenium WebDriver | 4.x     |
| TestNG             | 7.x     |
| Maven              | Latest  |
| ChromeDriver       | Latest  |
| EdgeDriver         | Latest  |
| FirefoxDriver      | Latest  |
| Log4j2             | Latest  |
| Extent Reports     | Latest  |

---

# 📂 Project Structure

```text
SeleniumHybridFramework
│
├── src
│   ├── test
│   │   ├── java
│   │   │
│   │   ├── com.demoapp
│   │   │   │
│   │   │   ├── drivers
│   │   │   │     └── DriverFactory.java
│   │   │   │
│   │   │   ├── pages
│   │   │   │     ├── HomePage.java
│   │   │   │     ├── LoginPage.java
│   │   │   │     └── ...
│   │   │   │
│   │   │   ├── tests
│   │   │   │     ├── LoginTest.java
│   │   │   │     ├── ImageTest.java
│   │   │   │     └── ...
│   │   │   │
│   │   │   ├── base
│   │   │   │     └── TestBase.java
│   │   │   │
│   │   │   ├── listeners
│   │   │   │     ├── HighlightListener.java
│   │   │   │     └── TestListener.java
│   │   │   │
│   │   │   ├── reports
│   │   │   │     ├── ExtentManager.java
│   │   │   │     ├── ExtentReport.java
│   │   │   │     └── ExtentTestManager.java
│   │   │   │
│   │   │   ├── utilities
│   │   │   │     ├── WaitUtils.java
│   │   │   │     ├── JSUtils.java
│   │   │   │     ├── ScreenshotUtils.java
│   │   │   │     ├── ExcelUtils.java
│   │   │   │     ├── ImageUtils.java
│   │   │   │     ├── ConfigReader.java
│   │   │   │     └── CommonUtils.java
│   │   │   │
│   │   │   └── database
│   │   │         └── DBConnection.java
│   │   │
│   │   └── resources
│   │         ├── config.properties
│   │         ├── log4j2.xml
│   │         ├── testdata
│   │         └── images
│   │
│   └──
│
├── reports
├── screenshots
├── logs
├── target
├── test-output
├── pom.xml
├── testng.xml
└── README.md
```

---

# 🏗 Framework Design

The framework follows a **Hybrid Automation Framework** by combining:

* Page Object Model (POM)
* ThreadLocal Driver Management
* Driver Factory Design Pattern
* Reusable Utility Classes
* TestNG Framework
* Extent Reports
* Log4j2 Logging
* Centralized Browser Configuration

---

# ⚙ Driver Management

The framework uses a **ThreadLocal DriverFactory** to provide thread-safe WebDriver instances during parallel execution.

### Supported Browsers

* Chrome
* Chrome (Headless)
* Edge
* Firefox

---

# ✨ Element Highlighting

Element highlighting is implemented using **Selenium 4 WebDriverListener**.

Every web element is automatically highlighted before Selenium performs actions such as:

* Click
* Send Keys
* Clear

This feature makes test execution easier to debug and helps identify the element currently being interacted with.

---

# 📊 Reporting

The framework automatically generates detailed **Extent Reports**, including:

* Test Execution Status
* Pass/Fail Statistics
* Execution Time
* Failure Screenshots
* Detailed Test Logs

---

# 📝 Logging

Logging is implemented using **Log4j2**.

The framework records:

* Browser Launch Details
* Test Execution Flow
* Pass/Fail Status
* Exceptions
* Debug Information

---

# 🌐 Cross-Browser Execution

The framework supports execution on:

* Chrome
* Chrome Headless
* Edge
* Firefox

The browser can be selected through the DriverFactory or configuration settings.

---

# 🚀 Framework Highlights

* ✔ Hybrid Automation Framework
* ✔ Java 21
* ✔ Selenium WebDriver 4
* ✔ TestNG
* ✔ Maven
* ✔ Page Object Model (POM)
* ✔ ThreadLocal DriverFactory
* ✔ Parallel Test Execution
* ✔ Cross-Browser Testing
* ✔ Explicit Waits
* ✔ JavaScript Executor
* ✔ Screenshot Utility
* ✔ Extent Reports
* ✔ Log4j2 Logging
* ✔ Selenium 4 WebDriverListener
* ✔ Reusable Utility Classes

---

# 📈 Future Enhancements

* Data-Driven Testing using Excel
* API Testing Integration (REST Assured)
* Database Validation
* Jenkins CI/CD Integration
* Docker Support
* Selenium Grid
* GitHub Actions
* Allure Reports

---

# 👨‍💻 Author

**Sanjay Hiraman Ughada**

**Role:** Quality Assurance Engineer

📧 Email: [sanjay.ughada.123@gmail.com](mailto:sanjay.ughada.123@gmail.com)

📱 Mobile: +91 8208124249

🔗 GitHub: https://github.com/your-username

🔗 LinkedIn: https://www.linkedin.com/in/your-profile

---

