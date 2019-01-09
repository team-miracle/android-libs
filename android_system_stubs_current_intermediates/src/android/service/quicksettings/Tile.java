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
package android.service.quicksettings;
public final class Tile
  implements android.os.Parcelable
{
Tile() { throw new RuntimeException("Stub!"); }
public  int getState() { throw new RuntimeException("Stub!"); }
public  void setState(int state) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Icon getIcon() { throw new RuntimeException("Stub!"); }
public  void setIcon(android.graphics.drawable.Icon icon) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getLabel() { throw new RuntimeException("Stub!"); }
public  void setLabel(java.lang.CharSequence label) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getContentDescription() { throw new RuntimeException("Stub!"); }
public  void setContentDescription(java.lang.CharSequence contentDescription) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void updateTile() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.service.quicksettings.Tile> CREATOR;
public static final int STATE_ACTIVE = 2;
public static final int STATE_INACTIVE = 1;
public static final int STATE_UNAVAILABLE = 0;
static { CREATOR = null; }
}
