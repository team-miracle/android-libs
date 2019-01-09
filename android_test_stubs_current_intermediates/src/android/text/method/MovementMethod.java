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
public interface MovementMethod
{
public abstract  void initialize(android.widget.TextView widget, android.text.Spannable text);
public abstract  boolean onKeyDown(android.widget.TextView widget, android.text.Spannable text, int keyCode, android.view.KeyEvent event);
public abstract  boolean onKeyUp(android.widget.TextView widget, android.text.Spannable text, int keyCode, android.view.KeyEvent event);
public abstract  boolean onKeyOther(android.widget.TextView view, android.text.Spannable text, android.view.KeyEvent event);
public abstract  void onTakeFocus(android.widget.TextView widget, android.text.Spannable text, int direction);
public abstract  boolean onTrackballEvent(android.widget.TextView widget, android.text.Spannable text, android.view.MotionEvent event);
public abstract  boolean onTouchEvent(android.widget.TextView widget, android.text.Spannable text, android.view.MotionEvent event);
public abstract  boolean onGenericMotionEvent(android.widget.TextView widget, android.text.Spannable text, android.view.MotionEvent event);
public abstract  boolean canSelectArbitrarily();
}
