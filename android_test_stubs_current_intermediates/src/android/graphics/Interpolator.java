/*
* Copyright (C) 2007 The Android Open Source Project
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

package android.graphics;
public class Interpolator
{
public static enum Result
{
FREEZE_END(),
FREEZE_START(),
NORMAL();
}
public  Interpolator(int valueCount) { throw new RuntimeException("Stub!"); }
public  Interpolator(int valueCount, int frameCount) { throw new RuntimeException("Stub!"); }
public  void reset(int valueCount) { throw new RuntimeException("Stub!"); }
public  void reset(int valueCount, int frameCount) { throw new RuntimeException("Stub!"); }
public final  int getKeyFrameCount() { throw new RuntimeException("Stub!"); }
public final  int getValueCount() { throw new RuntimeException("Stub!"); }
public  void setKeyFrame(int index, int msec, float[] values) { throw new RuntimeException("Stub!"); }
public  void setKeyFrame(int index, int msec, float[] values, float[] blend) { throw new RuntimeException("Stub!"); }
public  void setRepeatMirror(float repeatCount, boolean mirror) { throw new RuntimeException("Stub!"); }
public  android.graphics.Interpolator.Result timeToValues(float[] values) { throw new RuntimeException("Stub!"); }
public  android.graphics.Interpolator.Result timeToValues(int msec, float[] values) { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
}
