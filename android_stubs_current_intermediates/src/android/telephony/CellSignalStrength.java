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

package android.telephony;
public abstract class CellSignalStrength
{
CellSignalStrength() { throw new RuntimeException("Stub!"); }
public abstract  int getLevel();
public abstract  int getAsuLevel();
public abstract  int getDbm();
public abstract  int hashCode();
public abstract  boolean equals(java.lang.Object o);
public static final int SIGNAL_STRENGTH_GOOD = 3;
public static final int SIGNAL_STRENGTH_GREAT = 4;
public static final int SIGNAL_STRENGTH_MODERATE = 2;
public static final int SIGNAL_STRENGTH_NONE_OR_UNKNOWN = 0;
public static final int SIGNAL_STRENGTH_POOR = 1;
}
