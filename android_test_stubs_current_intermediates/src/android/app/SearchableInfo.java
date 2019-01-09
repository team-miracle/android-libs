/*
* Copyright (C) 2007 The Android Open Source Project
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
public final class SearchableInfo
  implements android.os.Parcelable
{
SearchableInfo() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSuggestAuthority() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSuggestPackage() { throw new RuntimeException("Stub!"); }
public  android.content.ComponentName getSearchActivity() { throw new RuntimeException("Stub!"); }
public  boolean shouldRewriteQueryFromData() { throw new RuntimeException("Stub!"); }
public  boolean shouldRewriteQueryFromText() { throw new RuntimeException("Stub!"); }
public  int getSettingsDescriptionId() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSuggestPath() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSuggestSelection() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSuggestIntentAction() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSuggestIntentData() { throw new RuntimeException("Stub!"); }
public  int getSuggestThreshold() { throw new RuntimeException("Stub!"); }
public  int getHintId() { throw new RuntimeException("Stub!"); }
public  boolean getVoiceSearchEnabled() { throw new RuntimeException("Stub!"); }
public  boolean getVoiceSearchLaunchWebSearch() { throw new RuntimeException("Stub!"); }
public  boolean getVoiceSearchLaunchRecognizer() { throw new RuntimeException("Stub!"); }
public  int getVoiceLanguageModeId() { throw new RuntimeException("Stub!"); }
public  int getVoicePromptTextId() { throw new RuntimeException("Stub!"); }
public  int getVoiceLanguageId() { throw new RuntimeException("Stub!"); }
public  int getVoiceMaxResults() { throw new RuntimeException("Stub!"); }
public  int getInputType() { throw new RuntimeException("Stub!"); }
public  int getImeOptions() { throw new RuntimeException("Stub!"); }
public  boolean shouldIncludeInGlobalSearch() { throw new RuntimeException("Stub!"); }
public  boolean queryAfterZeroResults() { throw new RuntimeException("Stub!"); }
public  boolean autoUrlDetect() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.app.SearchableInfo> CREATOR;
static { CREATOR = null; }
}
