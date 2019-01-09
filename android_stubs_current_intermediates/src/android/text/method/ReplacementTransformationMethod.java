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

package android.text.method;
public abstract class ReplacementTransformationMethod
  implements android.text.method.TransformationMethod
{
public  ReplacementTransformationMethod() { throw new RuntimeException("Stub!"); }
protected abstract  char[] getOriginal();
protected abstract  char[] getReplacement();
public  java.lang.CharSequence getTransformation(java.lang.CharSequence source, android.view.View v) { throw new RuntimeException("Stub!"); }
public  void onFocusChanged(android.view.View view, java.lang.CharSequence sourceText, boolean focused, int direction, android.graphics.Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
}
