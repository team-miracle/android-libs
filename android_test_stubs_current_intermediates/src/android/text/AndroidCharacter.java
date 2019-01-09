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

package android.text;
@java.lang.Deprecated()
public class AndroidCharacter
{
public  AndroidCharacter() { throw new RuntimeException("Stub!"); }
public static native  void getDirectionalities(char[] src, byte[] dest, int count);
public static native  int getEastAsianWidth(char input);
public static native  void getEastAsianWidths(char[] src, int start, int count, byte[] dest);
public static native  boolean mirror(char[] text, int start, int count);
public static native  char getMirror(char ch);
public static final int EAST_ASIAN_WIDTH_AMBIGUOUS = 1;
public static final int EAST_ASIAN_WIDTH_FULL_WIDTH = 3;
public static final int EAST_ASIAN_WIDTH_HALF_WIDTH = 2;
public static final int EAST_ASIAN_WIDTH_NARROW = 4;
public static final int EAST_ASIAN_WIDTH_NEUTRAL = 0;
public static final int EAST_ASIAN_WIDTH_WIDE = 5;
}
