/*
* Copyright (C) 2014 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License"); you may not
* use this file except in compliance with the License. You may obtain a copy of
* the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
* WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
* License for the specific language governing permissions and limitations under
* the License.
*/

package android.speech.tts;
public class Voice
  implements android.os.Parcelable
{
public  Voice(java.lang.String name, java.util.Locale locale, int quality, int latency, boolean requiresNetworkConnection, java.util.Set<java.lang.String> features) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  java.util.Locale getLocale() { throw new RuntimeException("Stub!"); }
public  int getQuality() { throw new RuntimeException("Stub!"); }
public  int getLatency() { throw new RuntimeException("Stub!"); }
public  boolean isNetworkConnectionRequired() { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.lang.String> getFeatures() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.speech.tts.Voice> CREATOR;
public static final int LATENCY_HIGH = 400;
public static final int LATENCY_LOW = 200;
public static final int LATENCY_NORMAL = 300;
public static final int LATENCY_VERY_HIGH = 500;
public static final int LATENCY_VERY_LOW = 100;
public static final int QUALITY_HIGH = 400;
public static final int QUALITY_LOW = 200;
public static final int QUALITY_NORMAL = 300;
public static final int QUALITY_VERY_HIGH = 500;
public static final int QUALITY_VERY_LOW = 100;
static { CREATOR = null; }
}
