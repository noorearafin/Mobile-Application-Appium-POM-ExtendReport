# Mobile Application Testing with Appium, POM & ExtendReport

This project demonstrates automated Android mobile application testing using **Appium**, **Page Object Model (POM)** design pattern, and **ExtendReport** for comprehensive test reporting. The goal is to automate testing for Android applications with a scalable, maintainable, and well-documented approach.

## Project Overview

This project uses the following tools and frameworks to perform automated Android application testing:

- **Appium**: An open-source test automation framework for mobile applications (iOS/Android)
- **Selenium WebDriver**: Browser automation and element interaction
- **Java**: The programming language used for writing test scripts
- **Page Object Model (POM)**: Design pattern for better code maintainability and reusability
- **ExtendReport**: Advanced HTML reporting for test execution results
- **TestNG**: Testing framework for organizing and executing tests
- **Maven**: Build and dependency management tool
- **Android Studio Emulator**: Virtual Android device for testing
- **Appium Inspector**: UI inspection tool for identifying application elements

## Features

✅ **Automated Android App Testing** - Complete test automation using Appium  
✅ **Page Object Model Implementation** - Reusable and maintainable test code  
✅ **Advanced Reporting** - Detailed ExtendReport with screenshots and logs  
✅ **Cross-Device Support** - Test on various Android devices via emulator  
✅ **Java-Based Test Scripts** - Object-oriented and modular test design  
✅ **Maven Integration** - Easy dependency management and build automation  
✅ **CI/CD Ready** - Compatible with continuous integration pipelines  

## Installation

### Prerequisites

1. **Java Development Kit (JDK) 11+**
   - [Download JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
   - Set `JAVA_HOME` environment variable

2. **Android Studio**
   - [Download Android Studio](https://developer.android.com/studio)
   - Install Android SDK and create an Android Virtual Device (AVD)

3. **Appium Server**
   - [Install Appium](https://appium.io/docs/en/latest/intro/)
   - Or use: `npm install -g appium`

4. **Appium Inspector**
   - [Download Appium Inspector](https://github.com/appium/appium-inspector)
   - Used to inspect UI elements of the app under test

5. **Maven 3.6+**
   - [Download Maven](https://maven.apache.org/)
   - Set `MAVEN_HOME` environment variable

### Setup Instructions

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/noorearafin/Mobile-Application-Appium-POM-ExtendReport.git
   cd Mobile-Application-Appium-POM-ExtendReport
   ```

2. **Install Dependencies:**
   ```bash
   mvn clean install
   ```

3. **Configure Android Emulator:**
   - Open Android Studio
   - Navigate to AVD Manager
   - Create or run an existing Android Virtual Device
   - Ensure the emulator is running before executing tests

4. **Start Appium Server:**
   ```bash
   appium
   ```
   The Appium server will start on `http://127.0.0.1:4723`

## Project Structure

```
Mobile-Application-Appium-POM-ExtendReport/
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── pages/               # Page Object Model classes
│   │       ├── base/                # Base classes and utilities
│   │       └── utils/               # Helper utilities and constants
│   ├── test/
│   │   └── java/
│   │       └── tests/               # Test classes
│   └── resources/
│       ├── config.properties        # Configuration file
│       └── log4j.properties         # Logging configuration
├── target/
│   └── ExtentReports/               # Generated test reports
├── pom.xml                          # Maven configuration
└── README.md
```

## Usage

### Running Tests

#### Option 1: Run All Tests
```bash
mvn clean test
```

#### Option 2: Run Specific Test Class
```bash
mvn -Dtest=TestClassName test
```

#### Option 3: Run from IDE
1. Open the project in IntelliJ IDEA or Eclipse
2. Ensure Android Emulator is running
3. Right-click on test class → Run or Run with Coverage

### Maven Commands Reference

| Command | Purpose |
|---------|---------|
| `mvn clean` | Remove target directory |
| `mvn compile` | Compile the source code |
| `mvn test` | Run all tests |
| `mvn install` | Build and install to local repository |
| `mvn clean install` | Clean build and install |
| `mvn -Dtest=ClassName test` | Run specific test |
| `mvn verify` | Run tests and verify build |

### Starting Appium Server

```bash
# Start Appium on default port (4723)
appium

# Start on custom port
appium --port 4724

# With additional capabilities
appium --allow-insecure chromedriver_autodownload
```

## Page Object Model (POM)

This project follows the Page Object Model design pattern for better code organization and maintenance:

- **Page Classes**: Located in `src/main/java/pages/`
- **Base Page Class**: Provides common functionality for all pages
- **Element Locators**: Defined as constants in each page class
- **Page Methods**: User actions encapsulated in reusable methods

### Example Page Object:

```java
public class LoginPage extends BasePage {
    // Locators
    private static final By USERNAME_FIELD = By.id("com.example.app:id/username");
    private static final By PASSWORD_FIELD = By.id("com.example.app:id/password");
    private static final By LOGIN_BUTTON = By.id("com.example.app:id/login_btn");

    // Page Methods
    public void enterUsername(String username) {
        sendText(USERNAME_FIELD, username);
    }

    public void enterPassword(String password) {
        sendText(PASSWORD_FIELD, password);
    }

    public HomePage clickLoginButton() {
        click(LOGIN_BUTTON);
        return new HomePage();
    }
}
```

## ExtendReport Integration

This project uses **ExtentReports** for detailed HTML test reports with:

- ✅ Test execution timeline
- ✅ Pass/Fail statistics
- ✅ Screenshot attachments on failures
- ✅ Log messages and debug information
- ✅ Environment details
- ✅ Test categorization and filtering

### Report Generation

After test execution, open the generated report:
```bash
target/ExtentReports/ExtentReport.html
```

### Report Features:

- **Dashboard**: Overall test summary and statistics
- **Test Cases**: Detailed information for each test
- **Logs**: Step-by-step test execution logs
- **Screenshots**: Visual evidence of test failures
- **Analysis**: Graphical representation of test results

## Configuration

Update `src/main/resources/config.properties` with your settings:

```properties
# Android Device Configuration
android.version=12
android.device.name=emulator-5554
app.package=com.example.app
app.activity=.MainActivity
app.path=/path/to/app.apk

# Appium Server
appium.server.url=http://127.0.0.1:4723/wd/hub

# Test Configuration
test.timeout=30
implicit.wait=10
explicit.wait=20
```

## Best Practices

1. **Use Page Object Model**: Keep UI interactions encapsulated in page classes
2. **Explicit Waits**: Use explicit waits instead of implicit waits for better stability
3. **Descriptive Test Names**: Use clear, meaningful test method names
4. **Test Data Management**: Externalize test data from test scripts
5. **Screenshot on Failure**: Capture screenshots automatically on test failures
6. **Logging**: Use proper logging for debugging and analysis
7. **Clean Code**: Follow Java naming conventions and code standards
8. **Reusable Methods**: Create utility methods for common operations

## Troubleshooting

### Appium Connection Issues
```bash
# Ensure Appium is running
appium

# Check port availability
lsof -i :4723  # macOS/Linux
netstat -ano | findstr :4723  # Windows
```

### Android Emulator Issues
```bash
# List available AVDs
emulator -list-avds

# Start specific emulator
emulator -avd emulator_name

# Get connected devices
adb devices
```

### Build Issues
```bash
# Clean Maven cache
mvn clean
rm -rf ~/.m2/repository/

# Rebuild project
mvn clean install
```

## Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/YourFeature`)
3. Commit your changes (`git commit -m 'Add YourFeature'`)
4. Push to the branch (`git push origin feature/YourFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Support

For issues, questions, or suggestions:
- Open an [Issue](https://github.com/noorearafin/Mobile-Application-Appium-POM-ExtendReport/issues)
- Check existing documentation
- Review Appium [Official Documentation](https://appium.io/docs/en/latest/)

## Resources

- [Appium Documentation](https://appium.io/)
- [Selenium WebDriver](https://www.selenium.dev/)
- [Page Object Model Pattern](https://www.selenium.dev/documentation/test_practices/encouraged/page_object_models/)
- [ExtentReports](https://www.extentreports.com/)
- [Android Developer Guide](https://developer.android.com/docs)
- [TestNG Documentation](https://testng.org/doc/documentation-main.html)

---

**Last Updated:** 2026-04-26  
**Author:** noorearafin  
**Repository:** [Mobile-Application-Appium-POM-ExtendReport](https://github.com/noorearafin/Mobile-Application-Appium-POM-ExtendReport)
