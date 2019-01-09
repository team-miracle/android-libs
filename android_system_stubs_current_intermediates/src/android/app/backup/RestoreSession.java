/*
* Copyright (C) 2010 The Android Open Source Project
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
public class RestoreSession
{
RestoreSession() { throw new RuntimeException("Stub!"); }
public  int getAvailableRestoreSets(android.app.backup.RestoreObserver observer, android.app.backup.BackupManagerMonitor monitor) { throw new RuntimeException("Stub!"); }
public  int getAvailableRestoreSets(android.app.backup.RestoreObserver observer) { throw new RuntimeException("Stub!"); }
public  int restoreAll(long token, android.app.backup.RestoreObserver observer, android.app.backup.BackupManagerMonitor monitor) { throw new RuntimeException("Stub!"); }
public  int restoreAll(long token, android.app.backup.RestoreObserver observer) { throw new RuntimeException("Stub!"); }
public  int restorePackage(java.lang.String packageName, android.app.backup.RestoreObserver observer, android.app.backup.BackupManagerMonitor monitor) { throw new RuntimeException("Stub!"); }
public  int restorePackage(java.lang.String packageName, android.app.backup.RestoreObserver observer) { throw new RuntimeException("Stub!"); }
public  void endRestoreSession() { throw new RuntimeException("Stub!"); }
}
