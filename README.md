# Android App Testing with Selenium & Appium

This project demonstrates automated Android testing using Selenium, Appium, and Android Emulator. The goal is to automate testing for Android applications, ensuring robust, scalable, and maintainable test cases.

## Project Overview

This project uses the following tools to perform Android application testing:
- **Appium**: An open-source test automation framework for mobile apps.
- **Selenium**: A suite of tools to automate web browsers.
- **Java**: The programming language used for writing the test scripts.
- **Appium Inspector**: A tool to inspect the UI elements of the application under test.
- **Android Studio Emulator**: A virtual Android device used to test the application in a simulated environment.

## Features
- Automated Android app testing using Appium and Android Emulator.
- Test cases are written in **Java**.
- Inspect and interact with UI elements using **Appium Inspector**.
- Supports testing on various Android devices through Android Studio Emulator.

## Installation

### Prerequisites
1. [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
2. [Android Studio](https://developer.android.com/studio)
3. [Appium](https://appium.io/)
4. [Appium Inspector](https://github.com/appium/appium-inspector)
5. [Selenium WebDriver](https://www.selenium.dev/documentation/webdriver/)
6. [Maven](https://maven.apache.org/) (for managing dependencies)
7. Android Emulator setup in Android Studio.

### Setup
1. Clone this repository:
   ```bash
   git clone https://github.com/noorearafin/Mobile-Application-Appium-POM-ExtendReport.git

2. Install dependencies using Maven:
   ```bash
   mvn clean install
      
3. Start Appium server:
   ```bash
      appium
4. Configure Android Emulator in Android Studio and ensure the emulator is running.
### Usage
#### Running the Tests
1. Open your IDE (Eclipse/IntelliJ) and import the project.
2. Ensure that the Android Emulator is up and running.
3. Run the test cases using Maven or directly from your IDE
   ```bash
      mvn test
#### Maven Commands
- To clean and install the project, run
    ```bash
      mvn clean install
-To run the tests, use:
    ```bash
      mvn test
- For running specific test cases, use:
   ```bash
   mvn -Dtest=TestClassName test
#### Appium Server Command
You can start the Appium server by running:
    ```bash
       appium
## Project Structure
 ![image](https://github.com/user-attachments/assets/ec78d42e-a5bc-41de-a379-c91c089c8ee3)





