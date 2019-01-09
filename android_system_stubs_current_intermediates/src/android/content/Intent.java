/*
* Copyright (C) 2006 The Android Open Source Project
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

package android.content;
public class Intent
  implements android.os.Parcelable, java.lang.Cloneable
{
public static class ShortcutIconResource
  implements android.os.Parcelable
{
public  ShortcutIconResource() { throw new RuntimeException("Stub!"); }
public static  android.content.Intent.ShortcutIconResource fromContext(android.content.Context context, int resourceId) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.content.Intent.ShortcutIconResource> CREATOR;
public java.lang.String packageName;
public java.lang.String resourceName;
static { CREATOR = null; }
}
public static final class FilterComparison
{
public  FilterComparison(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  android.content.Intent getIntent() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
}
public  Intent() { throw new RuntimeException("Stub!"); }
public  Intent(android.content.Intent o) { throw new RuntimeException("Stub!"); }
public  Intent(java.lang.String action) { throw new RuntimeException("Stub!"); }
public  Intent(java.lang.String action, android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public  Intent(android.content.Context packageContext, java.lang.Class<?> cls) { throw new RuntimeException("Stub!"); }
public  Intent(java.lang.String action, android.net.Uri uri, android.content.Context packageContext, java.lang.Class<?> cls) { throw new RuntimeException("Stub!"); }
public static  android.content.Intent createChooser(android.content.Intent target, java.lang.CharSequence title) { throw new RuntimeException("Stub!"); }
public static  android.content.Intent createChooser(android.content.Intent target, java.lang.CharSequence title, android.content.IntentSender sender) { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public  android.content.Intent cloneFilter() { throw new RuntimeException("Stub!"); }
public static  android.content.Intent makeMainActivity(android.content.ComponentName mainActivity) { throw new RuntimeException("Stub!"); }
public static  android.content.Intent makeMainSelectorActivity(java.lang.String selectorAction, java.lang.String selectorCategory) { throw new RuntimeException("Stub!"); }
public static  android.content.Intent makeRestartActivityTask(android.content.ComponentName mainActivity) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  android.content.Intent getIntent(java.lang.String uri) throws java.net.URISyntaxException { throw new RuntimeException("Stub!"); }
public static  android.content.Intent parseUri(java.lang.String uri, int flags) throws java.net.URISyntaxException { throw new RuntimeException("Stub!"); }
public static  android.content.Intent getIntentOld(java.lang.String uri) throws java.net.URISyntaxException { throw new RuntimeException("Stub!"); }
public  java.lang.String getAction() { throw new RuntimeException("Stub!"); }
public  android.net.Uri getData() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDataString() { throw new RuntimeException("Stub!"); }
public  java.lang.String getScheme() { throw new RuntimeException("Stub!"); }
public  java.lang.String getType() { throw new RuntimeException("Stub!"); }
public  java.lang.String resolveType(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  java.lang.String resolveType(android.content.ContentResolver resolver) { throw new RuntimeException("Stub!"); }
public  java.lang.String resolveTypeIfNeeded(android.content.ContentResolver resolver) { throw new RuntimeException("Stub!"); }
public  boolean hasCategory(java.lang.String category) { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.lang.String> getCategories() { throw new RuntimeException("Stub!"); }
public  android.content.Intent getSelector() { throw new RuntimeException("Stub!"); }
public  android.content.ClipData getClipData() { throw new RuntimeException("Stub!"); }
public  void setExtrasClassLoader(java.lang.ClassLoader loader) { throw new RuntimeException("Stub!"); }
public  boolean hasExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  boolean hasFileDescriptors() { throw new RuntimeException("Stub!"); }
public  boolean getBooleanExtra(java.lang.String name, boolean defaultValue) { throw new RuntimeException("Stub!"); }
public  byte getByteExtra(java.lang.String name, byte defaultValue) { throw new RuntimeException("Stub!"); }
public  short getShortExtra(java.lang.String name, short defaultValue) { throw new RuntimeException("Stub!"); }
public  char getCharExtra(java.lang.String name, char defaultValue) { throw new RuntimeException("Stub!"); }
public  int getIntExtra(java.lang.String name, int defaultValue) { throw new RuntimeException("Stub!"); }
public  long getLongExtra(java.lang.String name, long defaultValue) { throw new RuntimeException("Stub!"); }
public  float getFloatExtra(java.lang.String name, float defaultValue) { throw new RuntimeException("Stub!"); }
public  double getDoubleExtra(java.lang.String name, double defaultValue) { throw new RuntimeException("Stub!"); }
public  java.lang.String getStringExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getCharSequenceExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public <T extends android.os.Parcelable> T getParcelableExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  android.os.Parcelable[] getParcelableArrayExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public <T extends android.os.Parcelable> java.util.ArrayList<T> getParcelableArrayListExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.io.Serializable getSerializableExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.util.ArrayList<java.lang.Integer> getIntegerArrayListExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.util.ArrayList<java.lang.String> getStringArrayListExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.util.ArrayList<java.lang.CharSequence> getCharSequenceArrayListExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  boolean[] getBooleanArrayExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  byte[] getByteArrayExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  short[] getShortArrayExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  char[] getCharArrayExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  int[] getIntArrayExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  long[] getLongArrayExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  float[] getFloatArrayExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  double[] getDoubleArrayExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getStringArrayExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence[] getCharSequenceArrayExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getBundleExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
public  int getFlags() { throw new RuntimeException("Stub!"); }
public  java.lang.String getPackage() { throw new RuntimeException("Stub!"); }
public  android.content.ComponentName getComponent() { throw new RuntimeException("Stub!"); }
public  android.graphics.Rect getSourceBounds() { throw new RuntimeException("Stub!"); }
public  android.content.ComponentName resolveActivity(android.content.pm.PackageManager pm) { throw new RuntimeException("Stub!"); }
public  android.content.pm.ActivityInfo resolveActivityInfo(android.content.pm.PackageManager pm, int flags) { throw new RuntimeException("Stub!"); }
public  android.content.Intent setAction(java.lang.String action) { throw new RuntimeException("Stub!"); }
public  android.content.Intent setData(android.net.Uri data) { throw new RuntimeException("Stub!"); }
public  android.content.Intent setDataAndNormalize(android.net.Uri data) { throw new RuntimeException("Stub!"); }
public  android.content.Intent setType(java.lang.String type) { throw new RuntimeException("Stub!"); }
public  android.content.Intent setTypeAndNormalize(java.lang.String type) { throw new RuntimeException("Stub!"); }
public  android.content.Intent setDataAndType(android.net.Uri data, java.lang.String type) { throw new RuntimeException("Stub!"); }
public  android.content.Intent setDataAndTypeAndNormalize(android.net.Uri data, java.lang.String type) { throw new RuntimeException("Stub!"); }
public  android.content.Intent addCategory(java.lang.String category) { throw new RuntimeException("Stub!"); }
public  void removeCategory(java.lang.String category) { throw new RuntimeException("Stub!"); }
public  void setSelector(android.content.Intent selector) { throw new RuntimeException("Stub!"); }
public  void setClipData(android.content.ClipData clip) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, boolean value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, byte value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, char value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, short value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, int value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, long value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, float value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, double value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, java.lang.CharSequence value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, android.os.Parcelable value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, android.os.Parcelable[] value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putParcelableArrayListExtra(java.lang.String name, java.util.ArrayList<? extends android.os.Parcelable> value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putIntegerArrayListExtra(java.lang.String name, java.util.ArrayList<java.lang.Integer> value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putStringArrayListExtra(java.lang.String name, java.util.ArrayList<java.lang.String> value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putCharSequenceArrayListExtra(java.lang.String name, java.util.ArrayList<java.lang.CharSequence> value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, java.io.Serializable value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, boolean[] value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, byte[] value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, short[] value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, char[] value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, int[] value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, long[] value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, float[] value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, double[] value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, java.lang.String[] value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, java.lang.CharSequence[] value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, android.os.Bundle value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtras(android.content.Intent src) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtras(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  android.content.Intent replaceExtras(android.content.Intent src) { throw new RuntimeException("Stub!"); }
public  android.content.Intent replaceExtras(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  void removeExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  android.content.Intent setFlags(int flags) { throw new RuntimeException("Stub!"); }
public  android.content.Intent addFlags(int flags) { throw new RuntimeException("Stub!"); }
public  void removeFlags(int flags) { throw new RuntimeException("Stub!"); }
public  android.content.Intent setPackage(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  android.content.Intent setComponent(android.content.ComponentName component) { throw new RuntimeException("Stub!"); }
public  android.content.Intent setClassName(android.content.Context packageContext, java.lang.String className) { throw new RuntimeException("Stub!"); }
public  android.content.Intent setClassName(java.lang.String packageName, java.lang.String className) { throw new RuntimeException("Stub!"); }
public  android.content.Intent setClass(android.content.Context packageContext, java.lang.Class<?> cls) { throw new RuntimeException("Stub!"); }
public  void setSourceBounds(android.graphics.Rect r) { throw new RuntimeException("Stub!"); }
public  int fillIn(android.content.Intent other, int flags) { throw new RuntimeException("Stub!"); }
public  boolean filterEquals(android.content.Intent other) { throw new RuntimeException("Stub!"); }
public  int filterHashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.lang.String toURI() { throw new RuntimeException("Stub!"); }
public  java.lang.String toUri(int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  void readFromParcel(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public static  android.content.Intent parseIntent(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser parser, android.util.AttributeSet attrs) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
public static  java.lang.String normalizeMimeType(java.lang.String type) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_AIRPLANE_MODE_CHANGED = "android.intent.action.AIRPLANE_MODE";
public static final java.lang.String ACTION_ALL_APPS = "android.intent.action.ALL_APPS";
public static final java.lang.String ACTION_ANSWER = "android.intent.action.ANSWER";
public static final java.lang.String ACTION_APPLICATION_PREFERENCES = "android.intent.action.APPLICATION_PREFERENCES";
public static final java.lang.String ACTION_APPLICATION_RESTRICTIONS_CHANGED = "android.intent.action.APPLICATION_RESTRICTIONS_CHANGED";
public static final java.lang.String ACTION_APP_ERROR = "android.intent.action.APP_ERROR";
public static final java.lang.String ACTION_ASSIST = "android.intent.action.ASSIST";
public static final java.lang.String ACTION_ATTACH_DATA = "android.intent.action.ATTACH_DATA";
public static final java.lang.String ACTION_BATTERY_CHANGED = "android.intent.action.BATTERY_CHANGED";
public static final java.lang.String ACTION_BATTERY_LEVEL_CHANGED = "android.intent.action.BATTERY_LEVEL_CHANGED";
public static final java.lang.String ACTION_BATTERY_LOW = "android.intent.action.BATTERY_LOW";
public static final java.lang.String ACTION_BATTERY_OKAY = "android.intent.action.BATTERY_OKAY";
public static final java.lang.String ACTION_BOOT_COMPLETED = "android.intent.action.BOOT_COMPLETED";
public static final java.lang.String ACTION_BUG_REPORT = "android.intent.action.BUG_REPORT";
public static final java.lang.String ACTION_CALL = "android.intent.action.CALL";
public static final java.lang.String ACTION_CALL_BUTTON = "android.intent.action.CALL_BUTTON";
public static final java.lang.String ACTION_CALL_EMERGENCY = "android.intent.action.CALL_EMERGENCY";
public static final java.lang.String ACTION_CALL_PRIVILEGED = "android.intent.action.CALL_PRIVILEGED";
public static final java.lang.String ACTION_CAMERA_BUTTON = "android.intent.action.CAMERA_BUTTON";
public static final java.lang.String ACTION_CARRIER_SETUP = "android.intent.action.CARRIER_SETUP";
public static final java.lang.String ACTION_CHOOSER = "android.intent.action.CHOOSER";
public static final java.lang.String ACTION_CLOSE_SYSTEM_DIALOGS = "android.intent.action.CLOSE_SYSTEM_DIALOGS";
public static final java.lang.String ACTION_CONFIGURATION_CHANGED = "android.intent.action.CONFIGURATION_CHANGED";
public static final java.lang.String ACTION_CREATE_DOCUMENT = "android.intent.action.CREATE_DOCUMENT";
public static final java.lang.String ACTION_CREATE_SHORTCUT = "android.intent.action.CREATE_SHORTCUT";
public static final java.lang.String ACTION_DATE_CHANGED = "android.intent.action.DATE_CHANGED";
public static final java.lang.String ACTION_DEFAULT = "android.intent.action.VIEW";
public static final java.lang.String ACTION_DELETE = "android.intent.action.DELETE";
@java.lang.Deprecated()
public static final java.lang.String ACTION_DEVICE_STORAGE_LOW = "android.intent.action.DEVICE_STORAGE_LOW";
@java.lang.Deprecated()
public static final java.lang.String ACTION_DEVICE_STORAGE_OK = "android.intent.action.DEVICE_STORAGE_OK";
public static final java.lang.String ACTION_DIAL = "android.intent.action.DIAL";
public static final java.lang.String ACTION_DOCK_EVENT = "android.intent.action.DOCK_EVENT";
public static final java.lang.String ACTION_DREAMING_STARTED = "android.intent.action.DREAMING_STARTED";
public static final java.lang.String ACTION_DREAMING_STOPPED = "android.intent.action.DREAMING_STOPPED";
public static final java.lang.String ACTION_EDIT = "android.intent.action.EDIT";
public static final java.lang.String ACTION_EXTERNAL_APPLICATIONS_AVAILABLE = "android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE";
public static final java.lang.String ACTION_EXTERNAL_APPLICATIONS_UNAVAILABLE = "android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE";
public static final java.lang.String ACTION_FACTORY_RESET = "android.intent.action.FACTORY_RESET";
public static final java.lang.String ACTION_FACTORY_TEST = "android.intent.action.FACTORY_TEST";
public static final java.lang.String ACTION_GET_CONTENT = "android.intent.action.GET_CONTENT";
public static final java.lang.String ACTION_GET_RESTRICTION_ENTRIES = "android.intent.action.GET_RESTRICTION_ENTRIES";
public static final java.lang.String ACTION_GLOBAL_BUTTON = "android.intent.action.GLOBAL_BUTTON";
public static final java.lang.String ACTION_GTALK_SERVICE_CONNECTED = "android.intent.action.GTALK_CONNECTED";
public static final java.lang.String ACTION_GTALK_SERVICE_DISCONNECTED = "android.intent.action.GTALK_DISCONNECTED";
public static final java.lang.String ACTION_HEADSET_PLUG = "android.intent.action.HEADSET_PLUG";
public static final java.lang.String ACTION_INPUT_METHOD_CHANGED = "android.intent.action.INPUT_METHOD_CHANGED";
public static final java.lang.String ACTION_INSERT = "android.intent.action.INSERT";
public static final java.lang.String ACTION_INSERT_OR_EDIT = "android.intent.action.INSERT_OR_EDIT";
public static final java.lang.String ACTION_INSTALL_FAILURE = "android.intent.action.INSTALL_FAILURE";
public static final java.lang.String ACTION_INSTALL_INSTANT_APP_PACKAGE = "android.intent.action.INSTALL_INSTANT_APP_PACKAGE";
public static final java.lang.String ACTION_INSTALL_PACKAGE = "android.intent.action.INSTALL_PACKAGE";
public static final java.lang.String ACTION_INSTANT_APP_RESOLVER_SETTINGS = "android.intent.action.INSTANT_APP_RESOLVER_SETTINGS";
public static final java.lang.String ACTION_INTENT_FILTER_NEEDS_VERIFICATION = "android.intent.action.INTENT_FILTER_NEEDS_VERIFICATION";
public static final java.lang.String ACTION_LOCALE_CHANGED = "android.intent.action.LOCALE_CHANGED";
public static final java.lang.String ACTION_LOCKED_BOOT_COMPLETED = "android.intent.action.LOCKED_BOOT_COMPLETED";
public static final java.lang.String ACTION_MAIN = "android.intent.action.MAIN";
public static final java.lang.String ACTION_MANAGED_PROFILE_ADDED = "android.intent.action.MANAGED_PROFILE_ADDED";
public static final java.lang.String ACTION_MANAGED_PROFILE_AVAILABLE = "android.intent.action.MANAGED_PROFILE_AVAILABLE";
public static final java.lang.String ACTION_MANAGED_PROFILE_REMOVED = "android.intent.action.MANAGED_PROFILE_REMOVED";
public static final java.lang.String ACTION_MANAGED_PROFILE_UNAVAILABLE = "android.intent.action.MANAGED_PROFILE_UNAVAILABLE";
public static final java.lang.String ACTION_MANAGED_PROFILE_UNLOCKED = "android.intent.action.MANAGED_PROFILE_UNLOCKED";
public static final java.lang.String ACTION_MANAGE_APP_PERMISSIONS = "android.intent.action.MANAGE_APP_PERMISSIONS";
public static final java.lang.String ACTION_MANAGE_NETWORK_USAGE = "android.intent.action.MANAGE_NETWORK_USAGE";
public static final java.lang.String ACTION_MANAGE_PACKAGE_STORAGE = "android.intent.action.MANAGE_PACKAGE_STORAGE";
public static final java.lang.String ACTION_MANAGE_PERMISSIONS = "android.intent.action.MANAGE_PERMISSIONS";
public static final java.lang.String ACTION_MANAGE_PERMISSION_APPS = "android.intent.action.MANAGE_PERMISSION_APPS";
public static final java.lang.String ACTION_MASTER_CLEAR_NOTIFICATION = "android.intent.action.MASTER_CLEAR_NOTIFICATION";
public static final java.lang.String ACTION_MEDIA_BAD_REMOVAL = "android.intent.action.MEDIA_BAD_REMOVAL";
public static final java.lang.String ACTION_MEDIA_BUTTON = "android.intent.action.MEDIA_BUTTON";
public static final java.lang.String ACTION_MEDIA_CHECKING = "android.intent.action.MEDIA_CHECKING";
public static final java.lang.String ACTION_MEDIA_EJECT = "android.intent.action.MEDIA_EJECT";
public static final java.lang.String ACTION_MEDIA_MOUNTED = "android.intent.action.MEDIA_MOUNTED";
public static final java.lang.String ACTION_MEDIA_NOFS = "android.intent.action.MEDIA_NOFS";
public static final java.lang.String ACTION_MEDIA_REMOVED = "android.intent.action.MEDIA_REMOVED";
public static final java.lang.String ACTION_MEDIA_SCANNER_FINISHED = "android.intent.action.MEDIA_SCANNER_FINISHED";
public static final java.lang.String ACTION_MEDIA_SCANNER_SCAN_FILE = "android.intent.action.MEDIA_SCANNER_SCAN_FILE";
public static final java.lang.String ACTION_MEDIA_SCANNER_STARTED = "android.intent.action.MEDIA_SCANNER_STARTED";
public static final java.lang.String ACTION_MEDIA_SHARED = "android.intent.action.MEDIA_SHARED";
public static final java.lang.String ACTION_MEDIA_UNMOUNTABLE = "android.intent.action.MEDIA_UNMOUNTABLE";
public static final java.lang.String ACTION_MEDIA_UNMOUNTED = "android.intent.action.MEDIA_UNMOUNTED";
public static final java.lang.String ACTION_MY_PACKAGE_REPLACED = "android.intent.action.MY_PACKAGE_REPLACED";
public static final java.lang.String ACTION_MY_PACKAGE_SUSPENDED = "android.intent.action.MY_PACKAGE_SUSPENDED";
public static final java.lang.String ACTION_MY_PACKAGE_UNSUSPENDED = "android.intent.action.MY_PACKAGE_UNSUSPENDED";
public static final java.lang.String ACTION_NEW_OUTGOING_CALL = "android.intent.action.NEW_OUTGOING_CALL";
public static final java.lang.String ACTION_OPEN_DOCUMENT = "android.intent.action.OPEN_DOCUMENT";
public static final java.lang.String ACTION_OPEN_DOCUMENT_TREE = "android.intent.action.OPEN_DOCUMENT_TREE";
public static final java.lang.String ACTION_PACKAGES_SUSPENDED = "android.intent.action.PACKAGES_SUSPENDED";
public static final java.lang.String ACTION_PACKAGES_UNSUSPENDED = "android.intent.action.PACKAGES_UNSUSPENDED";
public static final java.lang.String ACTION_PACKAGE_ADDED = "android.intent.action.PACKAGE_ADDED";
public static final java.lang.String ACTION_PACKAGE_CHANGED = "android.intent.action.PACKAGE_CHANGED";
public static final java.lang.String ACTION_PACKAGE_DATA_CLEARED = "android.intent.action.PACKAGE_DATA_CLEARED";
public static final java.lang.String ACTION_PACKAGE_FIRST_LAUNCH = "android.intent.action.PACKAGE_FIRST_LAUNCH";
public static final java.lang.String ACTION_PACKAGE_FULLY_REMOVED = "android.intent.action.PACKAGE_FULLY_REMOVED";
@java.lang.Deprecated()
public static final java.lang.String ACTION_PACKAGE_INSTALL = "android.intent.action.PACKAGE_INSTALL";
public static final java.lang.String ACTION_PACKAGE_NEEDS_VERIFICATION = "android.intent.action.PACKAGE_NEEDS_VERIFICATION";
public static final java.lang.String ACTION_PACKAGE_REMOVED = "android.intent.action.PACKAGE_REMOVED";
public static final java.lang.String ACTION_PACKAGE_REPLACED = "android.intent.action.PACKAGE_REPLACED";
public static final java.lang.String ACTION_PACKAGE_RESTARTED = "android.intent.action.PACKAGE_RESTARTED";
public static final java.lang.String ACTION_PACKAGE_VERIFIED = "android.intent.action.PACKAGE_VERIFIED";
public static final java.lang.String ACTION_PASTE = "android.intent.action.PASTE";
public static final java.lang.String ACTION_PICK = "android.intent.action.PICK";
public static final java.lang.String ACTION_PICK_ACTIVITY = "android.intent.action.PICK_ACTIVITY";
public static final java.lang.String ACTION_POWER_CONNECTED = "android.intent.action.ACTION_POWER_CONNECTED";
public static final java.lang.String ACTION_POWER_DISCONNECTED = "android.intent.action.ACTION_POWER_DISCONNECTED";
public static final java.lang.String ACTION_POWER_USAGE_SUMMARY = "android.intent.action.POWER_USAGE_SUMMARY";
public static final java.lang.String ACTION_PRE_BOOT_COMPLETED = "android.intent.action.PRE_BOOT_COMPLETED";
public static final java.lang.String ACTION_PROCESS_TEXT = "android.intent.action.PROCESS_TEXT";
public static final java.lang.String ACTION_PROVIDER_CHANGED = "android.intent.action.PROVIDER_CHANGED";
public static final java.lang.String ACTION_QUERY_PACKAGE_RESTART = "android.intent.action.QUERY_PACKAGE_RESTART";
public static final java.lang.String ACTION_QUICK_CLOCK = "android.intent.action.QUICK_CLOCK";
public static final java.lang.String ACTION_QUICK_VIEW = "android.intent.action.QUICK_VIEW";
public static final java.lang.String ACTION_REBOOT = "android.intent.action.REBOOT";
public static final java.lang.String ACTION_RESOLVE_INSTANT_APP_PACKAGE = "android.intent.action.RESOLVE_INSTANT_APP_PACKAGE";
public static final java.lang.String ACTION_REVIEW_PERMISSIONS = "android.intent.action.REVIEW_PERMISSIONS";
public static final java.lang.String ACTION_RUN = "android.intent.action.RUN";
public static final java.lang.String ACTION_SCREEN_OFF = "android.intent.action.SCREEN_OFF";
public static final java.lang.String ACTION_SCREEN_ON = "android.intent.action.SCREEN_ON";
public static final java.lang.String ACTION_SEARCH = "android.intent.action.SEARCH";
public static final java.lang.String ACTION_SEARCH_LONG_PRESS = "android.intent.action.SEARCH_LONG_PRESS";
public static final java.lang.String ACTION_SEND = "android.intent.action.SEND";
public static final java.lang.String ACTION_SENDTO = "android.intent.action.SENDTO";
public static final java.lang.String ACTION_SEND_MULTIPLE = "android.intent.action.SEND_MULTIPLE";
public static final java.lang.String ACTION_SET_WALLPAPER = "android.intent.action.SET_WALLPAPER";
public static final java.lang.String ACTION_SHOW_APP_INFO = "android.intent.action.SHOW_APP_INFO";
public static final java.lang.String ACTION_SHOW_SUSPENDED_APP_DETAILS = "android.intent.action.SHOW_SUSPENDED_APP_DETAILS";
public static final java.lang.String ACTION_SHUTDOWN = "android.intent.action.ACTION_SHUTDOWN";
@java.lang.Deprecated()
public static final java.lang.String ACTION_SIM_STATE_CHANGED = "android.intent.action.SIM_STATE_CHANGED";
public static final java.lang.String ACTION_SPLIT_CONFIGURATION_CHANGED = "android.intent.action.SPLIT_CONFIGURATION_CHANGED";
public static final java.lang.String ACTION_SYNC = "android.intent.action.SYNC";
public static final java.lang.String ACTION_SYSTEM_TUTORIAL = "android.intent.action.SYSTEM_TUTORIAL";
public static final java.lang.String ACTION_TIMEZONE_CHANGED = "android.intent.action.TIMEZONE_CHANGED";
public static final java.lang.String ACTION_TIME_CHANGED = "android.intent.action.TIME_SET";
public static final java.lang.String ACTION_TIME_TICK = "android.intent.action.TIME_TICK";
public static final java.lang.String ACTION_UID_REMOVED = "android.intent.action.UID_REMOVED";
@java.lang.Deprecated()
public static final java.lang.String ACTION_UMS_CONNECTED = "android.intent.action.UMS_CONNECTED";
@java.lang.Deprecated()
public static final java.lang.String ACTION_UMS_DISCONNECTED = "android.intent.action.UMS_DISCONNECTED";
public static final java.lang.String ACTION_UNINSTALL_PACKAGE = "android.intent.action.UNINSTALL_PACKAGE";
public static final java.lang.String ACTION_UPGRADE_SETUP = "android.intent.action.UPGRADE_SETUP";
public static final java.lang.String ACTION_USER_BACKGROUND = "android.intent.action.USER_BACKGROUND";
public static final java.lang.String ACTION_USER_FOREGROUND = "android.intent.action.USER_FOREGROUND";
public static final java.lang.String ACTION_USER_INITIALIZE = "android.intent.action.USER_INITIALIZE";
public static final java.lang.String ACTION_USER_PRESENT = "android.intent.action.USER_PRESENT";
public static final java.lang.String ACTION_USER_REMOVED = "android.intent.action.USER_REMOVED";
public static final java.lang.String ACTION_USER_UNLOCKED = "android.intent.action.USER_UNLOCKED";
public static final java.lang.String ACTION_VIEW = "android.intent.action.VIEW";
public static final java.lang.String ACTION_VOICE_ASSIST = "android.intent.action.VOICE_ASSIST";
public static final java.lang.String ACTION_VOICE_COMMAND = "android.intent.action.VOICE_COMMAND";
@java.lang.Deprecated()
public static final java.lang.String ACTION_WALLPAPER_CHANGED = "android.intent.action.WALLPAPER_CHANGED";
public static final java.lang.String ACTION_WEB_SEARCH = "android.intent.action.WEB_SEARCH";
public static final java.lang.String CATEGORY_ALTERNATIVE = "android.intent.category.ALTERNATIVE";
public static final java.lang.String CATEGORY_APP_BROWSER = "android.intent.category.APP_BROWSER";
public static final java.lang.String CATEGORY_APP_CALCULATOR = "android.intent.category.APP_CALCULATOR";
public static final java.lang.String CATEGORY_APP_CALENDAR = "android.intent.category.APP_CALENDAR";
public static final java.lang.String CATEGORY_APP_CONTACTS = "android.intent.category.APP_CONTACTS";
public static final java.lang.String CATEGORY_APP_EMAIL = "android.intent.category.APP_EMAIL";
public static final java.lang.String CATEGORY_APP_GALLERY = "android.intent.category.APP_GALLERY";
public static final java.lang.String CATEGORY_APP_MAPS = "android.intent.category.APP_MAPS";
public static final java.lang.String CATEGORY_APP_MARKET = "android.intent.category.APP_MARKET";
public static final java.lang.String CATEGORY_APP_MESSAGING = "android.intent.category.APP_MESSAGING";
public static final java.lang.String CATEGORY_APP_MUSIC = "android.intent.category.APP_MUSIC";
public static final java.lang.String CATEGORY_BROWSABLE = "android.intent.category.BROWSABLE";
public static final java.lang.String CATEGORY_CAR_DOCK = "android.intent.category.CAR_DOCK";
public static final java.lang.String CATEGORY_CAR_MODE = "android.intent.category.CAR_MODE";
public static final java.lang.String CATEGORY_DEFAULT = "android.intent.category.DEFAULT";
public static final java.lang.String CATEGORY_DESK_DOCK = "android.intent.category.DESK_DOCK";
public static final java.lang.String CATEGORY_DEVELOPMENT_PREFERENCE = "android.intent.category.DEVELOPMENT_PREFERENCE";
public static final java.lang.String CATEGORY_EMBED = "android.intent.category.EMBED";
public static final java.lang.String CATEGORY_FRAMEWORK_INSTRUMENTATION_TEST = "android.intent.category.FRAMEWORK_INSTRUMENTATION_TEST";
public static final java.lang.String CATEGORY_HE_DESK_DOCK = "android.intent.category.HE_DESK_DOCK";
public static final java.lang.String CATEGORY_HOME = "android.intent.category.HOME";
public static final java.lang.String CATEGORY_INFO = "android.intent.category.INFO";
public static final java.lang.String CATEGORY_LAUNCHER = "android.intent.category.LAUNCHER";
public static final java.lang.String CATEGORY_LEANBACK_LAUNCHER = "android.intent.category.LEANBACK_LAUNCHER";
public static final java.lang.String CATEGORY_LEANBACK_SETTINGS = "android.intent.category.LEANBACK_SETTINGS";
public static final java.lang.String CATEGORY_LE_DESK_DOCK = "android.intent.category.LE_DESK_DOCK";
public static final java.lang.String CATEGORY_MONKEY = "android.intent.category.MONKEY";
public static final java.lang.String CATEGORY_OPENABLE = "android.intent.category.OPENABLE";
public static final java.lang.String CATEGORY_PREFERENCE = "android.intent.category.PREFERENCE";
public static final java.lang.String CATEGORY_SAMPLE_CODE = "android.intent.category.SAMPLE_CODE";
public static final java.lang.String CATEGORY_SELECTED_ALTERNATIVE = "android.intent.category.SELECTED_ALTERNATIVE";
public static final java.lang.String CATEGORY_TAB = "android.intent.category.TAB";
public static final java.lang.String CATEGORY_TEST = "android.intent.category.TEST";
public static final java.lang.String CATEGORY_TYPED_OPENABLE = "android.intent.category.TYPED_OPENABLE";
public static final java.lang.String CATEGORY_UNIT_TEST = "android.intent.category.UNIT_TEST";
public static final java.lang.String CATEGORY_VOICE = "android.intent.category.VOICE";
public static final java.lang.String CATEGORY_VR_HOME = "android.intent.category.VR_HOME";
public static final android.os.Parcelable.Creator<android.content.Intent> CREATOR;
public static final java.lang.String EXTRA_ALARM_COUNT = "android.intent.extra.ALARM_COUNT";
public static final java.lang.String EXTRA_ALLOW_MULTIPLE = "android.intent.extra.ALLOW_MULTIPLE";
@java.lang.Deprecated()
public static final java.lang.String EXTRA_ALLOW_REPLACE = "android.intent.extra.ALLOW_REPLACE";
public static final java.lang.String EXTRA_ALTERNATE_INTENTS = "android.intent.extra.ALTERNATE_INTENTS";
public static final java.lang.String EXTRA_ASSIST_CONTEXT = "android.intent.extra.ASSIST_CONTEXT";
public static final java.lang.String EXTRA_ASSIST_INPUT_DEVICE_ID = "android.intent.extra.ASSIST_INPUT_DEVICE_ID";
public static final java.lang.String EXTRA_ASSIST_INPUT_HINT_KEYBOARD = "android.intent.extra.ASSIST_INPUT_HINT_KEYBOARD";
public static final java.lang.String EXTRA_ASSIST_PACKAGE = "android.intent.extra.ASSIST_PACKAGE";
public static final java.lang.String EXTRA_ASSIST_UID = "android.intent.extra.ASSIST_UID";
public static final java.lang.String EXTRA_BCC = "android.intent.extra.BCC";
public static final java.lang.String EXTRA_BUG_REPORT = "android.intent.extra.BUG_REPORT";
public static final java.lang.String EXTRA_CALLING_PACKAGE = "android.intent.extra.CALLING_PACKAGE";
public static final java.lang.String EXTRA_CC = "android.intent.extra.CC";
@java.lang.Deprecated()
public static final java.lang.String EXTRA_CHANGED_COMPONENT_NAME = "android.intent.extra.changed_component_name";
public static final java.lang.String EXTRA_CHANGED_COMPONENT_NAME_LIST = "android.intent.extra.changed_component_name_list";
public static final java.lang.String EXTRA_CHANGED_PACKAGE_LIST = "android.intent.extra.changed_package_list";
public static final java.lang.String EXTRA_CHANGED_UID_LIST = "android.intent.extra.changed_uid_list";
public static final java.lang.String EXTRA_CHOOSER_REFINEMENT_INTENT_SENDER = "android.intent.extra.CHOOSER_REFINEMENT_INTENT_SENDER";
public static final java.lang.String EXTRA_CHOOSER_TARGETS = "android.intent.extra.CHOOSER_TARGETS";
public static final java.lang.String EXTRA_CHOSEN_COMPONENT = "android.intent.extra.CHOSEN_COMPONENT";
public static final java.lang.String EXTRA_CHOSEN_COMPONENT_INTENT_SENDER = "android.intent.extra.CHOSEN_COMPONENT_INTENT_SENDER";
public static final java.lang.String EXTRA_COMPONENT_NAME = "android.intent.extra.COMPONENT_NAME";
public static final java.lang.String EXTRA_CONTENT_ANNOTATIONS = "android.intent.extra.CONTENT_ANNOTATIONS";
public static final java.lang.String EXTRA_DATA_REMOVED = "android.intent.extra.DATA_REMOVED";
public static final java.lang.String EXTRA_DOCK_STATE = "android.intent.extra.DOCK_STATE";
public static final int EXTRA_DOCK_STATE_CAR = 2;
public static final int EXTRA_DOCK_STATE_DESK = 1;
public static final int EXTRA_DOCK_STATE_HE_DESK = 4;
public static final int EXTRA_DOCK_STATE_LE_DESK = 3;
public static final int EXTRA_DOCK_STATE_UNDOCKED = 0;
public static final java.lang.String EXTRA_DONT_KILL_APP = "android.intent.extra.DONT_KILL_APP";
public static final java.lang.String EXTRA_EMAIL = "android.intent.extra.EMAIL";
public static final java.lang.String EXTRA_EXCLUDE_COMPONENTS = "android.intent.extra.EXCLUDE_COMPONENTS";
public static final java.lang.String EXTRA_FORCE_FACTORY_RESET = "android.intent.extra.FORCE_FACTORY_RESET";
public static final java.lang.String EXTRA_FROM_STORAGE = "android.intent.extra.FROM_STORAGE";
public static final java.lang.String EXTRA_HTML_TEXT = "android.intent.extra.HTML_TEXT";
public static final java.lang.String EXTRA_INDEX = "android.intent.extra.INDEX";
public static final java.lang.String EXTRA_INITIAL_INTENTS = "android.intent.extra.INITIAL_INTENTS";
public static final java.lang.String EXTRA_INSTALLER_PACKAGE_NAME = "android.intent.extra.INSTALLER_PACKAGE_NAME";
public static final java.lang.String EXTRA_INSTANT_APP_ACTION = "android.intent.extra.INSTANT_APP_ACTION";
public static final java.lang.String EXTRA_INSTANT_APP_BUNDLES = "android.intent.extra.INSTANT_APP_BUNDLES";
public static final java.lang.String EXTRA_INSTANT_APP_EXTRAS = "android.intent.extra.INSTANT_APP_EXTRAS";
public static final java.lang.String EXTRA_INSTANT_APP_FAILURE = "android.intent.extra.INSTANT_APP_FAILURE";
public static final java.lang.String EXTRA_INSTANT_APP_HOSTNAME = "android.intent.extra.INSTANT_APP_HOSTNAME";
public static final java.lang.String EXTRA_INSTANT_APP_SUCCESS = "android.intent.extra.INSTANT_APP_SUCCESS";
public static final java.lang.String EXTRA_INSTANT_APP_TOKEN = "android.intent.extra.INSTANT_APP_TOKEN";
public static final java.lang.String EXTRA_INTENT = "android.intent.extra.INTENT";
public static final java.lang.String EXTRA_KEY_EVENT = "android.intent.extra.KEY_EVENT";
public static final java.lang.String EXTRA_LOCAL_ONLY = "android.intent.extra.LOCAL_ONLY";
public static final java.lang.String EXTRA_LONG_VERSION_CODE = "android.intent.extra.LONG_VERSION_CODE";
public static final java.lang.String EXTRA_MIME_TYPES = "android.intent.extra.MIME_TYPES";
public static final java.lang.String EXTRA_NOT_UNKNOWN_SOURCE = "android.intent.extra.NOT_UNKNOWN_SOURCE";
public static final java.lang.String EXTRA_ORIGINATING_UID = "android.intent.extra.ORIGINATING_UID";
public static final java.lang.String EXTRA_ORIGINATING_URI = "android.intent.extra.ORIGINATING_URI";
public static final java.lang.String EXTRA_PACKAGES = "android.intent.extra.PACKAGES";
public static final java.lang.String EXTRA_PACKAGE_NAME = "android.intent.extra.PACKAGE_NAME";
public static final java.lang.String EXTRA_PERMISSION_NAME = "android.intent.extra.PERMISSION_NAME";
public static final java.lang.String EXTRA_PHONE_NUMBER = "android.intent.extra.PHONE_NUMBER";
public static final java.lang.String EXTRA_PROCESS_TEXT = "android.intent.extra.PROCESS_TEXT";
public static final java.lang.String EXTRA_PROCESS_TEXT_READONLY = "android.intent.extra.PROCESS_TEXT_READONLY";
public static final java.lang.String EXTRA_QUICK_VIEW_FEATURES = "android.intent.extra.QUICK_VIEW_FEATURES";
public static final java.lang.String EXTRA_QUIET_MODE = "android.intent.extra.QUIET_MODE";
public static final java.lang.String EXTRA_REASON = "android.intent.extra.REASON";
public static final java.lang.String EXTRA_REFERRER = "android.intent.extra.REFERRER";
public static final java.lang.String EXTRA_REFERRER_NAME = "android.intent.extra.REFERRER_NAME";
public static final java.lang.String EXTRA_REMOTE_CALLBACK = "android.intent.extra.REMOTE_CALLBACK";
public static final java.lang.String EXTRA_REMOTE_INTENT_TOKEN = "android.intent.extra.remote_intent_token";
public static final java.lang.String EXTRA_REPLACEMENT_EXTRAS = "android.intent.extra.REPLACEMENT_EXTRAS";
public static final java.lang.String EXTRA_REPLACING = "android.intent.extra.REPLACING";
public static final java.lang.String EXTRA_RESTRICTIONS_BUNDLE = "android.intent.extra.restrictions_bundle";
public static final java.lang.String EXTRA_RESTRICTIONS_INTENT = "android.intent.extra.restrictions_intent";
public static final java.lang.String EXTRA_RESTRICTIONS_LIST = "android.intent.extra.restrictions_list";
public static final java.lang.String EXTRA_RESULT_NEEDED = "android.intent.extra.RESULT_NEEDED";
public static final java.lang.String EXTRA_RESULT_RECEIVER = "android.intent.extra.RESULT_RECEIVER";
public static final java.lang.String EXTRA_RETURN_RESULT = "android.intent.extra.RETURN_RESULT";
@java.lang.Deprecated()
public static final java.lang.String EXTRA_SHORTCUT_ICON = "android.intent.extra.shortcut.ICON";
@java.lang.Deprecated()
public static final java.lang.String EXTRA_SHORTCUT_ICON_RESOURCE = "android.intent.extra.shortcut.ICON_RESOURCE";
@java.lang.Deprecated()
public static final java.lang.String EXTRA_SHORTCUT_INTENT = "android.intent.extra.shortcut.INTENT";
@java.lang.Deprecated()
public static final java.lang.String EXTRA_SHORTCUT_NAME = "android.intent.extra.shortcut.NAME";
public static final java.lang.String EXTRA_SHUTDOWN_USERSPACE_ONLY = "android.intent.extra.SHUTDOWN_USERSPACE_ONLY";
public static final java.lang.String EXTRA_SPLIT_NAME = "android.intent.extra.SPLIT_NAME";
public static final java.lang.String EXTRA_STREAM = "android.intent.extra.STREAM";
public static final java.lang.String EXTRA_SUBJECT = "android.intent.extra.SUBJECT";
public static final java.lang.String EXTRA_SUSPENDED_PACKAGE_EXTRAS = "android.intent.extra.SUSPENDED_PACKAGE_EXTRAS";
public static final java.lang.String EXTRA_TEMPLATE = "android.intent.extra.TEMPLATE";
public static final java.lang.String EXTRA_TEXT = "android.intent.extra.TEXT";
public static final java.lang.String EXTRA_TITLE = "android.intent.extra.TITLE";
public static final java.lang.String EXTRA_UID = "android.intent.extra.UID";
public static final java.lang.String EXTRA_UNKNOWN_INSTANT_APP = "android.intent.extra.UNKNOWN_INSTANT_APP";
public static final java.lang.String EXTRA_USER = "android.intent.extra.USER";
public static final java.lang.String EXTRA_VERIFICATION_BUNDLE = "android.intent.extra.VERIFICATION_BUNDLE";
public static final int FILL_IN_ACTION = 1;
public static final int FILL_IN_CATEGORIES = 4;
public static final int FILL_IN_CLIP_DATA = 128;
public static final int FILL_IN_COMPONENT = 8;
public static final int FILL_IN_DATA = 2;
public static final int FILL_IN_PACKAGE = 16;
public static final int FILL_IN_SELECTOR = 64;
public static final int FILL_IN_SOURCE_BOUNDS = 32;
public static final int FLAG_ACTIVITY_BROUGHT_TO_FRONT = 4194304;
public static final int FLAG_ACTIVITY_CLEAR_TASK = 32768;
public static final int FLAG_ACTIVITY_CLEAR_TOP = 67108864;
@java.lang.Deprecated()
public static final int FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET = 524288;
public static final int FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS = 8388608;
public static final int FLAG_ACTIVITY_FORWARD_RESULT = 33554432;
public static final int FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY = 1048576;
public static final int FLAG_ACTIVITY_LAUNCH_ADJACENT = 4096;
public static final int FLAG_ACTIVITY_MATCH_EXTERNAL = 2048;
public static final int FLAG_ACTIVITY_MULTIPLE_TASK = 134217728;
public static final int FLAG_ACTIVITY_NEW_DOCUMENT = 524288;
public static final int FLAG_ACTIVITY_NEW_TASK = 268435456;
public static final int FLAG_ACTIVITY_NO_ANIMATION = 65536;
public static final int FLAG_ACTIVITY_NO_HISTORY = 1073741824;
public static final int FLAG_ACTIVITY_NO_USER_ACTION = 262144;
public static final int FLAG_ACTIVITY_PREVIOUS_IS_TOP = 16777216;
public static final int FLAG_ACTIVITY_REORDER_TO_FRONT = 131072;
public static final int FLAG_ACTIVITY_RESET_TASK_IF_NEEDED = 2097152;
public static final int FLAG_ACTIVITY_RETAIN_IN_RECENTS = 8192;
public static final int FLAG_ACTIVITY_SINGLE_TOP = 536870912;
public static final int FLAG_ACTIVITY_TASK_ON_HOME = 16384;
public static final int FLAG_DEBUG_LOG_RESOLUTION = 8;
public static final int FLAG_EXCLUDE_STOPPED_PACKAGES = 16;
public static final int FLAG_FROM_BACKGROUND = 4;
public static final int FLAG_GRANT_PERSISTABLE_URI_PERMISSION = 64;
public static final int FLAG_GRANT_PREFIX_URI_PERMISSION = 128;
public static final int FLAG_GRANT_READ_URI_PERMISSION = 1;
public static final int FLAG_GRANT_WRITE_URI_PERMISSION = 2;
public static final int FLAG_INCLUDE_STOPPED_PACKAGES = 32;
public static final int FLAG_RECEIVER_FOREGROUND = 268435456;
public static final int FLAG_RECEIVER_NO_ABORT = 134217728;
public static final int FLAG_RECEIVER_REGISTERED_ONLY = 1073741824;
public static final int FLAG_RECEIVER_REPLACE_PENDING = 536870912;
public static final int FLAG_RECEIVER_VISIBLE_TO_INSTANT_APPS = 2097152;
public static final java.lang.String METADATA_DOCK_HOME = "android.dock_home";
public static final int URI_ALLOW_UNSAFE = 4;
public static final int URI_ANDROID_APP_SCHEME = 2;
public static final int URI_INTENT_SCHEME = 1;
static { CREATOR = null; }
}
