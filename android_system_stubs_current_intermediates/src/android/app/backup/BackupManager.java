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

package android.app.backup;
public class BackupManager
{
public  BackupManager(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  void dataChanged() { throw new RuntimeException("Stub!"); }
public static  void dataChanged(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int requestRestore(android.app.backup.RestoreObserver observer) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int requestRestore(android.app.backup.RestoreObserver observer, android.app.backup.BackupManagerMonitor monitor) { throw new RuntimeException("Stub!"); }
public  android.app.backup.RestoreSession beginRestoreSession() { throw new RuntimeException("Stub!"); }
public  void setBackupEnabled(boolean isEnabled) { throw new RuntimeException("Stub!"); }
public  boolean isBackupEnabled() { throw new RuntimeException("Stub!"); }
public  boolean isBackupServiceActive(android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  void setAutoRestore(boolean isEnabled) { throw new RuntimeException("Stub!"); }
public  java.lang.String getCurrentTransport() { throw new RuntimeException("Stub!"); }
public  java.lang.String[] listAllTransports() { throw new RuntimeException("Stub!"); }
public  void updateTransportAttributes(android.content.ComponentName transportComponent, java.lang.String name, android.content.Intent configurationIntent, java.lang.String currentDestinationString, android.content.Intent dataManagementIntent, java.lang.String dataManagementLabel) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.lang.String selectBackupTransport(java.lang.String transport) { throw new RuntimeException("Stub!"); }
public  void selectBackupTransport(android.content.ComponentName transport, android.app.backup.SelectBackupTransportCallback listener) { throw new RuntimeException("Stub!"); }
public  void backupNow() { throw new RuntimeException("Stub!"); }
public  long getAvailableRestoreToken(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  boolean isAppEligibleForBackup(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  int requestBackup(java.lang.String[] packages, android.app.backup.BackupObserver observer) { throw new RuntimeException("Stub!"); }
public  int requestBackup(java.lang.String[] packages, android.app.backup.BackupObserver observer, android.app.backup.BackupManagerMonitor monitor, int flags) { throw new RuntimeException("Stub!"); }
public  void cancelBackups() { throw new RuntimeException("Stub!"); }
public  android.content.Intent getConfigurationIntent(java.lang.String transportName) { throw new RuntimeException("Stub!"); }
public  java.lang.String getDestinationString(java.lang.String transportName) { throw new RuntimeException("Stub!"); }
public  android.content.Intent getDataManagementIntent(java.lang.String transportName) { throw new RuntimeException("Stub!"); }
public  java.lang.String getDataManagementLabel(java.lang.String transportName) { throw new RuntimeException("Stub!"); }
public static final int ERROR_AGENT_FAILURE = -1003;
public static final int ERROR_BACKUP_CANCELLED = -2003;
public static final int ERROR_BACKUP_NOT_ALLOWED = -2001;
public static final int ERROR_PACKAGE_NOT_FOUND = -2002;
public static final int ERROR_TRANSPORT_ABORTED = -1000;
public static final int ERROR_TRANSPORT_INVALID = -2;
public static final int ERROR_TRANSPORT_PACKAGE_REJECTED = -1002;
public static final int ERROR_TRANSPORT_QUOTA_EXCEEDED = -1005;
public static final int ERROR_TRANSPORT_UNAVAILABLE = -1;
public static final int FLAG_NON_INCREMENTAL_BACKUP = 1;
public static final java.lang.String PACKAGE_MANAGER_SENTINEL = "@pm@";
public static final int SUCCESS = 0;
}
