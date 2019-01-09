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
public final class ScriptGroup
  extends android.renderscript.BaseObj
{
public static final class Closure
  extends android.renderscript.BaseObj
{
Closure() { throw new RuntimeException("Stub!"); }
public  void destroy() { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public  android.renderscript.ScriptGroup.Future getReturn() { throw new RuntimeException("Stub!"); }
public  android.renderscript.ScriptGroup.Future getGlobal(android.renderscript.Script.FieldID field) { throw new RuntimeException("Stub!"); }
}
public static final class Future
{
Future() { throw new RuntimeException("Stub!"); }
}
public static final class Input
{
Input() { throw new RuntimeException("Stub!"); }
}
@Deprecated
public static final class Builder
{
public  Builder(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public  android.renderscript.ScriptGroup.Builder addKernel(android.renderscript.Script.KernelID k) { throw new RuntimeException("Stub!"); }
public  android.renderscript.ScriptGroup.Builder addConnection(android.renderscript.Type t, android.renderscript.Script.KernelID from, android.renderscript.Script.FieldID to) { throw new RuntimeException("Stub!"); }
public  android.renderscript.ScriptGroup.Builder addConnection(android.renderscript.Type t, android.renderscript.Script.KernelID from, android.renderscript.Script.KernelID to) { throw new RuntimeException("Stub!"); }
public  android.renderscript.ScriptGroup create() { throw new RuntimeException("Stub!"); }
}
public static final class Binding
{
public  Binding(android.renderscript.Script.FieldID field, java.lang.Object value) { throw new RuntimeException("Stub!"); }
}
public static final class Builder2
{
public  Builder2(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public  android.renderscript.ScriptGroup.Input addInput() { throw new RuntimeException("Stub!"); }
public  android.renderscript.ScriptGroup.Closure addKernel(android.renderscript.Script.KernelID k, android.renderscript.Type returnType, java.lang.Object... argsAndBindings) { throw new RuntimeException("Stub!"); }
public  android.renderscript.ScriptGroup.Closure addInvoke(android.renderscript.Script.InvokeID invoke, java.lang.Object... argsAndBindings) { throw new RuntimeException("Stub!"); }
public  android.renderscript.ScriptGroup create(java.lang.String name, android.renderscript.ScriptGroup.Future... outputs) { throw new RuntimeException("Stub!"); }
}
ScriptGroup() { throw new RuntimeException("Stub!"); }
public  java.lang.Object[] execute(java.lang.Object... inputs) { throw new RuntimeException("Stub!"); }
@Deprecated
public  void setInput(android.renderscript.Script.KernelID s, android.renderscript.Allocation a) { throw new RuntimeException("Stub!"); }
@Deprecated
public  void setOutput(android.renderscript.Script.KernelID s, android.renderscript.Allocation a) { throw new RuntimeException("Stub!"); }
@Deprecated
public  void execute() { throw new RuntimeException("Stub!"); }
public  void destroy() { throw new RuntimeException("Stub!"); }
}
