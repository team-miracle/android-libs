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
public interface ExpandableListAdapter
{
public abstract  void registerDataSetObserver(android.database.DataSetObserver observer);
public abstract  void unregisterDataSetObserver(android.database.DataSetObserver observer);
public abstract  int getGroupCount();
public abstract  int getChildrenCount(int groupPosition);
public abstract  java.lang.Object getGroup(int groupPosition);
public abstract  java.lang.Object getChild(int groupPosition, int childPosition);
public abstract  long getGroupId(int groupPosition);
public abstract  long getChildId(int groupPosition, int childPosition);
public abstract  boolean hasStableIds();
public abstract  android.view.View getGroupView(int groupPosition, boolean isExpanded, android.view.View convertView, android.view.ViewGroup parent);
public abstract  android.view.View getChildView(int groupPosition, int childPosition, boolean isLastChild, android.view.View convertView, android.view.ViewGroup parent);
public abstract  boolean isChildSelectable(int groupPosition, int childPosition);
public abstract  boolean areAllItemsEnabled();
public abstract  boolean isEmpty();
public abstract  void onGroupExpanded(int groupPosition);
public abstract  void onGroupCollapsed(int groupPosition);
public abstract  long getCombinedChildId(long groupId, long childId);
public abstract  long getCombinedGroupId(long groupId);
}
