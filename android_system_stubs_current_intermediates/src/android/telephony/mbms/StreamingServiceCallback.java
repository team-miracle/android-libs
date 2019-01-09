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
public class StreamingServiceCallback
{
public  StreamingServiceCallback() { throw new RuntimeException("Stub!"); }
public  void onError(int errorCode, java.lang.String message) { throw new RuntimeException("Stub!"); }
public  void onStreamStateUpdated(int state, int reason) { throw new RuntimeException("Stub!"); }
public  void onMediaDescriptionUpdated() { throw new RuntimeException("Stub!"); }
public  void onBroadcastSignalStrengthUpdated(int signalStrength) { throw new RuntimeException("Stub!"); }
public  void onStreamMethodUpdated(int methodType) { throw new RuntimeException("Stub!"); }
public static final int SIGNAL_STRENGTH_UNAVAILABLE = -1;
}
