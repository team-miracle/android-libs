/*
* Copyright (C) 2014 The Android Open Source Project
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

package android.telecom;
public final class PhoneAccount
  implements android.os.Parcelable
{
public static class Builder
{
public  Builder(android.telecom.PhoneAccountHandle accountHandle, java.lang.CharSequence label) { throw new RuntimeException("Stub!"); }
public  Builder(android.telecom.PhoneAccount phoneAccount) { throw new RuntimeException("Stub!"); }
public  android.telecom.PhoneAccount.Builder setAddress(android.net.Uri value) { throw new RuntimeException("Stub!"); }
public  android.telecom.PhoneAccount.Builder setSubscriptionAddress(android.net.Uri value) { throw new RuntimeException("Stub!"); }
public  android.telecom.PhoneAccount.Builder setCapabilities(int value) { throw new RuntimeException("Stub!"); }
public  android.telecom.PhoneAccount.Builder setIcon(android.graphics.drawable.Icon icon) { throw new RuntimeException("Stub!"); }
public  android.telecom.PhoneAccount.Builder setHighlightColor(int value) { throw new RuntimeException("Stub!"); }
public  android.telecom.PhoneAccount.Builder setShortDescription(java.lang.CharSequence value) { throw new RuntimeException("Stub!"); }
public  android.telecom.PhoneAccount.Builder addSupportedUriScheme(java.lang.String uriScheme) { throw new RuntimeException("Stub!"); }
public  android.telecom.PhoneAccount.Builder setSupportedUriSchemes(java.util.List<java.lang.String> uriSchemes) { throw new RuntimeException("Stub!"); }
public  android.telecom.PhoneAccount.Builder setExtras(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  android.telecom.PhoneAccount build() { throw new RuntimeException("Stub!"); }
}
PhoneAccount() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public static  android.telecom.PhoneAccount.Builder builder(android.telecom.PhoneAccountHandle accountHandle, java.lang.CharSequence label) { throw new RuntimeException("Stub!"); }
public  android.telecom.PhoneAccount.Builder toBuilder() { throw new RuntimeException("Stub!"); }
public  android.telecom.PhoneAccountHandle getAccountHandle() { throw new RuntimeException("Stub!"); }
public  android.net.Uri getAddress() { throw new RuntimeException("Stub!"); }
public  android.net.Uri getSubscriptionAddress() { throw new RuntimeException("Stub!"); }
public  int getCapabilities() { throw new RuntimeException("Stub!"); }
public  boolean hasCapabilities(int capability) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getLabel() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getShortDescription() { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getSupportedUriSchemes() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Icon getIcon() { throw new RuntimeException("Stub!"); }
public  boolean isEnabled() { throw new RuntimeException("Stub!"); }
public  boolean supportsUriScheme(java.lang.String uriScheme) { throw new RuntimeException("Stub!"); }
public  int getHighlightColor() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final int CAPABILITY_CALL_PROVIDER = 2;
public static final int CAPABILITY_CALL_SUBJECT = 64;
public static final int CAPABILITY_CONNECTION_MANAGER = 1;
public static final int CAPABILITY_PLACE_EMERGENCY_CALLS = 16;
public static final int CAPABILITY_RTT = 4096;
public static final int CAPABILITY_SELF_MANAGED = 2048;
public static final int CAPABILITY_SIM_SUBSCRIPTION = 4;
public static final int CAPABILITY_SUPPORTS_VIDEO_CALLING = 1024;
public static final int CAPABILITY_VIDEO_CALLING = 8;
public static final int CAPABILITY_VIDEO_CALLING_RELIES_ON_PRESENCE = 256;
public static final android.os.Parcelable.Creator<android.telecom.PhoneAccount> CREATOR;
public static final java.lang.String EXTRA_CALL_SUBJECT_CHARACTER_ENCODING = "android.telecom.extra.CALL_SUBJECT_CHARACTER_ENCODING";
public static final java.lang.String EXTRA_CALL_SUBJECT_MAX_LENGTH = "android.telecom.extra.CALL_SUBJECT_MAX_LENGTH";
public static final java.lang.String EXTRA_LOG_SELF_MANAGED_CALLS = "android.telecom.extra.LOG_SELF_MANAGED_CALLS";
public static final java.lang.String EXTRA_SUPPORTS_HANDOVER_FROM = "android.telecom.extra.SUPPORTS_HANDOVER_FROM";
public static final java.lang.String EXTRA_SUPPORTS_HANDOVER_TO = "android.telecom.extra.SUPPORTS_HANDOVER_TO";
public static final int NO_HIGHLIGHT_COLOR = 0;
public static final int NO_RESOURCE_ID = -1;
public static final java.lang.String SCHEME_SIP = "sip";
public static final java.lang.String SCHEME_TEL = "tel";
public static final java.lang.String SCHEME_VOICEMAIL = "voicemail";
static { CREATOR = null; }
}
