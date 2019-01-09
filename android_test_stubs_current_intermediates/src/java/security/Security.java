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

package java.security;
public final class Security
{
Security() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  java.lang.String getAlgorithmProperty(java.lang.String algName, java.lang.String propName) { throw new RuntimeException("Stub!"); }
public static synchronized  int insertProviderAt(java.security.Provider provider, int position) { throw new RuntimeException("Stub!"); }
public static  int addProvider(java.security.Provider provider) { throw new RuntimeException("Stub!"); }
public static synchronized  void removeProvider(java.lang.String name) { throw new RuntimeException("Stub!"); }
public static  java.security.Provider[] getProviders() { throw new RuntimeException("Stub!"); }
public static  java.security.Provider getProvider(java.lang.String name) { throw new RuntimeException("Stub!"); }
public static  java.security.Provider[] getProviders(java.lang.String filter) { throw new RuntimeException("Stub!"); }
public static  java.security.Provider[] getProviders(java.util.Map<java.lang.String, java.lang.String> filter) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getProperty(java.lang.String key) { throw new RuntimeException("Stub!"); }
public static  void setProperty(java.lang.String key, java.lang.String datum) { throw new RuntimeException("Stub!"); }
public static  java.util.Set<java.lang.String> getAlgorithms(java.lang.String serviceName) { throw new RuntimeException("Stub!"); }
}
