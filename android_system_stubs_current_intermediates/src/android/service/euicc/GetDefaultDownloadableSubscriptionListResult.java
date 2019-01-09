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
public final class GetDefaultDownloadableSubscriptionListResult
  implements android.os.Parcelable
{
public  GetDefaultDownloadableSubscriptionListResult(int result, android.telephony.euicc.DownloadableSubscription[] subscriptions) { throw new RuntimeException("Stub!"); }
public  int getResult() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.telephony.euicc.DownloadableSubscription> getDownloadableSubscriptions() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.service.euicc.GetDefaultDownloadableSubscriptionListResult> CREATOR;
static { CREATOR = null; }
}
