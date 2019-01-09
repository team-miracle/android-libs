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

package android.graphics;
public class Typeface
{
public static final class Builder
{
public  Builder(java.io.File path) { throw new RuntimeException("Stub!"); }
public  Builder(java.io.FileDescriptor fd) { throw new RuntimeException("Stub!"); }
public  Builder(java.lang.String path) { throw new RuntimeException("Stub!"); }
public  Builder(android.content.res.AssetManager assetManager, java.lang.String path) { throw new RuntimeException("Stub!"); }
public  android.graphics.Typeface.Builder setWeight(int weight) { throw new RuntimeException("Stub!"); }
public  android.graphics.Typeface.Builder setItalic(boolean italic) { throw new RuntimeException("Stub!"); }
public  android.graphics.Typeface.Builder setTtcIndex(int ttcIndex) { throw new RuntimeException("Stub!"); }
public  android.graphics.Typeface.Builder setFontVariationSettings(java.lang.String variationSettings) { throw new RuntimeException("Stub!"); }
public  android.graphics.Typeface.Builder setFontVariationSettings(android.graphics.fonts.FontVariationAxis[] axes) { throw new RuntimeException("Stub!"); }
public  android.graphics.Typeface.Builder setFallback(java.lang.String familyName) { throw new RuntimeException("Stub!"); }
public  android.graphics.Typeface build() { throw new RuntimeException("Stub!"); }
}
Typeface() { throw new RuntimeException("Stub!"); }
public  int getWeight() { throw new RuntimeException("Stub!"); }
public  int getStyle() { throw new RuntimeException("Stub!"); }
public final  boolean isBold() { throw new RuntimeException("Stub!"); }
public final  boolean isItalic() { throw new RuntimeException("Stub!"); }
public static  android.graphics.Typeface create(java.lang.String familyName, int style) { throw new RuntimeException("Stub!"); }
public static  android.graphics.Typeface create(android.graphics.Typeface family, int style) { throw new RuntimeException("Stub!"); }
public static  android.graphics.Typeface create(android.graphics.Typeface family, int weight, boolean italic) { throw new RuntimeException("Stub!"); }
public static  android.graphics.Typeface defaultFromStyle(int style) { throw new RuntimeException("Stub!"); }
public static  android.graphics.Typeface createFromAsset(android.content.res.AssetManager mgr, java.lang.String path) { throw new RuntimeException("Stub!"); }
public static  android.graphics.Typeface createFromFile(java.io.File file) { throw new RuntimeException("Stub!"); }
public static  android.graphics.Typeface createFromFile(java.lang.String path) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public static final int BOLD = 1;
public static final int BOLD_ITALIC = 3;
public static final android.graphics.Typeface DEFAULT;
public static final android.graphics.Typeface DEFAULT_BOLD;
public static final int ITALIC = 2;
public static final android.graphics.Typeface MONOSPACE;
public static final int NORMAL = 0;
public static final android.graphics.Typeface SANS_SERIF;
public static final android.graphics.Typeface SERIF;
static { DEFAULT = null; DEFAULT_BOLD = null; MONOSPACE = null; SANS_SERIF = null; SERIF = null; }
}
