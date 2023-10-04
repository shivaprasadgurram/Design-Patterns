# Observer Design Pattern

Let's try to understand our **Weather Monitoring app** in detail.

This example demonstrates the Observer Design Pattern, where a weather station (the subject) notifies various weather displays (observers) when weather conditions change.

1. **Weather Station (WeatherData):**
   1. This class acts as the subject, representing the weather station that collects weather data.
   2. It maintains a list of observers and provides methods to register observers, remove observers, and notify observers when weather conditions change.
   3. The **registerObserver** method adds observers to its list.
   4. The **removeObserver** method removes observers from its list.
   5. The **notifyObservers** method iterates through the list of observers and calls their **update** method to notify them of changes in weather conditions.
   6. The **setMeasurements** method is used to update the weather data (temperature, humidity, and pressure) and then notifies the observers.
2. **Observer Interface (Observer):**
   1. This interface defines the common interface for all weather displays (observers).
   2. It consists of an **update** method that observers will implement to receive and display updated weather information.
3. **Concrete Observers (Display):**
   1. The **Display** class represents a concrete observer, such as a display screen that shows weather information.
   2. It implements the **Observer** interface, providing the **update** method to receive and display updated weather data.
   3. In the **update** method, the observer displays the received weather information, which includes temperature, humidity, and pressure.
4. **Main Method (WeatherStationExample):**
   1. In the **main** method, we create an instance of the **WeatherData** class, which serves as our weather station.
   2. We also create two instances of **Display** (concrete observers) to represent two weather displays.
   3. Next, we register both **Display** objects with the **WeatherData** (weather station) using the **registerObserver** method. This step establishes the observers' connection to the weather station.
   4. After registering the observers, we simulate changes in weather conditions by calling the **setMeasurements** method on the weather station twice. This triggers the notification process.
   5. When **setMeasurements** is called, the weather station **updates its internal state** (temperature, humidity, and pressure) and then **notifies all registered observers**.
   6. As a result, both **Display** objects receive the updated weather data and display it on the console.

When you run the **WeatherStationExample** program, you'll observe that both display screens (observers) receive and display the weather information as it changes. This example illustrates the key principles of the Observer Design Pattern, which allows you to maintain a one-to-many relationship between a subject (weather station) and multiple observers (weather displays) while keeping them loosely coupled. This flexibility makes it easy to add or remove observers without affecting the subject or other observers.
