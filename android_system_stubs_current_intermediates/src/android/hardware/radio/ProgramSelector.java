/**
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

package android.hardware.radio;
public final class ProgramSelector
  implements android.os.Parcelable
{
@java.lang.Deprecated()
@java.lang.annotation.Retention(value=java.lang.annotation.RetentionPolicy.SOURCE)
public static @interface ProgramType
{
}
@java.lang.annotation.Retention(value=java.lang.annotation.RetentionPolicy.SOURCE)
public static @interface IdentifierType
{
}
public static final class Identifier
  implements android.os.Parcelable
{
public  Identifier(@android.hardware.radio.ProgramSelector.IdentifierType()
int type, long value) { throw new RuntimeException("Stub!"); }
@android.hardware.radio.ProgramSelector.IdentifierType()
public  int getType() { throw new RuntimeException("Stub!"); }
public  long getValue() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.hardware.radio.ProgramSelector.Identifier> CREATOR;
static { CREATOR = null; }
}
public  ProgramSelector(@android.hardware.radio.ProgramSelector.ProgramType()
int programType, android.hardware.radio.ProgramSelector.Identifier primaryId, android.hardware.radio.ProgramSelector.Identifier[] secondaryIds, long[] vendorIds) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
@android.hardware.radio.ProgramSelector.ProgramType()
public  int getProgramType() { throw new RuntimeException("Stub!"); }
public  android.hardware.radio.ProgramSelector.Identifier getPrimaryId() { throw new RuntimeException("Stub!"); }
public  android.hardware.radio.ProgramSelector.Identifier[] getSecondaryIds() { throw new RuntimeException("Stub!"); }
public  long getFirstId(@android.hardware.radio.ProgramSelector.IdentifierType()
int type) { throw new RuntimeException("Stub!"); }
public  android.hardware.radio.ProgramSelector.Identifier[] getAllIds(@android.hardware.radio.ProgramSelector.IdentifierType()
int type) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  long[] getVendorIds() { throw new RuntimeException("Stub!"); }
public  android.hardware.radio.ProgramSelector withSecondaryPreferred(android.hardware.radio.ProgramSelector.Identifier preferred) { throw new RuntimeException("Stub!"); }
public static  android.hardware.radio.ProgramSelector createAmFmSelector(@android.hardware.radio.RadioManager.Band()
int band, int frequencyKhz) { throw new RuntimeException("Stub!"); }
public static  android.hardware.radio.ProgramSelector createAmFmSelector(@android.hardware.radio.RadioManager.Band()
int band, int frequencyKhz, int subChannel) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.hardware.radio.ProgramSelector> CREATOR;
public static final int IDENTIFIER_TYPE_AMFM_FREQUENCY = 1;
public static final int IDENTIFIER_TYPE_DAB_ENSEMBLE = 6;
public static final int IDENTIFIER_TYPE_DAB_FREQUENCY = 8;
public static final int IDENTIFIER_TYPE_DAB_SCID = 7;
public static final int IDENTIFIER_TYPE_DAB_SIDECC = 5;
public static final int IDENTIFIER_TYPE_DAB_SID_EXT = 5;
public static final int IDENTIFIER_TYPE_DRMO_FREQUENCY = 10;
@java.lang.Deprecated()
public static final int IDENTIFIER_TYPE_DRMO_MODULATION = 11;
public static final int IDENTIFIER_TYPE_DRMO_SERVICE_ID = 9;
public static final int IDENTIFIER_TYPE_HD_STATION_ID_EXT = 3;
public static final int IDENTIFIER_TYPE_HD_STATION_NAME = 10004;
@java.lang.Deprecated()
public static final int IDENTIFIER_TYPE_HD_SUBCHANNEL = 4;
public static final int IDENTIFIER_TYPE_INVALID = 0;
public static final int IDENTIFIER_TYPE_RDS_PI = 2;
public static final int IDENTIFIER_TYPE_SXM_CHANNEL = 13;
public static final int IDENTIFIER_TYPE_SXM_SERVICE_ID = 12;
public static final int IDENTIFIER_TYPE_VENDOR_END = 1999;
@java.lang.Deprecated()
public static final int IDENTIFIER_TYPE_VENDOR_PRIMARY_END = 1999;
@java.lang.Deprecated()
public static final int IDENTIFIER_TYPE_VENDOR_PRIMARY_START = 1000;
public static final int IDENTIFIER_TYPE_VENDOR_START = 1000;
@java.lang.Deprecated()
public static final int PROGRAM_TYPE_AM = 1;
@java.lang.Deprecated()
public static final int PROGRAM_TYPE_AM_HD = 3;
@java.lang.Deprecated()
public static final int PROGRAM_TYPE_DAB = 5;
@java.lang.Deprecated()
public static final int PROGRAM_TYPE_DRMO = 6;
@java.lang.Deprecated()
public static final int PROGRAM_TYPE_FM = 2;
@java.lang.Deprecated()
public static final int PROGRAM_TYPE_FM_HD = 4;
@java.lang.Deprecated()
public static final int PROGRAM_TYPE_INVALID = 0;
@java.lang.Deprecated()
public static final int PROGRAM_TYPE_SXM = 7;
@java.lang.Deprecated()
public static final int PROGRAM_TYPE_VENDOR_END = 1999;
@java.lang.Deprecated()
public static final int PROGRAM_TYPE_VENDOR_START = 1000;
static { CREATOR = null; }
}
