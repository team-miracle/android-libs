/*
* Copyright (C) 2016 The Android Open Source Project
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
package android.content.pm;
public class ShortcutManager
{
ShortcutManager() { throw new RuntimeException("Stub!"); }
public  boolean setDynamicShortcuts(java.util.List<android.content.pm.ShortcutInfo> shortcutInfoList) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.ShortcutInfo> getDynamicShortcuts() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.ShortcutInfo> getManifestShortcuts() { throw new RuntimeException("Stub!"); }
public  boolean addDynamicShortcuts(java.util.List<android.content.pm.ShortcutInfo> shortcutInfoList) { throw new RuntimeException("Stub!"); }
public  void removeDynamicShortcuts(java.util.List<java.lang.String> shortcutIds) { throw new RuntimeException("Stub!"); }
public  void removeAllDynamicShortcuts() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.ShortcutInfo> getPinnedShortcuts() { throw new RuntimeException("Stub!"); }
public  boolean updateShortcuts(java.util.List<android.content.pm.ShortcutInfo> shortcutInfoList) { throw new RuntimeException("Stub!"); }
public  void disableShortcuts(java.util.List<java.lang.String> shortcutIds) { throw new RuntimeException("Stub!"); }
public  void disableShortcuts(java.util.List<java.lang.String> shortcutIds, java.lang.CharSequence disabledMessage) { throw new RuntimeException("Stub!"); }
public  void enableShortcuts(java.util.List<java.lang.String> shortcutIds) { throw new RuntimeException("Stub!"); }
public  int getMaxShortcutCountPerActivity() { throw new RuntimeException("Stub!"); }
public  boolean isRateLimitingActive() { throw new RuntimeException("Stub!"); }
public  int getIconMaxWidth() { throw new RuntimeException("Stub!"); }
public  int getIconMaxHeight() { throw new RuntimeException("Stub!"); }
public  void reportShortcutUsed(java.lang.String shortcutId) { throw new RuntimeException("Stub!"); }
public  boolean isRequestPinShortcutSupported() { throw new RuntimeException("Stub!"); }
public  boolean requestPinShortcut(android.content.pm.ShortcutInfo shortcut, android.content.IntentSender resultIntent) { throw new RuntimeException("Stub!"); }
public  android.content.Intent createShortcutResultIntent(android.content.pm.ShortcutInfo shortcut) { throw new RuntimeException("Stub!"); }
}
