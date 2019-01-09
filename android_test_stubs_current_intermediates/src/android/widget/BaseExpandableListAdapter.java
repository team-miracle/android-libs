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
public abstract class BaseExpandableListAdapter
  implements android.widget.ExpandableListAdapter, android.widget.HeterogeneousExpandableList
{
public  BaseExpandableListAdapter() { throw new RuntimeException("Stub!"); }
public  void registerDataSetObserver(android.database.DataSetObserver observer) { throw new RuntimeException("Stub!"); }
public  void unregisterDataSetObserver(android.database.DataSetObserver observer) { throw new RuntimeException("Stub!"); }
public  void notifyDataSetInvalidated() { throw new RuntimeException("Stub!"); }
public  void notifyDataSetChanged() { throw new RuntimeException("Stub!"); }
public  boolean areAllItemsEnabled() { throw new RuntimeException("Stub!"); }
public  void onGroupCollapsed(int groupPosition) { throw new RuntimeException("Stub!"); }
public  void onGroupExpanded(int groupPosition) { throw new RuntimeException("Stub!"); }
public  long getCombinedChildId(long groupId, long childId) { throw new RuntimeException("Stub!"); }
public  long getCombinedGroupId(long groupId) { throw new RuntimeException("Stub!"); }
public  boolean isEmpty() { throw new RuntimeException("Stub!"); }
public  int getChildType(int groupPosition, int childPosition) { throw new RuntimeException("Stub!"); }
public  int getChildTypeCount() { throw new RuntimeException("Stub!"); }
public  int getGroupType(int groupPosition) { throw new RuntimeException("Stub!"); }
public  int getGroupTypeCount() { throw new RuntimeException("Stub!"); }
}
