/*
* Copyright (C) 2008 The Android Open Source Project
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

package android.os;
public class PatternMatcher
  implements android.os.Parcelable
{
public  PatternMatcher(java.lang.String pattern, int type) { throw new RuntimeException("Stub!"); }
public  PatternMatcher(android.os.Parcel src) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getPath() { throw new RuntimeException("Stub!"); }
public final  int getType() { throw new RuntimeException("Stub!"); }
public  boolean match(java.lang.String str) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.os.PatternMatcher> CREATOR;
public static final int PATTERN_ADVANCED_GLOB = 3;
public static final int PATTERN_LITERAL = 0;
public static final int PATTERN_PREFIX = 1;
public static final int PATTERN_SIMPLE_GLOB = 2;
static { CREATOR = null; }
}
