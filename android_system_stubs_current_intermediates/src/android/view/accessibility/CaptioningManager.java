/*
* Copyright (C) 2013 The Android Open Source Project
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

package android.view.accessibility;
public class CaptioningManager
{
public static final class CaptionStyle
{
CaptionStyle() { throw new RuntimeException("Stub!"); }
public  boolean hasBackgroundColor() { throw new RuntimeException("Stub!"); }
public  boolean hasForegroundColor() { throw new RuntimeException("Stub!"); }
public  boolean hasEdgeType() { throw new RuntimeException("Stub!"); }
public  boolean hasEdgeColor() { throw new RuntimeException("Stub!"); }
public  boolean hasWindowColor() { throw new RuntimeException("Stub!"); }
public  android.graphics.Typeface getTypeface() { throw new RuntimeException("Stub!"); }
public static final int EDGE_TYPE_DEPRESSED = 4;
public static final int EDGE_TYPE_DROP_SHADOW = 2;
public static final int EDGE_TYPE_NONE = 0;
public static final int EDGE_TYPE_OUTLINE = 1;
public static final int EDGE_TYPE_RAISED = 3;
public static final int EDGE_TYPE_UNSPECIFIED = -1;
public final int backgroundColor;
public final int edgeColor;
public final int edgeType;
public final int foregroundColor;
public final int windowColor;
}
public abstract static class CaptioningChangeListener
{
public  CaptioningChangeListener() { throw new RuntimeException("Stub!"); }
public  void onEnabledChanged(boolean enabled) { throw new RuntimeException("Stub!"); }
public  void onUserStyleChanged(android.view.accessibility.CaptioningManager.CaptionStyle userStyle) { throw new RuntimeException("Stub!"); }
public  void onLocaleChanged(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  void onFontScaleChanged(float fontScale) { throw new RuntimeException("Stub!"); }
}
CaptioningManager() { throw new RuntimeException("Stub!"); }
public final  boolean isEnabled() { throw new RuntimeException("Stub!"); }
public final  java.util.Locale getLocale() { throw new RuntimeException("Stub!"); }
public final  float getFontScale() { throw new RuntimeException("Stub!"); }
public  android.view.accessibility.CaptioningManager.CaptionStyle getUserStyle() { throw new RuntimeException("Stub!"); }
public  void addCaptioningChangeListener(android.view.accessibility.CaptioningManager.CaptioningChangeListener listener) { throw new RuntimeException("Stub!"); }
public  void removeCaptioningChangeListener(android.view.accessibility.CaptioningManager.CaptioningChangeListener listener) { throw new RuntimeException("Stub!"); }
}
