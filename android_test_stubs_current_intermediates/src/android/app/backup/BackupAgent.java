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
public abstract class BackupAgent
  extends android.content.ContextWrapper
{
public  BackupAgent() { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public  void onCreate() { throw new RuntimeException("Stub!"); }
public  void onDestroy() { throw new RuntimeException("Stub!"); }
public abstract  void onBackup(android.os.ParcelFileDescriptor oldState, android.app.backup.BackupDataOutput data, android.os.ParcelFileDescriptor newState) throws java.io.IOException;
public abstract  void onRestore(android.app.backup.BackupDataInput data, int appVersionCode, android.os.ParcelFileDescriptor newState) throws java.io.IOException;
public  void onRestore(android.app.backup.BackupDataInput data, long appVersionCode, android.os.ParcelFileDescriptor newState) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void onFullBackup(android.app.backup.FullBackupDataOutput data) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void onQuotaExceeded(long backupDataBytes, long quotaBytes) { throw new RuntimeException("Stub!"); }
public final  void fullBackupFile(java.io.File file, android.app.backup.FullBackupDataOutput output) { throw new RuntimeException("Stub!"); }
public  void onRestoreFile(android.os.ParcelFileDescriptor data, long size, java.io.File destination, int type, long mode, long mtime) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void onRestoreFinished() { throw new RuntimeException("Stub!"); }
public static final int FLAG_CLIENT_SIDE_ENCRYPTION_ENABLED = 1;
public static final int FLAG_DEVICE_TO_DEVICE_TRANSFER = 2;
public static final int TYPE_DIRECTORY = 2;
public static final int TYPE_FILE = 1;
}
