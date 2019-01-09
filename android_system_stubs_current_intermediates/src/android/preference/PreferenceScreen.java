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

package android.preference;
public final class PreferenceScreen
  extends android.preference.PreferenceGroup
  implements android.widget.AdapterView.OnItemClickListener, android.content.DialogInterface.OnDismissListener
{
PreferenceScreen() { super((android.content.Context)null,(android.util.AttributeSet)null); throw new RuntimeException("Stub!"); }
public  android.widget.ListAdapter getRootAdapter() { throw new RuntimeException("Stub!"); }
protected  android.widget.ListAdapter onCreateRootAdapter() { throw new RuntimeException("Stub!"); }
public  void bind(android.widget.ListView listView) { throw new RuntimeException("Stub!"); }
protected  void onClick() { throw new RuntimeException("Stub!"); }
public  void onDismiss(android.content.DialogInterface dialog) { throw new RuntimeException("Stub!"); }
public  android.app.Dialog getDialog() { throw new RuntimeException("Stub!"); }
public  void onItemClick(android.widget.AdapterView parent, android.view.View view, int position, long id) { throw new RuntimeException("Stub!"); }
protected  boolean isOnSameScreenAsChildren() { throw new RuntimeException("Stub!"); }
protected  android.os.Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
protected  void onRestoreInstanceState(android.os.Parcelable state) { throw new RuntimeException("Stub!"); }
}
