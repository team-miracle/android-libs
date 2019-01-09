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
package android.telephony.data;
public class ApnSetting
  implements android.os.Parcelable
{
public static class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  android.telephony.data.ApnSetting.Builder setEntryName(java.lang.String entryName) { throw new RuntimeException("Stub!"); }
public  android.telephony.data.ApnSetting.Builder setApnName(java.lang.String apnName) { throw new RuntimeException("Stub!"); }
public  android.telephony.data.ApnSetting.Builder setProxyAddress(java.net.InetAddress proxy) { throw new RuntimeException("Stub!"); }
public  android.telephony.data.ApnSetting.Builder setProxyPort(int port) { throw new RuntimeException("Stub!"); }
public  android.telephony.data.ApnSetting.Builder setMmsc(android.net.Uri mmsc) { throw new RuntimeException("Stub!"); }
public  android.telephony.data.ApnSetting.Builder setMmsProxyAddress(java.net.InetAddress mmsProxy) { throw new RuntimeException("Stub!"); }
public  android.telephony.data.ApnSetting.Builder setMmsProxyPort(int mmsPort) { throw new RuntimeException("Stub!"); }
public  android.telephony.data.ApnSetting.Builder setUser(java.lang.String user) { throw new RuntimeException("Stub!"); }
public  android.telephony.data.ApnSetting.Builder setPassword(java.lang.String password) { throw new RuntimeException("Stub!"); }
public  android.telephony.data.ApnSetting.Builder setAuthType(int authType) { throw new RuntimeException("Stub!"); }
public  android.telephony.data.ApnSetting.Builder setApnTypeBitmask(int apnTypeBitmask) { throw new RuntimeException("Stub!"); }
public  android.telephony.data.ApnSetting.Builder setOperatorNumeric(java.lang.String operatorNumeric) { throw new RuntimeException("Stub!"); }
public  android.telephony.data.ApnSetting.Builder setProtocol(int protocol) { throw new RuntimeException("Stub!"); }
public  android.telephony.data.ApnSetting.Builder setRoamingProtocol(int roamingProtocol) { throw new RuntimeException("Stub!"); }
public  android.telephony.data.ApnSetting.Builder setCarrierEnabled(boolean carrierEnabled) { throw new RuntimeException("Stub!"); }
public  android.telephony.data.ApnSetting.Builder setNetworkTypeBitmask(int networkTypeBitmask) { throw new RuntimeException("Stub!"); }
public  android.telephony.data.ApnSetting.Builder setMvnoType(int mvnoType) { throw new RuntimeException("Stub!"); }
public  android.telephony.data.ApnSetting build() { throw new RuntimeException("Stub!"); }
}
ApnSetting() { throw new RuntimeException("Stub!"); }
public  java.lang.String getEntryName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getApnName() { throw new RuntimeException("Stub!"); }
public  java.net.InetAddress getProxyAddress() { throw new RuntimeException("Stub!"); }
public  int getProxyPort() { throw new RuntimeException("Stub!"); }
public  android.net.Uri getMmsc() { throw new RuntimeException("Stub!"); }
public  java.net.InetAddress getMmsProxyAddress() { throw new RuntimeException("Stub!"); }
public  int getMmsProxyPort() { throw new RuntimeException("Stub!"); }
public  java.lang.String getUser() { throw new RuntimeException("Stub!"); }
public  java.lang.String getPassword() { throw new RuntimeException("Stub!"); }
public  int getAuthType() { throw new RuntimeException("Stub!"); }
public  int getApnTypeBitmask() { throw new RuntimeException("Stub!"); }
public  int getId() { throw new RuntimeException("Stub!"); }
public  java.lang.String getOperatorNumeric() { throw new RuntimeException("Stub!"); }
public  int getProtocol() { throw new RuntimeException("Stub!"); }
public  int getRoamingProtocol() { throw new RuntimeException("Stub!"); }
public  boolean isEnabled() { throw new RuntimeException("Stub!"); }
public  int getNetworkTypeBitmask() { throw new RuntimeException("Stub!"); }
public  int getMvnoType() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final int AUTH_TYPE_CHAP = 2;
public static final int AUTH_TYPE_NONE = 0;
public static final int AUTH_TYPE_PAP = 1;
public static final int AUTH_TYPE_PAP_OR_CHAP = 3;
public static final android.os.Parcelable.Creator<android.telephony.data.ApnSetting> CREATOR;
public static final int MVNO_TYPE_GID = 2;
public static final int MVNO_TYPE_ICCID = 3;
public static final int MVNO_TYPE_IMSI = 1;
public static final int MVNO_TYPE_SPN = 0;
public static final int PROTOCOL_IP = 0;
public static final int PROTOCOL_IPV4V6 = 2;
public static final int PROTOCOL_IPV6 = 1;
public static final int PROTOCOL_PPP = 3;
public static final int TYPE_CBS = 128;
public static final int TYPE_DEFAULT = 17;
public static final int TYPE_DUN = 8;
public static final int TYPE_EMERGENCY = 512;
public static final int TYPE_FOTA = 32;
public static final int TYPE_HIPRI = 16;
public static final int TYPE_IA = 256;
public static final int TYPE_IMS = 64;
public static final int TYPE_MMS = 2;
public static final int TYPE_SUPL = 4;
static { CREATOR = null; }
}
