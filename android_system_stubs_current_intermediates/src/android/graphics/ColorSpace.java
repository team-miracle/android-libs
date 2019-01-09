/*
* Copyright (C) 2016 The Android Open Source Project
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
@java.lang.SuppressWarnings(value={"StaticInitializerReferencesSubClass"})
public abstract class ColorSpace
{
public static enum Named
{
ACES(),
ACESCG(),
ADOBE_RGB(),
BT2020(),
BT709(),
CIE_LAB(),
CIE_XYZ(),
DCI_P3(),
DISPLAY_P3(),
EXTENDED_SRGB(),
LINEAR_EXTENDED_SRGB(),
LINEAR_SRGB(),
NTSC_1953(),
PRO_PHOTO_RGB(),
SMPTE_C(),
SRGB();
}
public static enum RenderIntent
{
ABSOLUTE(),
PERCEPTUAL(),
RELATIVE(),
SATURATION();
}
public static enum Adaptation
{
BRADFORD(),
CIECAT02(),
VON_KRIES();
}
public static enum Model
{
CMYK(),
LAB(),
RGB(),
XYZ();
public  int getComponentCount() { throw new RuntimeException("Stub!"); }
}
public static class Rgb
  extends android.graphics.ColorSpace
{
public static class TransferParameters
{
public  TransferParameters(double a, double b, double c, double d, double g) { throw new RuntimeException("Stub!"); }
public  TransferParameters(double a, double b, double c, double d, double e, double f, double g) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"SimplifiableIfStatement"})
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public final double a;
public final double b;
public final double c;
public final double d;
public final double e;
public final double f;
public final double g;
}
public  Rgb(java.lang.String name, float[] toXYZ, java.util.function.DoubleUnaryOperator oetf, java.util.function.DoubleUnaryOperator eotf) { throw new RuntimeException("Stub!"); }
public  Rgb(java.lang.String name, float[] primaries, float[] whitePoint, java.util.function.DoubleUnaryOperator oetf, java.util.function.DoubleUnaryOperator eotf, float min, float max) { throw new RuntimeException("Stub!"); }
public  Rgb(java.lang.String name, float[] toXYZ, android.graphics.ColorSpace.Rgb.TransferParameters function) { throw new RuntimeException("Stub!"); }
public  Rgb(java.lang.String name, float[] primaries, float[] whitePoint, android.graphics.ColorSpace.Rgb.TransferParameters function) { throw new RuntimeException("Stub!"); }
public  Rgb(java.lang.String name, float[] toXYZ, double gamma) { throw new RuntimeException("Stub!"); }
public  Rgb(java.lang.String name, float[] primaries, float[] whitePoint, double gamma) { throw new RuntimeException("Stub!"); }
public  float[] getWhitePoint(float[] whitePoint) { throw new RuntimeException("Stub!"); }
public  float[] getWhitePoint() { throw new RuntimeException("Stub!"); }
public  float[] getPrimaries(float[] primaries) { throw new RuntimeException("Stub!"); }
public  float[] getPrimaries() { throw new RuntimeException("Stub!"); }
public  float[] getTransform(float[] transform) { throw new RuntimeException("Stub!"); }
public  float[] getTransform() { throw new RuntimeException("Stub!"); }
public  float[] getInverseTransform(float[] inverseTransform) { throw new RuntimeException("Stub!"); }
public  float[] getInverseTransform() { throw new RuntimeException("Stub!"); }
public  java.util.function.DoubleUnaryOperator getOetf() { throw new RuntimeException("Stub!"); }
public  java.util.function.DoubleUnaryOperator getEotf() { throw new RuntimeException("Stub!"); }
public  android.graphics.ColorSpace.Rgb.TransferParameters getTransferParameters() { throw new RuntimeException("Stub!"); }
public  boolean isSrgb() { throw new RuntimeException("Stub!"); }
public  boolean isWideGamut() { throw new RuntimeException("Stub!"); }
public  float getMinValue(int component) { throw new RuntimeException("Stub!"); }
public  float getMaxValue(int component) { throw new RuntimeException("Stub!"); }
public  float[] toLinear(float r, float g, float b) { throw new RuntimeException("Stub!"); }
public  float[] toLinear(float[] v) { throw new RuntimeException("Stub!"); }
public  float[] fromLinear(float r, float g, float b) { throw new RuntimeException("Stub!"); }
public  float[] fromLinear(float[] v) { throw new RuntimeException("Stub!"); }
public  float[] toXyz(float[] v) { throw new RuntimeException("Stub!"); }
public  float[] fromXyz(float[] v) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
}
public static class Connector
{
Connector() { throw new RuntimeException("Stub!"); }
public  android.graphics.ColorSpace getSource() { throw new RuntimeException("Stub!"); }
public  android.graphics.ColorSpace getDestination() { throw new RuntimeException("Stub!"); }
public  android.graphics.ColorSpace.RenderIntent getRenderIntent() { throw new RuntimeException("Stub!"); }
public  float[] transform(float r, float g, float b) { throw new RuntimeException("Stub!"); }
public  float[] transform(float[] v) { throw new RuntimeException("Stub!"); }
}
ColorSpace() { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  int getId() { throw new RuntimeException("Stub!"); }
public  android.graphics.ColorSpace.Model getModel() { throw new RuntimeException("Stub!"); }
public  int getComponentCount() { throw new RuntimeException("Stub!"); }
public abstract  boolean isWideGamut();
public  boolean isSrgb() { throw new RuntimeException("Stub!"); }
public abstract  float getMinValue(int component);
public abstract  float getMaxValue(int component);
public  float[] toXyz(float r, float g, float b) { throw new RuntimeException("Stub!"); }
public abstract  float[] toXyz(float[] v);
public  float[] fromXyz(float x, float y, float z) { throw new RuntimeException("Stub!"); }
public abstract  float[] fromXyz(float[] v);
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public static  android.graphics.ColorSpace.Connector connect(android.graphics.ColorSpace source, android.graphics.ColorSpace destination) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"ConstantConditions"})
public static  android.graphics.ColorSpace.Connector connect(android.graphics.ColorSpace source, android.graphics.ColorSpace destination, android.graphics.ColorSpace.RenderIntent intent) { throw new RuntimeException("Stub!"); }
public static  android.graphics.ColorSpace.Connector connect(android.graphics.ColorSpace source) { throw new RuntimeException("Stub!"); }
public static  android.graphics.ColorSpace.Connector connect(android.graphics.ColorSpace source, android.graphics.ColorSpace.RenderIntent intent) { throw new RuntimeException("Stub!"); }
public static  android.graphics.ColorSpace adapt(android.graphics.ColorSpace colorSpace, float[] whitePoint) { throw new RuntimeException("Stub!"); }
public static  android.graphics.ColorSpace adapt(android.graphics.ColorSpace colorSpace, float[] whitePoint, android.graphics.ColorSpace.Adaptation adaptation) { throw new RuntimeException("Stub!"); }
public static  android.graphics.ColorSpace get(android.graphics.ColorSpace.Named name) { throw new RuntimeException("Stub!"); }
public static  android.graphics.ColorSpace match(float[] toXYZD50, android.graphics.ColorSpace.Rgb.TransferParameters function) { throw new RuntimeException("Stub!"); }
public static final float[] ILLUMINANT_A = null;
public static final float[] ILLUMINANT_B = null;
public static final float[] ILLUMINANT_C = null;
public static final float[] ILLUMINANT_D50 = null;
public static final float[] ILLUMINANT_D55 = null;
public static final float[] ILLUMINANT_D60 = null;
public static final float[] ILLUMINANT_D65 = null;
public static final float[] ILLUMINANT_D75 = null;
public static final float[] ILLUMINANT_E = null;
public static final int MAX_ID = 63;
public static final int MIN_ID = -1;
}
