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
public class StreamingService
  implements java.lang.AutoCloseable
{
StreamingService() { throw new RuntimeException("Stub!"); }
public  android.net.Uri getPlaybackUri() { throw new RuntimeException("Stub!"); }
public  android.telephony.mbms.StreamingServiceInfo getInfo() { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public static final int BROADCAST_METHOD = 1;
public static final int REASON_BY_USER_REQUEST = 1;
public static final int REASON_END_OF_SESSION = 2;
public static final int REASON_FREQUENCY_CONFLICT = 3;
public static final int REASON_LEFT_MBMS_BROADCAST_AREA = 6;
public static final int REASON_NONE = 0;
public static final int REASON_NOT_CONNECTED_TO_HOMECARRIER_LTE = 5;
public static final int REASON_OUT_OF_MEMORY = 4;
public static final int STATE_STALLED = 3;
public static final int STATE_STARTED = 2;
public static final int STATE_STOPPED = 1;
public static final int UNICAST_METHOD = 2;
}
