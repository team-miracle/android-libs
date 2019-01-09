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

package android.text;
public class Selection
{
Selection() { throw new RuntimeException("Stub!"); }
public static final  int getSelectionStart(java.lang.CharSequence text) { throw new RuntimeException("Stub!"); }
public static final  int getSelectionEnd(java.lang.CharSequence text) { throw new RuntimeException("Stub!"); }
public static  void setSelection(android.text.Spannable text, int start, int stop) { throw new RuntimeException("Stub!"); }
public static final  void setSelection(android.text.Spannable text, int index) { throw new RuntimeException("Stub!"); }
public static final  void selectAll(android.text.Spannable text) { throw new RuntimeException("Stub!"); }
public static final  void extendSelection(android.text.Spannable text, int index) { throw new RuntimeException("Stub!"); }
public static final  void removeSelection(android.text.Spannable text) { throw new RuntimeException("Stub!"); }
public static  boolean moveUp(android.text.Spannable text, android.text.Layout layout) { throw new RuntimeException("Stub!"); }
public static  boolean moveDown(android.text.Spannable text, android.text.Layout layout) { throw new RuntimeException("Stub!"); }
public static  boolean moveLeft(android.text.Spannable text, android.text.Layout layout) { throw new RuntimeException("Stub!"); }
public static  boolean moveRight(android.text.Spannable text, android.text.Layout layout) { throw new RuntimeException("Stub!"); }
public static  boolean extendUp(android.text.Spannable text, android.text.Layout layout) { throw new RuntimeException("Stub!"); }
public static  boolean extendDown(android.text.Spannable text, android.text.Layout layout) { throw new RuntimeException("Stub!"); }
public static  boolean extendLeft(android.text.Spannable text, android.text.Layout layout) { throw new RuntimeException("Stub!"); }
public static  boolean extendRight(android.text.Spannable text, android.text.Layout layout) { throw new RuntimeException("Stub!"); }
public static  boolean extendToLeftEdge(android.text.Spannable text, android.text.Layout layout) { throw new RuntimeException("Stub!"); }
public static  boolean extendToRightEdge(android.text.Spannable text, android.text.Layout layout) { throw new RuntimeException("Stub!"); }
public static  boolean moveToLeftEdge(android.text.Spannable text, android.text.Layout layout) { throw new RuntimeException("Stub!"); }
public static  boolean moveToRightEdge(android.text.Spannable text, android.text.Layout layout) { throw new RuntimeException("Stub!"); }
public static final java.lang.Object SELECTION_END;
public static final java.lang.Object SELECTION_START;
static { SELECTION_END = null; SELECTION_START = null; }
}
