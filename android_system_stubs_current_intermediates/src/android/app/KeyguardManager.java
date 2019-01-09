/*
* Copyright (C) 2007 The Android Open Source Project
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

package android.app;
public class KeyguardManager
{
@java.lang.Deprecated()
public class KeyguardLock
{
KeyguardLock() { throw new RuntimeException("Stub!"); }
public  void disableKeyguard() { throw new RuntimeException("Stub!"); }
public  void reenableKeyguard() { throw new RuntimeException("Stub!"); }
}
@java.lang.Deprecated()
public static interface OnKeyguardExitResult
{
public abstract  void onKeyguardExitResult(boolean success);
}
public abstract static class KeyguardDismissCallback
{
public  KeyguardDismissCallback() { throw new RuntimeException("Stub!"); }
public  void onDismissError() { throw new RuntimeException("Stub!"); }
public  void onDismissSucceeded() { throw new RuntimeException("Stub!"); }
public  void onDismissCancelled() { throw new RuntimeException("Stub!"); }
}
KeyguardManager() { throw new RuntimeException("Stub!"); }
public  android.content.Intent createConfirmDeviceCredentialIntent(java.lang.CharSequence title, java.lang.CharSequence description) { throw new RuntimeException("Stub!"); }
public  android.content.Intent createConfirmFactoryResetCredentialIntent(java.lang.CharSequence title, java.lang.CharSequence description, java.lang.CharSequence alternateButtonLabel) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  android.app.KeyguardManager.KeyguardLock newKeyguardLock(java.lang.String tag) { throw new RuntimeException("Stub!"); }
public  boolean isKeyguardLocked() { throw new RuntimeException("Stub!"); }
public  boolean isKeyguardSecure() { throw new RuntimeException("Stub!"); }
@Deprecated
public  boolean inKeyguardRestrictedInputMode() { throw new RuntimeException("Stub!"); }
public  boolean isDeviceLocked() { throw new RuntimeException("Stub!"); }
public  boolean isDeviceSecure() { throw new RuntimeException("Stub!"); }
public  void requestDismissKeyguard(android.app.Activity activity, android.app.KeyguardManager.KeyguardDismissCallback callback) { throw new RuntimeException("Stub!"); }
public  void requestDismissKeyguard(android.app.Activity activity, java.lang.CharSequence message, android.app.KeyguardManager.KeyguardDismissCallback callback) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void exitKeyguardSecurely(android.app.KeyguardManager.OnKeyguardExitResult callback) { throw new RuntimeException("Stub!"); }
}
