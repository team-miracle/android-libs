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

package android.widget;
public abstract class Filter
{
protected static class FilterResults
{
public  FilterResults() { throw new RuntimeException("Stub!"); }
public int count;
public java.lang.Object values;
}
public static interface FilterListener
{
public abstract  void onFilterComplete(int count);
}
public  Filter() { throw new RuntimeException("Stub!"); }
public final  void filter(java.lang.CharSequence constraint) { throw new RuntimeException("Stub!"); }
public final  void filter(java.lang.CharSequence constraint, android.widget.Filter.FilterListener listener) { throw new RuntimeException("Stub!"); }
protected abstract  android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence constraint);
protected abstract  void publishResults(java.lang.CharSequence constraint, android.widget.Filter.FilterResults results);
public  java.lang.CharSequence convertResultToString(java.lang.Object resultValue) { throw new RuntimeException("Stub!"); }
}
