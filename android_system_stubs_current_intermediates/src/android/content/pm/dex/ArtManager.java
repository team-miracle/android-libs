/**
* Copyright 2017 The Android Open Source Project
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

package android.content.pm.dex;
public class ArtManager
{
public abstract static class SnapshotRuntimeProfileCallback
{
public  SnapshotRuntimeProfileCallback() { throw new RuntimeException("Stub!"); }
public abstract  void onSuccess(android.os.ParcelFileDescriptor profileReadFd);
public abstract  void onError(int errCode);
}
ArtManager() { throw new RuntimeException("Stub!"); }
public  void snapshotRuntimeProfile(int profileType, java.lang.String packageName, java.lang.String codePath, java.util.concurrent.Executor executor, android.content.pm.dex.ArtManager.SnapshotRuntimeProfileCallback callback) { throw new RuntimeException("Stub!"); }
public  boolean isRuntimeProfilingEnabled(int profileType) { throw new RuntimeException("Stub!"); }
public static final int PROFILE_APPS = 0;
public static final int PROFILE_BOOT_IMAGE = 1;
public static final int SNAPSHOT_FAILED_CODE_PATH_NOT_FOUND = 1;
public static final int SNAPSHOT_FAILED_INTERNAL_ERROR = 2;
public static final int SNAPSHOT_FAILED_PACKAGE_NOT_FOUND = 0;
}
