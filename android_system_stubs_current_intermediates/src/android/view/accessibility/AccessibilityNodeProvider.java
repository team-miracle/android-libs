/*
* Copyright (C) 2011 The Android Open Source Project
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
public abstract class AccessibilityNodeProvider
{
public  AccessibilityNodeProvider() { throw new RuntimeException("Stub!"); }
public  android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int virtualViewId) { throw new RuntimeException("Stub!"); }
public  void addExtraDataToAccessibilityNodeInfo(int virtualViewId, android.view.accessibility.AccessibilityNodeInfo info, java.lang.String extraDataKey, android.os.Bundle arguments) { throw new RuntimeException("Stub!"); }
public  boolean performAction(int virtualViewId, int action, android.os.Bundle arguments) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByText(java.lang.String text, int virtualViewId) { throw new RuntimeException("Stub!"); }
public  android.view.accessibility.AccessibilityNodeInfo findFocus(int focus) { throw new RuntimeException("Stub!"); }
public static final int HOST_VIEW_ID = -1;
}
