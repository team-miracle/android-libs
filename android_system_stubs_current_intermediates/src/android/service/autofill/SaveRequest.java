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

package android.service.autofill;
public final class SaveRequest
  implements android.os.Parcelable
{
SaveRequest() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.service.autofill.FillContext> getFillContexts() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getClientState() { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getDatasetIds() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.service.autofill.SaveRequest> CREATOR;
static { CREATOR = null; }
}
