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
public class PackageInstaller
{
public abstract static class SessionCallback
{
public  SessionCallback() { throw new RuntimeException("Stub!"); }
public abstract  void onCreated(int sessionId);
public abstract  void onBadgingChanged(int sessionId);
public abstract  void onActiveChanged(int sessionId, boolean active);
public abstract  void onProgressChanged(int sessionId, float progress);
public abstract  void onFinished(int sessionId, boolean success);
}
public static class Session
  implements java.io.Closeable
{
Session() { throw new RuntimeException("Stub!"); }
public  void setStagingProgress(float progress) { throw new RuntimeException("Stub!"); }
public  java.io.OutputStream openWrite(java.lang.String name, long offsetBytes, long lengthBytes) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void fsync(java.io.OutputStream out) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getNames() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.io.InputStream openRead(java.lang.String name) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void removeSplit(java.lang.String splitName) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void commit(android.content.IntentSender statusReceiver) { throw new RuntimeException("Stub!"); }
public  void transfer(java.lang.String packageName) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  void abandon() { throw new RuntimeException("Stub!"); }
}
public static class SessionParams
  implements android.os.Parcelable
{
public  SessionParams(int mode) { throw new RuntimeException("Stub!"); }
public  void setInstallLocation(int installLocation) { throw new RuntimeException("Stub!"); }
public  void setSize(long sizeBytes) { throw new RuntimeException("Stub!"); }
public  void setAppPackageName(java.lang.String appPackageName) { throw new RuntimeException("Stub!"); }
public  void setAppIcon(android.graphics.Bitmap appIcon) { throw new RuntimeException("Stub!"); }
public  void setAppLabel(java.lang.CharSequence appLabel) { throw new RuntimeException("Stub!"); }
public  void setOriginatingUri(android.net.Uri originatingUri) { throw new RuntimeException("Stub!"); }
public  void setOriginatingUid(int originatingUid) { throw new RuntimeException("Stub!"); }
public  void setReferrerUri(android.net.Uri referrerUri) { throw new RuntimeException("Stub!"); }
public  void setInstallReason(int installReason) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.content.pm.PackageInstaller.SessionParams> CREATOR;
public static final int MODE_FULL_INSTALL = 1;
public static final int MODE_INHERIT_EXISTING = 2;
static { CREATOR = null; }
}
public static class SessionInfo
  implements android.os.Parcelable
{
SessionInfo() { throw new RuntimeException("Stub!"); }
public  int getSessionId() { throw new RuntimeException("Stub!"); }
public  java.lang.String getInstallerPackageName() { throw new RuntimeException("Stub!"); }
public  float getProgress() { throw new RuntimeException("Stub!"); }
public  boolean isActive() { throw new RuntimeException("Stub!"); }
public  boolean isSealed() { throw new RuntimeException("Stub!"); }
public  int getInstallReason() { throw new RuntimeException("Stub!"); }
public  java.lang.String getAppPackageName() { throw new RuntimeException("Stub!"); }
public  android.graphics.Bitmap getAppIcon() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getAppLabel() { throw new RuntimeException("Stub!"); }
public  android.content.Intent createDetailsIntent() { throw new RuntimeException("Stub!"); }
public  int getMode() { throw new RuntimeException("Stub!"); }
public  int getInstallLocation() { throw new RuntimeException("Stub!"); }
public  long getSize() { throw new RuntimeException("Stub!"); }
public  android.net.Uri getOriginatingUri() { throw new RuntimeException("Stub!"); }
public  int getOriginatingUid() { throw new RuntimeException("Stub!"); }
public  android.net.Uri getReferrerUri() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.content.pm.PackageInstaller.SessionInfo> CREATOR;
static { CREATOR = null; }
}
PackageInstaller() { throw new RuntimeException("Stub!"); }
public  int createSession(android.content.pm.PackageInstaller.SessionParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.content.pm.PackageInstaller.Session openSession(int sessionId) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void updateSessionAppIcon(int sessionId, android.graphics.Bitmap appIcon) { throw new RuntimeException("Stub!"); }
public  void updateSessionAppLabel(int sessionId, java.lang.CharSequence appLabel) { throw new RuntimeException("Stub!"); }
public  void abandonSession(int sessionId) { throw new RuntimeException("Stub!"); }
public  android.content.pm.PackageInstaller.SessionInfo getSessionInfo(int sessionId) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.PackageInstaller.SessionInfo> getAllSessions() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.PackageInstaller.SessionInfo> getMySessions() { throw new RuntimeException("Stub!"); }
public  void uninstall(java.lang.String packageName, android.content.IntentSender statusReceiver) { throw new RuntimeException("Stub!"); }
public  void uninstall(android.content.pm.VersionedPackage versionedPackage, android.content.IntentSender statusReceiver) { throw new RuntimeException("Stub!"); }
public  void registerSessionCallback(android.content.pm.PackageInstaller.SessionCallback callback) { throw new RuntimeException("Stub!"); }
public  void registerSessionCallback(android.content.pm.PackageInstaller.SessionCallback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void unregisterSessionCallback(android.content.pm.PackageInstaller.SessionCallback callback) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_SESSION_COMMITTED = "android.content.pm.action.SESSION_COMMITTED";
public static final java.lang.String ACTION_SESSION_DETAILS = "android.content.pm.action.SESSION_DETAILS";
public static final java.lang.String EXTRA_OTHER_PACKAGE_NAME = "android.content.pm.extra.OTHER_PACKAGE_NAME";
public static final java.lang.String EXTRA_PACKAGE_NAME = "android.content.pm.extra.PACKAGE_NAME";
public static final java.lang.String EXTRA_SESSION = "android.content.pm.extra.SESSION";
public static final java.lang.String EXTRA_SESSION_ID = "android.content.pm.extra.SESSION_ID";
public static final java.lang.String EXTRA_STATUS = "android.content.pm.extra.STATUS";
public static final java.lang.String EXTRA_STATUS_MESSAGE = "android.content.pm.extra.STATUS_MESSAGE";
public static final java.lang.String EXTRA_STORAGE_PATH = "android.content.pm.extra.STORAGE_PATH";
public static final int STATUS_FAILURE = 1;
public static final int STATUS_FAILURE_ABORTED = 3;
public static final int STATUS_FAILURE_BLOCKED = 2;
public static final int STATUS_FAILURE_CONFLICT = 5;
public static final int STATUS_FAILURE_INCOMPATIBLE = 7;
public static final int STATUS_FAILURE_INVALID = 4;
public static final int STATUS_FAILURE_STORAGE = 6;
public static final int STATUS_PENDING_USER_ACTION = -1;
public static final int STATUS_SUCCESS = 0;
}
