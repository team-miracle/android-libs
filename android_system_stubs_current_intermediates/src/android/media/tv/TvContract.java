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

package android.media.tv;
public final class TvContract
{
public static interface BaseTvColumns
  extends android.provider.BaseColumns
{
public static final java.lang.String COLUMN_PACKAGE_NAME = "package_name";
}
public static final class Channels
  implements android.media.tv.TvContract.BaseTvColumns
{
public static final class Logo
{
Logo() { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONTENT_DIRECTORY = "logo";
}
Channels() { throw new RuntimeException("Stub!"); }
public static  java.lang.String getVideoResolution(java.lang.String videoFormat) { throw new RuntimeException("Stub!"); }
public static final java.lang.String COLUMN_APP_LINK_COLOR = "app_link_color";
public static final java.lang.String COLUMN_APP_LINK_ICON_URI = "app_link_icon_uri";
public static final java.lang.String COLUMN_APP_LINK_INTENT_URI = "app_link_intent_uri";
public static final java.lang.String COLUMN_APP_LINK_POSTER_ART_URI = "app_link_poster_art_uri";
public static final java.lang.String COLUMN_APP_LINK_TEXT = "app_link_text";
public static final java.lang.String COLUMN_BROWSABLE = "browsable";
public static final java.lang.String COLUMN_DESCRIPTION = "description";
public static final java.lang.String COLUMN_DISPLAY_NAME = "display_name";
public static final java.lang.String COLUMN_DISPLAY_NUMBER = "display_number";
public static final java.lang.String COLUMN_INPUT_ID = "input_id";
public static final java.lang.String COLUMN_INTERNAL_PROVIDER_DATA = "internal_provider_data";
public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG1 = "internal_provider_flag1";
public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG2 = "internal_provider_flag2";
public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG3 = "internal_provider_flag3";
public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG4 = "internal_provider_flag4";
public static final java.lang.String COLUMN_INTERNAL_PROVIDER_ID = "internal_provider_id";
public static final java.lang.String COLUMN_LOCKED = "locked";
public static final java.lang.String COLUMN_NETWORK_AFFILIATION = "network_affiliation";
public static final java.lang.String COLUMN_ORIGINAL_NETWORK_ID = "original_network_id";
public static final java.lang.String COLUMN_SEARCHABLE = "searchable";
public static final java.lang.String COLUMN_SERVICE_ID = "service_id";
public static final java.lang.String COLUMN_SERVICE_TYPE = "service_type";
public static final java.lang.String COLUMN_TRANSIENT = "transient";
public static final java.lang.String COLUMN_TRANSPORT_STREAM_ID = "transport_stream_id";
public static final java.lang.String COLUMN_TYPE = "type";
public static final java.lang.String COLUMN_VERSION_NUMBER = "version_number";
public static final java.lang.String COLUMN_VIDEO_FORMAT = "video_format";
public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/channel";
public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/channel";
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String SERVICE_TYPE_AUDIO = "SERVICE_TYPE_AUDIO";
public static final java.lang.String SERVICE_TYPE_AUDIO_VIDEO = "SERVICE_TYPE_AUDIO_VIDEO";
public static final java.lang.String SERVICE_TYPE_OTHER = "SERVICE_TYPE_OTHER";
public static final java.lang.String TYPE_1SEG = "TYPE_1SEG";
public static final java.lang.String TYPE_ATSC_C = "TYPE_ATSC_C";
public static final java.lang.String TYPE_ATSC_M_H = "TYPE_ATSC_M_H";
public static final java.lang.String TYPE_ATSC_T = "TYPE_ATSC_T";
public static final java.lang.String TYPE_CMMB = "TYPE_CMMB";
public static final java.lang.String TYPE_DTMB = "TYPE_DTMB";
public static final java.lang.String TYPE_DVB_C = "TYPE_DVB_C";
public static final java.lang.String TYPE_DVB_C2 = "TYPE_DVB_C2";
public static final java.lang.String TYPE_DVB_H = "TYPE_DVB_H";
public static final java.lang.String TYPE_DVB_S = "TYPE_DVB_S";
public static final java.lang.String TYPE_DVB_S2 = "TYPE_DVB_S2";
public static final java.lang.String TYPE_DVB_SH = "TYPE_DVB_SH";
public static final java.lang.String TYPE_DVB_T = "TYPE_DVB_T";
public static final java.lang.String TYPE_DVB_T2 = "TYPE_DVB_T2";
public static final java.lang.String TYPE_ISDB_C = "TYPE_ISDB_C";
public static final java.lang.String TYPE_ISDB_S = "TYPE_ISDB_S";
public static final java.lang.String TYPE_ISDB_T = "TYPE_ISDB_T";
public static final java.lang.String TYPE_ISDB_TB = "TYPE_ISDB_TB";
public static final java.lang.String TYPE_NTSC = "TYPE_NTSC";
public static final java.lang.String TYPE_OTHER = "TYPE_OTHER";
public static final java.lang.String TYPE_PAL = "TYPE_PAL";
public static final java.lang.String TYPE_PREVIEW = "TYPE_PREVIEW";
public static final java.lang.String TYPE_SECAM = "TYPE_SECAM";
public static final java.lang.String TYPE_S_DMB = "TYPE_S_DMB";
public static final java.lang.String TYPE_T_DMB = "TYPE_T_DMB";
public static final java.lang.String VIDEO_FORMAT_1080I = "VIDEO_FORMAT_1080I";
public static final java.lang.String VIDEO_FORMAT_1080P = "VIDEO_FORMAT_1080P";
public static final java.lang.String VIDEO_FORMAT_2160P = "VIDEO_FORMAT_2160P";
public static final java.lang.String VIDEO_FORMAT_240P = "VIDEO_FORMAT_240P";
public static final java.lang.String VIDEO_FORMAT_360P = "VIDEO_FORMAT_360P";
public static final java.lang.String VIDEO_FORMAT_4320P = "VIDEO_FORMAT_4320P";
public static final java.lang.String VIDEO_FORMAT_480I = "VIDEO_FORMAT_480I";
public static final java.lang.String VIDEO_FORMAT_480P = "VIDEO_FORMAT_480P";
public static final java.lang.String VIDEO_FORMAT_576I = "VIDEO_FORMAT_576I";
public static final java.lang.String VIDEO_FORMAT_576P = "VIDEO_FORMAT_576P";
public static final java.lang.String VIDEO_FORMAT_720P = "VIDEO_FORMAT_720P";
public static final java.lang.String VIDEO_RESOLUTION_ED = "VIDEO_RESOLUTION_ED";
public static final java.lang.String VIDEO_RESOLUTION_FHD = "VIDEO_RESOLUTION_FHD";
public static final java.lang.String VIDEO_RESOLUTION_HD = "VIDEO_RESOLUTION_HD";
public static final java.lang.String VIDEO_RESOLUTION_SD = "VIDEO_RESOLUTION_SD";
public static final java.lang.String VIDEO_RESOLUTION_UHD = "VIDEO_RESOLUTION_UHD";
static { CONTENT_URI = null; }
}
public static final class Programs
  implements android.media.tv.TvContract.BaseTvColumns
{
public static final class Genres
{
Genres() { throw new RuntimeException("Stub!"); }
public static  java.lang.String encode(java.lang.String... genres) { throw new RuntimeException("Stub!"); }
public static  java.lang.String[] decode(java.lang.String genres) { throw new RuntimeException("Stub!"); }
public static  boolean isCanonical(java.lang.String genre) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ANIMAL_WILDLIFE = "ANIMAL_WILDLIFE";
public static final java.lang.String ARTS = "ARTS";
public static final java.lang.String COMEDY = "COMEDY";
public static final java.lang.String DRAMA = "DRAMA";
public static final java.lang.String EDUCATION = "EDUCATION";
public static final java.lang.String ENTERTAINMENT = "ENTERTAINMENT";
public static final java.lang.String FAMILY_KIDS = "FAMILY_KIDS";
public static final java.lang.String GAMING = "GAMING";
public static final java.lang.String LIFE_STYLE = "LIFE_STYLE";
public static final java.lang.String MOVIES = "MOVIES";
public static final java.lang.String MUSIC = "MUSIC";
public static final java.lang.String NEWS = "NEWS";
public static final java.lang.String PREMIER = "PREMIER";
public static final java.lang.String SHOPPING = "SHOPPING";
public static final java.lang.String SPORTS = "SPORTS";
public static final java.lang.String TECH_SCIENCE = "TECH_SCIENCE";
public static final java.lang.String TRAVEL = "TRAVEL";
}
Programs() { throw new RuntimeException("Stub!"); }
public static final java.lang.String COLUMN_AUDIO_LANGUAGE = "audio_language";
public static final java.lang.String COLUMN_BROADCAST_GENRE = "broadcast_genre";
public static final java.lang.String COLUMN_CANONICAL_GENRE = "canonical_genre";
public static final java.lang.String COLUMN_CHANNEL_ID = "channel_id";
public static final java.lang.String COLUMN_CONTENT_RATING = "content_rating";
public static final java.lang.String COLUMN_END_TIME_UTC_MILLIS = "end_time_utc_millis";
public static final java.lang.String COLUMN_EPISODE_DISPLAY_NUMBER = "episode_display_number";
@java.lang.Deprecated()
public static final java.lang.String COLUMN_EPISODE_NUMBER = "episode_number";
public static final java.lang.String COLUMN_EPISODE_TITLE = "episode_title";
public static final java.lang.String COLUMN_INTERNAL_PROVIDER_DATA = "internal_provider_data";
public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG1 = "internal_provider_flag1";
public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG2 = "internal_provider_flag2";
public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG3 = "internal_provider_flag3";
public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG4 = "internal_provider_flag4";
public static final java.lang.String COLUMN_LONG_DESCRIPTION = "long_description";
public static final java.lang.String COLUMN_POSTER_ART_URI = "poster_art_uri";
public static final java.lang.String COLUMN_RECORDING_PROHIBITED = "recording_prohibited";
public static final java.lang.String COLUMN_REVIEW_RATING = "review_rating";
public static final java.lang.String COLUMN_REVIEW_RATING_STYLE = "review_rating_style";
public static final java.lang.String COLUMN_SEARCHABLE = "searchable";
public static final java.lang.String COLUMN_SEASON_DISPLAY_NUMBER = "season_display_number";
@java.lang.Deprecated()
public static final java.lang.String COLUMN_SEASON_NUMBER = "season_number";
public static final java.lang.String COLUMN_SEASON_TITLE = "season_title";
public static final java.lang.String COLUMN_SHORT_DESCRIPTION = "short_description";
public static final java.lang.String COLUMN_START_TIME_UTC_MILLIS = "start_time_utc_millis";
public static final java.lang.String COLUMN_THUMBNAIL_URI = "thumbnail_uri";
public static final java.lang.String COLUMN_TITLE = "title";
public static final java.lang.String COLUMN_VERSION_NUMBER = "version_number";
public static final java.lang.String COLUMN_VIDEO_HEIGHT = "video_height";
public static final java.lang.String COLUMN_VIDEO_WIDTH = "video_width";
public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/program";
public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/program";
public static final android.net.Uri CONTENT_URI;
public static final int REVIEW_RATING_STYLE_PERCENTAGE = 2;
public static final int REVIEW_RATING_STYLE_STARS = 0;
public static final int REVIEW_RATING_STYLE_THUMBS_UP_DOWN = 1;
static { CONTENT_URI = null; }
}
public static final class RecordedPrograms
  implements android.media.tv.TvContract.BaseTvColumns
{
RecordedPrograms() { throw new RuntimeException("Stub!"); }
public static final java.lang.String COLUMN_AUDIO_LANGUAGE = "audio_language";
public static final java.lang.String COLUMN_BROADCAST_GENRE = "broadcast_genre";
public static final java.lang.String COLUMN_CANONICAL_GENRE = "canonical_genre";
public static final java.lang.String COLUMN_CHANNEL_ID = "channel_id";
public static final java.lang.String COLUMN_CONTENT_RATING = "content_rating";
public static final java.lang.String COLUMN_END_TIME_UTC_MILLIS = "end_time_utc_millis";
public static final java.lang.String COLUMN_EPISODE_DISPLAY_NUMBER = "episode_display_number";
public static final java.lang.String COLUMN_EPISODE_TITLE = "episode_title";
public static final java.lang.String COLUMN_INPUT_ID = "input_id";
public static final java.lang.String COLUMN_INTERNAL_PROVIDER_DATA = "internal_provider_data";
public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG1 = "internal_provider_flag1";
public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG2 = "internal_provider_flag2";
public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG3 = "internal_provider_flag3";
public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG4 = "internal_provider_flag4";
public static final java.lang.String COLUMN_LONG_DESCRIPTION = "long_description";
public static final java.lang.String COLUMN_POSTER_ART_URI = "poster_art_uri";
public static final java.lang.String COLUMN_RECORDING_DATA_BYTES = "recording_data_bytes";
public static final java.lang.String COLUMN_RECORDING_DATA_URI = "recording_data_uri";
public static final java.lang.String COLUMN_RECORDING_DURATION_MILLIS = "recording_duration_millis";
public static final java.lang.String COLUMN_RECORDING_EXPIRE_TIME_UTC_MILLIS = "recording_expire_time_utc_millis";
public static final java.lang.String COLUMN_REVIEW_RATING = "review_rating";
public static final java.lang.String COLUMN_REVIEW_RATING_STYLE = "review_rating_style";
public static final java.lang.String COLUMN_SEARCHABLE = "searchable";
public static final java.lang.String COLUMN_SEASON_DISPLAY_NUMBER = "season_display_number";
public static final java.lang.String COLUMN_SEASON_TITLE = "season_title";
public static final java.lang.String COLUMN_SHORT_DESCRIPTION = "short_description";
public static final java.lang.String COLUMN_START_TIME_UTC_MILLIS = "start_time_utc_millis";
public static final java.lang.String COLUMN_THUMBNAIL_URI = "thumbnail_uri";
public static final java.lang.String COLUMN_TITLE = "title";
public static final java.lang.String COLUMN_VERSION_NUMBER = "version_number";
public static final java.lang.String COLUMN_VIDEO_HEIGHT = "video_height";
public static final java.lang.String COLUMN_VIDEO_WIDTH = "video_width";
public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/recorded_program";
public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/recorded_program";
public static final android.net.Uri CONTENT_URI;
public static final int REVIEW_RATING_STYLE_PERCENTAGE = 2;
public static final int REVIEW_RATING_STYLE_STARS = 0;
public static final int REVIEW_RATING_STYLE_THUMBS_UP_DOWN = 1;
static { CONTENT_URI = null; }
}
public static final class PreviewPrograms
  implements android.media.tv.TvContract.BaseTvColumns
{
PreviewPrograms() { throw new RuntimeException("Stub!"); }
public static final int ASPECT_RATIO_16_9 = 0;
public static final int ASPECT_RATIO_1_1 = 3;
public static final int ASPECT_RATIO_2_3 = 4;
public static final int ASPECT_RATIO_3_2 = 1;
public static final int ASPECT_RATIO_4_3 = 2;
public static final int AVAILABILITY_AVAILABLE = 0;
public static final int AVAILABILITY_FREE_WITH_SUBSCRIPTION = 1;
public static final int AVAILABILITY_PAID_CONTENT = 2;
public static final java.lang.String COLUMN_AUDIO_LANGUAGE = "audio_language";
public static final java.lang.String COLUMN_AUTHOR = "author";
public static final java.lang.String COLUMN_AVAILABILITY = "availability";
public static final java.lang.String COLUMN_BROWSABLE = "browsable";
public static final java.lang.String COLUMN_CANONICAL_GENRE = "canonical_genre";
public static final java.lang.String COLUMN_CHANNEL_ID = "channel_id";
public static final java.lang.String COLUMN_CONTENT_ID = "content_id";
public static final java.lang.String COLUMN_CONTENT_RATING = "content_rating";
public static final java.lang.String COLUMN_DURATION_MILLIS = "duration_millis";
public static final java.lang.String COLUMN_EPISODE_DISPLAY_NUMBER = "episode_display_number";
public static final java.lang.String COLUMN_EPISODE_TITLE = "episode_title";
public static final java.lang.String COLUMN_INTENT_URI = "intent_uri";
public static final java.lang.String COLUMN_INTERACTION_COUNT = "interaction_count";
public static final java.lang.String COLUMN_INTERACTION_TYPE = "interaction_type";
public static final java.lang.String COLUMN_INTERNAL_PROVIDER_DATA = "internal_provider_data";
public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG1 = "internal_provider_flag1";
public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG2 = "internal_provider_flag2";
public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG3 = "internal_provider_flag3";
public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG4 = "internal_provider_flag4";
public static final java.lang.String COLUMN_INTERNAL_PROVIDER_ID = "internal_provider_id";
public static final java.lang.String COLUMN_ITEM_COUNT = "item_count";
public static final java.lang.String COLUMN_LAST_PLAYBACK_POSITION_MILLIS = "last_playback_position_millis";
public static final java.lang.String COLUMN_LIVE = "live";
public static final java.lang.String COLUMN_LOGO_URI = "logo_uri";
public static final java.lang.String COLUMN_LONG_DESCRIPTION = "long_description";
public static final java.lang.String COLUMN_OFFER_PRICE = "offer_price";
public static final java.lang.String COLUMN_POSTER_ART_ASPECT_RATIO = "poster_art_aspect_ratio";
public static final java.lang.String COLUMN_POSTER_ART_URI = "poster_art_uri";
public static final java.lang.String COLUMN_PREVIEW_VIDEO_URI = "preview_video_uri";
public static final java.lang.String COLUMN_RELEASE_DATE = "release_date";
public static final java.lang.String COLUMN_REVIEW_RATING = "review_rating";
public static final java.lang.String COLUMN_REVIEW_RATING_STYLE = "review_rating_style";
public static final java.lang.String COLUMN_SEARCHABLE = "searchable";
public static final java.lang.String COLUMN_SEASON_DISPLAY_NUMBER = "season_display_number";
public static final java.lang.String COLUMN_SEASON_TITLE = "season_title";
public static final java.lang.String COLUMN_SHORT_DESCRIPTION = "short_description";
public static final java.lang.String COLUMN_STARTING_PRICE = "starting_price";
public static final java.lang.String COLUMN_THUMBNAIL_ASPECT_RATIO = "poster_thumbnail_aspect_ratio";
public static final java.lang.String COLUMN_THUMBNAIL_URI = "thumbnail_uri";
public static final java.lang.String COLUMN_TITLE = "title";
public static final java.lang.String COLUMN_TRANSIENT = "transient";
public static final java.lang.String COLUMN_TYPE = "type";
public static final java.lang.String COLUMN_VERSION_NUMBER = "version_number";
public static final java.lang.String COLUMN_VIDEO_HEIGHT = "video_height";
public static final java.lang.String COLUMN_VIDEO_WIDTH = "video_width";
public static final java.lang.String COLUMN_WEIGHT = "weight";
public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/preview_program";
public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/preview_program";
public static final android.net.Uri CONTENT_URI;
public static final int INTERACTION_TYPE_FANS = 3;
public static final int INTERACTION_TYPE_FOLLOWERS = 2;
public static final int INTERACTION_TYPE_LIKES = 4;
public static final int INTERACTION_TYPE_LISTENS = 1;
public static final int INTERACTION_TYPE_THUMBS = 5;
public static final int INTERACTION_TYPE_VIEWERS = 6;
public static final int INTERACTION_TYPE_VIEWS = 0;
public static final int REVIEW_RATING_STYLE_PERCENTAGE = 2;
public static final int REVIEW_RATING_STYLE_STARS = 0;
public static final int REVIEW_RATING_STYLE_THUMBS_UP_DOWN = 1;
public static final int TYPE_ALBUM = 8;
public static final int TYPE_ARTIST = 9;
public static final int TYPE_CHANNEL = 6;
public static final int TYPE_CLIP = 4;
public static final int TYPE_EVENT = 5;
public static final int TYPE_MOVIE = 0;
public static final int TYPE_PLAYLIST = 10;
public static final int TYPE_STATION = 11;
public static final int TYPE_TRACK = 7;
public static final int TYPE_TV_EPISODE = 3;
public static final int TYPE_TV_SEASON = 2;
public static final int TYPE_TV_SERIES = 1;
static { CONTENT_URI = null; }
}
public static final class WatchNextPrograms
  implements android.media.tv.TvContract.BaseTvColumns
{
WatchNextPrograms() { throw new RuntimeException("Stub!"); }
public static final int ASPECT_RATIO_16_9 = 0;
public static final int ASPECT_RATIO_1_1 = 3;
public static final int ASPECT_RATIO_2_3 = 4;
public static final int ASPECT_RATIO_3_2 = 1;
public static final int ASPECT_RATIO_4_3 = 2;
public static final int AVAILABILITY_AVAILABLE = 0;
public static final int AVAILABILITY_FREE_WITH_SUBSCRIPTION = 1;
public static final int AVAILABILITY_PAID_CONTENT = 2;
public static final java.lang.String COLUMN_AUDIO_LANGUAGE = "audio_language";
public static final java.lang.String COLUMN_AUTHOR = "author";
public static final java.lang.String COLUMN_AVAILABILITY = "availability";
public static final java.lang.String COLUMN_BROWSABLE = "browsable";
public static final java.lang.String COLUMN_CANONICAL_GENRE = "canonical_genre";
public static final java.lang.String COLUMN_CONTENT_ID = "content_id";
public static final java.lang.String COLUMN_CONTENT_RATING = "content_rating";
public static final java.lang.String COLUMN_DURATION_MILLIS = "duration_millis";
public static final java.lang.String COLUMN_EPISODE_DISPLAY_NUMBER = "episode_display_number";
public static final java.lang.String COLUMN_EPISODE_TITLE = "episode_title";
public static final java.lang.String COLUMN_INTENT_URI = "intent_uri";
public static final java.lang.String COLUMN_INTERACTION_COUNT = "interaction_count";
public static final java.lang.String COLUMN_INTERACTION_TYPE = "interaction_type";
public static final java.lang.String COLUMN_INTERNAL_PROVIDER_DATA = "internal_provider_data";
public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG1 = "internal_provider_flag1";
public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG2 = "internal_provider_flag2";
public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG3 = "internal_provider_flag3";
public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG4 = "internal_provider_flag4";
public static final java.lang.String COLUMN_INTERNAL_PROVIDER_ID = "internal_provider_id";
public static final java.lang.String COLUMN_ITEM_COUNT = "item_count";
public static final java.lang.String COLUMN_LAST_ENGAGEMENT_TIME_UTC_MILLIS = "last_engagement_time_utc_millis";
public static final java.lang.String COLUMN_LAST_PLAYBACK_POSITION_MILLIS = "last_playback_position_millis";
public static final java.lang.String COLUMN_LIVE = "live";
public static final java.lang.String COLUMN_LOGO_URI = "logo_uri";
public static final java.lang.String COLUMN_LONG_DESCRIPTION = "long_description";
public static final java.lang.String COLUMN_OFFER_PRICE = "offer_price";
public static final java.lang.String COLUMN_POSTER_ART_ASPECT_RATIO = "poster_art_aspect_ratio";
public static final java.lang.String COLUMN_POSTER_ART_URI = "poster_art_uri";
public static final java.lang.String COLUMN_PREVIEW_VIDEO_URI = "preview_video_uri";
public static final java.lang.String COLUMN_RELEASE_DATE = "release_date";
public static final java.lang.String COLUMN_REVIEW_RATING = "review_rating";
public static final java.lang.String COLUMN_REVIEW_RATING_STYLE = "review_rating_style";
public static final java.lang.String COLUMN_SEARCHABLE = "searchable";
public static final java.lang.String COLUMN_SEASON_DISPLAY_NUMBER = "season_display_number";
public static final java.lang.String COLUMN_SEASON_TITLE = "season_title";
public static final java.lang.String COLUMN_SHORT_DESCRIPTION = "short_description";
public static final java.lang.String COLUMN_STARTING_PRICE = "starting_price";
public static final java.lang.String COLUMN_THUMBNAIL_ASPECT_RATIO = "poster_thumbnail_aspect_ratio";
public static final java.lang.String COLUMN_THUMBNAIL_URI = "thumbnail_uri";
public static final java.lang.String COLUMN_TITLE = "title";
public static final java.lang.String COLUMN_TRANSIENT = "transient";
public static final java.lang.String COLUMN_TYPE = "type";
public static final java.lang.String COLUMN_VERSION_NUMBER = "version_number";
public static final java.lang.String COLUMN_VIDEO_HEIGHT = "video_height";
public static final java.lang.String COLUMN_VIDEO_WIDTH = "video_width";
public static final java.lang.String COLUMN_WATCH_NEXT_TYPE = "watch_next_type";
public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/watch_next_program";
public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/watch_next_program";
public static final android.net.Uri CONTENT_URI;
public static final int INTERACTION_TYPE_FANS = 3;
public static final int INTERACTION_TYPE_FOLLOWERS = 2;
public static final int INTERACTION_TYPE_LIKES = 4;
public static final int INTERACTION_TYPE_LISTENS = 1;
public static final int INTERACTION_TYPE_THUMBS = 5;
public static final int INTERACTION_TYPE_VIEWERS = 6;
public static final int INTERACTION_TYPE_VIEWS = 0;
public static final int REVIEW_RATING_STYLE_PERCENTAGE = 2;
public static final int REVIEW_RATING_STYLE_STARS = 0;
public static final int REVIEW_RATING_STYLE_THUMBS_UP_DOWN = 1;
public static final int TYPE_ALBUM = 8;
public static final int TYPE_ARTIST = 9;
public static final int TYPE_CHANNEL = 6;
public static final int TYPE_CLIP = 4;
public static final int TYPE_EVENT = 5;
public static final int TYPE_MOVIE = 0;
public static final int TYPE_PLAYLIST = 10;
public static final int TYPE_STATION = 11;
public static final int TYPE_TRACK = 7;
public static final int TYPE_TV_EPISODE = 3;
public static final int TYPE_TV_SEASON = 2;
public static final int TYPE_TV_SERIES = 1;
public static final int WATCH_NEXT_TYPE_CONTINUE = 0;
public static final int WATCH_NEXT_TYPE_NEW = 2;
public static final int WATCH_NEXT_TYPE_NEXT = 1;
public static final int WATCH_NEXT_TYPE_WATCHLIST = 3;
static { CONTENT_URI = null; }
}
public static final class WatchedPrograms
  implements android.media.tv.TvContract.BaseTvColumns
{
WatchedPrograms() { throw new RuntimeException("Stub!"); }
public static final java.lang.String COLUMN_CHANNEL_ID = "channel_id";
public static final java.lang.String COLUMN_DESCRIPTION = "description";
public static final java.lang.String COLUMN_END_TIME_UTC_MILLIS = "end_time_utc_millis";
public static final java.lang.String COLUMN_INTERNAL_SESSION_TOKEN = "session_token";
public static final java.lang.String COLUMN_INTERNAL_TUNE_PARAMS = "tune_params";
public static final java.lang.String COLUMN_START_TIME_UTC_MILLIS = "start_time_utc_millis";
public static final java.lang.String COLUMN_TITLE = "title";
public static final java.lang.String COLUMN_WATCH_END_TIME_UTC_MILLIS = "watch_end_time_utc_millis";
public static final java.lang.String COLUMN_WATCH_START_TIME_UTC_MILLIS = "watch_start_time_utc_millis";
public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/watched_program";
public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/watched_program";
public static final android.net.Uri CONTENT_URI;
static { CONTENT_URI = null; }
}
TvContract() { throw new RuntimeException("Stub!"); }
public static  java.lang.String buildInputId(android.content.ComponentName name) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri buildChannelUri(long channelId) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri buildChannelUriForPassthroughInput(java.lang.String inputId) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri buildChannelLogoUri(long channelId) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri buildChannelLogoUri(android.net.Uri channelUri) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri buildChannelsUriForInput(java.lang.String inputId) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri buildChannelsUriForInput(java.lang.String inputId, boolean browsableOnly) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri buildChannelsUriForInput(java.lang.String inputId, java.lang.String genre, boolean browsableOnly) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri buildProgramUri(long programId) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri buildProgramsUriForChannel(long channelId) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri buildProgramsUriForChannel(android.net.Uri channelUri) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri buildProgramsUriForChannel(long channelId, long startTime, long endTime) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri buildProgramsUriForChannel(android.net.Uri channelUri, long startTime, long endTime) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri buildRecordedProgramUri(long recordedProgramId) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri buildPreviewProgramUri(long previewProgramId) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri buildPreviewProgramsUriForChannel(long channelId) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri buildPreviewProgramsUriForChannel(android.net.Uri channelUri) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri buildWatchNextProgramUri(long watchNextProgramId) { throw new RuntimeException("Stub!"); }
public static  boolean isChannelUri(android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public static  boolean isChannelUriForTunerInput(android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public static  boolean isChannelUriForPassthroughInput(android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public static  boolean isProgramUri(android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public static  boolean isRecordedProgramUri(android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public static  void requestChannelBrowsable(android.content.Context context, long channelId) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_CHANNEL_BROWSABLE_REQUESTED = "android.media.tv.action.CHANNEL_BROWSABLE_REQUESTED";
public static final java.lang.String ACTION_INITIALIZE_PROGRAMS = "android.media.tv.action.INITIALIZE_PROGRAMS";
public static final java.lang.String ACTION_PREVIEW_PROGRAM_ADDED_TO_WATCH_NEXT = "android.media.tv.action.PREVIEW_PROGRAM_ADDED_TO_WATCH_NEXT";
public static final java.lang.String ACTION_PREVIEW_PROGRAM_BROWSABLE_DISABLED = "android.media.tv.action.PREVIEW_PROGRAM_BROWSABLE_DISABLED";
public static final java.lang.String ACTION_REQUEST_CHANNEL_BROWSABLE = "android.media.tv.action.REQUEST_CHANNEL_BROWSABLE";
public static final java.lang.String ACTION_WATCH_NEXT_PROGRAM_BROWSABLE_DISABLED = "android.media.tv.action.WATCH_NEXT_PROGRAM_BROWSABLE_DISABLED";
public static final java.lang.String AUTHORITY = "android.media.tv";
public static final java.lang.String EXTRA_BLOCKED_PACKAGES = "android.media.tv.extra.BLOCKED_PACKAGES";
public static final java.lang.String EXTRA_CHANNEL_ID = "android.media.tv.extra.CHANNEL_ID";
public static final java.lang.String EXTRA_COLUMN_NAME = "android.media.tv.extra.COLUMN_NAME";
public static final java.lang.String EXTRA_DATA_TYPE = "android.media.tv.extra.DATA_TYPE";
public static final java.lang.String EXTRA_DEFAULT_VALUE = "android.media.tv.extra.DEFAULT_VALUE";
public static final java.lang.String EXTRA_EXISTING_COLUMN_NAMES = "android.media.tv.extra.EXISTING_COLUMN_NAMES";
public static final java.lang.String EXTRA_PACKAGE_NAME = "android.media.tv.extra.PACKAGE_NAME";
public static final java.lang.String EXTRA_PREVIEW_PROGRAM_ID = "android.media.tv.extra.PREVIEW_PROGRAM_ID";
public static final java.lang.String EXTRA_RESULT_CODE = "android.media.tv.extra.RESULT_CODE";
public static final java.lang.String EXTRA_WATCH_NEXT_PROGRAM_ID = "android.media.tv.extra.WATCH_NEXT_PROGRAM_ID";
public static final java.lang.String METHOD_ADD_COLUMN = "add_column";
public static final java.lang.String METHOD_BLOCK_PACKAGE = "block_package";
public static final java.lang.String METHOD_GET_BLOCKED_PACKAGES = "get_blocked_packages";
public static final java.lang.String METHOD_GET_COLUMNS = "get_columns";
public static final java.lang.String METHOD_UNBLOCK_PACKAGE = "unblock_package";
public static final int RESULT_ERROR_INVALID_ARGUMENT = 2;
public static final int RESULT_ERROR_IO = 1;
public static final int RESULT_OK = 0;
}
