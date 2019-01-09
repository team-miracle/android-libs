/*
* Copyright (C) 2017 The Android Open Source Project
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

package android.app.slice;
public final class Slice
  implements android.os.Parcelable
{
public static class Builder
{
public  Builder(android.net.Uri uri, android.app.slice.SliceSpec spec) { throw new RuntimeException("Stub!"); }
public  Builder(android.app.slice.Slice.Builder parent) { throw new RuntimeException("Stub!"); }
public  android.app.slice.Slice.Builder setCallerNeeded(boolean callerNeeded) { throw new RuntimeException("Stub!"); }
public  android.app.slice.Slice.Builder addHints(java.util.List<java.lang.String> hints) { throw new RuntimeException("Stub!"); }
public  android.app.slice.Slice.Builder addSubSlice(android.app.slice.Slice slice, java.lang.String subType) { throw new RuntimeException("Stub!"); }
public  android.app.slice.Slice.Builder addAction(android.app.PendingIntent action, android.app.slice.Slice s, java.lang.String subType) { throw new RuntimeException("Stub!"); }
public  android.app.slice.Slice.Builder addText(java.lang.CharSequence text, java.lang.String subType, java.util.List<java.lang.String> hints) { throw new RuntimeException("Stub!"); }
public  android.app.slice.Slice.Builder addIcon(android.graphics.drawable.Icon icon, java.lang.String subType, java.util.List<java.lang.String> hints) { throw new RuntimeException("Stub!"); }
public  android.app.slice.Slice.Builder addRemoteInput(android.app.RemoteInput remoteInput, java.lang.String subType, java.util.List<java.lang.String> hints) { throw new RuntimeException("Stub!"); }
public  android.app.slice.Slice.Builder addInt(int value, java.lang.String subType, java.util.List<java.lang.String> hints) { throw new RuntimeException("Stub!"); }
public  android.app.slice.Slice.Builder addLong(long value, java.lang.String subType, java.util.List<java.lang.String> hints) { throw new RuntimeException("Stub!"); }
public  android.app.slice.Slice.Builder addBundle(android.os.Bundle bundle, java.lang.String subType, java.util.List<java.lang.String> hints) { throw new RuntimeException("Stub!"); }
public  android.app.slice.Slice build() { throw new RuntimeException("Stub!"); }
}
protected  Slice(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public  android.app.slice.SliceSpec getSpec() { throw new RuntimeException("Stub!"); }
public  android.net.Uri getUri() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.app.slice.SliceItem> getItems() { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getHints() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  boolean isCallerNeeded() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.app.slice.Slice> CREATOR;
public static final java.lang.String EXTRA_RANGE_VALUE = "android.app.slice.extra.RANGE_VALUE";
public static final java.lang.String EXTRA_TOGGLE_STATE = "android.app.slice.extra.TOGGLE_STATE";
public static final java.lang.String HINT_ACTIONS = "actions";
public static final java.lang.String HINT_ERROR = "error";
public static final java.lang.String HINT_HORIZONTAL = "horizontal";
public static final java.lang.String HINT_KEYWORDS = "keywords";
public static final java.lang.String HINT_LARGE = "large";
public static final java.lang.String HINT_LAST_UPDATED = "last_updated";
public static final java.lang.String HINT_LIST = "list";
public static final java.lang.String HINT_LIST_ITEM = "list_item";
public static final java.lang.String HINT_NO_TINT = "no_tint";
public static final java.lang.String HINT_PARTIAL = "partial";
public static final java.lang.String HINT_PERMISSION_REQUEST = "permission_request";
public static final java.lang.String HINT_SEE_MORE = "see_more";
public static final java.lang.String HINT_SELECTED = "selected";
public static final java.lang.String HINT_SHORTCUT = "shortcut";
public static final java.lang.String HINT_SUMMARY = "summary";
public static final java.lang.String HINT_TITLE = "title";
public static final java.lang.String HINT_TTL = "ttl";
public static final java.lang.String SUBTYPE_COLOR = "color";
public static final java.lang.String SUBTYPE_CONTENT_DESCRIPTION = "content_description";
public static final java.lang.String SUBTYPE_LAYOUT_DIRECTION = "layout_direction";
public static final java.lang.String SUBTYPE_MAX = "max";
public static final java.lang.String SUBTYPE_MESSAGE = "message";
public static final java.lang.String SUBTYPE_MILLIS = "millis";
public static final java.lang.String SUBTYPE_PRIORITY = "priority";
public static final java.lang.String SUBTYPE_RANGE = "range";
public static final java.lang.String SUBTYPE_SOURCE = "source";
public static final java.lang.String SUBTYPE_TOGGLE = "toggle";
public static final java.lang.String SUBTYPE_VALUE = "value";
static { CREATOR = null; }
}
