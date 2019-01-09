/*
* Copyright (C) 2012 The Android Open Source Project
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
public class MediaSyncEvent
{
MediaSyncEvent() { throw new RuntimeException("Stub!"); }
public static  android.media.MediaSyncEvent createEvent(int eventType) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  android.media.MediaSyncEvent setAudioSessionId(int audioSessionId) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  int getType() { throw new RuntimeException("Stub!"); }
public  int getAudioSessionId() { throw new RuntimeException("Stub!"); }
public static final int SYNC_EVENT_NONE = 0;
public static final int SYNC_EVENT_PRESENTATION_COMPLETE = 1;
}
