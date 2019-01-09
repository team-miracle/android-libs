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
public interface KeyListener
{
public abstract  int getInputType();
public abstract  boolean onKeyDown(android.view.View view, android.text.Editable text, int keyCode, android.view.KeyEvent event);
public abstract  boolean onKeyUp(android.view.View view, android.text.Editable text, int keyCode, android.view.KeyEvent event);
public abstract  boolean onKeyOther(android.view.View view, android.text.Editable text, android.view.KeyEvent event);
public abstract  void clearMetaKeyState(android.view.View view, android.text.Editable content, int states);
}
