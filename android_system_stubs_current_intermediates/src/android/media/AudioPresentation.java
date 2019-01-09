/*
* Copyright (C) 2018 The Android Open Source Project
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
public final class AudioPresentation
{
AudioPresentation() { throw new RuntimeException("Stub!"); }
public  java.util.Map<java.util.Locale, java.lang.String> getLabels() { throw new RuntimeException("Stub!"); }
public  java.util.Locale getLocale() { throw new RuntimeException("Stub!"); }
public  int getMasteringIndication() { throw new RuntimeException("Stub!"); }
public  boolean hasAudioDescription() { throw new RuntimeException("Stub!"); }
public  boolean hasSpokenSubtitles() { throw new RuntimeException("Stub!"); }
public  boolean hasDialogueEnhancement() { throw new RuntimeException("Stub!"); }
public static final int MASTERED_FOR_3D = 3;
public static final int MASTERED_FOR_HEADPHONE = 4;
public static final int MASTERED_FOR_STEREO = 1;
public static final int MASTERED_FOR_SURROUND = 2;
public static final int MASTERING_NOT_INDICATED = 0;
}
