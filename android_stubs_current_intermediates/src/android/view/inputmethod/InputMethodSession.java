/*
* Copyright (C) 2007-2008 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License"); you may not
* use this file except in compliance with the License. You may obtain a copy of
* the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
* WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
* License for the specific language governing permissions and limitations under
* the License.
*/

package android.view.inputmethod;
public interface InputMethodSession
{
public static interface EventCallback
{
public abstract  void finishedEvent(int seq, boolean handled);
}
public abstract  void finishInput();
public abstract  void updateSelection(int oldSelStart, int oldSelEnd, int newSelStart, int newSelEnd, int candidatesStart, int candidatesEnd);
public abstract  void viewClicked(boolean focusChanged);
public abstract  void updateCursor(android.graphics.Rect newCursor);
public abstract  void displayCompletions(android.view.inputmethod.CompletionInfo[] completions);
public abstract  void updateExtractedText(int token, android.view.inputmethod.ExtractedText text);
public abstract  void dispatchKeyEvent(int seq, android.view.KeyEvent event, android.view.inputmethod.InputMethodSession.EventCallback callback);
public abstract  void dispatchTrackballEvent(int seq, android.view.MotionEvent event, android.view.inputmethod.InputMethodSession.EventCallback callback);
public abstract  void dispatchGenericMotionEvent(int seq, android.view.MotionEvent event, android.view.inputmethod.InputMethodSession.EventCallback callback);
public abstract  void appPrivateCommand(java.lang.String action, android.os.Bundle data);
public abstract  void toggleSoftInput(int showFlags, int hideFlags);
public abstract  void updateCursorAnchorInfo(android.view.inputmethod.CursorAnchorInfo cursorAnchorInfo);
}
