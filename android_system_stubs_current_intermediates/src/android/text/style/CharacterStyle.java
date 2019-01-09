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

package android.text.style;
public abstract class CharacterStyle
{
public  CharacterStyle() { throw new RuntimeException("Stub!"); }
public abstract  void updateDrawState(android.text.TextPaint tp);
public static  android.text.style.CharacterStyle wrap(android.text.style.CharacterStyle cs) { throw new RuntimeException("Stub!"); }
public  android.text.style.CharacterStyle getUnderlying() { throw new RuntimeException("Stub!"); }
}
