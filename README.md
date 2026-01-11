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
