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
public abstract class BaseAdapter
  implements android.widget.ListAdapter, android.widget.SpinnerAdapter
{
public  BaseAdapter() { throw new RuntimeException("Stub!"); }
public  boolean hasStableIds() { throw new RuntimeException("Stub!"); }
public  void registerDataSetObserver(android.database.DataSetObserver observer) { throw new RuntimeException("Stub!"); }
public  void unregisterDataSetObserver(android.database.DataSetObserver observer) { throw new RuntimeException("Stub!"); }
public  void notifyDataSetChanged() { throw new RuntimeException("Stub!"); }
public  void notifyDataSetInvalidated() { throw new RuntimeException("Stub!"); }
public  boolean areAllItemsEnabled() { throw new RuntimeException("Stub!"); }
public  boolean isEnabled(int position) { throw new RuntimeException("Stub!"); }
public  android.view.View getDropDownView(int position, android.view.View convertView, android.view.ViewGroup parent) { throw new RuntimeException("Stub!"); }
public  int getItemViewType(int position) { throw new RuntimeException("Stub!"); }
public  int getViewTypeCount() { throw new RuntimeException("Stub!"); }
public  boolean isEmpty() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence[] getAutofillOptions() { throw new RuntimeException("Stub!"); }
public  void setAutofillOptions(java.lang.CharSequence... options) { throw new RuntimeException("Stub!"); }
}
