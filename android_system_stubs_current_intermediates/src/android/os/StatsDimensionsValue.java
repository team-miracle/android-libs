/*
* Copyright 2018 The Android Open Source Project
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
public final class StatsDimensionsValue
  implements android.os.Parcelable
{
StatsDimensionsValue() { throw new RuntimeException("Stub!"); }
public  int getField() { throw new RuntimeException("Stub!"); }
public  java.lang.String getStringValue() { throw new RuntimeException("Stub!"); }
public  int getIntValue() { throw new RuntimeException("Stub!"); }
public  long getLongValue() { throw new RuntimeException("Stub!"); }
public  boolean getBooleanValue() { throw new RuntimeException("Stub!"); }
public  float getFloatValue() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.os.StatsDimensionsValue> getTupleValueList() { throw new RuntimeException("Stub!"); }
public  int getValueType() { throw new RuntimeException("Stub!"); }
public  boolean isValueType(int valueType) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public static final int BOOLEAN_VALUE_TYPE = 5;
public static final android.os.Parcelable.Creator<android.os.StatsDimensionsValue> CREATOR;
public static final int FLOAT_VALUE_TYPE = 6;
public static final int INT_VALUE_TYPE = 3;
public static final int LONG_VALUE_TYPE = 4;
public static final int STRING_VALUE_TYPE = 2;
public static final int TUPLE_VALUE_TYPE = 7;
static { CREATOR = null; }
}
