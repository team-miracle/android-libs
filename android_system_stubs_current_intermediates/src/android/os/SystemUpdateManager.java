/*
* Copyright (C) 2018 The Android Open Source Project
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

package android.os;
public class SystemUpdateManager
{
SystemUpdateManager() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle retrieveSystemUpdateInfo() { throw new RuntimeException("Stub!"); }
public  void updateSystemUpdateInfo(android.os.PersistableBundle infoBundle) { throw new RuntimeException("Stub!"); }
public static final java.lang.String KEY_IS_SECURITY_UPDATE = "is_security_update";
public static final java.lang.String KEY_STATUS = "status";
public static final java.lang.String KEY_TARGET_BUILD_FINGERPRINT = "target_build_fingerprint";
public static final java.lang.String KEY_TARGET_SECURITY_PATCH_LEVEL = "target_security_patch_level";
public static final java.lang.String KEY_TITLE = "title";
public static final int STATUS_IDLE = 1;
public static final int STATUS_IN_PROGRESS = 3;
public static final int STATUS_UNKNOWN = 0;
public static final int STATUS_WAITING_DOWNLOAD = 2;
public static final int STATUS_WAITING_INSTALL = 4;
public static final int STATUS_WAITING_REBOOT = 5;
}
