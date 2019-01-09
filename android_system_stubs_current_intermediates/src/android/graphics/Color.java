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
public class Color
{
public  Color() { throw new RuntimeException("Stub!"); }
public  android.graphics.ColorSpace getColorSpace() { throw new RuntimeException("Stub!"); }
public  android.graphics.ColorSpace.Model getModel() { throw new RuntimeException("Stub!"); }
public  boolean isWideGamut() { throw new RuntimeException("Stub!"); }
public  boolean isSrgb() { throw new RuntimeException("Stub!"); }
public  int getComponentCount() { throw new RuntimeException("Stub!"); }
public  long pack() { throw new RuntimeException("Stub!"); }
public  android.graphics.Color convert(android.graphics.ColorSpace colorSpace) { throw new RuntimeException("Stub!"); }
public  int toArgb() { throw new RuntimeException("Stub!"); }
public  float red() { throw new RuntimeException("Stub!"); }
public  float green() { throw new RuntimeException("Stub!"); }
public  float blue() { throw new RuntimeException("Stub!"); }
public  float alpha() { throw new RuntimeException("Stub!"); }
public  float[] getComponents() { throw new RuntimeException("Stub!"); }
public  float[] getComponents(float[] components) { throw new RuntimeException("Stub!"); }
public  float getComponent(int component) { throw new RuntimeException("Stub!"); }
public  float luminance() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static  android.graphics.ColorSpace colorSpace(long color) { throw new RuntimeException("Stub!"); }
public static  float red(long color) { throw new RuntimeException("Stub!"); }
public static  float green(long color) { throw new RuntimeException("Stub!"); }
public static  float blue(long color) { throw new RuntimeException("Stub!"); }
public static  float alpha(long color) { throw new RuntimeException("Stub!"); }
public static  boolean isSrgb(long color) { throw new RuntimeException("Stub!"); }
public static  boolean isWideGamut(long color) { throw new RuntimeException("Stub!"); }
public static  boolean isInColorSpace(long color, android.graphics.ColorSpace colorSpace) { throw new RuntimeException("Stub!"); }
public static  int toArgb(long color) { throw new RuntimeException("Stub!"); }
public static  android.graphics.Color valueOf(int color) { throw new RuntimeException("Stub!"); }
public static  android.graphics.Color valueOf(long color) { throw new RuntimeException("Stub!"); }
public static  android.graphics.Color valueOf(float r, float g, float b) { throw new RuntimeException("Stub!"); }
public static  android.graphics.Color valueOf(float r, float g, float b, float a) { throw new RuntimeException("Stub!"); }
public static  android.graphics.Color valueOf(float r, float g, float b, float a, android.graphics.ColorSpace colorSpace) { throw new RuntimeException("Stub!"); }
public static  android.graphics.Color valueOf(float[] components, android.graphics.ColorSpace colorSpace) { throw new RuntimeException("Stub!"); }
public static  long pack(int color) { throw new RuntimeException("Stub!"); }
public static  long pack(float red, float green, float blue) { throw new RuntimeException("Stub!"); }
public static  long pack(float red, float green, float blue, float alpha) { throw new RuntimeException("Stub!"); }
public static  long pack(float red, float green, float blue, float alpha, android.graphics.ColorSpace colorSpace) { throw new RuntimeException("Stub!"); }
public static  long convert(int color, android.graphics.ColorSpace colorSpace) { throw new RuntimeException("Stub!"); }
public static  long convert(long color, android.graphics.ColorSpace colorSpace) { throw new RuntimeException("Stub!"); }
public static  long convert(float r, float g, float b, float a, android.graphics.ColorSpace source, android.graphics.ColorSpace destination) { throw new RuntimeException("Stub!"); }
public static  long convert(long color, android.graphics.ColorSpace.Connector connector) { throw new RuntimeException("Stub!"); }
public static  long convert(float r, float g, float b, float a, android.graphics.ColorSpace.Connector connector) { throw new RuntimeException("Stub!"); }
public static  float luminance(long color) { throw new RuntimeException("Stub!"); }
public static  int alpha(int color) { throw new RuntimeException("Stub!"); }
public static  int red(int color) { throw new RuntimeException("Stub!"); }
public static  int green(int color) { throw new RuntimeException("Stub!"); }
public static  int blue(int color) { throw new RuntimeException("Stub!"); }
public static  int rgb(int red, int green, int blue) { throw new RuntimeException("Stub!"); }
public static  int rgb(float red, float green, float blue) { throw new RuntimeException("Stub!"); }
public static  int argb(int alpha, int red, int green, int blue) { throw new RuntimeException("Stub!"); }
public static  int argb(float alpha, float red, float green, float blue) { throw new RuntimeException("Stub!"); }
public static  float luminance(int color) { throw new RuntimeException("Stub!"); }
public static  int parseColor(java.lang.String colorString) { throw new RuntimeException("Stub!"); }
public static  void RGBToHSV(int red, int green, int blue, float[] hsv) { throw new RuntimeException("Stub!"); }
public static  void colorToHSV(int color, float[] hsv) { throw new RuntimeException("Stub!"); }
public static  int HSVToColor(float[] hsv) { throw new RuntimeException("Stub!"); }
public static  int HSVToColor(int alpha, float[] hsv) { throw new RuntimeException("Stub!"); }
public static final int BLACK = -16777216;
public static final int BLUE = -16776961;
public static final int CYAN = -16711681;
public static final int DKGRAY = -12303292;
public static final int GRAY = -7829368;
public static final int GREEN = -16711936;
public static final int LTGRAY = -3355444;
public static final int MAGENTA = -65281;
public static final int RED = -65536;
public static final int TRANSPARENT = 0;
public static final int WHITE = -1;
public static final int YELLOW = -256;
}
