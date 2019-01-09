/*
* Copyright (C) 2009 The Android Open Source Project
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

package android.opengl;
public class ETC1Util
{
public static class ETC1Texture
{
public  ETC1Texture(int width, int height, java.nio.ByteBuffer data) { throw new RuntimeException("Stub!"); }
public  int getWidth() { throw new RuntimeException("Stub!"); }
public  int getHeight() { throw new RuntimeException("Stub!"); }
public  java.nio.ByteBuffer getData() { throw new RuntimeException("Stub!"); }
}
public  ETC1Util() { throw new RuntimeException("Stub!"); }
public static  void loadTexture(int target, int level, int border, int fallbackFormat, int fallbackType, java.io.InputStream input) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  void loadTexture(int target, int level, int border, int fallbackFormat, int fallbackType, android.opengl.ETC1Util.ETC1Texture texture) { throw new RuntimeException("Stub!"); }
public static  boolean isETC1Supported() { throw new RuntimeException("Stub!"); }
public static  android.opengl.ETC1Util.ETC1Texture createTexture(java.io.InputStream input) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  android.opengl.ETC1Util.ETC1Texture compressTexture(java.nio.Buffer input, int width, int height, int pixelSize, int stride) { throw new RuntimeException("Stub!"); }
public static  void writeTexture(android.opengl.ETC1Util.ETC1Texture texture, java.io.OutputStream output) throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
