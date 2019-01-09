/*
* Copyright (C) 2017 The Android Open Source Project
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

package android.accessibilityservice;
public final class AccessibilityButtonController
{
public abstract static class AccessibilityButtonCallback
{
public  AccessibilityButtonCallback() { throw new RuntimeException("Stub!"); }
public  void onClicked(android.accessibilityservice.AccessibilityButtonController controller) { throw new RuntimeException("Stub!"); }
public  void onAvailabilityChanged(android.accessibilityservice.AccessibilityButtonController controller, boolean available) { throw new RuntimeException("Stub!"); }
}
AccessibilityButtonController() { throw new RuntimeException("Stub!"); }
public  boolean isAccessibilityButtonAvailable() { throw new RuntimeException("Stub!"); }
public  void registerAccessibilityButtonCallback(android.accessibilityservice.AccessibilityButtonController.AccessibilityButtonCallback callback) { throw new RuntimeException("Stub!"); }
public  void registerAccessibilityButtonCallback(android.accessibilityservice.AccessibilityButtonController.AccessibilityButtonCallback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void unregisterAccessibilityButtonCallback(android.accessibilityservice.AccessibilityButtonController.AccessibilityButtonCallback callback) { throw new RuntimeException("Stub!"); }
}
