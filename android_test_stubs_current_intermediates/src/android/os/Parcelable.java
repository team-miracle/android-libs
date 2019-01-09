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

package android.os;
public interface Parcelable
{
public static interface Creator<T>
{
public abstract  T createFromParcel(android.os.Parcel source);
public abstract  T[] newArray(int size);
}
public static interface ClassLoaderCreator<T>
  extends android.os.Parcelable.Creator<T>
{
public abstract  T createFromParcel(android.os.Parcel source, java.lang.ClassLoader loader);
}
public abstract  int describeContents();
public abstract  void writeToParcel(android.os.Parcel dest, int flags);
public static final int CONTENTS_FILE_DESCRIPTOR = 1;
public static final int PARCELABLE_WRITE_RETURN_VALUE = 1;
}
