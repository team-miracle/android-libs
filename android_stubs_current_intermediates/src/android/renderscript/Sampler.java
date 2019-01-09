/*
* Copyright (C) 2008 The Android Open Source Project
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
public class Sampler
  extends android.renderscript.BaseObj
{
public static enum Value
{
CLAMP(),
LINEAR(),
LINEAR_MIP_LINEAR(),
LINEAR_MIP_NEAREST(),
MIRRORED_REPEAT(),
NEAREST(),
WRAP();
}
public static class Builder
{
public  Builder(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public  void setMinification(android.renderscript.Sampler.Value v) { throw new RuntimeException("Stub!"); }
public  void setMagnification(android.renderscript.Sampler.Value v) { throw new RuntimeException("Stub!"); }
public  void setWrapS(android.renderscript.Sampler.Value v) { throw new RuntimeException("Stub!"); }
public  void setWrapT(android.renderscript.Sampler.Value v) { throw new RuntimeException("Stub!"); }
public  void setAnisotropy(float v) { throw new RuntimeException("Stub!"); }
public  android.renderscript.Sampler create() { throw new RuntimeException("Stub!"); }
}
Sampler() { throw new RuntimeException("Stub!"); }
public  android.renderscript.Sampler.Value getMinification() { throw new RuntimeException("Stub!"); }
public  android.renderscript.Sampler.Value getMagnification() { throw new RuntimeException("Stub!"); }
public  android.renderscript.Sampler.Value getWrapS() { throw new RuntimeException("Stub!"); }
public  android.renderscript.Sampler.Value getWrapT() { throw new RuntimeException("Stub!"); }
public  float getAnisotropy() { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Sampler CLAMP_NEAREST(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Sampler CLAMP_LINEAR(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Sampler CLAMP_LINEAR_MIP_LINEAR(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Sampler WRAP_NEAREST(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Sampler WRAP_LINEAR(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Sampler WRAP_LINEAR_MIP_LINEAR(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Sampler MIRRORED_REPEAT_NEAREST(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Sampler MIRRORED_REPEAT_LINEAR(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Sampler MIRRORED_REPEAT_LINEAR_MIP_LINEAR(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
}
