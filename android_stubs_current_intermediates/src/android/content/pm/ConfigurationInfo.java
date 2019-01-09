/*
* Copyright (C) 2008 The Android Open Source Project
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

package android.content.pm;
public class ConfigurationInfo
  implements android.os.Parcelable
{
public  ConfigurationInfo() { throw new RuntimeException("Stub!"); }
public  ConfigurationInfo(android.content.pm.ConfigurationInfo orig) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public  java.lang.String getGlEsVersion() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.content.pm.ConfigurationInfo> CREATOR;
public static final int GL_ES_VERSION_UNDEFINED = 0;
public static final int INPUT_FEATURE_FIVE_WAY_NAV = 2;
public static final int INPUT_FEATURE_HARD_KEYBOARD = 1;
public int reqGlEsVersion;
public int reqInputFeatures;
public int reqKeyboardType;
public int reqNavigation;
public int reqTouchScreen;
static { CREATOR = null; }
}
