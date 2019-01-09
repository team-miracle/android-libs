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

package android.service.resolver;
public final class ResolverTarget
  implements android.os.Parcelable
{
public  ResolverTarget() { throw new RuntimeException("Stub!"); }
public  float getRecencyScore() { throw new RuntimeException("Stub!"); }
public  void setRecencyScore(float recencyScore) { throw new RuntimeException("Stub!"); }
public  float getTimeSpentScore() { throw new RuntimeException("Stub!"); }
public  void setTimeSpentScore(float timeSpentScore) { throw new RuntimeException("Stub!"); }
public  float getLaunchScore() { throw new RuntimeException("Stub!"); }
public  void setLaunchScore(float launchScore) { throw new RuntimeException("Stub!"); }
public  float getChooserScore() { throw new RuntimeException("Stub!"); }
public  void setChooserScore(float chooserScore) { throw new RuntimeException("Stub!"); }
public  float getSelectProbability() { throw new RuntimeException("Stub!"); }
public  void setSelectProbability(float selectProbability) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.service.resolver.ResolverTarget> CREATOR;
static { CREATOR = null; }
}
