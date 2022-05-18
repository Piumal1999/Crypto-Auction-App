# Crypto-Auction-App
Android Application for Cryptocurrency Auction Management System - CO225 Group Project

## Developer Guide

### Prerequisites
* Java 
* Android Studio
* Gradle (for Android App dependency management)
* Maven
* MySQL

### Setting up the App

1. Setup and deploy the backend
   - [Backend Development Guide and API Documentation](https://github.com/Piumal1999/cryptobid-backend/blob/main/README.md)

2. Fork and clone the repository
```shell
git clone https://github.com/<your profile name>/Crypto-Auction-App
```
3. Update the API Base URL in `java/com/cryptobid/cryptobid/network/RetrofitClient.java`
```java
private static final String BASE_URL = "http://192.168.1.9:8080/"
```

4. Build the app and run using the emulator or device


### User Guide

The user guide is available on the [Wiki](https://github.com/Piumal1999/Crypto-Auction-App/wiki/User-guide)
