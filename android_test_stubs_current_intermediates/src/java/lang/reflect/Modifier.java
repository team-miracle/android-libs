/*
* Copyright (C) 2014 The Android Open Source Project
* Copyright (c) 1996, 2013, Oracle and/or its affiliates. All rights reserved.
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

package java.lang.reflect;
public class Modifier
{
public  Modifier() { throw new RuntimeException("Stub!"); }
public static  boolean isPublic(int mod) { throw new RuntimeException("Stub!"); }
public static  boolean isPrivate(int mod) { throw new RuntimeException("Stub!"); }
public static  boolean isProtected(int mod) { throw new RuntimeException("Stub!"); }
public static  boolean isStatic(int mod) { throw new RuntimeException("Stub!"); }
public static  boolean isFinal(int mod) { throw new RuntimeException("Stub!"); }
public static  boolean isSynchronized(int mod) { throw new RuntimeException("Stub!"); }
public static  boolean isVolatile(int mod) { throw new RuntimeException("Stub!"); }
public static  boolean isTransient(int mod) { throw new RuntimeException("Stub!"); }
public static  boolean isNative(int mod) { throw new RuntimeException("Stub!"); }
public static  boolean isInterface(int mod) { throw new RuntimeException("Stub!"); }
public static  boolean isAbstract(int mod) { throw new RuntimeException("Stub!"); }
public static  boolean isStrict(int mod) { throw new RuntimeException("Stub!"); }
public static  java.lang.String toString(int mod) { throw new RuntimeException("Stub!"); }
public static  int classModifiers() { throw new RuntimeException("Stub!"); }
public static  int interfaceModifiers() { throw new RuntimeException("Stub!"); }
public static  int constructorModifiers() { throw new RuntimeException("Stub!"); }
public static  int methodModifiers() { throw new RuntimeException("Stub!"); }
public static  int fieldModifiers() { throw new RuntimeException("Stub!"); }
public static  int parameterModifiers() { throw new RuntimeException("Stub!"); }
public static final int ABSTRACT = 1024;
public static final int FINAL = 16;
public static final int INTERFACE = 512;
public static final int NATIVE = 256;
public static final int PRIVATE = 2;
public static final int PROTECTED = 4;
public static final int PUBLIC = 1;
public static final int STATIC = 8;
public static final int STRICT = 2048;
public static final int SYNCHRONIZED = 32;
public static final int TRANSIENT = 128;
public static final int VOLATILE = 64;
}
