/*
* Copyright (C) 2010 The Android Open Source Project
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

package android.webkit;
public class FindActionModeCallback
  implements android.view.ActionMode.Callback, android.text.TextWatcher, android.view.View.OnClickListener, android.webkit.WebView.FindListener
{
public static class NoAction
  implements android.view.ActionMode.Callback
{
public  NoAction() { throw new RuntimeException("Stub!"); }
public  boolean onCreateActionMode(android.view.ActionMode mode, android.view.Menu menu) { throw new RuntimeException("Stub!"); }
public  boolean onPrepareActionMode(android.view.ActionMode mode, android.view.Menu menu) { throw new RuntimeException("Stub!"); }
public  boolean onActionItemClicked(android.view.ActionMode mode, android.view.MenuItem item) { throw new RuntimeException("Stub!"); }
public  void onDestroyActionMode(android.view.ActionMode mode) { throw new RuntimeException("Stub!"); }
}
public  FindActionModeCallback(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  void finish() { throw new RuntimeException("Stub!"); }
public  void setText(java.lang.String text) { throw new RuntimeException("Stub!"); }
public  void setWebView(android.webkit.WebView webView) { throw new RuntimeException("Stub!"); }
public  void onFindResultReceived(int activeMatchOrdinal, int numberOfMatches, boolean isDoneCounting) { throw new RuntimeException("Stub!"); }
public  void findAll() { throw new RuntimeException("Stub!"); }
public  void showSoftInput() { throw new RuntimeException("Stub!"); }
public  void updateMatchCount(int matchIndex, int matchCount, boolean isEmptyFind) { throw new RuntimeException("Stub!"); }
public  void onClick(android.view.View v) { throw new RuntimeException("Stub!"); }
public  boolean onCreateActionMode(android.view.ActionMode mode, android.view.Menu menu) { throw new RuntimeException("Stub!"); }
public  void onDestroyActionMode(android.view.ActionMode mode) { throw new RuntimeException("Stub!"); }
public  boolean onPrepareActionMode(android.view.ActionMode mode, android.view.Menu menu) { throw new RuntimeException("Stub!"); }
public  boolean onActionItemClicked(android.view.ActionMode mode, android.view.MenuItem item) { throw new RuntimeException("Stub!"); }
public  void beforeTextChanged(java.lang.CharSequence s, int start, int count, int after) { throw new RuntimeException("Stub!"); }
public  void onTextChanged(java.lang.CharSequence s, int start, int before, int count) { throw new RuntimeException("Stub!"); }
public  void afterTextChanged(android.text.Editable s) { throw new RuntimeException("Stub!"); }
public  int getActionModeGlobalBottom() { throw new RuntimeException("Stub!"); }
}
