/*
* Copyright (C) 2008-2009 Google Inc.
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

package android.inputmethodservice;
public class Keyboard
{
public static class Row
{
public  Row(android.inputmethodservice.Keyboard parent) { throw new RuntimeException("Stub!"); }
public  Row(android.content.res.Resources res, android.inputmethodservice.Keyboard parent, android.content.res.XmlResourceParser parser) { throw new RuntimeException("Stub!"); }
public int defaultHeight;
public int defaultHorizontalGap;
public int defaultWidth;
public int mode;
public int rowEdgeFlags;
public int verticalGap;
}
public static class Key
{
public  Key(android.inputmethodservice.Keyboard.Row parent) { throw new RuntimeException("Stub!"); }
public  Key(android.content.res.Resources res, android.inputmethodservice.Keyboard.Row parent, int x, int y, android.content.res.XmlResourceParser parser) { throw new RuntimeException("Stub!"); }
public  void onPressed() { throw new RuntimeException("Stub!"); }
public  void onReleased(boolean inside) { throw new RuntimeException("Stub!"); }
public  boolean isInside(int x, int y) { throw new RuntimeException("Stub!"); }
public  int squaredDistanceFrom(int x, int y) { throw new RuntimeException("Stub!"); }
public  int[] getCurrentDrawableState() { throw new RuntimeException("Stub!"); }
public int[] codes = null;
public int edgeFlags;
public int gap;
public int height;
public android.graphics.drawable.Drawable icon;
public android.graphics.drawable.Drawable iconPreview;
public java.lang.CharSequence label;
public boolean modifier;
public boolean on;
public java.lang.CharSequence popupCharacters;
public int popupResId;
public boolean pressed;
public boolean repeatable;
public boolean sticky;
public java.lang.CharSequence text;
public int width;
public int x;
public int y;
}
public  Keyboard(android.content.Context context, int xmlLayoutResId) { throw new RuntimeException("Stub!"); }
public  Keyboard(android.content.Context context, int xmlLayoutResId, int modeId, int width, int height) { throw new RuntimeException("Stub!"); }
public  Keyboard(android.content.Context context, int xmlLayoutResId, int modeId) { throw new RuntimeException("Stub!"); }
public  Keyboard(android.content.Context context, int layoutTemplateResId, java.lang.CharSequence characters, int columns, int horizontalPadding) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.inputmethodservice.Keyboard.Key> getKeys() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.inputmethodservice.Keyboard.Key> getModifierKeys() { throw new RuntimeException("Stub!"); }
protected  int getHorizontalGap() { throw new RuntimeException("Stub!"); }
protected  void setHorizontalGap(int gap) { throw new RuntimeException("Stub!"); }
protected  int getVerticalGap() { throw new RuntimeException("Stub!"); }
protected  void setVerticalGap(int gap) { throw new RuntimeException("Stub!"); }
protected  int getKeyHeight() { throw new RuntimeException("Stub!"); }
protected  void setKeyHeight(int height) { throw new RuntimeException("Stub!"); }
protected  int getKeyWidth() { throw new RuntimeException("Stub!"); }
protected  void setKeyWidth(int width) { throw new RuntimeException("Stub!"); }
public  int getHeight() { throw new RuntimeException("Stub!"); }
public  int getMinWidth() { throw new RuntimeException("Stub!"); }
public  boolean setShifted(boolean shiftState) { throw new RuntimeException("Stub!"); }
public  boolean isShifted() { throw new RuntimeException("Stub!"); }
public  int getShiftKeyIndex() { throw new RuntimeException("Stub!"); }
public  int[] getNearestKeys(int x, int y) { throw new RuntimeException("Stub!"); }
protected  android.inputmethodservice.Keyboard.Row createRowFromXml(android.content.res.Resources res, android.content.res.XmlResourceParser parser) { throw new RuntimeException("Stub!"); }
protected  android.inputmethodservice.Keyboard.Key createKeyFromXml(android.content.res.Resources res, android.inputmethodservice.Keyboard.Row parent, int x, int y, android.content.res.XmlResourceParser parser) { throw new RuntimeException("Stub!"); }
public static final int EDGE_BOTTOM = 8;
public static final int EDGE_LEFT = 1;
public static final int EDGE_RIGHT = 2;
public static final int EDGE_TOP = 4;
public static final int KEYCODE_ALT = -6;
public static final int KEYCODE_CANCEL = -3;
public static final int KEYCODE_DELETE = -5;
public static final int KEYCODE_DONE = -4;
public static final int KEYCODE_MODE_CHANGE = -2;
public static final int KEYCODE_SHIFT = -1;
}
