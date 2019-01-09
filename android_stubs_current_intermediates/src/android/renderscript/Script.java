/*
* Copyright (C) 2008-2012 The Android Open Source Project
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
public class Script
  extends android.renderscript.BaseObj
{
public static final class KernelID
  extends android.renderscript.BaseObj
{
KernelID() { throw new RuntimeException("Stub!"); }
}
public static final class InvokeID
  extends android.renderscript.BaseObj
{
InvokeID() { throw new RuntimeException("Stub!"); }
}
public static final class FieldID
  extends android.renderscript.BaseObj
{
FieldID() { throw new RuntimeException("Stub!"); }
}
public static class Builder
{
Builder() { throw new RuntimeException("Stub!"); }
}
public static class FieldBase
{
protected  FieldBase() { throw new RuntimeException("Stub!"); }
protected  void init(android.renderscript.RenderScript rs, int dimx) { throw new RuntimeException("Stub!"); }
protected  void init(android.renderscript.RenderScript rs, int dimx, int usages) { throw new RuntimeException("Stub!"); }
public  android.renderscript.Element getElement() { throw new RuntimeException("Stub!"); }
public  android.renderscript.Type getType() { throw new RuntimeException("Stub!"); }
public  android.renderscript.Allocation getAllocation() { throw new RuntimeException("Stub!"); }
public  void updateAllocation() { throw new RuntimeException("Stub!"); }
protected android.renderscript.Allocation mAllocation;
protected android.renderscript.Element mElement;
}
public static final class LaunchOptions
{
public  LaunchOptions() { throw new RuntimeException("Stub!"); }
public  android.renderscript.Script.LaunchOptions setX(int xstartArg, int xendArg) { throw new RuntimeException("Stub!"); }
public  android.renderscript.Script.LaunchOptions setY(int ystartArg, int yendArg) { throw new RuntimeException("Stub!"); }
public  android.renderscript.Script.LaunchOptions setZ(int zstartArg, int zendArg) { throw new RuntimeException("Stub!"); }
public  int getXStart() { throw new RuntimeException("Stub!"); }
public  int getXEnd() { throw new RuntimeException("Stub!"); }
public  int getYStart() { throw new RuntimeException("Stub!"); }
public  int getYEnd() { throw new RuntimeException("Stub!"); }
public  int getZStart() { throw new RuntimeException("Stub!"); }
public  int getZEnd() { throw new RuntimeException("Stub!"); }
}
Script() { throw new RuntimeException("Stub!"); }
protected  android.renderscript.Script.KernelID createKernelID(int slot, int sig, android.renderscript.Element ein, android.renderscript.Element eout) { throw new RuntimeException("Stub!"); }
protected  android.renderscript.Script.InvokeID createInvokeID(int slot) { throw new RuntimeException("Stub!"); }
protected  android.renderscript.Script.FieldID createFieldID(int slot, android.renderscript.Element e) { throw new RuntimeException("Stub!"); }
protected  void invoke(int slot) { throw new RuntimeException("Stub!"); }
protected  void invoke(int slot, android.renderscript.FieldPacker v) { throw new RuntimeException("Stub!"); }
protected  void forEach(int slot, android.renderscript.Allocation ain, android.renderscript.Allocation aout, android.renderscript.FieldPacker v) { throw new RuntimeException("Stub!"); }
protected  void forEach(int slot, android.renderscript.Allocation ain, android.renderscript.Allocation aout, android.renderscript.FieldPacker v, android.renderscript.Script.LaunchOptions sc) { throw new RuntimeException("Stub!"); }
protected  void forEach(int slot, android.renderscript.Allocation[] ains, android.renderscript.Allocation aout, android.renderscript.FieldPacker v) { throw new RuntimeException("Stub!"); }
protected  void forEach(int slot, android.renderscript.Allocation[] ains, android.renderscript.Allocation aout, android.renderscript.FieldPacker v, android.renderscript.Script.LaunchOptions sc) { throw new RuntimeException("Stub!"); }
protected  void reduce(int slot, android.renderscript.Allocation[] ains, android.renderscript.Allocation aout, android.renderscript.Script.LaunchOptions sc) { throw new RuntimeException("Stub!"); }
public  void bindAllocation(android.renderscript.Allocation va, int slot) { throw new RuntimeException("Stub!"); }
public  void setVar(int index, float v) { throw new RuntimeException("Stub!"); }
public  float getVarF(int index) { throw new RuntimeException("Stub!"); }
public  void setVar(int index, double v) { throw new RuntimeException("Stub!"); }
public  double getVarD(int index) { throw new RuntimeException("Stub!"); }
public  void setVar(int index, int v) { throw new RuntimeException("Stub!"); }
public  int getVarI(int index) { throw new RuntimeException("Stub!"); }
public  void setVar(int index, long v) { throw new RuntimeException("Stub!"); }
public  long getVarJ(int index) { throw new RuntimeException("Stub!"); }
public  void setVar(int index, boolean v) { throw new RuntimeException("Stub!"); }
public  boolean getVarB(int index) { throw new RuntimeException("Stub!"); }
public  void setVar(int index, android.renderscript.BaseObj o) { throw new RuntimeException("Stub!"); }
public  void setVar(int index, android.renderscript.FieldPacker v) { throw new RuntimeException("Stub!"); }
public  void setVar(int index, android.renderscript.FieldPacker v, android.renderscript.Element e, int[] dims) { throw new RuntimeException("Stub!"); }
public  void getVarV(int index, android.renderscript.FieldPacker v) { throw new RuntimeException("Stub!"); }
public  void setTimeZone(java.lang.String timeZone) { throw new RuntimeException("Stub!"); }
}
