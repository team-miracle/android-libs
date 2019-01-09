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

package android.view;
public abstract class LayoutInflater
{
public static interface Filter
{
@java.lang.SuppressWarnings(value={"unchecked"})
public abstract  boolean onLoadClass(java.lang.Class clazz);
}
public static interface Factory
{
public abstract  android.view.View onCreateView(java.lang.String name, android.content.Context context, android.util.AttributeSet attrs);
}
public static interface Factory2
  extends android.view.LayoutInflater.Factory
{
public abstract  android.view.View onCreateView(android.view.View parent, java.lang.String name, android.content.Context context, android.util.AttributeSet attrs);
}
protected  LayoutInflater(android.content.Context context) { throw new RuntimeException("Stub!"); }
protected  LayoutInflater(android.view.LayoutInflater original, android.content.Context newContext) { throw new RuntimeException("Stub!"); }
public static  android.view.LayoutInflater from(android.content.Context context) { throw new RuntimeException("Stub!"); }
public abstract  android.view.LayoutInflater cloneInContext(android.content.Context newContext);
public  android.content.Context getContext() { throw new RuntimeException("Stub!"); }
public final  android.view.LayoutInflater.Factory getFactory() { throw new RuntimeException("Stub!"); }
public final  android.view.LayoutInflater.Factory2 getFactory2() { throw new RuntimeException("Stub!"); }
public  void setFactory(android.view.LayoutInflater.Factory factory) { throw new RuntimeException("Stub!"); }
public  void setFactory2(android.view.LayoutInflater.Factory2 factory) { throw new RuntimeException("Stub!"); }
public  android.view.LayoutInflater.Filter getFilter() { throw new RuntimeException("Stub!"); }
public  void setFilter(android.view.LayoutInflater.Filter filter) { throw new RuntimeException("Stub!"); }
public  android.view.View inflate(int resource, android.view.ViewGroup root) { throw new RuntimeException("Stub!"); }
public  android.view.View inflate(org.xmlpull.v1.XmlPullParser parser, android.view.ViewGroup root) { throw new RuntimeException("Stub!"); }
public  android.view.View inflate(int resource, android.view.ViewGroup root, boolean attachToRoot) { throw new RuntimeException("Stub!"); }
public  android.view.View inflate(org.xmlpull.v1.XmlPullParser parser, android.view.ViewGroup root, boolean attachToRoot) { throw new RuntimeException("Stub!"); }
public final  android.view.View createView(java.lang.String name, java.lang.String prefix, android.util.AttributeSet attrs) throws java.lang.ClassNotFoundException, android.view.InflateException { throw new RuntimeException("Stub!"); }
protected  android.view.View onCreateView(java.lang.String name, android.util.AttributeSet attrs) throws java.lang.ClassNotFoundException { throw new RuntimeException("Stub!"); }
protected  android.view.View onCreateView(android.view.View parent, java.lang.String name, android.util.AttributeSet attrs) throws java.lang.ClassNotFoundException { throw new RuntimeException("Stub!"); }
}
