/*
* Copyright (C) 2007 The Android Open Source Project
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

package android.util;
public class StateSet
{
StateSet() { throw new RuntimeException("Stub!"); }
public static  boolean isWildCard(int[] stateSetOrSpec) { throw new RuntimeException("Stub!"); }
public static  boolean stateSetMatches(int[] stateSpec, int[] stateSet) { throw new RuntimeException("Stub!"); }
public static  boolean stateSetMatches(int[] stateSpec, int state) { throw new RuntimeException("Stub!"); }
public static  int[] trimStateSet(int[] states, int newSize) { throw new RuntimeException("Stub!"); }
public static  java.lang.String dump(int[] states) { throw new RuntimeException("Stub!"); }
public static final int[] NOTHING = null;
public static final int[] WILD_CARD = null;
}
