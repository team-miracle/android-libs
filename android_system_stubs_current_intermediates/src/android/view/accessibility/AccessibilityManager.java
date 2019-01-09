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

package android.view.accessibility;
public final class AccessibilityManager
{
public static interface AccessibilityStateChangeListener
{
public abstract  void onAccessibilityStateChanged(boolean enabled);
}
public static interface TouchExplorationStateChangeListener
{
public abstract  void onTouchExplorationStateChanged(boolean enabled);
}
AccessibilityManager() { throw new RuntimeException("Stub!"); }
public  boolean isEnabled() { throw new RuntimeException("Stub!"); }
public  boolean isTouchExplorationEnabled() { throw new RuntimeException("Stub!"); }
public  void sendAccessibilityEvent(android.view.accessibility.AccessibilityEvent event) { throw new RuntimeException("Stub!"); }
public  void interrupt() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.util.List<android.content.pm.ServiceInfo> getAccessibilityServiceList() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getInstalledAccessibilityServiceList() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getEnabledAccessibilityServiceList(int feedbackTypeFlags) { throw new RuntimeException("Stub!"); }
public  boolean addAccessibilityStateChangeListener(android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener listener) { throw new RuntimeException("Stub!"); }
public  void addAccessibilityStateChangeListener(android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  boolean removeAccessibilityStateChangeListener(android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener listener) { throw new RuntimeException("Stub!"); }
public  boolean addTouchExplorationStateChangeListener(android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener listener) { throw new RuntimeException("Stub!"); }
public  void addTouchExplorationStateChangeListener(android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  boolean removeTouchExplorationStateChangeListener(android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener listener) { throw new RuntimeException("Stub!"); }
public  void addAccessibilityRequestPreparer(android.view.accessibility.AccessibilityRequestPreparer preparer) { throw new RuntimeException("Stub!"); }
public  void removeAccessibilityRequestPreparer(android.view.accessibility.AccessibilityRequestPreparer preparer) { throw new RuntimeException("Stub!"); }
public static  boolean isAccessibilityButtonSupported() { throw new RuntimeException("Stub!"); }
}
