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

package android.appwidget;
public class AppWidgetProviderInfo
  implements android.os.Parcelable
{
public  AppWidgetProviderInfo() { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"deprecation"})
public  AppWidgetProviderInfo(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public final  java.lang.String loadLabel(android.content.pm.PackageManager packageManager) { throw new RuntimeException("Stub!"); }
public final  android.graphics.drawable.Drawable loadIcon(android.content.Context context, int density) { throw new RuntimeException("Stub!"); }
public final  android.graphics.drawable.Drawable loadPreviewImage(android.content.Context context, int density) { throw new RuntimeException("Stub!"); }
public final  android.os.UserHandle getProfile() { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"deprecation"})
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"deprecation"})
public  android.appwidget.AppWidgetProviderInfo clone() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.appwidget.AppWidgetProviderInfo> CREATOR;
public static final int RESIZE_BOTH = 3;
public static final int RESIZE_HORIZONTAL = 1;
public static final int RESIZE_NONE = 0;
public static final int RESIZE_VERTICAL = 2;
public static final int WIDGET_CATEGORY_HOME_SCREEN = 1;
public static final int WIDGET_CATEGORY_KEYGUARD = 2;
public static final int WIDGET_CATEGORY_SEARCHBOX = 4;
public static final int WIDGET_FEATURE_HIDE_FROM_PICKER = 2;
public static final int WIDGET_FEATURE_RECONFIGURABLE = 1;
public int autoAdvanceViewId;
public android.content.ComponentName configure;
public int icon;
public int initialKeyguardLayout;
public int initialLayout;
@java.lang.Deprecated()
public java.lang.String label;
public int minHeight;
public int minResizeHeight;
public int minResizeWidth;
public int minWidth;
public int previewImage;
public android.content.ComponentName provider;
public int resizeMode;
public int updatePeriodMillis;
public int widgetCategory;
public int widgetFeatures;
static { CREATOR = null; }
}
