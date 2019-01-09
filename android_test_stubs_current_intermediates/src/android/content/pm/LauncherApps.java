/*
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

package android.content.pm;
public class LauncherApps
{
public abstract static class Callback
{
public  Callback() { throw new RuntimeException("Stub!"); }
public abstract  void onPackageRemoved(java.lang.String packageName, android.os.UserHandle user);
public abstract  void onPackageAdded(java.lang.String packageName, android.os.UserHandle user);
public abstract  void onPackageChanged(java.lang.String packageName, android.os.UserHandle user);
public abstract  void onPackagesAvailable(java.lang.String[] packageNames, android.os.UserHandle user, boolean replacing);
public abstract  void onPackagesUnavailable(java.lang.String[] packageNames, android.os.UserHandle user, boolean replacing);
public  void onPackagesSuspended(java.lang.String[] packageNames, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  void onPackagesSuspended(java.lang.String[] packageNames, android.os.UserHandle user, android.os.Bundle launcherExtras) { throw new RuntimeException("Stub!"); }
public  void onPackagesUnsuspended(java.lang.String[] packageNames, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  void onShortcutsChanged(java.lang.String packageName, java.util.List<android.content.pm.ShortcutInfo> shortcuts, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
}
public static class ShortcutQuery
{
public  ShortcutQuery() { throw new RuntimeException("Stub!"); }
public  android.content.pm.LauncherApps.ShortcutQuery setChangedSince(long changedSince) { throw new RuntimeException("Stub!"); }
public  android.content.pm.LauncherApps.ShortcutQuery setPackage(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  android.content.pm.LauncherApps.ShortcutQuery setShortcutIds(java.util.List<java.lang.String> shortcutIds) { throw new RuntimeException("Stub!"); }
public  android.content.pm.LauncherApps.ShortcutQuery setActivity(android.content.ComponentName activity) { throw new RuntimeException("Stub!"); }
public  android.content.pm.LauncherApps.ShortcutQuery setQueryFlags(int queryFlags) { throw new RuntimeException("Stub!"); }
public static final int FLAG_GET_KEY_FIELDS_ONLY = 4;
public static final int FLAG_MATCH_DYNAMIC = 1;
public static final int FLAG_MATCH_MANIFEST = 8;
public static final int FLAG_MATCH_PINNED = 2;
public static final int FLAG_MATCH_PINNED_BY_ANY_LAUNCHER = 1024;
}
public static final class PinItemRequest
  implements android.os.Parcelable
{
PinItemRequest() { throw new RuntimeException("Stub!"); }
public  int getRequestType() { throw new RuntimeException("Stub!"); }
public  android.content.pm.ShortcutInfo getShortcutInfo() { throw new RuntimeException("Stub!"); }
public  android.appwidget.AppWidgetProviderInfo getAppWidgetProviderInfo(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
public  boolean isValid() { throw new RuntimeException("Stub!"); }
public  boolean accept(android.os.Bundle options) { throw new RuntimeException("Stub!"); }
public  boolean accept() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.content.pm.LauncherApps.PinItemRequest> CREATOR;
public static final int REQUEST_TYPE_APPWIDGET = 2;
public static final int REQUEST_TYPE_SHORTCUT = 1;
static { CREATOR = null; }
}
public  LauncherApps(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.os.UserHandle> getProfiles() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.LauncherActivityInfo> getActivityList(java.lang.String packageName, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  android.content.pm.LauncherActivityInfo resolveActivity(android.content.Intent intent, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  void startMainActivity(android.content.ComponentName component, android.os.UserHandle user, android.graphics.Rect sourceBounds, android.os.Bundle opts) { throw new RuntimeException("Stub!"); }
public  void startAppDetailsActivity(android.content.ComponentName component, android.os.UserHandle user, android.graphics.Rect sourceBounds, android.os.Bundle opts) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.LauncherActivityInfo> getShortcutConfigActivityList(java.lang.String packageName, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  android.content.IntentSender getShortcutConfigActivityIntent(android.content.pm.LauncherActivityInfo info) { throw new RuntimeException("Stub!"); }
public  boolean isPackageEnabled(java.lang.String packageName, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getSuspendedPackageLauncherExtras(java.lang.String packageName, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String packageName, int flags, android.os.UserHandle user) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  boolean isActivityEnabled(android.content.ComponentName component, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  boolean hasShortcutHostPermission() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.ShortcutInfo> getShortcuts(android.content.pm.LauncherApps.ShortcutQuery query, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  void pinShortcuts(java.lang.String packageName, java.util.List<java.lang.String> shortcutIds, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getShortcutIconDrawable(android.content.pm.ShortcutInfo shortcut, int density) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getShortcutBadgedIconDrawable(android.content.pm.ShortcutInfo shortcut, int density) { throw new RuntimeException("Stub!"); }
public  void startShortcut(java.lang.String packageName, java.lang.String shortcutId, android.graphics.Rect sourceBounds, android.os.Bundle startActivityOptions, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  void startShortcut(android.content.pm.ShortcutInfo shortcut, android.graphics.Rect sourceBounds, android.os.Bundle startActivityOptions) { throw new RuntimeException("Stub!"); }
public  void registerCallback(android.content.pm.LauncherApps.Callback callback) { throw new RuntimeException("Stub!"); }
public  void registerCallback(android.content.pm.LauncherApps.Callback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void unregisterCallback(android.content.pm.LauncherApps.Callback callback) { throw new RuntimeException("Stub!"); }
public  android.content.pm.LauncherApps.PinItemRequest getPinItemRequest(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_CONFIRM_PIN_APPWIDGET = "android.content.pm.action.CONFIRM_PIN_APPWIDGET";
public static final java.lang.String ACTION_CONFIRM_PIN_SHORTCUT = "android.content.pm.action.CONFIRM_PIN_SHORTCUT";
public static final java.lang.String EXTRA_PIN_ITEM_REQUEST = "android.content.pm.extra.PIN_ITEM_REQUEST";
}
