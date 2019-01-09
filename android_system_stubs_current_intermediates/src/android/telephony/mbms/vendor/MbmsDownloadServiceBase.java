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
* limitations under the License
*/

package android.telephony.mbms.vendor;
public class MbmsDownloadServiceBase
  extends android.os.Binder
{
public  MbmsDownloadServiceBase() { throw new RuntimeException("Stub!"); }
public  int initialize(int subscriptionId, android.telephony.mbms.MbmsDownloadSessionCallback callback) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  int requestUpdateFileServices(int subscriptionId, java.util.List<java.lang.String> serviceClasses) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  int setTempFileRootDirectory(int subscriptionId, java.lang.String rootDirectoryPath) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  int download(android.telephony.mbms.DownloadRequest downloadRequest) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  int addStatusListener(android.telephony.mbms.DownloadRequest downloadRequest, android.telephony.mbms.DownloadStatusListener listener) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  int removeStatusListener(android.telephony.mbms.DownloadRequest downloadRequest, android.telephony.mbms.DownloadStatusListener listener) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  int addProgressListener(android.telephony.mbms.DownloadRequest downloadRequest, android.telephony.mbms.DownloadProgressListener listener) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  int removeProgressListener(android.telephony.mbms.DownloadRequest downloadRequest, android.telephony.mbms.DownloadProgressListener listener) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  java.util.List<android.telephony.mbms.DownloadRequest> listPendingDownloads(int subscriptionId) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  int cancelDownload(android.telephony.mbms.DownloadRequest downloadRequest) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  int requestDownloadState(android.telephony.mbms.DownloadRequest downloadRequest, android.telephony.mbms.FileInfo fileInfo) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  int resetDownloadKnowledge(android.telephony.mbms.DownloadRequest downloadRequest) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  void dispose(int subscriptionId) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  void onAppCallbackDied(int uid, int subscriptionId) { throw new RuntimeException("Stub!"); }
}
