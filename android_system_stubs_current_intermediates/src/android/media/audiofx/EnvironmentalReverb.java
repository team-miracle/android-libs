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

package android.media.audiofx;
public class EnvironmentalReverb
  extends android.media.audiofx.AudioEffect
{
public static interface OnParameterChangeListener
{
public abstract  void onParameterChange(android.media.audiofx.EnvironmentalReverb effect, int status, int param, int value);
}
public static class Settings
{
public  Settings() { throw new RuntimeException("Stub!"); }
public  Settings(java.lang.String settings) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public short decayHFRatio;
public int decayTime;
public short density;
public short diffusion;
public int reflectionsDelay;
public short reflectionsLevel;
public int reverbDelay;
public short reverbLevel;
public short roomHFLevel;
public short roomLevel;
}
public  EnvironmentalReverb(int priority, int audioSession) throws java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException, java.lang.RuntimeException { throw new RuntimeException("Stub!"); }
public  void setRoomLevel(short room) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  short getRoomLevel() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  void setRoomHFLevel(short roomHF) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  short getRoomHFLevel() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  void setDecayTime(int decayTime) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  int getDecayTime() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  void setDecayHFRatio(short decayHFRatio) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  short getDecayHFRatio() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  void setReflectionsLevel(short reflectionsLevel) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  short getReflectionsLevel() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  void setReflectionsDelay(int reflectionsDelay) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  int getReflectionsDelay() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  void setReverbLevel(short reverbLevel) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  short getReverbLevel() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  void setReverbDelay(int reverbDelay) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  int getReverbDelay() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  void setDiffusion(short diffusion) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  short getDiffusion() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  void setDensity(short density) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  short getDensity() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  void setParameterListener(android.media.audiofx.EnvironmentalReverb.OnParameterChangeListener listener) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.EnvironmentalReverb.Settings getProperties() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  void setProperties(android.media.audiofx.EnvironmentalReverb.Settings settings) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public static final int PARAM_DECAY_HF_RATIO = 3;
public static final int PARAM_DECAY_TIME = 2;
public static final int PARAM_DENSITY = 9;
public static final int PARAM_DIFFUSION = 8;
public static final int PARAM_REFLECTIONS_DELAY = 5;
public static final int PARAM_REFLECTIONS_LEVEL = 4;
public static final int PARAM_REVERB_DELAY = 7;
public static final int PARAM_REVERB_LEVEL = 6;
public static final int PARAM_ROOM_HF_LEVEL = 1;
public static final int PARAM_ROOM_LEVEL = 0;
}
