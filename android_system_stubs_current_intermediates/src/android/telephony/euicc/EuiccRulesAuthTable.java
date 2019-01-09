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
package android.telephony.euicc;
public final class EuiccRulesAuthTable
  implements android.os.Parcelable
{
@java.lang.annotation.Retention(value=java.lang.annotation.RetentionPolicy.SOURCE)
public static @interface PolicyRuleFlag
{
}
public static final class Builder
{
public  Builder(int ruleNum) { throw new RuntimeException("Stub!"); }
public  android.telephony.euicc.EuiccRulesAuthTable build() { throw new RuntimeException("Stub!"); }
public  android.telephony.euicc.EuiccRulesAuthTable.Builder add(int policyRules, java.util.List<android.service.carrier.CarrierIdentifier> carrierId, int policyRuleFlags) { throw new RuntimeException("Stub!"); }
}
EuiccRulesAuthTable() { throw new RuntimeException("Stub!"); }
public  int findIndex(@android.service.euicc.EuiccProfileInfo.PolicyRule()
int policy, android.service.carrier.CarrierIdentifier carrierId) { throw new RuntimeException("Stub!"); }
public  boolean hasPolicyRuleFlag(int index, @android.telephony.euicc.EuiccRulesAuthTable.PolicyRuleFlag()
int flag) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.telephony.euicc.EuiccRulesAuthTable> CREATOR;
public static final int POLICY_RULE_FLAG_CONSENT_REQUIRED = 1;
static { CREATOR = null; }
}
