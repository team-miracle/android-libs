/*
* Copyright (C) 2017 The Android Open Source Project
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

package android.app.usage;
public class StorageStatsManager
{
StorageStatsManager() { throw new RuntimeException("Stub!"); }
public  long getTotalBytes(java.util.UUID storageUuid) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  long getFreeBytes(java.util.UUID storageUuid) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.app.usage.StorageStats queryStatsForPackage(java.util.UUID storageUuid, java.lang.String packageName, android.os.UserHandle user) throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.app.usage.StorageStats queryStatsForUid(java.util.UUID storageUuid, int uid) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.app.usage.StorageStats queryStatsForUser(java.util.UUID storageUuid, android.os.UserHandle user) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.app.usage.ExternalStorageStats queryExternalStatsForUser(java.util.UUID storageUuid, android.os.UserHandle user) throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
