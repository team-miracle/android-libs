/*
* Copyright (C) 2007 The Android Open Source Project
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

package android.view.inputmethod;
public interface InputConnection
{
public abstract  java.lang.CharSequence getTextBeforeCursor(int n, int flags);
public abstract  java.lang.CharSequence getTextAfterCursor(int n, int flags);
public abstract  java.lang.CharSequence getSelectedText(int flags);
public abstract  int getCursorCapsMode(int reqModes);
public abstract  android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest request, int flags);
public abstract  boolean deleteSurroundingText(int beforeLength, int afterLength);
public abstract  boolean deleteSurroundingTextInCodePoints(int beforeLength, int afterLength);
public abstract  boolean setComposingText(java.lang.CharSequence text, int newCursorPosition);
public abstract  boolean setComposingRegion(int start, int end);
public abstract  boolean finishComposingText();
public abstract  boolean commitText(java.lang.CharSequence text, int newCursorPosition);
public abstract  boolean commitCompletion(android.view.inputmethod.CompletionInfo text);
public abstract  boolean commitCorrection(android.view.inputmethod.CorrectionInfo correctionInfo);
public abstract  boolean setSelection(int start, int end);
public abstract  boolean performEditorAction(int editorAction);
public abstract  boolean performContextMenuAction(int id);
public abstract  boolean beginBatchEdit();
public abstract  boolean endBatchEdit();
public abstract  boolean sendKeyEvent(android.view.KeyEvent event);
public abstract  boolean clearMetaKeyStates(int states);
public abstract  boolean reportFullscreenMode(boolean enabled);
public abstract  boolean performPrivateCommand(java.lang.String action, android.os.Bundle data);
public abstract  boolean requestCursorUpdates(int cursorUpdateMode);
public abstract  android.os.Handler getHandler();
public abstract  void closeConnection();
public abstract  boolean commitContent(android.view.inputmethod.InputContentInfo inputContentInfo, int flags, android.os.Bundle opts);
public static final int CURSOR_UPDATE_IMMEDIATE = 1;
public static final int CURSOR_UPDATE_MONITOR = 2;
public static final int GET_EXTRACTED_TEXT_MONITOR = 1;
public static final int GET_TEXT_WITH_STYLES = 1;
public static final int INPUT_CONTENT_GRANT_READ_URI_PERMISSION = 1;
}
