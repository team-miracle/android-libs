/*
* Copyright (C) 2009 The Android Open Source Project
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
public abstract class AccessibilityService
  extends android.app.Service
{
public static final class MagnificationController
{
public static interface OnMagnificationChangedListener
{
public abstract  void onMagnificationChanged(android.accessibilityservice.AccessibilityService.MagnificationController controller, android.graphics.Region region, float scale, float centerX, float centerY);
}
MagnificationController() { throw new RuntimeException("Stub!"); }
public  void addListener(android.accessibilityservice.AccessibilityService.MagnificationController.OnMagnificationChangedListener listener) { throw new RuntimeException("Stub!"); }
public  void addListener(android.accessibilityservice.AccessibilityService.MagnificationController.OnMagnificationChangedListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  boolean removeListener(android.accessibilityservice.AccessibilityService.MagnificationController.OnMagnificationChangedListener listener) { throw new RuntimeException("Stub!"); }
public  float getScale() { throw new RuntimeException("Stub!"); }
public  float getCenterX() { throw new RuntimeException("Stub!"); }
public  float getCenterY() { throw new RuntimeException("Stub!"); }
public  android.graphics.Region getMagnificationRegion() { throw new RuntimeException("Stub!"); }
public  boolean reset(boolean animate) { throw new RuntimeException("Stub!"); }
public  boolean setScale(float scale, boolean animate) { throw new RuntimeException("Stub!"); }
public  boolean setCenter(float centerX, float centerY, boolean animate) { throw new RuntimeException("Stub!"); }
}
public static final class SoftKeyboardController
{
public static interface OnShowModeChangedListener
{
public abstract  void onShowModeChanged(android.accessibilityservice.AccessibilityService.SoftKeyboardController controller, int showMode);
}
SoftKeyboardController() { throw new RuntimeException("Stub!"); }
public  void addOnShowModeChangedListener(android.accessibilityservice.AccessibilityService.SoftKeyboardController.OnShowModeChangedListener listener) { throw new RuntimeException("Stub!"); }
public  void addOnShowModeChangedListener(android.accessibilityservice.AccessibilityService.SoftKeyboardController.OnShowModeChangedListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  boolean removeOnShowModeChangedListener(android.accessibilityservice.AccessibilityService.SoftKeyboardController.OnShowModeChangedListener listener) { throw new RuntimeException("Stub!"); }
public  int getShowMode() { throw new RuntimeException("Stub!"); }
public  boolean setShowMode(int showMode) { throw new RuntimeException("Stub!"); }
}
public abstract static class GestureResultCallback
{
public  GestureResultCallback() { throw new RuntimeException("Stub!"); }
public  void onCompleted(android.accessibilityservice.GestureDescription gestureDescription) { throw new RuntimeException("Stub!"); }
public  void onCancelled(android.accessibilityservice.GestureDescription gestureDescription) { throw new RuntimeException("Stub!"); }
}
public  AccessibilityService() { throw new RuntimeException("Stub!"); }
public abstract  void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent event);
public abstract  void onInterrupt();
protected  void onServiceConnected() { throw new RuntimeException("Stub!"); }
protected  boolean onGesture(int gestureId) { throw new RuntimeException("Stub!"); }
protected  boolean onKeyEvent(android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.view.accessibility.AccessibilityWindowInfo> getWindows() { throw new RuntimeException("Stub!"); }
public  android.view.accessibility.AccessibilityNodeInfo getRootInActiveWindow() { throw new RuntimeException("Stub!"); }
public final  void disableSelf() { throw new RuntimeException("Stub!"); }
public final  android.accessibilityservice.AccessibilityService.MagnificationController getMagnificationController() { throw new RuntimeException("Stub!"); }
public final  android.accessibilityservice.FingerprintGestureController getFingerprintGestureController() { throw new RuntimeException("Stub!"); }
public final  boolean dispatchGesture(android.accessibilityservice.GestureDescription gesture, android.accessibilityservice.AccessibilityService.GestureResultCallback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public final  android.accessibilityservice.AccessibilityService.SoftKeyboardController getSoftKeyboardController() { throw new RuntimeException("Stub!"); }
public final  android.accessibilityservice.AccessibilityButtonController getAccessibilityButtonController() { throw new RuntimeException("Stub!"); }
public final  boolean performGlobalAction(int action) { throw new RuntimeException("Stub!"); }
public  android.view.accessibility.AccessibilityNodeInfo findFocus(int focus) { throw new RuntimeException("Stub!"); }
public final  android.accessibilityservice.AccessibilityServiceInfo getServiceInfo() { throw new RuntimeException("Stub!"); }
public final  void setServiceInfo(android.accessibilityservice.AccessibilityServiceInfo info) { throw new RuntimeException("Stub!"); }
public  java.lang.Object getSystemService(java.lang.String name) { throw new RuntimeException("Stub!"); }
public final  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public static final int GESTURE_SWIPE_DOWN = 2;
public static final int GESTURE_SWIPE_DOWN_AND_LEFT = 15;
public static final int GESTURE_SWIPE_DOWN_AND_RIGHT = 16;
public static final int GESTURE_SWIPE_DOWN_AND_UP = 8;
public static final int GESTURE_SWIPE_LEFT = 3;
public static final int GESTURE_SWIPE_LEFT_AND_DOWN = 10;
public static final int GESTURE_SWIPE_LEFT_AND_RIGHT = 5;
public static final int GESTURE_SWIPE_LEFT_AND_UP = 9;
public static final int GESTURE_SWIPE_RIGHT = 4;
public static final int GESTURE_SWIPE_RIGHT_AND_DOWN = 12;
public static final int GESTURE_SWIPE_RIGHT_AND_LEFT = 6;
public static final int GESTURE_SWIPE_RIGHT_AND_UP = 11;
public static final int GESTURE_SWIPE_UP = 1;
public static final int GESTURE_SWIPE_UP_AND_DOWN = 7;
public static final int GESTURE_SWIPE_UP_AND_LEFT = 13;
public static final int GESTURE_SWIPE_UP_AND_RIGHT = 14;
public static final int GLOBAL_ACTION_BACK = 1;
public static final int GLOBAL_ACTION_HOME = 2;
public static final int GLOBAL_ACTION_LOCK_SCREEN = 8;
public static final int GLOBAL_ACTION_NOTIFICATIONS = 4;
public static final int GLOBAL_ACTION_POWER_DIALOG = 6;
public static final int GLOBAL_ACTION_QUICK_SETTINGS = 5;
public static final int GLOBAL_ACTION_RECENTS = 3;
public static final int GLOBAL_ACTION_TAKE_SCREENSHOT = 9;
public static final int GLOBAL_ACTION_TOGGLE_SPLIT_SCREEN = 7;
public static final java.lang.String SERVICE_INTERFACE = "android.accessibilityservice.AccessibilityService";
public static final java.lang.String SERVICE_META_DATA = "android.accessibilityservice";
public static final int SHOW_MODE_AUTO = 0;
public static final int SHOW_MODE_HIDDEN = 1;
}
