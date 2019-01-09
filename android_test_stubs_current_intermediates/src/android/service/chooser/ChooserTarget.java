/*
* Copyright (C) 2015 The Android Open Source Project
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


package android.service.chooser;
public final class ChooserTarget
  implements android.os.Parcelable
{
public  ChooserTarget(java.lang.CharSequence title, android.graphics.drawable.Icon icon, float score, android.content.ComponentName componentName, android.os.Bundle intentExtras) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getTitle() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Icon getIcon() { throw new RuntimeException("Stub!"); }
public  float getScore() { throw new RuntimeException("Stub!"); }
public  android.content.ComponentName getComponentName() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getIntentExtras() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.service.chooser.ChooserTarget> CREATOR;
static { CREATOR = null; }
}
