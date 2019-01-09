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
package android.service.euicc;
public final class EuiccProfileInfo
  implements android.os.Parcelable
{
@java.lang.annotation.Retention(value=java.lang.annotation.RetentionPolicy.SOURCE)
public static @interface PolicyRule
{
}
@java.lang.annotation.Retention(value=java.lang.annotation.RetentionPolicy.SOURCE)
public static @interface ProfileClass
{
}
@java.lang.annotation.Retention(value=java.lang.annotation.RetentionPolicy.SOURCE)
public static @interface ProfileState
{
}
public static final class Builder
{
public  Builder(java.lang.String value) { throw new RuntimeException("Stub!"); }
public  Builder(android.service.euicc.EuiccProfileInfo baseProfile) { throw new RuntimeException("Stub!"); }
public  android.service.euicc.EuiccProfileInfo build() { throw new RuntimeException("Stub!"); }
public  android.service.euicc.EuiccProfileInfo.Builder setIccid(java.lang.String value) { throw new RuntimeException("Stub!"); }
public  android.service.euicc.EuiccProfileInfo.Builder setNickname(java.lang.String value) { throw new RuntimeException("Stub!"); }
public  android.service.euicc.EuiccProfileInfo.Builder setServiceProviderName(java.lang.String value) { throw new RuntimeException("Stub!"); }
public  android.service.euicc.EuiccProfileInfo.Builder setProfileName(java.lang.String value) { throw new RuntimeException("Stub!"); }
public  android.service.euicc.EuiccProfileInfo.Builder setProfileClass(@android.service.euicc.EuiccProfileInfo.ProfileClass()
int value) { throw new RuntimeException("Stub!"); }
public  android.service.euicc.EuiccProfileInfo.Builder setState(@android.service.euicc.EuiccProfileInfo.ProfileState()
int value) { throw new RuntimeException("Stub!"); }
public  android.service.euicc.EuiccProfileInfo.Builder setCarrierIdentifier(android.service.carrier.CarrierIdentifier value) { throw new RuntimeException("Stub!"); }
public  android.service.euicc.EuiccProfileInfo.Builder setPolicyRules(@android.service.euicc.EuiccProfileInfo.PolicyRule()
int value) { throw new RuntimeException("Stub!"); }
public  android.service.euicc.EuiccProfileInfo.Builder setUiccAccessRule(java.util.List<android.telephony.UiccAccessRule> value) { throw new RuntimeException("Stub!"); }
}
EuiccProfileInfo() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  java.lang.String getIccid() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.telephony.UiccAccessRule> getUiccAccessRules() { throw new RuntimeException("Stub!"); }
public  java.lang.String getNickname() { throw new RuntimeException("Stub!"); }
public  java.lang.String getServiceProviderName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getProfileName() { throw new RuntimeException("Stub!"); }
@android.service.euicc.EuiccProfileInfo.ProfileClass()
public  int getProfileClass() { throw new RuntimeException("Stub!"); }
@android.service.euicc.EuiccProfileInfo.ProfileState()
public  int getState() { throw new RuntimeException("Stub!"); }
public  android.service.carrier.CarrierIdentifier getCarrierIdentifier() { throw new RuntimeException("Stub!"); }
@android.service.euicc.EuiccProfileInfo.PolicyRule()
public  int getPolicyRules() { throw new RuntimeException("Stub!"); }
public  boolean hasPolicyRules() { throw new RuntimeException("Stub!"); }
public  boolean hasPolicyRule(@android.service.euicc.EuiccProfileInfo.PolicyRule()
int policy) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.service.euicc.EuiccProfileInfo> CREATOR;
public static final int POLICY_RULE_DELETE_AFTER_DISABLING = 4;
public static final int POLICY_RULE_DO_NOT_DELETE = 2;
public static final int POLICY_RULE_DO_NOT_DISABLE = 1;
public static final int PROFILE_CLASS_OPERATIONAL = 2;
public static final int PROFILE_CLASS_PROVISIONING = 1;
public static final int PROFILE_CLASS_TESTING = 0;
public static final int PROFILE_STATE_DISABLED = 0;
public static final int PROFILE_STATE_ENABLED = 1;
static { CREATOR = null; }
}
