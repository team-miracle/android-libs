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
public class ViewDebug
{
@java.lang.annotation.Target(value={java.lang.annotation.ElementType.FIELD,java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(value=java.lang.annotation.RetentionPolicy.RUNTIME)
public static @interface ExportedProperty
{
boolean resolveId() default false;
android.view.ViewDebug.IntToString[] mapping() default {};
android.view.ViewDebug.IntToString[] indexMapping() default {};
android.view.ViewDebug.FlagToString[] flagMapping() default {};
boolean deepExport() default false;
java.lang.String prefix() default "";
java.lang.String category() default "";
boolean formatToHexString() default false;
boolean hasAdjacentMapping() default false;
}
@java.lang.annotation.Target(value={java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(value=java.lang.annotation.RetentionPolicy.RUNTIME)
public static @interface IntToString
{
int from();
java.lang.String to();
}
@java.lang.annotation.Target(value={java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(value=java.lang.annotation.RetentionPolicy.RUNTIME)
public static @interface FlagToString
{
int mask();
int equals();
java.lang.String name();
boolean outputIf() default true;
}
@java.lang.annotation.Target(value={java.lang.annotation.ElementType.FIELD,java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(value=java.lang.annotation.RetentionPolicy.RUNTIME)
public static @interface CapturedViewProperty
{
boolean retrieveReturn() default false;
}
@java.lang.Deprecated()
public static enum HierarchyTraceType
{
BUILD_CACHE(),
DRAW(),
INVALIDATE(),
INVALIDATE_CHILD(),
INVALIDATE_CHILD_IN_PARENT(),
ON_LAYOUT(),
ON_MEASURE(),
REQUEST_LAYOUT();
}
@java.lang.Deprecated()
public static enum RecyclerTraceType
{
BIND_VIEW(),
MOVE_FROM_ACTIVE_TO_SCRAP_HEAP(),
MOVE_TO_SCRAP_HEAP(),
NEW_VIEW(),
RECYCLE_FROM_ACTIVE_HEAP(),
RECYCLE_FROM_SCRAP_HEAP();
}
public  ViewDebug() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
@java.lang.SuppressWarnings(value={"UnusedParameters","deprecation"})
public static  void trace(android.view.View view, android.view.ViewDebug.RecyclerTraceType type, int... parameters) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
@java.lang.SuppressWarnings(value={"UnusedParameters"})
public static  void startRecyclerTracing(java.lang.String prefix, android.view.View view) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
@java.lang.SuppressWarnings(value={"UnusedParameters"})
public static  void stopRecyclerTracing() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
@java.lang.SuppressWarnings(value={"UnusedParameters","deprecation"})
public static  void trace(android.view.View view, android.view.ViewDebug.HierarchyTraceType type) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
@java.lang.SuppressWarnings(value={"UnusedParameters"})
public static  void startHierarchyTracing(java.lang.String prefix, android.view.View view) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  void stopHierarchyTracing() { throw new RuntimeException("Stub!"); }
public static  void dumpCapturedView(java.lang.String tag, java.lang.Object view) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static final boolean TRACE_HIERARCHY = false;
@java.lang.Deprecated()
public static final boolean TRACE_RECYCLER = false;
}
