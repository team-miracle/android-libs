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
* limitations under the License.
*/

package android.os;
public class UpdateEngine
{
public static final class ErrorCodeConstants
{
public  ErrorCodeConstants() { throw new RuntimeException("Stub!"); }
public static final int DOWNLOAD_PAYLOAD_VERIFICATION_ERROR = 12;
public static final int DOWNLOAD_TRANSFER_ERROR = 9;
public static final int ERROR = 1;
public static final int FILESYSTEM_COPIER_ERROR = 4;
public static final int INSTALL_DEVICE_OPEN_ERROR = 7;
public static final int KERNEL_DEVICE_OPEN_ERROR = 8;
public static final int PAYLOAD_HASH_MISMATCH_ERROR = 10;
public static final int PAYLOAD_MISMATCHED_TYPE_ERROR = 6;
public static final int PAYLOAD_SIZE_MISMATCH_ERROR = 11;
public static final int POST_INSTALL_RUNNER_ERROR = 5;
public static final int SUCCESS = 0;
public static final int UPDATED_BUT_NOT_ACTIVE = 52;
}
public static final class UpdateStatusConstants
{
public  UpdateStatusConstants() { throw new RuntimeException("Stub!"); }
public static final int ATTEMPTING_ROLLBACK = 8;
public static final int CHECKING_FOR_UPDATE = 1;
public static final int DISABLED = 9;
public static final int DOWNLOADING = 3;
public static final int FINALIZING = 5;
public static final int IDLE = 0;
public static final int REPORTING_ERROR_EVENT = 7;
public static final int UPDATED_NEED_REBOOT = 6;
public static final int UPDATE_AVAILABLE = 2;
public static final int VERIFYING = 4;
}
public  UpdateEngine() { throw new RuntimeException("Stub!"); }
public  boolean bind(android.os.UpdateEngineCallback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  boolean bind(android.os.UpdateEngineCallback callback) { throw new RuntimeException("Stub!"); }
public  void applyPayload(java.lang.String url, long offset, long size, java.lang.String[] headerKeyValuePairs) { throw new RuntimeException("Stub!"); }
public  void cancel() { throw new RuntimeException("Stub!"); }
public  void suspend() { throw new RuntimeException("Stub!"); }
public  void resume() { throw new RuntimeException("Stub!"); }
public  void resetStatus() { throw new RuntimeException("Stub!"); }
public  boolean unbind() { throw new RuntimeException("Stub!"); }
public  boolean verifyPayloadMetadata(java.lang.String payloadMetadataFilename) { throw new RuntimeException("Stub!"); }
}
