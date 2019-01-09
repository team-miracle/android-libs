/**
* Copyright (C) 2014 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package android.hardware.fingerprint;
@java.lang.Deprecated()
public class FingerprintManager
{
@java.lang.Deprecated()
public static final class CryptoObject
{
public  CryptoObject(java.security.Signature signature) { throw new RuntimeException("Stub!"); }
public  CryptoObject(javax.crypto.Cipher cipher) { throw new RuntimeException("Stub!"); }
public  CryptoObject(javax.crypto.Mac mac) { throw new RuntimeException("Stub!"); }
public  java.security.Signature getSignature() { throw new RuntimeException("Stub!"); }
public  javax.crypto.Cipher getCipher() { throw new RuntimeException("Stub!"); }
public  javax.crypto.Mac getMac() { throw new RuntimeException("Stub!"); }
}
@java.lang.Deprecated()
public static class AuthenticationResult
{
AuthenticationResult() { throw new RuntimeException("Stub!"); }
public  android.hardware.fingerprint.FingerprintManager.CryptoObject getCryptoObject() { throw new RuntimeException("Stub!"); }
}
@java.lang.Deprecated()
public abstract static class AuthenticationCallback
{
public  AuthenticationCallback() { throw new RuntimeException("Stub!"); }
public  void onAuthenticationError(int errorCode, java.lang.CharSequence errString) { throw new RuntimeException("Stub!"); }
public  void onAuthenticationHelp(int helpCode, java.lang.CharSequence helpString) { throw new RuntimeException("Stub!"); }
public  void onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager.AuthenticationResult result) { throw new RuntimeException("Stub!"); }
public  void onAuthenticationFailed() { throw new RuntimeException("Stub!"); }
}
FingerprintManager() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void authenticate(android.hardware.fingerprint.FingerprintManager.CryptoObject crypto, android.os.CancellationSignal cancel, int flags, android.hardware.fingerprint.FingerprintManager.AuthenticationCallback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean hasEnrolledFingerprints() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean isHardwareDetected() { throw new RuntimeException("Stub!"); }
public static final int FINGERPRINT_ACQUIRED_GOOD = 0;
public static final int FINGERPRINT_ACQUIRED_IMAGER_DIRTY = 3;
public static final int FINGERPRINT_ACQUIRED_INSUFFICIENT = 2;
public static final int FINGERPRINT_ACQUIRED_PARTIAL = 1;
public static final int FINGERPRINT_ACQUIRED_TOO_FAST = 5;
public static final int FINGERPRINT_ACQUIRED_TOO_SLOW = 4;
public static final int FINGERPRINT_ERROR_CANCELED = 5;
public static final int FINGERPRINT_ERROR_HW_NOT_PRESENT = 12;
public static final int FINGERPRINT_ERROR_HW_UNAVAILABLE = 1;
public static final int FINGERPRINT_ERROR_LOCKOUT = 7;
public static final int FINGERPRINT_ERROR_LOCKOUT_PERMANENT = 9;
public static final int FINGERPRINT_ERROR_NO_FINGERPRINTS = 11;
public static final int FINGERPRINT_ERROR_NO_SPACE = 4;
public static final int FINGERPRINT_ERROR_TIMEOUT = 3;
public static final int FINGERPRINT_ERROR_UNABLE_TO_PROCESS = 2;
public static final int FINGERPRINT_ERROR_USER_CANCELED = 10;
public static final int FINGERPRINT_ERROR_VENDOR = 8;
}
