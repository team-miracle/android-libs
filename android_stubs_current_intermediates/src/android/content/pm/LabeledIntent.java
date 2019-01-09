/*
* Copyright (C) 2009 The Android Open Source Project
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
public class LabeledIntent
  extends android.content.Intent
{
public  LabeledIntent(android.content.Intent origIntent, java.lang.String sourcePackage, int labelRes, int icon) { throw new RuntimeException("Stub!"); }
public  LabeledIntent(android.content.Intent origIntent, java.lang.String sourcePackage, java.lang.CharSequence nonLocalizedLabel, int icon) { throw new RuntimeException("Stub!"); }
public  LabeledIntent(java.lang.String sourcePackage, int labelRes, int icon) { throw new RuntimeException("Stub!"); }
public  LabeledIntent(java.lang.String sourcePackage, java.lang.CharSequence nonLocalizedLabel, int icon) { throw new RuntimeException("Stub!"); }
public  java.lang.String getSourcePackage() { throw new RuntimeException("Stub!"); }
public  int getLabelResource() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getNonLocalizedLabel() { throw new RuntimeException("Stub!"); }
public  int getIconResource() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence loadLabel(android.content.pm.PackageManager pm) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable loadIcon(android.content.pm.PackageManager pm) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public  void readFromParcel(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.content.pm.LabeledIntent> CREATOR;
static { CREATOR = null; }
}
