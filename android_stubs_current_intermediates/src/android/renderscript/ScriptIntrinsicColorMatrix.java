/*
* Copyright (C) 2012 The Android Open Source Project
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
public final class ScriptIntrinsicColorMatrix
  extends android.renderscript.ScriptIntrinsic
{
ScriptIntrinsicColorMatrix() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  android.renderscript.ScriptIntrinsicColorMatrix create(android.renderscript.RenderScript rs, android.renderscript.Element e) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.ScriptIntrinsicColorMatrix create(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public  void setColorMatrix(android.renderscript.Matrix4f m) { throw new RuntimeException("Stub!"); }
public  void setColorMatrix(android.renderscript.Matrix3f m) { throw new RuntimeException("Stub!"); }
public  void setAdd(android.renderscript.Float4 f) { throw new RuntimeException("Stub!"); }
public  void setAdd(float r, float g, float b, float a) { throw new RuntimeException("Stub!"); }
public  void setGreyscale() { throw new RuntimeException("Stub!"); }
public  void setYUVtoRGB() { throw new RuntimeException("Stub!"); }
public  void setRGBtoYUV() { throw new RuntimeException("Stub!"); }
public  void forEach(android.renderscript.Allocation ain, android.renderscript.Allocation aout) { throw new RuntimeException("Stub!"); }
public  void forEach(android.renderscript.Allocation ain, android.renderscript.Allocation aout, android.renderscript.Script.LaunchOptions opt) { throw new RuntimeException("Stub!"); }
public  android.renderscript.Script.KernelID getKernelID() { throw new RuntimeException("Stub!"); }
}
