/*
* Copyright (C) 2006 The Android Open Source Project
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

package android.os;
public abstract class Vibrator
{
Vibrator() { throw new RuntimeException("Stub!"); }
public abstract  boolean hasVibrator();
public abstract  boolean hasAmplitudeControl();
@java.lang.Deprecated()
public  void vibrate(long milliseconds) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void vibrate(long milliseconds, android.media.AudioAttributes attributes) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void vibrate(long[] pattern, int repeat) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void vibrate(long[] pattern, int repeat, android.media.AudioAttributes attributes) { throw new RuntimeException("Stub!"); }
public  void vibrate(android.os.VibrationEffect vibe) { throw new RuntimeException("Stub!"); }
public  void vibrate(android.os.VibrationEffect vibe, android.media.AudioAttributes attributes) { throw new RuntimeException("Stub!"); }
public abstract  void cancel();
}
