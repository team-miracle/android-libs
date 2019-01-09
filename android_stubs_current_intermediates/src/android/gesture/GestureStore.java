/*
* Copyright (C) 2008-2009 The Android Open Source Project
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

package android.gesture;
public class GestureStore
{
public  GestureStore() { throw new RuntimeException("Stub!"); }
public  void setOrientationStyle(int style) { throw new RuntimeException("Stub!"); }
public  int getOrientationStyle() { throw new RuntimeException("Stub!"); }
public  void setSequenceType(int type) { throw new RuntimeException("Stub!"); }
public  int getSequenceType() { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.lang.String> getGestureEntries() { throw new RuntimeException("Stub!"); }
public  java.util.ArrayList<android.gesture.Prediction> recognize(android.gesture.Gesture gesture) { throw new RuntimeException("Stub!"); }
public  void addGesture(java.lang.String entryName, android.gesture.Gesture gesture) { throw new RuntimeException("Stub!"); }
public  void removeGesture(java.lang.String entryName, android.gesture.Gesture gesture) { throw new RuntimeException("Stub!"); }
public  void removeEntry(java.lang.String entryName) { throw new RuntimeException("Stub!"); }
public  java.util.ArrayList<android.gesture.Gesture> getGestures(java.lang.String entryName) { throw new RuntimeException("Stub!"); }
public  boolean hasChanged() { throw new RuntimeException("Stub!"); }
public  void save(java.io.OutputStream stream) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void save(java.io.OutputStream stream, boolean closeStream) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void load(java.io.InputStream stream) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void load(java.io.InputStream stream, boolean closeStream) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static final int ORIENTATION_INVARIANT = 1;
public static final int ORIENTATION_SENSITIVE = 2;
public static final int SEQUENCE_INVARIANT = 1;
public static final int SEQUENCE_SENSITIVE = 2;
}
