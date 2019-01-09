package android.media;
public class MediaDescription
  implements android.os.Parcelable
{
public static class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  android.media.MediaDescription.Builder setMediaId(java.lang.String mediaId) { throw new RuntimeException("Stub!"); }
public  android.media.MediaDescription.Builder setTitle(java.lang.CharSequence title) { throw new RuntimeException("Stub!"); }
public  android.media.MediaDescription.Builder setSubtitle(java.lang.CharSequence subtitle) { throw new RuntimeException("Stub!"); }
public  android.media.MediaDescription.Builder setDescription(java.lang.CharSequence description) { throw new RuntimeException("Stub!"); }
public  android.media.MediaDescription.Builder setIconBitmap(android.graphics.Bitmap icon) { throw new RuntimeException("Stub!"); }
public  android.media.MediaDescription.Builder setIconUri(android.net.Uri iconUri) { throw new RuntimeException("Stub!"); }
public  android.media.MediaDescription.Builder setExtras(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  android.media.MediaDescription.Builder setMediaUri(android.net.Uri mediaUri) { throw new RuntimeException("Stub!"); }
public  android.media.MediaDescription build() { throw new RuntimeException("Stub!"); }
}
MediaDescription() { throw new RuntimeException("Stub!"); }
public  java.lang.String getMediaId() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getTitle() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getSubtitle() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getDescription() { throw new RuntimeException("Stub!"); }
public  android.graphics.Bitmap getIconBitmap() { throw new RuntimeException("Stub!"); }
public  android.net.Uri getIconUri() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
public  android.net.Uri getMediaUri() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final long BT_FOLDER_TYPE_ALBUMS = 2L;
public static final long BT_FOLDER_TYPE_ARTISTS = 3L;
public static final long BT_FOLDER_TYPE_GENRES = 4L;
public static final long BT_FOLDER_TYPE_MIXED = 0L;
public static final long BT_FOLDER_TYPE_PLAYLISTS = 5L;
public static final long BT_FOLDER_TYPE_TITLES = 1L;
public static final long BT_FOLDER_TYPE_YEARS = 6L;
public static final android.os.Parcelable.Creator<android.media.MediaDescription> CREATOR;
public static final java.lang.String EXTRA_BT_FOLDER_TYPE = "android.media.extra.BT_FOLDER_TYPE";
static { CREATOR = null; }
}
