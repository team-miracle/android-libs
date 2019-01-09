/*
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

package android.media;
public final class MicrophoneInfo
{
public static final class Coordinate3F
{
Coordinate3F() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public final float x;
public final float y;
public final float z;
}
MicrophoneInfo() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDescription() { throw new RuntimeException("Stub!"); }
public  int getId() { throw new RuntimeException("Stub!"); }
public  int getType() { throw new RuntimeException("Stub!"); }
public  java.lang.String getAddress() { throw new RuntimeException("Stub!"); }
public  int getLocation() { throw new RuntimeException("Stub!"); }
public  int getGroup() { throw new RuntimeException("Stub!"); }
public  int getIndexInTheGroup() { throw new RuntimeException("Stub!"); }
public  android.media.MicrophoneInfo.Coordinate3F getPosition() { throw new RuntimeException("Stub!"); }
public  android.media.MicrophoneInfo.Coordinate3F getOrientation() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.util.Pair<java.lang.Float, java.lang.Float>> getFrequencyResponse() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.util.Pair<java.lang.Integer, java.lang.Integer>> getChannelMapping() { throw new RuntimeException("Stub!"); }
public  float getSensitivity() { throw new RuntimeException("Stub!"); }
public  float getMaxSpl() { throw new RuntimeException("Stub!"); }
public  float getMinSpl() { throw new RuntimeException("Stub!"); }
public  int getDirectionality() { throw new RuntimeException("Stub!"); }
public static final int CHANNEL_MAPPING_DIRECT = 1;
public static final int CHANNEL_MAPPING_PROCESSED = 2;
public static final int DIRECTIONALITY_BI_DIRECTIONAL = 2;
public static final int DIRECTIONALITY_CARDIOID = 3;
public static final int DIRECTIONALITY_HYPER_CARDIOID = 4;
public static final int DIRECTIONALITY_OMNI = 1;
public static final int DIRECTIONALITY_SUPER_CARDIOID = 5;
public static final int DIRECTIONALITY_UNKNOWN = 0;
public static final int GROUP_UNKNOWN = -1;
public static final int INDEX_IN_THE_GROUP_UNKNOWN = -1;
public static final int LOCATION_MAINBODY = 1;
public static final int LOCATION_MAINBODY_MOVABLE = 2;
public static final int LOCATION_PERIPHERAL = 3;
public static final int LOCATION_UNKNOWN = 0;
public static final android.media.MicrophoneInfo.Coordinate3F ORIENTATION_UNKNOWN;
public static final android.media.MicrophoneInfo.Coordinate3F POSITION_UNKNOWN;
public static final float SENSITIVITY_UNKNOWN = -3.4028235E38f;
public static final float SPL_UNKNOWN = -3.4028235E38f;
static { ORIENTATION_UNKNOWN = null; POSITION_UNKNOWN = null; }
}
