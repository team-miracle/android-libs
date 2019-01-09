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

package android.app;
public final class RemoteInput
  implements android.os.Parcelable
{
public static final class Builder
{
public  Builder(java.lang.String resultKey) { throw new RuntimeException("Stub!"); }
public  android.app.RemoteInput.Builder setLabel(java.lang.CharSequence label) { throw new RuntimeException("Stub!"); }
public  android.app.RemoteInput.Builder setChoices(java.lang.CharSequence[] choices) { throw new RuntimeException("Stub!"); }
public  android.app.RemoteInput.Builder setAllowDataType(java.lang.String mimeType, boolean doAllow) { throw new RuntimeException("Stub!"); }
public  android.app.RemoteInput.Builder setAllowFreeFormInput(boolean allowFreeFormTextInput) { throw new RuntimeException("Stub!"); }
public  android.app.RemoteInput.Builder addExtras(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
public  android.app.RemoteInput build() { throw new RuntimeException("Stub!"); }
}
RemoteInput() { throw new RuntimeException("Stub!"); }
public  java.lang.String getResultKey() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getLabel() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence[] getChoices() { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.lang.String> getAllowedDataTypes() { throw new RuntimeException("Stub!"); }
public  boolean isDataOnly() { throw new RuntimeException("Stub!"); }
public  boolean getAllowFreeFormInput() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
public static  java.util.Map<java.lang.String, android.net.Uri> getDataResultsFromIntent(android.content.Intent intent, java.lang.String remoteInputResultKey) { throw new RuntimeException("Stub!"); }
public static  android.os.Bundle getResultsFromIntent(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public static  void addResultsToIntent(android.app.RemoteInput[] remoteInputs, android.content.Intent intent, android.os.Bundle results) { throw new RuntimeException("Stub!"); }
public static  void addDataResultToIntent(android.app.RemoteInput remoteInput, android.content.Intent intent, java.util.Map<java.lang.String, android.net.Uri> results) { throw new RuntimeException("Stub!"); }
public static  void setResultsSource(android.content.Intent intent, int source) { throw new RuntimeException("Stub!"); }
public static  int getResultsSource(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.app.RemoteInput> CREATOR;
public static final java.lang.String EXTRA_RESULTS_DATA = "android.remoteinput.resultsData";
public static final java.lang.String RESULTS_CLIP_LABEL = "android.remoteinput.results";
public static final int SOURCE_CHOICE = 1;
public static final int SOURCE_FREE_FORM_INPUT = 0;
static { CREATOR = null; }
}
