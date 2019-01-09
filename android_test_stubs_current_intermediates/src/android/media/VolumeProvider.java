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
package android.media;
public abstract class VolumeProvider
{
public  VolumeProvider(int volumeControl, int maxVolume, int currentVolume) { throw new RuntimeException("Stub!"); }
public final  int getVolumeControl() { throw new RuntimeException("Stub!"); }
public final  int getMaxVolume() { throw new RuntimeException("Stub!"); }
public final  int getCurrentVolume() { throw new RuntimeException("Stub!"); }
public final  void setCurrentVolume(int currentVolume) { throw new RuntimeException("Stub!"); }
public  void onSetVolumeTo(int volume) { throw new RuntimeException("Stub!"); }
public  void onAdjustVolume(int direction) { throw new RuntimeException("Stub!"); }
public static final int VOLUME_CONTROL_ABSOLUTE = 2;
public static final int VOLUME_CONTROL_FIXED = 0;
public static final int VOLUME_CONTROL_RELATIVE = 1;
}
