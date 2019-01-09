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

package android.graphics;
public class Shader
{
public static enum TileMode
{
CLAMP(),
MIRROR(),
REPEAT();
}
@java.lang.Deprecated()
public  Shader() { throw new RuntimeException("Stub!"); }
public  boolean getLocalMatrix(android.graphics.Matrix localM) { throw new RuntimeException("Stub!"); }
public  void setLocalMatrix(android.graphics.Matrix localM) { throw new RuntimeException("Stub!"); }
}
