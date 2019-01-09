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

package android.content.res;
public class ColorStateList
  implements android.os.Parcelable
{
public  ColorStateList(int[][] states, int[] colors) { throw new RuntimeException("Stub!"); }
public static  android.content.res.ColorStateList valueOf(int color) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  android.content.res.ColorStateList createFromXml(android.content.res.Resources r, org.xmlpull.v1.XmlPullParser parser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
public static  android.content.res.ColorStateList createFromXml(android.content.res.Resources r, org.xmlpull.v1.XmlPullParser parser, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.content.res.ColorStateList withAlpha(int alpha) { throw new RuntimeException("Stub!"); }
public  int getChangingConfigurations() { throw new RuntimeException("Stub!"); }
public  boolean isStateful() { throw new RuntimeException("Stub!"); }
public  boolean isOpaque() { throw new RuntimeException("Stub!"); }
public  int getColorForState(int[] stateSet, int defaultColor) { throw new RuntimeException("Stub!"); }
public  int getDefaultColor() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.content.res.ColorStateList> CREATOR;
static { CREATOR = null; }
}
