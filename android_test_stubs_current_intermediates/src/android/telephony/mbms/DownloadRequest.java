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

package android.telephony.mbms;
public final class DownloadRequest
  implements android.os.Parcelable
{
public static class Builder
{
public  Builder(android.net.Uri sourceUri, android.net.Uri destinationUri) { throw new RuntimeException("Stub!"); }
public static  android.telephony.mbms.DownloadRequest.Builder fromDownloadRequest(android.telephony.mbms.DownloadRequest other) { throw new RuntimeException("Stub!"); }
public static  android.telephony.mbms.DownloadRequest.Builder fromSerializedRequest(byte[] data) { throw new RuntimeException("Stub!"); }
public  android.telephony.mbms.DownloadRequest.Builder setServiceInfo(android.telephony.mbms.FileServiceInfo serviceInfo) { throw new RuntimeException("Stub!"); }
public  android.telephony.mbms.DownloadRequest.Builder setServiceId(java.lang.String serviceId) { throw new RuntimeException("Stub!"); }
public  android.telephony.mbms.DownloadRequest.Builder setSubscriptionId(int subscriptionId) { throw new RuntimeException("Stub!"); }
public  android.telephony.mbms.DownloadRequest.Builder setAppIntent(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  android.telephony.mbms.DownloadRequest build() { throw new RuntimeException("Stub!"); }
}
DownloadRequest() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String getFileServiceId() { throw new RuntimeException("Stub!"); }
public  android.net.Uri getSourceUri() { throw new RuntimeException("Stub!"); }
public  android.net.Uri getDestinationUri() { throw new RuntimeException("Stub!"); }
public  int getSubscriptionId() { throw new RuntimeException("Stub!"); }
public  byte[] toByteArray() { throw new RuntimeException("Stub!"); }
public static  int getMaxAppIntentSize() { throw new RuntimeException("Stub!"); }
public static  int getMaxDestinationUriSize() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.telephony.mbms.DownloadRequest> CREATOR;
static { CREATOR = null; }
}
