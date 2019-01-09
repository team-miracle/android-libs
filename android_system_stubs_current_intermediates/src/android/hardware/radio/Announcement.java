/**
* Copyright (C) 2018 The Android Open Source Project
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

package android.hardware.radio;
public final class Announcement
  implements android.os.Parcelable
{
public static interface OnListUpdatedListener
{
public abstract  void onListUpdated(java.util.Collection<android.hardware.radio.Announcement> activeAnnouncements);
}
Announcement() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  android.hardware.radio.ProgramSelector getSelector() { throw new RuntimeException("Stub!"); }
public  int getType() { throw new RuntimeException("Stub!"); }
public  java.util.Map<java.lang.String, java.lang.String> getVendorInfo() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.hardware.radio.Announcement> CREATOR;
public static final int TYPE_EMERGENCY = 1;
public static final int TYPE_EVENT = 6;
public static final int TYPE_MISC = 8;
public static final int TYPE_NEWS = 5;
public static final int TYPE_SPORT = 7;
public static final int TYPE_TRAFFIC = 3;
public static final int TYPE_WARNING = 2;
public static final int TYPE_WEATHER = 4;
static { CREATOR = null; }
}
