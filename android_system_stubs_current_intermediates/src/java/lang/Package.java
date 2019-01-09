/*
* Copyright (C) 2014 The Android Open Source Project
* Copyright (c) 1997, 2013, Oracle and/or its affiliates. All rights reserved.
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

package java.lang;
public class Package
  implements java.lang.reflect.AnnotatedElement
{
Package() { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSpecificationTitle() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSpecificationVersion() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSpecificationVendor() { throw new RuntimeException("Stub!"); }
public  java.lang.String getImplementationTitle() { throw new RuntimeException("Stub!"); }
public  java.lang.String getImplementationVersion() { throw new RuntimeException("Stub!"); }
public  java.lang.String getImplementationVendor() { throw new RuntimeException("Stub!"); }
public  boolean isSealed() { throw new RuntimeException("Stub!"); }
public  boolean isSealed(java.net.URL url) { throw new RuntimeException("Stub!"); }
public  boolean isCompatibleWith(java.lang.String desired) throws java.lang.NumberFormatException { throw new RuntimeException("Stub!"); }
public static  java.lang.Package getPackage(java.lang.String name) { throw new RuntimeException("Stub!"); }
public static  java.lang.Package[] getPackages() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public <A extends java.lang.annotation.Annotation> A getAnnotation(java.lang.Class<A> annotationClass) { throw new RuntimeException("Stub!"); }
public  boolean isAnnotationPresent(java.lang.Class<? extends java.lang.annotation.Annotation> annotationClass) { throw new RuntimeException("Stub!"); }
public <A extends java.lang.annotation.Annotation> A[] getAnnotationsByType(java.lang.Class<A> annotationClass) { throw new RuntimeException("Stub!"); }
public  java.lang.annotation.Annotation[] getAnnotations() { throw new RuntimeException("Stub!"); }
public <A extends java.lang.annotation.Annotation> A getDeclaredAnnotation(java.lang.Class<A> annotationClass) { throw new RuntimeException("Stub!"); }
public <A extends java.lang.annotation.Annotation> A[] getDeclaredAnnotationsByType(java.lang.Class<A> annotationClass) { throw new RuntimeException("Stub!"); }
public  java.lang.annotation.Annotation[] getDeclaredAnnotations() { throw new RuntimeException("Stub!"); }
}
