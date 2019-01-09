/*
* Copyright (C) 2013 The Android Open Source Project
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
public final class UiAutomation
{
public static interface OnAccessibilityEventListener
{
public abstract  void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent event);
}
public static interface AccessibilityEventFilter
{
public abstract  boolean accept(android.view.accessibility.AccessibilityEvent event);
}
UiAutomation() { throw new RuntimeException("Stub!"); }
public  void setOnAccessibilityEventListener(android.app.UiAutomation.OnAccessibilityEventListener listener) { throw new RuntimeException("Stub!"); }
public  void destroy() { throw new RuntimeException("Stub!"); }
public  boolean performGlobalAction(int action) { throw new RuntimeException("Stub!"); }
public  android.view.accessibility.AccessibilityNodeInfo findFocus(int focus) { throw new RuntimeException("Stub!"); }
public  android.accessibilityservice.AccessibilityServiceInfo getServiceInfo() { throw new RuntimeException("Stub!"); }
public  void setServiceInfo(android.accessibilityservice.AccessibilityServiceInfo info) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.view.accessibility.AccessibilityWindowInfo> getWindows() { throw new RuntimeException("Stub!"); }
public  android.view.accessibility.AccessibilityNodeInfo getRootInActiveWindow() { throw new RuntimeException("Stub!"); }
public  boolean injectInputEvent(android.view.InputEvent event, boolean sync) { throw new RuntimeException("Stub!"); }
public  boolean setRotation(int rotation) { throw new RuntimeException("Stub!"); }
public  android.view.accessibility.AccessibilityEvent executeAndWaitForEvent(java.lang.Runnable command, android.app.UiAutomation.AccessibilityEventFilter filter, long timeoutMillis) throws java.util.concurrent.TimeoutException { throw new RuntimeException("Stub!"); }
public  void waitForIdle(long idleTimeoutMillis, long globalTimeoutMillis) throws java.util.concurrent.TimeoutException { throw new RuntimeException("Stub!"); }
public  android.graphics.Bitmap takeScreenshot() { throw new RuntimeException("Stub!"); }
public  void setRunAsMonkey(boolean enable) { throw new RuntimeException("Stub!"); }
public  boolean clearWindowContentFrameStats(int windowId) { throw new RuntimeException("Stub!"); }
public  android.view.WindowContentFrameStats getWindowContentFrameStats(int windowId) { throw new RuntimeException("Stub!"); }
public  void clearWindowAnimationFrameStats() { throw new RuntimeException("Stub!"); }
public  android.view.WindowAnimationFrameStats getWindowAnimationFrameStats() { throw new RuntimeException("Stub!"); }
public  void grantRuntimePermission(java.lang.String packageName, java.lang.String permission) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean grantRuntimePermission(java.lang.String packageName, java.lang.String permission, android.os.UserHandle userHandle) { throw new RuntimeException("Stub!"); }
public  void grantRuntimePermissionAsUser(java.lang.String packageName, java.lang.String permission, android.os.UserHandle userHandle) { throw new RuntimeException("Stub!"); }
public  void revokeRuntimePermission(java.lang.String packageName, java.lang.String permission) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean revokeRuntimePermission(java.lang.String packageName, java.lang.String permission, android.os.UserHandle userHandle) { throw new RuntimeException("Stub!"); }
public  void revokeRuntimePermissionAsUser(java.lang.String packageName, java.lang.String permission, android.os.UserHandle userHandle) { throw new RuntimeException("Stub!"); }
public  android.os.ParcelFileDescriptor executeShellCommand(java.lang.String command) { throw new RuntimeException("Stub!"); }
public  android.os.ParcelFileDescriptor[] executeShellCommandRw(java.lang.String command) { throw new RuntimeException("Stub!"); }
public static final int FLAG_DONT_SUPPRESS_ACCESSIBILITY_SERVICES = 1;
public static final int ROTATION_FREEZE_0 = 0;
public static final int ROTATION_FREEZE_180 = 2;
public static final int ROTATION_FREEZE_270 = 3;
public static final int ROTATION_FREEZE_90 = 1;
public static final int ROTATION_FREEZE_CURRENT = -1;
public static final int ROTATION_UNFREEZE = -2;
}
