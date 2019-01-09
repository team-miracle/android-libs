/*
* Copyright (C) 2014 The Android Open Source Project
* Copyright (c) 2003, 2013, Oracle and/or its affiliates. All rights reserved.
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

package java.util;
public abstract class EnumSet<E extends java.lang.Enum<E>>
  extends java.util.AbstractSet<E>
  implements java.lang.Cloneable, java.io.Serializable
{
EnumSet() { throw new RuntimeException("Stub!"); }
public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> noneOf(java.lang.Class<E> elementType) { throw new RuntimeException("Stub!"); }
public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> allOf(java.lang.Class<E> elementType) { throw new RuntimeException("Stub!"); }
public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> copyOf(java.util.EnumSet<E> s) { throw new RuntimeException("Stub!"); }
public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> copyOf(java.util.Collection<E> c) { throw new RuntimeException("Stub!"); }
public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> complementOf(java.util.EnumSet<E> s) { throw new RuntimeException("Stub!"); }
public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> of(E e) { throw new RuntimeException("Stub!"); }
public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> of(E e1, E e2) { throw new RuntimeException("Stub!"); }
public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> of(E e1, E e2, E e3) { throw new RuntimeException("Stub!"); }
public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> of(E e1, E e2, E e3, E e4) { throw new RuntimeException("Stub!"); }
public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> of(E e1, E e2, E e3, E e4, E e5) { throw new RuntimeException("Stub!"); }
@java.lang.SafeVarargs()
public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> of(E first, E... rest) { throw new RuntimeException("Stub!"); }
public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> range(E from, E to) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public  java.util.EnumSet<E> clone() { throw new RuntimeException("Stub!"); }
}
