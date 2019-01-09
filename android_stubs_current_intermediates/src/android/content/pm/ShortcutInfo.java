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
public final class ShortcutInfo
  implements android.os.Parcelable
{
public static class Builder
{
public  Builder(android.content.Context context, java.lang.String id) { throw new RuntimeException("Stub!"); }
public  android.content.pm.ShortcutInfo.Builder setActivity(android.content.ComponentName activity) { throw new RuntimeException("Stub!"); }
public  android.content.pm.ShortcutInfo.Builder setIcon(android.graphics.drawable.Icon icon) { throw new RuntimeException("Stub!"); }
public  android.content.pm.ShortcutInfo.Builder setShortLabel(java.lang.CharSequence shortLabel) { throw new RuntimeException("Stub!"); }
public  android.content.pm.ShortcutInfo.Builder setLongLabel(java.lang.CharSequence longLabel) { throw new RuntimeException("Stub!"); }
public  android.content.pm.ShortcutInfo.Builder setDisabledMessage(java.lang.CharSequence disabledMessage) { throw new RuntimeException("Stub!"); }
public  android.content.pm.ShortcutInfo.Builder setCategories(java.util.Set<java.lang.String> categories) { throw new RuntimeException("Stub!"); }
public  android.content.pm.ShortcutInfo.Builder setIntent(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  android.content.pm.ShortcutInfo.Builder setIntents(android.content.Intent[] intents) { throw new RuntimeException("Stub!"); }
public  android.content.pm.ShortcutInfo.Builder setRank(int rank) { throw new RuntimeException("Stub!"); }
public  android.content.pm.ShortcutInfo.Builder setExtras(android.os.PersistableBundle extras) { throw new RuntimeException("Stub!"); }
public  android.content.pm.ShortcutInfo build() { throw new RuntimeException("Stub!"); }
}
ShortcutInfo() { throw new RuntimeException("Stub!"); }
public  java.lang.String getId() { throw new RuntimeException("Stub!"); }
public  java.lang.String getPackage() { throw new RuntimeException("Stub!"); }
public  android.content.ComponentName getActivity() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getShortLabel() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getLongLabel() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getDisabledMessage() { throw new RuntimeException("Stub!"); }
public  int getDisabledReason() { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.lang.String> getCategories() { throw new RuntimeException("Stub!"); }
public  android.content.Intent getIntent() { throw new RuntimeException("Stub!"); }
public  android.content.Intent[] getIntents() { throw new RuntimeException("Stub!"); }
public  int getRank() { throw new RuntimeException("Stub!"); }
public  android.os.PersistableBundle getExtras() { throw new RuntimeException("Stub!"); }
public  android.os.UserHandle getUserHandle() { throw new RuntimeException("Stub!"); }
public  long getLastChangedTimestamp() { throw new RuntimeException("Stub!"); }
public  boolean isDynamic() { throw new RuntimeException("Stub!"); }
public  boolean isPinned() { throw new RuntimeException("Stub!"); }
public  boolean isDeclaredInManifest() { throw new RuntimeException("Stub!"); }
public  boolean isImmutable() { throw new RuntimeException("Stub!"); }
public  boolean isEnabled() { throw new RuntimeException("Stub!"); }
public  boolean hasKeyFieldsOnly() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.content.pm.ShortcutInfo> CREATOR;
public static final int DISABLED_REASON_APP_CHANGED = 2;
public static final int DISABLED_REASON_BACKUP_NOT_SUPPORTED = 101;
public static final int DISABLED_REASON_BY_APP = 1;
public static final int DISABLED_REASON_NOT_DISABLED = 0;
public static final int DISABLED_REASON_OTHER_RESTORE_ISSUE = 103;
public static final int DISABLED_REASON_SIGNATURE_MISMATCH = 102;
public static final int DISABLED_REASON_UNKNOWN = 3;
public static final int DISABLED_REASON_VERSION_LOWER = 100;
public static final java.lang.String SHORTCUT_CATEGORY_CONVERSATION = "android.shortcut.conversation";
static { CREATOR = null; }
}
