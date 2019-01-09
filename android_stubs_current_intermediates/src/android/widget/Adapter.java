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
public interface Adapter
{
public abstract  void registerDataSetObserver(android.database.DataSetObserver observer);
public abstract  void unregisterDataSetObserver(android.database.DataSetObserver observer);
public abstract  int getCount();
public abstract  java.lang.Object getItem(int position);
public abstract  long getItemId(int position);
public abstract  boolean hasStableIds();
public abstract  android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent);
public abstract  int getItemViewType(int position);
public abstract  int getViewTypeCount();
public abstract  boolean isEmpty();
default public  java.lang.CharSequence[] getAutofillOptions() { throw new RuntimeException("Stub!"); }
public static final int IGNORE_ITEM_VIEW_TYPE = -1;
public static final int NO_SELECTION = -2147483648;
}
