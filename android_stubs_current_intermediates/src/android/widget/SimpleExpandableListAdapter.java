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
public class SimpleExpandableListAdapter
  extends android.widget.BaseExpandableListAdapter
{
public  SimpleExpandableListAdapter(android.content.Context context, java.util.List<? extends java.util.Map<java.lang.String, ?>> groupData, int groupLayout, java.lang.String[] groupFrom, int[] groupTo, java.util.List<? extends java.util.List<? extends java.util.Map<java.lang.String, ?>>> childData, int childLayout, java.lang.String[] childFrom, int[] childTo) { throw new RuntimeException("Stub!"); }
public  SimpleExpandableListAdapter(android.content.Context context, java.util.List<? extends java.util.Map<java.lang.String, ?>> groupData, int expandedGroupLayout, int collapsedGroupLayout, java.lang.String[] groupFrom, int[] groupTo, java.util.List<? extends java.util.List<? extends java.util.Map<java.lang.String, ?>>> childData, int childLayout, java.lang.String[] childFrom, int[] childTo) { throw new RuntimeException("Stub!"); }
public  SimpleExpandableListAdapter(android.content.Context context, java.util.List<? extends java.util.Map<java.lang.String, ?>> groupData, int expandedGroupLayout, int collapsedGroupLayout, java.lang.String[] groupFrom, int[] groupTo, java.util.List<? extends java.util.List<? extends java.util.Map<java.lang.String, ?>>> childData, int childLayout, int lastChildLayout, java.lang.String[] childFrom, int[] childTo) { throw new RuntimeException("Stub!"); }
public  java.lang.Object getChild(int groupPosition, int childPosition) { throw new RuntimeException("Stub!"); }
public  long getChildId(int groupPosition, int childPosition) { throw new RuntimeException("Stub!"); }
public  android.view.View getChildView(int groupPosition, int childPosition, boolean isLastChild, android.view.View convertView, android.view.ViewGroup parent) { throw new RuntimeException("Stub!"); }
public  android.view.View newChildView(boolean isLastChild, android.view.ViewGroup parent) { throw new RuntimeException("Stub!"); }
public  int getChildrenCount(int groupPosition) { throw new RuntimeException("Stub!"); }
public  java.lang.Object getGroup(int groupPosition) { throw new RuntimeException("Stub!"); }
public  int getGroupCount() { throw new RuntimeException("Stub!"); }
public  long getGroupId(int groupPosition) { throw new RuntimeException("Stub!"); }
public  android.view.View getGroupView(int groupPosition, boolean isExpanded, android.view.View convertView, android.view.ViewGroup parent) { throw new RuntimeException("Stub!"); }
public  android.view.View newGroupView(boolean isExpanded, android.view.ViewGroup parent) { throw new RuntimeException("Stub!"); }
public  boolean isChildSelectable(int groupPosition, int childPosition) { throw new RuntimeException("Stub!"); }
public  boolean hasStableIds() { throw new RuntimeException("Stub!"); }
}
