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
public final class ImageTransformation
  implements android.service.autofill.Transformation, android.os.Parcelable
{
public static class Builder
{
@java.lang.Deprecated()
public  Builder(android.view.autofill.AutofillId id, java.util.regex.Pattern regex, int resId) { throw new RuntimeException("Stub!"); }
public  Builder(android.view.autofill.AutofillId id, java.util.regex.Pattern regex, int resId, java.lang.CharSequence contentDescription) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  android.service.autofill.ImageTransformation.Builder addOption(java.util.regex.Pattern regex, int resId) { throw new RuntimeException("Stub!"); }
public  android.service.autofill.ImageTransformation.Builder addOption(java.util.regex.Pattern regex, int resId, java.lang.CharSequence contentDescription) { throw new RuntimeException("Stub!"); }
public  android.service.autofill.ImageTransformation build() { throw new RuntimeException("Stub!"); }
}
ImageTransformation() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.service.autofill.ImageTransformation> CREATOR;
static { CREATOR = null; }
}
