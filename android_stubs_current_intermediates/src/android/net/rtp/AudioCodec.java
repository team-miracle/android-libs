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

package android.net.rtp;
public class AudioCodec
{
AudioCodec() { throw new RuntimeException("Stub!"); }
public static  android.net.rtp.AudioCodec[] getCodecs() { throw new RuntimeException("Stub!"); }
public static  android.net.rtp.AudioCodec getCodec(int type, java.lang.String rtpmap, java.lang.String fmtp) { throw new RuntimeException("Stub!"); }
public static final android.net.rtp.AudioCodec AMR;
public static final android.net.rtp.AudioCodec GSM;
public static final android.net.rtp.AudioCodec GSM_EFR;
public static final android.net.rtp.AudioCodec PCMA;
public static final android.net.rtp.AudioCodec PCMU;
public final java.lang.String fmtp;
public final java.lang.String rtpmap;
public final int type;
static { AMR = null; GSM = null; GSM_EFR = null; PCMA = null; PCMU = null; }
}
