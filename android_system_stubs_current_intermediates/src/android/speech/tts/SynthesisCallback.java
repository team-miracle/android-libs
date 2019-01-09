/*
* Copyright (C) 2011 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License"); you may not
* use this file except in compliance with the License. You may obtain a copy of
* the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
* WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
* License for the specific language governing permissions and limitations under
* the License.
*/
package android.speech.tts;
public interface SynthesisCallback
{
public abstract  int getMaxBufferSize();
public abstract  int start(int sampleRateInHz, int audioFormat, int channelCount);
public abstract  int audioAvailable(byte[] buffer, int offset, int length);
public abstract  int done();
public abstract  void error();
public abstract  void error(int errorCode);
public abstract  boolean hasStarted();
public abstract  boolean hasFinished();
default public  void rangeStart(int markerInFrames, int start, int end) { throw new RuntimeException("Stub!"); }
}
