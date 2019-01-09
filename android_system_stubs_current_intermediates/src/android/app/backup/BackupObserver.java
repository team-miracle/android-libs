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
* limitations under the License
*/

package android.app.backup;
public abstract class BackupObserver
{
public  BackupObserver() { throw new RuntimeException("Stub!"); }
public  void onUpdate(java.lang.String currentBackupPackage, android.app.backup.BackupProgress backupProgress) { throw new RuntimeException("Stub!"); }
public  void onResult(java.lang.String currentBackupPackage, int status) { throw new RuntimeException("Stub!"); }
public  void backupFinished(int status) { throw new RuntimeException("Stub!"); }
}
