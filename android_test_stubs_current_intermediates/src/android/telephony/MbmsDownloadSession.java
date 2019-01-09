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

package android.telephony;
public class MbmsDownloadSession
  implements java.lang.AutoCloseable
{
MbmsDownloadSession() { throw new RuntimeException("Stub!"); }
public static  android.telephony.MbmsDownloadSession create(android.content.Context context, java.util.concurrent.Executor executor, android.telephony.mbms.MbmsDownloadSessionCallback callback) { throw new RuntimeException("Stub!"); }
public static  android.telephony.MbmsDownloadSession create(android.content.Context context, java.util.concurrent.Executor executor, int subscriptionId, android.telephony.mbms.MbmsDownloadSessionCallback callback) { throw new RuntimeException("Stub!"); }
public  void requestUpdateFileServices(java.util.List<java.lang.String> classList) { throw new RuntimeException("Stub!"); }
public  void setTempFileRootDirectory(java.io.File tempFileRootDirectory) { throw new RuntimeException("Stub!"); }
public  java.io.File getTempFileRootDirectory() { throw new RuntimeException("Stub!"); }
public  void download(android.telephony.mbms.DownloadRequest request) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.telephony.mbms.DownloadRequest> listPendingDownloads() { throw new RuntimeException("Stub!"); }
public  void addStatusListener(android.telephony.mbms.DownloadRequest request, java.util.concurrent.Executor executor, android.telephony.mbms.DownloadStatusListener listener) { throw new RuntimeException("Stub!"); }
public  void removeStatusListener(android.telephony.mbms.DownloadRequest request, android.telephony.mbms.DownloadStatusListener listener) { throw new RuntimeException("Stub!"); }
public  void addProgressListener(android.telephony.mbms.DownloadRequest request, java.util.concurrent.Executor executor, android.telephony.mbms.DownloadProgressListener listener) { throw new RuntimeException("Stub!"); }
public  void removeProgressListener(android.telephony.mbms.DownloadRequest request, android.telephony.mbms.DownloadProgressListener listener) { throw new RuntimeException("Stub!"); }
public  void cancelDownload(android.telephony.mbms.DownloadRequest downloadRequest) { throw new RuntimeException("Stub!"); }
public  void requestDownloadState(android.telephony.mbms.DownloadRequest downloadRequest, android.telephony.mbms.FileInfo fileInfo) { throw new RuntimeException("Stub!"); }
public  void resetDownloadKnowledge(android.telephony.mbms.DownloadRequest downloadRequest) { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public static final java.lang.String DEFAULT_TOP_LEVEL_TEMP_DIRECTORY = "androidMbmsTempFileRoot";
public static final java.lang.String EXTRA_MBMS_COMPLETED_FILE_URI = "android.telephony.extra.MBMS_COMPLETED_FILE_URI";
public static final java.lang.String EXTRA_MBMS_DOWNLOAD_REQUEST = "android.telephony.extra.MBMS_DOWNLOAD_REQUEST";
public static final java.lang.String EXTRA_MBMS_DOWNLOAD_RESULT = "android.telephony.extra.MBMS_DOWNLOAD_RESULT";
public static final java.lang.String EXTRA_MBMS_FILE_INFO = "android.telephony.extra.MBMS_FILE_INFO";
public static final java.lang.String MBMS_DOWNLOAD_SERVICE_OVERRIDE_METADATA = "mbms-download-service-override";
public static final int RESULT_CANCELLED = 2;
public static final int RESULT_DOWNLOAD_FAILURE = 6;
public static final int RESULT_EXPIRED = 3;
public static final int RESULT_FILE_ROOT_UNREACHABLE = 8;
public static final int RESULT_IO_ERROR = 4;
public static final int RESULT_OUT_OF_STORAGE = 7;
public static final int RESULT_SERVICE_ID_NOT_DEFINED = 5;
public static final int RESULT_SUCCESSFUL = 1;
public static final int STATUS_ACTIVELY_DOWNLOADING = 1;
public static final int STATUS_PENDING_DOWNLOAD = 2;
public static final int STATUS_PENDING_DOWNLOAD_WINDOW = 4;
public static final int STATUS_PENDING_REPAIR = 3;
public static final int STATUS_UNKNOWN = 0;
}
