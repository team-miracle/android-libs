/*
* Copyright (C) 2011 The Android Open Source Project
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

package android.view;
public final class PointerIcon
  implements android.os.Parcelable
{
PointerIcon() { throw new RuntimeException("Stub!"); }
public static  android.view.PointerIcon getSystemIcon(android.content.Context context, int type) { throw new RuntimeException("Stub!"); }
public static  android.view.PointerIcon create(android.graphics.Bitmap bitmap, float hotSpotX, float hotSpotY) { throw new RuntimeException("Stub!"); }
public static  android.view.PointerIcon load(android.content.res.Resources resources, int resourceId) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object other) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.view.PointerIcon> CREATOR;
public static final int TYPE_ALIAS = 1010;
public static final int TYPE_ALL_SCROLL = 1013;
public static final int TYPE_ARROW = 1000;
public static final int TYPE_CELL = 1006;
public static final int TYPE_CONTEXT_MENU = 1001;
public static final int TYPE_COPY = 1011;
public static final int TYPE_CROSSHAIR = 1007;
public static final int TYPE_DEFAULT = 1000;
public static final int TYPE_GRAB = 1020;
public static final int TYPE_GRABBING = 1021;
public static final int TYPE_HAND = 1002;
public static final int TYPE_HELP = 1003;
public static final int TYPE_HORIZONTAL_DOUBLE_ARROW = 1014;
public static final int TYPE_NO_DROP = 1012;
public static final int TYPE_NULL = 0;
public static final int TYPE_TEXT = 1008;
public static final int TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW = 1017;
public static final int TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW = 1016;
public static final int TYPE_VERTICAL_DOUBLE_ARROW = 1015;
public static final int TYPE_VERTICAL_TEXT = 1009;
public static final int TYPE_WAIT = 1004;
public static final int TYPE_ZOOM_IN = 1018;
public static final int TYPE_ZOOM_OUT = 1019;
static { CREATOR = null; }
}
