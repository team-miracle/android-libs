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
* limitations under the License
*/

package android.location;
public class GpsNavigationMessageEvent
  implements android.os.Parcelable
{
public static interface Listener
{
public abstract  void onGpsNavigationMessageReceived(android.location.GpsNavigationMessageEvent event);
public abstract  void onStatusChanged(int status);
}
public  GpsNavigationMessageEvent(android.location.GpsNavigationMessage message) { throw new RuntimeException("Stub!"); }
public  android.location.GpsNavigationMessage getNavigationMessage() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.location.GpsNavigationMessageEvent> CREATOR;
public static int STATUS_GPS_LOCATION_DISABLED;
public static int STATUS_NOT_SUPPORTED;
public static int STATUS_READY;
static { CREATOR = null; }
}
