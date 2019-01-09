/*
* Copyright (C) 2013 The Android Open Source Project
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

package android.renderscript;
public class Type
  extends android.renderscript.BaseObj
{
public static enum CubemapFace
{
NEGATIVE_X(),
NEGATIVE_Y(),
NEGATIVE_Z(),
POSITIVE_X(),
POSITIVE_Y(),
POSITIVE_Z(),
@java.lang.Deprecated()
POSITVE_X(),
@java.lang.Deprecated()
POSITVE_Y(),
@java.lang.Deprecated()
POSITVE_Z();
}
public static class Builder
{
public  Builder(android.renderscript.RenderScript rs, android.renderscript.Element e) { throw new RuntimeException("Stub!"); }
public  android.renderscript.Type.Builder setX(int value) { throw new RuntimeException("Stub!"); }
public  android.renderscript.Type.Builder setY(int value) { throw new RuntimeException("Stub!"); }
public  android.renderscript.Type.Builder setZ(int value) { throw new RuntimeException("Stub!"); }
public  android.renderscript.Type.Builder setMipmaps(boolean value) { throw new RuntimeException("Stub!"); }
public  android.renderscript.Type.Builder setFaces(boolean value) { throw new RuntimeException("Stub!"); }
public  android.renderscript.Type.Builder setYuvFormat(int yuvFormat) { throw new RuntimeException("Stub!"); }
public  android.renderscript.Type create() { throw new RuntimeException("Stub!"); }
}
Type() { throw new RuntimeException("Stub!"); }
public  android.renderscript.Element getElement() { throw new RuntimeException("Stub!"); }
public  int getX() { throw new RuntimeException("Stub!"); }
public  int getY() { throw new RuntimeException("Stub!"); }
public  int getZ() { throw new RuntimeException("Stub!"); }
public  int getYuv() { throw new RuntimeException("Stub!"); }
public  boolean hasMipmaps() { throw new RuntimeException("Stub!"); }
public  boolean hasFaces() { throw new RuntimeException("Stub!"); }
public  int getCount() { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Type createX(android.renderscript.RenderScript rs, android.renderscript.Element e, int dimX) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Type createXY(android.renderscript.RenderScript rs, android.renderscript.Element e, int dimX, int dimY) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Type createXYZ(android.renderscript.RenderScript rs, android.renderscript.Element e, int dimX, int dimY, int dimZ) { throw new RuntimeException("Stub!"); }
}
