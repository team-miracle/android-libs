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

package android.app.backup;
public class BackupTransport
{
public  BackupTransport() { throw new RuntimeException("Stub!"); }
public  android.os.IBinder getBinder() { throw new RuntimeException("Stub!"); }
public  java.lang.String name() { throw new RuntimeException("Stub!"); }
public  android.content.Intent configurationIntent() { throw new RuntimeException("Stub!"); }
public  java.lang.String currentDestinationString() { throw new RuntimeException("Stub!"); }
public  android.content.Intent dataManagementIntent() { throw new RuntimeException("Stub!"); }
public  java.lang.String dataManagementLabel() { throw new RuntimeException("Stub!"); }
public  java.lang.String transportDirName() { throw new RuntimeException("Stub!"); }
public  int initializeDevice() { throw new RuntimeException("Stub!"); }
public  int clearBackupData(android.content.pm.PackageInfo packageInfo) { throw new RuntimeException("Stub!"); }
public  int finishBackup() { throw new RuntimeException("Stub!"); }
public  long requestBackupTime() { throw new RuntimeException("Stub!"); }
public  int performBackup(android.content.pm.PackageInfo packageInfo, android.os.ParcelFileDescriptor inFd, int flags) { throw new RuntimeException("Stub!"); }
public  int performBackup(android.content.pm.PackageInfo packageInfo, android.os.ParcelFileDescriptor inFd) { throw new RuntimeException("Stub!"); }
public  android.app.backup.RestoreSet[] getAvailableRestoreSets() { throw new RuntimeException("Stub!"); }
public  long getCurrentRestoreSet() { throw new RuntimeException("Stub!"); }
public  int startRestore(long token, android.content.pm.PackageInfo[] packages) { throw new RuntimeException("Stub!"); }
public  android.app.backup.RestoreDescription nextRestorePackage() { throw new RuntimeException("Stub!"); }
public  int getRestoreData(android.os.ParcelFileDescriptor outFd) { throw new RuntimeException("Stub!"); }
public  void finishRestore() { throw new RuntimeException("Stub!"); }
public  long requestFullBackupTime() { throw new RuntimeException("Stub!"); }
public  int performFullBackup(android.content.pm.PackageInfo targetPackage, android.os.ParcelFileDescriptor socket, int flags) { throw new RuntimeException("Stub!"); }
public  int performFullBackup(android.content.pm.PackageInfo targetPackage, android.os.ParcelFileDescriptor socket) { throw new RuntimeException("Stub!"); }
public  int checkFullBackupSize(long size) { throw new RuntimeException("Stub!"); }
public  int sendBackupData(int numBytes) { throw new RuntimeException("Stub!"); }
public  void cancelFullBackup() { throw new RuntimeException("Stub!"); }
public  boolean isAppEligibleForBackup(android.content.pm.PackageInfo targetPackage, boolean isFullBackup) { throw new RuntimeException("Stub!"); }
public  long getBackupQuota(java.lang.String packageName, boolean isFullBackup) { throw new RuntimeException("Stub!"); }
public  int getNextFullRestoreDataChunk(android.os.ParcelFileDescriptor socket) { throw new RuntimeException("Stub!"); }
public  int abortFullRestore() { throw new RuntimeException("Stub!"); }
public  int getTransportFlags() { throw new RuntimeException("Stub!"); }
public static final int AGENT_ERROR = -1003;
public static final int AGENT_UNKNOWN = -1004;
public static final java.lang.String EXTRA_TRANSPORT_REGISTRATION = "android.app.backup.extra.TRANSPORT_REGISTRATION";
public static final int FLAG_INCREMENTAL = 2;
public static final int FLAG_NON_INCREMENTAL = 4;
public static final int FLAG_USER_INITIATED = 1;
public static final int NO_MORE_DATA = -1;
public static final int TRANSPORT_ERROR = -1000;
public static final int TRANSPORT_NON_INCREMENTAL_BACKUP_REQUIRED = -1006;
public static final int TRANSPORT_NOT_INITIALIZED = -1001;
public static final int TRANSPORT_OK = 0;
public static final int TRANSPORT_PACKAGE_REJECTED = -1002;
public static final int TRANSPORT_QUOTA_EXCEEDED = -1005;
}
