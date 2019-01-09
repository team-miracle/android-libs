/*
* Copyright (C) 2010 The Android Open Source Project
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
public class CamcorderProfile
{
CamcorderProfile() { throw new RuntimeException("Stub!"); }
public static  android.media.CamcorderProfile get(int quality) { throw new RuntimeException("Stub!"); }
public static  android.media.CamcorderProfile get(int cameraId, int quality) { throw new RuntimeException("Stub!"); }
public static  boolean hasProfile(int quality) { throw new RuntimeException("Stub!"); }
public static  boolean hasProfile(int cameraId, int quality) { throw new RuntimeException("Stub!"); }
public static final int QUALITY_1080P = 6;
public static final int QUALITY_2160P = 8;
public static final int QUALITY_480P = 4;
public static final int QUALITY_720P = 5;
public static final int QUALITY_CIF = 3;
public static final int QUALITY_HIGH = 1;
public static final int QUALITY_HIGH_SPEED_1080P = 2004;
public static final int QUALITY_HIGH_SPEED_2160P = 2005;
public static final int QUALITY_HIGH_SPEED_480P = 2002;
public static final int QUALITY_HIGH_SPEED_720P = 2003;
public static final int QUALITY_HIGH_SPEED_HIGH = 2001;
public static final int QUALITY_HIGH_SPEED_LOW = 2000;
public static final int QUALITY_LOW = 0;
public static final int QUALITY_QCIF = 2;
public static final int QUALITY_QVGA = 7;
public static final int QUALITY_TIME_LAPSE_1080P = 1006;
public static final int QUALITY_TIME_LAPSE_2160P = 1008;
public static final int QUALITY_TIME_LAPSE_480P = 1004;
public static final int QUALITY_TIME_LAPSE_720P = 1005;
public static final int QUALITY_TIME_LAPSE_CIF = 1003;
public static final int QUALITY_TIME_LAPSE_HIGH = 1001;
public static final int QUALITY_TIME_LAPSE_LOW = 1000;
public static final int QUALITY_TIME_LAPSE_QCIF = 1002;
public static final int QUALITY_TIME_LAPSE_QVGA = 1007;
public int audioBitRate;
public int audioChannels;
public int audioCodec;
public int audioSampleRate;
public int duration;
public int fileFormat;
public int quality;
public int videoBitRate;
public int videoCodec;
public int videoFrameHeight;
public int videoFrameRate;
public int videoFrameWidth;
}
