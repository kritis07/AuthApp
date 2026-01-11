# 📱 AuthApp – Android Authentication Application

AuthApp is an Android application built using **Kotlin** and **Firebase Authentication** to demonstrate secure user authentication workflows. The app includes email/password authentication, user signup, password recovery, and OTP-based login, along with clear explanations for advanced features.

---

## 🔹 Tech Stack Used
- Android Studio
- Kotlin
- XML Layouts
- Firebase Authentication
- Firebase Console
- Material Design Components

---

## 🔹 Core Features Implemented (Mandatory Requirements)

### ✅ Email & Password Authentication
- Users can log in using registered email and password.
- Authentication handled securely via Firebase Authentication.

### ✅ User Signup
- New users can create an account using email and password.
- Input validation and Firebase error handling implemented.

### ✅ Login Functionality
- Secure login for existing users.
- Proper success and failure handling.

### ✅ Password Reset via Email (Bonus Implemented)
- Users can reset their password using a password reset email.
- Implemented using Firebase Authentication:
  ```kotlin
  FirebaseAuth.sendPasswordResetEmail()

### ✅ Session Handling
-Firebase Authentication automatically manages user sessions.
-Users remain logged in until explicitly logged out.

### ✅ Navigation Flow
-Splash Screen → Login Screen
-Login → Home Screen
-Signup → Login
-OTP Login → Home Screen

---

## 🌟 Bonus / Advanced Features
### ✅ Implemented Bonus Features

###  🔸 OTP-Based Login (Phone Authentication)
-OTP login screen implemented.
-Firebase Phone Authentication logic integrated.
-Flow includes:
Phone number input
OTP verification
Firebase credential validation

### ⚠️ Bonus Features Not Fully Implemented
### 🔹 Google Sign-In (Design Explanation)
Google Sign-In can be integrated using Firebase Authentication with GoogleAuthProvider.
-The app would request a Google ID token via Google Sign-In SDK and authenticate the user seamlessly without password entry.

### 🔹 Token-Based Session Handling (Design Explanation)
-Firebase Authentication internally manages secure ID tokens and refresh tokens to maintain authenticated user sessions without manual token handling.

### 🔹 Preventing Multiple Active Sessions (Design Explanation)
-To prevent multiple active sessions, a backend database such as Firestore can store session identifiers or timestamps per user.
-On each new login, older sessions can be invalidated to ensure only one active session per user.

### 🔹 OTP Feature Limitation (Important Note)
-Real OTP SMS delivery requires:
-App verification via SHA-1 fingerprint
-Physical device testing
Since emulators restrict SMS delivery, Firebase test phone numbers were used for development.
In production, OTP would work on real devices after SHA fingerprint registration.





  
