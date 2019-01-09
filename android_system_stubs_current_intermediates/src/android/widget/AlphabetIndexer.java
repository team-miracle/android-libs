/*
* Copyright (C) 2008 The Android Open Source Project
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
public class AlphabetIndexer
  extends android.database.DataSetObserver
  implements android.widget.SectionIndexer
{
public  AlphabetIndexer(android.database.Cursor cursor, int sortedColumnIndex, java.lang.CharSequence alphabet) { throw new RuntimeException("Stub!"); }
public  java.lang.Object[] getSections() { throw new RuntimeException("Stub!"); }
public  void setCursor(android.database.Cursor cursor) { throw new RuntimeException("Stub!"); }
protected  int compare(java.lang.String word, java.lang.String letter) { throw new RuntimeException("Stub!"); }
public  int getPositionForSection(int sectionIndex) { throw new RuntimeException("Stub!"); }
public  int getSectionForPosition(int position) { throw new RuntimeException("Stub!"); }
public  void onChanged() { throw new RuntimeException("Stub!"); }
public  void onInvalidated() { throw new RuntimeException("Stub!"); }
protected java.lang.CharSequence mAlphabet;
protected int mColumnIndex;
protected android.database.Cursor mDataCursor;
}
