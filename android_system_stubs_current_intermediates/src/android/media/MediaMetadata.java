/*
* Copyright (C) 2014 The Android Open Source Project
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
package android.media;
public final class MediaMetadata
  implements android.os.Parcelable
{
public static final class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  Builder(android.media.MediaMetadata source) { throw new RuntimeException("Stub!"); }
public  android.media.MediaMetadata.Builder putText(java.lang.String key, java.lang.CharSequence value) { throw new RuntimeException("Stub!"); }
public  android.media.MediaMetadata.Builder putString(java.lang.String key, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  android.media.MediaMetadata.Builder putLong(java.lang.String key, long value) { throw new RuntimeException("Stub!"); }
public  android.media.MediaMetadata.Builder putRating(java.lang.String key, android.media.Rating value) { throw new RuntimeException("Stub!"); }
public  android.media.MediaMetadata.Builder putBitmap(java.lang.String key, android.graphics.Bitmap value) { throw new RuntimeException("Stub!"); }
public  android.media.MediaMetadata build() { throw new RuntimeException("Stub!"); }
}
MediaMetadata() { throw new RuntimeException("Stub!"); }
public  boolean containsKey(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getText(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  java.lang.String getString(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  long getLong(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  android.media.Rating getRating(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  android.graphics.Bitmap getBitmap(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int size() { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.lang.String> keySet() { throw new RuntimeException("Stub!"); }
public  android.media.MediaDescription getDescription() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.media.MediaMetadata> CREATOR;
public static final java.lang.String METADATA_KEY_ALBUM = "android.media.metadata.ALBUM";
public static final java.lang.String METADATA_KEY_ALBUM_ART = "android.media.metadata.ALBUM_ART";
public static final java.lang.String METADATA_KEY_ALBUM_ARTIST = "android.media.metadata.ALBUM_ARTIST";
public static final java.lang.String METADATA_KEY_ALBUM_ART_URI = "android.media.metadata.ALBUM_ART_URI";
public static final java.lang.String METADATA_KEY_ART = "android.media.metadata.ART";
public static final java.lang.String METADATA_KEY_ARTIST = "android.media.metadata.ARTIST";
public static final java.lang.String METADATA_KEY_ART_URI = "android.media.metadata.ART_URI";
public static final java.lang.String METADATA_KEY_AUTHOR = "android.media.metadata.AUTHOR";
public static final java.lang.String METADATA_KEY_BT_FOLDER_TYPE = "android.media.metadata.BT_FOLDER_TYPE";
public static final java.lang.String METADATA_KEY_COMPILATION = "android.media.metadata.COMPILATION";
public static final java.lang.String METADATA_KEY_COMPOSER = "android.media.metadata.COMPOSER";
public static final java.lang.String METADATA_KEY_DATE = "android.media.metadata.DATE";
public static final java.lang.String METADATA_KEY_DISC_NUMBER = "android.media.metadata.DISC_NUMBER";
public static final java.lang.String METADATA_KEY_DISPLAY_DESCRIPTION = "android.media.metadata.DISPLAY_DESCRIPTION";
public static final java.lang.String METADATA_KEY_DISPLAY_ICON = "android.media.metadata.DISPLAY_ICON";
public static final java.lang.String METADATA_KEY_DISPLAY_ICON_URI = "android.media.metadata.DISPLAY_ICON_URI";
public static final java.lang.String METADATA_KEY_DISPLAY_SUBTITLE = "android.media.metadata.DISPLAY_SUBTITLE";
public static final java.lang.String METADATA_KEY_DISPLAY_TITLE = "android.media.metadata.DISPLAY_TITLE";
public static final java.lang.String METADATA_KEY_DURATION = "android.media.metadata.DURATION";
public static final java.lang.String METADATA_KEY_GENRE = "android.media.metadata.GENRE";
public static final java.lang.String METADATA_KEY_MEDIA_ID = "android.media.metadata.MEDIA_ID";
public static final java.lang.String METADATA_KEY_MEDIA_URI = "android.media.metadata.MEDIA_URI";
public static final java.lang.String METADATA_KEY_NUM_TRACKS = "android.media.metadata.NUM_TRACKS";
public static final java.lang.String METADATA_KEY_RATING = "android.media.metadata.RATING";
public static final java.lang.String METADATA_KEY_TITLE = "android.media.metadata.TITLE";
public static final java.lang.String METADATA_KEY_TRACK_NUMBER = "android.media.metadata.TRACK_NUMBER";
public static final java.lang.String METADATA_KEY_USER_RATING = "android.media.metadata.USER_RATING";
public static final java.lang.String METADATA_KEY_WRITER = "android.media.metadata.WRITER";
public static final java.lang.String METADATA_KEY_YEAR = "android.media.metadata.YEAR";
static { CREATOR = null; }
}
