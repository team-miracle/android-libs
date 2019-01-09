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

package android.print;
public final class PrintAttributes
  implements android.os.Parcelable
{
public static final class MediaSize
{
public  MediaSize(java.lang.String id, java.lang.String label, int widthMils, int heightMils) { throw new RuntimeException("Stub!"); }
public  java.lang.String getId() { throw new RuntimeException("Stub!"); }
public  java.lang.String getLabel(android.content.pm.PackageManager packageManager) { throw new RuntimeException("Stub!"); }
public  int getWidthMils() { throw new RuntimeException("Stub!"); }
public  int getHeightMils() { throw new RuntimeException("Stub!"); }
public  boolean isPortrait() { throw new RuntimeException("Stub!"); }
public  android.print.PrintAttributes.MediaSize asPortrait() { throw new RuntimeException("Stub!"); }
public  android.print.PrintAttributes.MediaSize asLandscape() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.print.PrintAttributes.MediaSize ISO_A0;
public static final android.print.PrintAttributes.MediaSize ISO_A1;
public static final android.print.PrintAttributes.MediaSize ISO_A10;
public static final android.print.PrintAttributes.MediaSize ISO_A2;
public static final android.print.PrintAttributes.MediaSize ISO_A3;
public static final android.print.PrintAttributes.MediaSize ISO_A4;
public static final android.print.PrintAttributes.MediaSize ISO_A5;
public static final android.print.PrintAttributes.MediaSize ISO_A6;
public static final android.print.PrintAttributes.MediaSize ISO_A7;
public static final android.print.PrintAttributes.MediaSize ISO_A8;
public static final android.print.PrintAttributes.MediaSize ISO_A9;
public static final android.print.PrintAttributes.MediaSize ISO_B0;
public static final android.print.PrintAttributes.MediaSize ISO_B1;
public static final android.print.PrintAttributes.MediaSize ISO_B10;
public static final android.print.PrintAttributes.MediaSize ISO_B2;
public static final android.print.PrintAttributes.MediaSize ISO_B3;
public static final android.print.PrintAttributes.MediaSize ISO_B4;
public static final android.print.PrintAttributes.MediaSize ISO_B5;
public static final android.print.PrintAttributes.MediaSize ISO_B6;
public static final android.print.PrintAttributes.MediaSize ISO_B7;
public static final android.print.PrintAttributes.MediaSize ISO_B8;
public static final android.print.PrintAttributes.MediaSize ISO_B9;
public static final android.print.PrintAttributes.MediaSize ISO_C0;
public static final android.print.PrintAttributes.MediaSize ISO_C1;
public static final android.print.PrintAttributes.MediaSize ISO_C10;
public static final android.print.PrintAttributes.MediaSize ISO_C2;
public static final android.print.PrintAttributes.MediaSize ISO_C3;
public static final android.print.PrintAttributes.MediaSize ISO_C4;
public static final android.print.PrintAttributes.MediaSize ISO_C5;
public static final android.print.PrintAttributes.MediaSize ISO_C6;
public static final android.print.PrintAttributes.MediaSize ISO_C7;
public static final android.print.PrintAttributes.MediaSize ISO_C8;
public static final android.print.PrintAttributes.MediaSize ISO_C9;
public static final android.print.PrintAttributes.MediaSize JIS_B0;
public static final android.print.PrintAttributes.MediaSize JIS_B1;
public static final android.print.PrintAttributes.MediaSize JIS_B10;
public static final android.print.PrintAttributes.MediaSize JIS_B2;
public static final android.print.PrintAttributes.MediaSize JIS_B3;
public static final android.print.PrintAttributes.MediaSize JIS_B4;
public static final android.print.PrintAttributes.MediaSize JIS_B5;
public static final android.print.PrintAttributes.MediaSize JIS_B6;
public static final android.print.PrintAttributes.MediaSize JIS_B7;
public static final android.print.PrintAttributes.MediaSize JIS_B8;
public static final android.print.PrintAttributes.MediaSize JIS_B9;
public static final android.print.PrintAttributes.MediaSize JIS_EXEC;
public static final android.print.PrintAttributes.MediaSize JPN_CHOU2;
public static final android.print.PrintAttributes.MediaSize JPN_CHOU3;
public static final android.print.PrintAttributes.MediaSize JPN_CHOU4;
public static final android.print.PrintAttributes.MediaSize JPN_HAGAKI;
public static final android.print.PrintAttributes.MediaSize JPN_KAHU;
public static final android.print.PrintAttributes.MediaSize JPN_KAKU2;
public static final android.print.PrintAttributes.MediaSize JPN_OUFUKU;
public static final android.print.PrintAttributes.MediaSize JPN_YOU4;
public static final android.print.PrintAttributes.MediaSize NA_FOOLSCAP;
public static final android.print.PrintAttributes.MediaSize NA_GOVT_LETTER;
public static final android.print.PrintAttributes.MediaSize NA_INDEX_3X5;
public static final android.print.PrintAttributes.MediaSize NA_INDEX_4X6;
public static final android.print.PrintAttributes.MediaSize NA_INDEX_5X8;
public static final android.print.PrintAttributes.MediaSize NA_JUNIOR_LEGAL;
public static final android.print.PrintAttributes.MediaSize NA_LEDGER;
public static final android.print.PrintAttributes.MediaSize NA_LEGAL;
public static final android.print.PrintAttributes.MediaSize NA_LETTER;
public static final android.print.PrintAttributes.MediaSize NA_MONARCH;
public static final android.print.PrintAttributes.MediaSize NA_QUARTO;
public static final android.print.PrintAttributes.MediaSize NA_TABLOID;
public static final android.print.PrintAttributes.MediaSize OM_DAI_PA_KAI;
public static final android.print.PrintAttributes.MediaSize OM_JUURO_KU_KAI;
public static final android.print.PrintAttributes.MediaSize OM_PA_KAI;
public static final android.print.PrintAttributes.MediaSize PRC_1;
public static final android.print.PrintAttributes.MediaSize PRC_10;
public static final android.print.PrintAttributes.MediaSize PRC_16K;
public static final android.print.PrintAttributes.MediaSize PRC_2;
public static final android.print.PrintAttributes.MediaSize PRC_3;
public static final android.print.PrintAttributes.MediaSize PRC_4;
public static final android.print.PrintAttributes.MediaSize PRC_5;
public static final android.print.PrintAttributes.MediaSize PRC_6;
public static final android.print.PrintAttributes.MediaSize PRC_7;
public static final android.print.PrintAttributes.MediaSize PRC_8;
public static final android.print.PrintAttributes.MediaSize PRC_9;
public static final android.print.PrintAttributes.MediaSize ROC_16K;
public static final android.print.PrintAttributes.MediaSize ROC_8K;
public static final android.print.PrintAttributes.MediaSize UNKNOWN_LANDSCAPE;
public static final android.print.PrintAttributes.MediaSize UNKNOWN_PORTRAIT;
static { ISO_A0 = null; ISO_A1 = null; ISO_A10 = null; ISO_A2 = null; ISO_A3 = null; ISO_A4 = null; ISO_A5 = null; ISO_A6 = null; ISO_A7 = null; ISO_A8 = null; ISO_A9 = null; ISO_B0 = null; ISO_B1 = null; ISO_B10 = null; ISO_B2 = null; ISO_B3 = null; ISO_B4 = null; ISO_B5 = null; ISO_B6 = null; ISO_B7 = null; ISO_B8 = null; ISO_B9 = null; ISO_C0 = null; ISO_C1 = null; ISO_C10 = null; ISO_C2 = null; ISO_C3 = null; ISO_C4 = null; ISO_C5 = null; ISO_C6 = null; ISO_C7 = null; ISO_C8 = null; ISO_C9 = null; JIS_B0 = null; JIS_B1 = null; JIS_B10 = null; JIS_B2 = null; JIS_B3 = null; JIS_B4 = null; JIS_B5 = null; JIS_B6 = null; JIS_B7 = null; JIS_B8 = null; JIS_B9 = null; JIS_EXEC = null; JPN_CHOU2 = null; JPN_CHOU3 = null; JPN_CHOU4 = null; JPN_HAGAKI = null; JPN_KAHU = null; JPN_KAKU2 = null; JPN_OUFUKU = null; JPN_YOU4 = null; NA_FOOLSCAP = null; NA_GOVT_LETTER = null; NA_INDEX_3X5 = null; NA_INDEX_4X6 = null; NA_INDEX_5X8 = null; NA_JUNIOR_LEGAL = null; NA_LEDGER = null; NA_LEGAL = null; NA_LETTER = null; NA_MONARCH = null; NA_QUARTO = null; NA_TABLOID = null; OM_DAI_PA_KAI = null; OM_JUURO_KU_KAI = null; OM_PA_KAI = null; PRC_1 = null; PRC_10 = null; PRC_16K = null; PRC_2 = null; PRC_3 = null; PRC_4 = null; PRC_5 = null; PRC_6 = null; PRC_7 = null; PRC_8 = null; PRC_9 = null; ROC_16K = null; ROC_8K = null; UNKNOWN_LANDSCAPE = null; UNKNOWN_PORTRAIT = null; }
}
public static final class Resolution
{
public  Resolution(java.lang.String id, java.lang.String label, int horizontalDpi, int verticalDpi) { throw new RuntimeException("Stub!"); }
public  java.lang.String getId() { throw new RuntimeException("Stub!"); }
public  java.lang.String getLabel() { throw new RuntimeException("Stub!"); }
public  int getHorizontalDpi() { throw new RuntimeException("Stub!"); }
public  int getVerticalDpi() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
public static final class Margins
{
public  Margins(int leftMils, int topMils, int rightMils, int bottomMils) { throw new RuntimeException("Stub!"); }
public  int getLeftMils() { throw new RuntimeException("Stub!"); }
public  int getTopMils() { throw new RuntimeException("Stub!"); }
public  int getRightMils() { throw new RuntimeException("Stub!"); }
public  int getBottomMils() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.print.PrintAttributes.Margins NO_MARGINS;
static { NO_MARGINS = null; }
}
public static final class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  android.print.PrintAttributes.Builder setMediaSize(android.print.PrintAttributes.MediaSize mediaSize) { throw new RuntimeException("Stub!"); }
public  android.print.PrintAttributes.Builder setResolution(android.print.PrintAttributes.Resolution resolution) { throw new RuntimeException("Stub!"); }
public  android.print.PrintAttributes.Builder setMinMargins(android.print.PrintAttributes.Margins margins) { throw new RuntimeException("Stub!"); }
public  android.print.PrintAttributes.Builder setColorMode(int colorMode) { throw new RuntimeException("Stub!"); }
public  android.print.PrintAttributes.Builder setDuplexMode(int duplexMode) { throw new RuntimeException("Stub!"); }
public  android.print.PrintAttributes build() { throw new RuntimeException("Stub!"); }
}
PrintAttributes() { throw new RuntimeException("Stub!"); }
public  android.print.PrintAttributes.MediaSize getMediaSize() { throw new RuntimeException("Stub!"); }
public  android.print.PrintAttributes.Resolution getResolution() { throw new RuntimeException("Stub!"); }
public  android.print.PrintAttributes.Margins getMinMargins() { throw new RuntimeException("Stub!"); }
public  int getColorMode() { throw new RuntimeException("Stub!"); }
public  int getDuplexMode() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final int COLOR_MODE_COLOR = 2;
public static final int COLOR_MODE_MONOCHROME = 1;
public static final android.os.Parcelable.Creator<android.print.PrintAttributes> CREATOR;
public static final int DUPLEX_MODE_LONG_EDGE = 2;
public static final int DUPLEX_MODE_NONE = 1;
public static final int DUPLEX_MODE_SHORT_EDGE = 4;
static { CREATOR = null; }
}
