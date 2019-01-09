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
public class BackupAgentHelper
  extends android.app.backup.BackupAgent
{
public  BackupAgentHelper() { throw new RuntimeException("Stub!"); }
public  void onBackup(android.os.ParcelFileDescriptor oldState, android.app.backup.BackupDataOutput data, android.os.ParcelFileDescriptor newState) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void onRestore(android.app.backup.BackupDataInput data, int appVersionCode, android.os.ParcelFileDescriptor newState) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void addHelper(java.lang.String keyPrefix, android.app.backup.BackupHelper helper) { throw new RuntimeException("Stub!"); }
}
