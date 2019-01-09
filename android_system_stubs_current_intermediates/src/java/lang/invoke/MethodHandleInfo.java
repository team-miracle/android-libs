/*
* Copyright (c) 2012, 2013, Oracle and/or its affiliates. All rights reserved.
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
public interface MethodHandleInfo
{
public abstract  int getReferenceKind();
public abstract  java.lang.Class<?> getDeclaringClass();
public abstract  java.lang.String getName();
public abstract  java.lang.invoke.MethodType getMethodType();
public abstract <T extends java.lang.reflect.Member> T reflectAs(java.lang.Class<T> expected, java.lang.invoke.MethodHandles.Lookup lookup);
public abstract  int getModifiers();
default public  boolean isVarArgs() { throw new RuntimeException("Stub!"); }
public static  java.lang.String referenceKindToString(int referenceKind) { throw new RuntimeException("Stub!"); }
public static  java.lang.String toString(int kind, java.lang.Class<?> defc, java.lang.String name, java.lang.invoke.MethodType type) { throw new RuntimeException("Stub!"); }
public static  boolean refKindIsValid(int refKind) { throw new RuntimeException("Stub!"); }
public static  boolean refKindIsField(int refKind) { throw new RuntimeException("Stub!"); }
public static  java.lang.String refKindName(int refKind) { throw new RuntimeException("Stub!"); }
public static final int REF_getField = 1;
public static final int REF_getStatic = 2;
public static final int REF_invokeInterface = 9;
public static final int REF_invokeSpecial = 7;
public static final int REF_invokeStatic = 6;
public static final int REF_invokeVirtual = 5;
public static final int REF_newInvokeSpecial = 8;
public static final int REF_putField = 3;
public static final int REF_putStatic = 4;
}
