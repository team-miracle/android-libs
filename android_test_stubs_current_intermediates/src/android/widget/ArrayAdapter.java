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

package android.widget;
public class ArrayAdapter<T>
  extends android.widget.BaseAdapter
  implements android.widget.Filterable, android.widget.ThemedSpinnerAdapter
{
public  ArrayAdapter(android.content.Context context, int resource) { throw new RuntimeException("Stub!"); }
public  ArrayAdapter(android.content.Context context, int resource, int textViewResourceId) { throw new RuntimeException("Stub!"); }
public  ArrayAdapter(android.content.Context context, int resource, T[] objects) { throw new RuntimeException("Stub!"); }
public  ArrayAdapter(android.content.Context context, int resource, int textViewResourceId, T[] objects) { throw new RuntimeException("Stub!"); }
public  ArrayAdapter(android.content.Context context, int resource, java.util.List<T> objects) { throw new RuntimeException("Stub!"); }
public  ArrayAdapter(android.content.Context context, int resource, int textViewResourceId, java.util.List<T> objects) { throw new RuntimeException("Stub!"); }
public  void add(T object) { throw new RuntimeException("Stub!"); }
public  void addAll(java.util.Collection<? extends T> collection) { throw new RuntimeException("Stub!"); }
public  void addAll(T... items) { throw new RuntimeException("Stub!"); }
public  void insert(T object, int index) { throw new RuntimeException("Stub!"); }
public  void remove(T object) { throw new RuntimeException("Stub!"); }
public  void clear() { throw new RuntimeException("Stub!"); }
public  void sort(java.util.Comparator<? super T> comparator) { throw new RuntimeException("Stub!"); }
public  void notifyDataSetChanged() { throw new RuntimeException("Stub!"); }
public  void setNotifyOnChange(boolean notifyOnChange) { throw new RuntimeException("Stub!"); }
public  android.content.Context getContext() { throw new RuntimeException("Stub!"); }
public  int getCount() { throw new RuntimeException("Stub!"); }
public  T getItem(int position) { throw new RuntimeException("Stub!"); }
public  int getPosition(T item) { throw new RuntimeException("Stub!"); }
public  long getItemId(int position) { throw new RuntimeException("Stub!"); }
public  android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) { throw new RuntimeException("Stub!"); }
public  void setDropDownViewResource(int resource) { throw new RuntimeException("Stub!"); }
public  void setDropDownViewTheme(android.content.res.Resources.Theme theme) { throw new RuntimeException("Stub!"); }
public  android.content.res.Resources.Theme getDropDownViewTheme() { throw new RuntimeException("Stub!"); }
public  android.view.View getDropDownView(int position, android.view.View convertView, android.view.ViewGroup parent) { throw new RuntimeException("Stub!"); }
public static  android.widget.ArrayAdapter<java.lang.CharSequence> createFromResource(android.content.Context context, int textArrayResId, int textViewResId) { throw new RuntimeException("Stub!"); }
public  android.widget.Filter getFilter() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence[] getAutofillOptions() { throw new RuntimeException("Stub!"); }
}
