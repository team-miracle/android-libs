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
public class SharedPreferencesBackupHelper
  extends android.app.backup.FileBackupHelperBase
  implements android.app.backup.BackupHelper
{
public  SharedPreferencesBackupHelper(android.content.Context context, java.lang.String... prefGroups) { throw new RuntimeException("Stub!"); }
public  void performBackup(android.os.ParcelFileDescriptor oldState, android.app.backup.BackupDataOutput data, android.os.ParcelFileDescriptor newState) { throw new RuntimeException("Stub!"); }
public  void restoreEntity(android.app.backup.BackupDataInputStream data) { throw new RuntimeException("Stub!"); }
}
