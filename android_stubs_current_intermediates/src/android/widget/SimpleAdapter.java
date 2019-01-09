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
public class SimpleAdapter
  extends android.widget.BaseAdapter
  implements android.widget.Filterable, android.widget.ThemedSpinnerAdapter
{
public static interface ViewBinder
{
public abstract  boolean setViewValue(android.view.View view, java.lang.Object data, java.lang.String textRepresentation);
}
public  SimpleAdapter(android.content.Context context, java.util.List<? extends java.util.Map<java.lang.String, ?>> data, int resource, java.lang.String[] from, int[] to) { throw new RuntimeException("Stub!"); }
public  int getCount() { throw new RuntimeException("Stub!"); }
public  java.lang.Object getItem(int position) { throw new RuntimeException("Stub!"); }
public  long getItemId(int position) { throw new RuntimeException("Stub!"); }
public  android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) { throw new RuntimeException("Stub!"); }
public  void setDropDownViewResource(int resource) { throw new RuntimeException("Stub!"); }
public  void setDropDownViewTheme(android.content.res.Resources.Theme theme) { throw new RuntimeException("Stub!"); }
public  android.content.res.Resources.Theme getDropDownViewTheme() { throw new RuntimeException("Stub!"); }
public  android.view.View getDropDownView(int position, android.view.View convertView, android.view.ViewGroup parent) { throw new RuntimeException("Stub!"); }
public  android.widget.SimpleAdapter.ViewBinder getViewBinder() { throw new RuntimeException("Stub!"); }
public  void setViewBinder(android.widget.SimpleAdapter.ViewBinder viewBinder) { throw new RuntimeException("Stub!"); }
public  void setViewImage(android.widget.ImageView v, int value) { throw new RuntimeException("Stub!"); }
public  void setViewImage(android.widget.ImageView v, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void setViewText(android.widget.TextView v, java.lang.String text) { throw new RuntimeException("Stub!"); }
public  android.widget.Filter getFilter() { throw new RuntimeException("Stub!"); }
}
