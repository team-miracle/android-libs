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
public final class FingerprintGestureController
{
public abstract static class FingerprintGestureCallback
{
public  FingerprintGestureCallback() { throw new RuntimeException("Stub!"); }
public  void onGestureDetectionAvailabilityChanged(boolean available) { throw new RuntimeException("Stub!"); }
public  void onGestureDetected(int gesture) { throw new RuntimeException("Stub!"); }
}
FingerprintGestureController() { throw new RuntimeException("Stub!"); }
public  boolean isGestureDetectionAvailable() { throw new RuntimeException("Stub!"); }
public  void registerFingerprintGestureCallback(android.accessibilityservice.FingerprintGestureController.FingerprintGestureCallback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void unregisterFingerprintGestureCallback(android.accessibilityservice.FingerprintGestureController.FingerprintGestureCallback callback) { throw new RuntimeException("Stub!"); }
public static final int FINGERPRINT_GESTURE_SWIPE_DOWN = 8;
public static final int FINGERPRINT_GESTURE_SWIPE_LEFT = 2;
public static final int FINGERPRINT_GESTURE_SWIPE_RIGHT = 1;
public static final int FINGERPRINT_GESTURE_SWIPE_UP = 4;
}
