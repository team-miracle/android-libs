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
* limitations under the License.
*/

package android.media.audiopolicy;
public class AudioMix
{
public static class Builder
{
public  Builder(android.media.audiopolicy.AudioMixingRule rule) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  android.media.audiopolicy.AudioMix.Builder setFormat(android.media.AudioFormat format) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  android.media.audiopolicy.AudioMix.Builder setRouteFlags(int routeFlags) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  android.media.audiopolicy.AudioMix.Builder setDevice(android.media.AudioDeviceInfo device) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  android.media.audiopolicy.AudioMix build() throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
}
AudioMix() { throw new RuntimeException("Stub!"); }
public  int getMixState() { throw new RuntimeException("Stub!"); }
public static final int MIX_STATE_DISABLED = -1;
public static final int MIX_STATE_IDLE = 0;
public static final int MIX_STATE_MIXING = 1;
public static final int ROUTE_FLAG_LOOP_BACK = 2;
public static final int ROUTE_FLAG_RENDER = 1;
}
