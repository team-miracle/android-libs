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
public final class TvContentRating
{
TvContentRating() { throw new RuntimeException("Stub!"); }
public static  android.media.tv.TvContentRating createRating(java.lang.String domain, java.lang.String ratingSystem, java.lang.String rating, java.lang.String... subRatings) { throw new RuntimeException("Stub!"); }
public static  android.media.tv.TvContentRating unflattenFromString(java.lang.String ratingString) { throw new RuntimeException("Stub!"); }
public  java.lang.String getDomain() { throw new RuntimeException("Stub!"); }
public  java.lang.String getRatingSystem() { throw new RuntimeException("Stub!"); }
public  java.lang.String getMainRating() { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getSubRatings() { throw new RuntimeException("Stub!"); }
public  java.lang.String flattenToString() { throw new RuntimeException("Stub!"); }
public  boolean contains(android.media.tv.TvContentRating rating) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public static final android.media.tv.TvContentRating UNRATED;
static { UNRATED = null; }
}
