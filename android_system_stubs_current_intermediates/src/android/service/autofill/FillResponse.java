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

package android.service.autofill;
public final class FillResponse
  implements android.os.Parcelable
{
public static final class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  android.service.autofill.FillResponse.Builder setAuthentication(android.view.autofill.AutofillId[] ids, android.content.IntentSender authentication, android.widget.RemoteViews presentation) { throw new RuntimeException("Stub!"); }
public  android.service.autofill.FillResponse.Builder setIgnoredIds(android.view.autofill.AutofillId... ids) { throw new RuntimeException("Stub!"); }
public  android.service.autofill.FillResponse.Builder addDataset(android.service.autofill.Dataset dataset) { throw new RuntimeException("Stub!"); }
public  android.service.autofill.FillResponse.Builder setSaveInfo(android.service.autofill.SaveInfo saveInfo) { throw new RuntimeException("Stub!"); }
public  android.service.autofill.FillResponse.Builder setClientState(android.os.Bundle clientState) { throw new RuntimeException("Stub!"); }
public  android.service.autofill.FillResponse.Builder setFieldClassificationIds(android.view.autofill.AutofillId... ids) { throw new RuntimeException("Stub!"); }
public  android.service.autofill.FillResponse.Builder setFlags(int flags) { throw new RuntimeException("Stub!"); }
public  android.service.autofill.FillResponse.Builder disableAutofill(long duration) { throw new RuntimeException("Stub!"); }
public  android.service.autofill.FillResponse.Builder setHeader(android.widget.RemoteViews header) { throw new RuntimeException("Stub!"); }
public  android.service.autofill.FillResponse.Builder setFooter(android.widget.RemoteViews footer) { throw new RuntimeException("Stub!"); }
public  android.service.autofill.FillResponse build() { throw new RuntimeException("Stub!"); }
}
FillResponse() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.service.autofill.FillResponse> CREATOR;
public static final int FLAG_DISABLE_ACTIVITY_ONLY = 2;
public static final int FLAG_TRACK_CONTEXT_COMMITED = 1;
static { CREATOR = null; }
}
