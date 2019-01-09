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
public abstract class MetaKeyKeyListener
{
public  MetaKeyKeyListener() { throw new RuntimeException("Stub!"); }
public static  void resetMetaState(android.text.Spannable text) { throw new RuntimeException("Stub!"); }
public static final  int getMetaState(java.lang.CharSequence text) { throw new RuntimeException("Stub!"); }
public static final  int getMetaState(java.lang.CharSequence text, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public static final  int getMetaState(java.lang.CharSequence text, int meta) { throw new RuntimeException("Stub!"); }
public static final  int getMetaState(java.lang.CharSequence text, int meta, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public static  void adjustMetaAfterKeypress(android.text.Spannable content) { throw new RuntimeException("Stub!"); }
public static  boolean isMetaTracker(java.lang.CharSequence text, java.lang.Object what) { throw new RuntimeException("Stub!"); }
public static  boolean isSelectingMetaTracker(java.lang.CharSequence text, java.lang.Object what) { throw new RuntimeException("Stub!"); }
protected static  void resetLockedMeta(android.text.Spannable content) { throw new RuntimeException("Stub!"); }
public  boolean onKeyDown(android.view.View view, android.text.Editable content, int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyUp(android.view.View view, android.text.Editable content, int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  void clearMetaKeyState(android.view.View view, android.text.Editable content, int states) { throw new RuntimeException("Stub!"); }
public static  void clearMetaKeyState(android.text.Editable content, int states) { throw new RuntimeException("Stub!"); }
public static  long resetLockedMeta(long state) { throw new RuntimeException("Stub!"); }
public static final  int getMetaState(long state) { throw new RuntimeException("Stub!"); }
public static final  int getMetaState(long state, int meta) { throw new RuntimeException("Stub!"); }
public static  long adjustMetaAfterKeypress(long state) { throw new RuntimeException("Stub!"); }
public static  long handleKeyDown(long state, int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public static  long handleKeyUp(long state, int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  long clearMetaKeyState(long state, int which) { throw new RuntimeException("Stub!"); }
public static final int META_ALT_LOCKED = 512;
public static final int META_ALT_ON = 2;
public static final int META_CAP_LOCKED = 256;
public static final int META_SHIFT_ON = 1;
public static final int META_SYM_LOCKED = 1024;
public static final int META_SYM_ON = 4;
}
