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
public class BassBoost
  extends android.media.audiofx.AudioEffect
{
public static interface OnParameterChangeListener
{
public abstract  void onParameterChange(android.media.audiofx.BassBoost effect, int status, int param, short value);
}
public static class Settings
{
public  Settings() { throw new RuntimeException("Stub!"); }
public  Settings(java.lang.String settings) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public short strength;
}
public  BassBoost(int priority, int audioSession) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException, java.lang.RuntimeException { throw new RuntimeException("Stub!"); }
public  boolean getStrengthSupported() { throw new RuntimeException("Stub!"); }
public  void setStrength(short strength) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  short getRoundedStrength() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  void setParameterListener(android.media.audiofx.BassBoost.OnParameterChangeListener listener) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.BassBoost.Settings getProperties() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  void setProperties(android.media.audiofx.BassBoost.Settings settings) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public static final int PARAM_STRENGTH = 1;
public static final int PARAM_STRENGTH_SUPPORTED = 0;
}
