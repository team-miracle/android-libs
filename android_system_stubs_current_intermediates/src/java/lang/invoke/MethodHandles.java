/*
* Copyright (c) 2008, 2017, Oracle and/or its affiliates. All rights reserved.
* DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
*
* This code is free software; you can redistribute it and/or modify it
* under the terms of the GNU General Public License version 2 only, as
* published by the Free Software Foundation.  Oracle designates this
* particular file as subject to the "Classpath" exception as provided
* by Oracle in the LICENSE file that accompanied this code.
*
* This code is distributed in the hope that it will be useful, but WITHOUT
* ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
* FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
* version 2 for more details (a copy is included in the LICENSE file that
* accompanied this code).
*
* You should have received a copy of the GNU General Public License version
* 2 along with this work; if not, write to the Free Software Foundation,
* Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
*
* Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
* or visit www.oracle.com if you need additional information or have any
* questions.
*/

package java.lang.invoke;
public class MethodHandles
{
public static final class Lookup
{
Lookup() { throw new RuntimeException("Stub!"); }
public  java.lang.Class<?> lookupClass() { throw new RuntimeException("Stub!"); }
public  int lookupModes() { throw new RuntimeException("Stub!"); }
public  java.lang.invoke.MethodHandles.Lookup in(java.lang.Class<?> requestedLookupClass) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  java.lang.invoke.MethodHandle findStatic(java.lang.Class<?> refc, java.lang.String name, java.lang.invoke.MethodType type) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException { throw new RuntimeException("Stub!"); }
public  java.lang.invoke.MethodHandle findVirtual(java.lang.Class<?> refc, java.lang.String name, java.lang.invoke.MethodType type) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException { throw new RuntimeException("Stub!"); }
public  java.lang.invoke.MethodHandle findConstructor(java.lang.Class<?> refc, java.lang.invoke.MethodType type) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException { throw new RuntimeException("Stub!"); }
public  java.lang.invoke.MethodHandle findSpecial(java.lang.Class<?> refc, java.lang.String name, java.lang.invoke.MethodType type, java.lang.Class<?> specialCaller) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException { throw new RuntimeException("Stub!"); }
public  java.lang.invoke.MethodHandle findGetter(java.lang.Class<?> refc, java.lang.String name, java.lang.Class<?> type) throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException { throw new RuntimeException("Stub!"); }
public  java.lang.invoke.MethodHandle findSetter(java.lang.Class<?> refc, java.lang.String name, java.lang.Class<?> type) throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException { throw new RuntimeException("Stub!"); }
public  java.lang.invoke.MethodHandle findStaticGetter(java.lang.Class<?> refc, java.lang.String name, java.lang.Class<?> type) throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException { throw new RuntimeException("Stub!"); }
public  java.lang.invoke.MethodHandle findStaticSetter(java.lang.Class<?> refc, java.lang.String name, java.lang.Class<?> type) throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException { throw new RuntimeException("Stub!"); }
public  java.lang.invoke.MethodHandle bind(java.lang.Object receiver, java.lang.String name, java.lang.invoke.MethodType type) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException { throw new RuntimeException("Stub!"); }
public  java.lang.invoke.MethodHandle unreflect(java.lang.reflect.Method m) throws java.lang.IllegalAccessException { throw new RuntimeException("Stub!"); }
public  java.lang.invoke.MethodHandle unreflectSpecial(java.lang.reflect.Method m, java.lang.Class<?> specialCaller) throws java.lang.IllegalAccessException { throw new RuntimeException("Stub!"); }
public  java.lang.invoke.MethodHandle unreflectConstructor(java.lang.reflect.Constructor<?> c) throws java.lang.IllegalAccessException { throw new RuntimeException("Stub!"); }
public  java.lang.invoke.MethodHandle unreflectGetter(java.lang.reflect.Field f) throws java.lang.IllegalAccessException { throw new RuntimeException("Stub!"); }
public  java.lang.invoke.MethodHandle unreflectSetter(java.lang.reflect.Field f) throws java.lang.IllegalAccessException { throw new RuntimeException("Stub!"); }
public  java.lang.invoke.MethodHandleInfo revealDirect(java.lang.invoke.MethodHandle target) { throw new RuntimeException("Stub!"); }
public static final int PACKAGE = 8;
public static final int PRIVATE = 2;
public static final int PROTECTED = 4;
public static final int PUBLIC = 1;
}
MethodHandles() { throw new RuntimeException("Stub!"); }
public static  java.lang.invoke.MethodHandles.Lookup lookup() { throw new RuntimeException("Stub!"); }
public static  java.lang.invoke.MethodHandles.Lookup publicLookup() { throw new RuntimeException("Stub!"); }
public static <T extends java.lang.reflect.Member> T reflectAs(java.lang.Class<T> expected, java.lang.invoke.MethodHandle target) { throw new RuntimeException("Stub!"); }
public static  java.lang.invoke.MethodHandle arrayElementGetter(java.lang.Class<?> arrayClass) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public static  java.lang.invoke.MethodHandle arrayElementSetter(java.lang.Class<?> arrayClass) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public static  java.lang.invoke.MethodHandle spreadInvoker(java.lang.invoke.MethodType type, int leadingArgCount) { throw new RuntimeException("Stub!"); }
public static  java.lang.invoke.MethodHandle exactInvoker(java.lang.invoke.MethodType type) { throw new RuntimeException("Stub!"); }
public static  java.lang.invoke.MethodHandle invoker(java.lang.invoke.MethodType type) { throw new RuntimeException("Stub!"); }
public static  java.lang.invoke.MethodHandle explicitCastArguments(java.lang.invoke.MethodHandle target, java.lang.invoke.MethodType newType) { throw new RuntimeException("Stub!"); }
public static  java.lang.invoke.MethodHandle permuteArguments(java.lang.invoke.MethodHandle target, java.lang.invoke.MethodType newType, int... reorder) { throw new RuntimeException("Stub!"); }
public static  java.lang.invoke.MethodHandle constant(java.lang.Class<?> type, java.lang.Object value) { throw new RuntimeException("Stub!"); }
public static  java.lang.invoke.MethodHandle identity(java.lang.Class<?> type) { throw new RuntimeException("Stub!"); }
public static  java.lang.invoke.MethodHandle insertArguments(java.lang.invoke.MethodHandle target, int pos, java.lang.Object... values) { throw new RuntimeException("Stub!"); }
public static  java.lang.invoke.MethodHandle dropArguments(java.lang.invoke.MethodHandle target, int pos, java.util.List<java.lang.Class<?>> valueTypes) { throw new RuntimeException("Stub!"); }
public static  java.lang.invoke.MethodHandle dropArguments(java.lang.invoke.MethodHandle target, int pos, java.lang.Class<?>... valueTypes) { throw new RuntimeException("Stub!"); }
public static  java.lang.invoke.MethodHandle filterArguments(java.lang.invoke.MethodHandle target, int pos, java.lang.invoke.MethodHandle... filters) { throw new RuntimeException("Stub!"); }
public static  java.lang.invoke.MethodHandle collectArguments(java.lang.invoke.MethodHandle target, int pos, java.lang.invoke.MethodHandle filter) { throw new RuntimeException("Stub!"); }
public static  java.lang.invoke.MethodHandle filterReturnValue(java.lang.invoke.MethodHandle target, java.lang.invoke.MethodHandle filter) { throw new RuntimeException("Stub!"); }
public static  java.lang.invoke.MethodHandle foldArguments(java.lang.invoke.MethodHandle target, java.lang.invoke.MethodHandle combiner) { throw new RuntimeException("Stub!"); }
public static  java.lang.invoke.MethodHandle guardWithTest(java.lang.invoke.MethodHandle test, java.lang.invoke.MethodHandle target, java.lang.invoke.MethodHandle fallback) { throw new RuntimeException("Stub!"); }
public static  java.lang.invoke.MethodHandle catchException(java.lang.invoke.MethodHandle target, java.lang.Class<? extends java.lang.Throwable> exType, java.lang.invoke.MethodHandle handler) { throw new RuntimeException("Stub!"); }
public static  java.lang.invoke.MethodHandle throwException(java.lang.Class<?> returnType, java.lang.Class<? extends java.lang.Throwable> exType) { throw new RuntimeException("Stub!"); }
}
