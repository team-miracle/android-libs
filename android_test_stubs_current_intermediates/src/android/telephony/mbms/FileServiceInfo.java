/*
* Copyright (C) 2016 The Android Open Source Project
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

package android.telephony.mbms;
public final class FileServiceInfo
  extends android.telephony.mbms.ServiceInfo
  implements android.os.Parcelable
{
public  FileServiceInfo(java.util.Map<java.util.Locale, java.lang.String> newNames, java.lang.String newClassName, java.util.List<java.util.Locale> newLocales, java.lang.String newServiceId, java.util.Date start, java.util.Date end, java.util.List<android.telephony.mbms.FileInfo> newFiles) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.telephony.mbms.FileInfo> getFiles() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.telephony.mbms.FileServiceInfo> CREATOR;
static { CREATOR = null; }
}
