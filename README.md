
# WEATHER APP

A brief description of what this project does and who it's for

Sure! Here’s a detailed explanation of each part of the weather app, including its functionality and how the code works.

### Overview

The app consists of three main screens: a splash screen, a main screen, and a detailed view screen. The app uses Kotlin for Android development in Android Studio. The user can view weekly weather conditions, including minimum and maximum temperatures, and detailed daily weather information.

### Splash Screen

**Purpose:**
The splash screen serves as the initial screen of the app, displaying the app’s name, your name, student number, a logo, and options to navigate to the main screen or exit the app.

**Components:**
- **ImageView:** Displays the app's logo.
- **TextViews:** Show the app name, your name, and student number.
- **Buttons:** 
  - `Start` button navigates to the main screen.
  - `Exit` button closes the app.

**Code Explanation:**
- The `MainActivity.kt` initializes the splash screen. The `startBtn` button starts `MainAScreenctivity` when clicked, and the `exitBtn` button closes the app using `finish()`.

### Main Screen

**Purpose:**
The main screen displays the average temperature for the week and provides buttons to view detailed weather information or clear the input data. It also has an exit button.

**Components:**
- **TextView:** Displays the average temperature for the week.
- **Buttons:** 
  - `View Details` button navigates to the detailed view screen.
  - `Clear Data` button clears user input data.
  - `Exit` button closes the app.

**Code Explanation:**
- The `MainScreenActivity.kt` calculates the average temperature using two arrays for minimum and maximum temperatures.
- The `calculateAverageTemp` function computes the average temperature by summing the temperatures and dividing by the number of entries.
- The `btnViewDetails` button starts `DetailActivity` to show detailed daily weather information.
- The `btnClearData` button is a placeholder for functionality to clear and re-input user data.

### Detailed View Screen

**Purpose:**
The detailed view screen provides a comprehensive overview of each day’s weather, including minimum and maximum temperatures and weather conditions.

**Components:**
- **TextView:** Displays detailed weather information for each day.
- **Button:** 
  - `Back` button returns to the main screen.

**Code Explanation:**
- The `DetailActivity.kt` constructs a detailed string with information for each day, combining arrays for days, minimum temperatures, maximum temperatures, and conditions.
- The `btnBackMain` button closes the current activity, returning to the main screen.

### Error Handling

**Purpose:**
Error handling ensures the app can gracefully handle incorrect user actions, such as invalid input data.

**Example Implementation:**
- In the main screen’s `btnClearData` click listener, there’s a try-catch block that attempts to clear user data. If an error occurs, a `Toast` message informs the user of the error.

### Sample Data

The app uses sample data arrays to store weather information:
- `days`: Names of the days of the week.
- `minTemps`: Minimum temperatures for each day.
- `maxTemps`: Maximum temperatures for each day.
- `conditions`: Weather conditions for each day.

### Navigation

- **Splash Screen to Main Screen:** Clicking the `Start` button on the splash screen navigates to the main screen.
- **Main Screen to Detailed View Screen:** Clicking the `View Details` button on the main screen navigates to the detailed view screen.
- **Back from Detailed View Screen:** Clicking the `Back` button on the detailed view screen returns to the main screen.

### User Interface Design

- **Splash Screen:** Simple and welcoming, with essential information and navigation options.
- **Main Screen:** Provides key information (average temperature) and navigation buttons, ensuring ease of use.
- **Detailed View Screen:** Lists comprehensive daily weather information, ensuring readability and easy navigation back to the main screen.
