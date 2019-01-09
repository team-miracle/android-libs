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

package android.hardware.camera2.params;
public final class StreamConfigurationMap
{
StreamConfigurationMap() { throw new RuntimeException("Stub!"); }
public  int[] getOutputFormats() { throw new RuntimeException("Stub!"); }
public  int[] getValidOutputFormatsForInput(int inputFormat) { throw new RuntimeException("Stub!"); }
public  int[] getInputFormats() { throw new RuntimeException("Stub!"); }
public  android.util.Size[] getInputSizes(int format) { throw new RuntimeException("Stub!"); }
public  boolean isOutputSupportedFor(int format) { throw new RuntimeException("Stub!"); }
public static <T> boolean isOutputSupportedFor(java.lang.Class<T> klass) { throw new RuntimeException("Stub!"); }
public  boolean isOutputSupportedFor(android.view.Surface surface) { throw new RuntimeException("Stub!"); }
public <T> android.util.Size[] getOutputSizes(java.lang.Class<T> klass) { throw new RuntimeException("Stub!"); }
public  android.util.Size[] getOutputSizes(int format) { throw new RuntimeException("Stub!"); }
public  android.util.Size[] getHighSpeedVideoSizes() { throw new RuntimeException("Stub!"); }
public  android.util.Range<java.lang.Integer>[] getHighSpeedVideoFpsRangesFor(android.util.Size size) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public  android.util.Range<java.lang.Integer>[] getHighSpeedVideoFpsRanges() { throw new RuntimeException("Stub!"); }
public  android.util.Size[] getHighSpeedVideoSizesFor(android.util.Range<java.lang.Integer> fpsRange) { throw new RuntimeException("Stub!"); }
public  android.util.Size[] getHighResolutionOutputSizes(int format) { throw new RuntimeException("Stub!"); }
public  long getOutputMinFrameDuration(int format, android.util.Size size) { throw new RuntimeException("Stub!"); }
public <T> long getOutputMinFrameDuration(java.lang.Class<T> klass, android.util.Size size) { throw new RuntimeException("Stub!"); }
public  long getOutputStallDuration(int format, android.util.Size size) { throw new RuntimeException("Stub!"); }
public <T> long getOutputStallDuration(java.lang.Class<T> klass, android.util.Size size) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
