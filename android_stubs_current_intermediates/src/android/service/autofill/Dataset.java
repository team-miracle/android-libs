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
public final class Dataset
  implements android.os.Parcelable
{
public static final class Builder
{
public  Builder(android.widget.RemoteViews presentation) { throw new RuntimeException("Stub!"); }
public  Builder() { throw new RuntimeException("Stub!"); }
public  android.service.autofill.Dataset.Builder setAuthentication(android.content.IntentSender authentication) { throw new RuntimeException("Stub!"); }
public  android.service.autofill.Dataset.Builder setId(java.lang.String id) { throw new RuntimeException("Stub!"); }
public  android.service.autofill.Dataset.Builder setValue(android.view.autofill.AutofillId id, android.view.autofill.AutofillValue value) { throw new RuntimeException("Stub!"); }
public  android.service.autofill.Dataset.Builder setValue(android.view.autofill.AutofillId id, android.view.autofill.AutofillValue value, android.widget.RemoteViews presentation) { throw new RuntimeException("Stub!"); }
public  android.service.autofill.Dataset.Builder setValue(android.view.autofill.AutofillId id, android.view.autofill.AutofillValue value, java.util.regex.Pattern filter) { throw new RuntimeException("Stub!"); }
public  android.service.autofill.Dataset.Builder setValue(android.view.autofill.AutofillId id, android.view.autofill.AutofillValue value, java.util.regex.Pattern filter, android.widget.RemoteViews presentation) { throw new RuntimeException("Stub!"); }
public  android.service.autofill.Dataset build() { throw new RuntimeException("Stub!"); }
}
Dataset() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.service.autofill.Dataset> CREATOR;
static { CREATOR = null; }
}
