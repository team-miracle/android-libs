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

/*
* (C) Copyright Taligent, Inc. 1996, 1997 - All Rights Reserved
* (C) Copyright IBM Corp. 1996 - 1999 - All Rights Reserved
*
* The original version of this source code and documentation
* is copyrighted and owned by Taligent, Inc., a wholly-owned
* subsidiary of IBM. These materials are provided under terms
* of a License Agreement between Taligent and Sun. This technology
* is protected by multiple US and International patents.
*
* This notice and attribution to Taligent may not be removed.
* Taligent is a registered trademark of Taligent, Inc.
*
*/

package java.util;
public abstract class ResourceBundle
{
public static class Control
{
protected  Control() { throw new RuntimeException("Stub!"); }
public static final  java.util.ResourceBundle.Control getControl(java.util.List<java.lang.String> formats) { throw new RuntimeException("Stub!"); }
public static final  java.util.ResourceBundle.Control getNoFallbackControl(java.util.List<java.lang.String> formats) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getFormats(java.lang.String baseName) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.util.Locale> getCandidateLocales(java.lang.String baseName, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  java.util.Locale getFallbackLocale(java.lang.String baseName, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  java.util.ResourceBundle newBundle(java.lang.String baseName, java.util.Locale locale, java.lang.String format, java.lang.ClassLoader loader, boolean reload) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  long getTimeToLive(java.lang.String baseName, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  boolean needsReload(java.lang.String baseName, java.util.Locale locale, java.lang.String format, java.lang.ClassLoader loader, java.util.ResourceBundle bundle, long loadTime) { throw new RuntimeException("Stub!"); }
public  java.lang.String toBundleName(java.lang.String baseName, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public final  java.lang.String toResourceName(java.lang.String bundleName, java.lang.String suffix) { throw new RuntimeException("Stub!"); }
public static final java.util.List<java.lang.String> FORMAT_CLASS;
public static final java.util.List<java.lang.String> FORMAT_DEFAULT;
public static final java.util.List<java.lang.String> FORMAT_PROPERTIES;
public static final long TTL_DONT_CACHE = -1L;
public static final long TTL_NO_EXPIRATION_CONTROL = -2L;
static { FORMAT_CLASS = null; FORMAT_DEFAULT = null; FORMAT_PROPERTIES = null; }
}
public  ResourceBundle() { throw new RuntimeException("Stub!"); }
public  java.lang.String getBaseBundleName() { throw new RuntimeException("Stub!"); }
public final  java.lang.String getString(java.lang.String key) { throw new RuntimeException("Stub!"); }
public final  java.lang.String[] getStringArray(java.lang.String key) { throw new RuntimeException("Stub!"); }
public final  java.lang.Object getObject(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  java.util.Locale getLocale() { throw new RuntimeException("Stub!"); }
protected  void setParent(java.util.ResourceBundle parent) { throw new RuntimeException("Stub!"); }
public static final  java.util.ResourceBundle getBundle(java.lang.String baseName) { throw new RuntimeException("Stub!"); }
public static final  java.util.ResourceBundle getBundle(java.lang.String baseName, java.util.ResourceBundle.Control control) { throw new RuntimeException("Stub!"); }
public static final  java.util.ResourceBundle getBundle(java.lang.String baseName, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public static final  java.util.ResourceBundle getBundle(java.lang.String baseName, java.util.Locale targetLocale, java.util.ResourceBundle.Control control) { throw new RuntimeException("Stub!"); }
public static  java.util.ResourceBundle getBundle(java.lang.String baseName, java.util.Locale locale, java.lang.ClassLoader loader) { throw new RuntimeException("Stub!"); }
public static  java.util.ResourceBundle getBundle(java.lang.String baseName, java.util.Locale targetLocale, java.lang.ClassLoader loader, java.util.ResourceBundle.Control control) { throw new RuntimeException("Stub!"); }
public static final  void clearCache() { throw new RuntimeException("Stub!"); }
public static final  void clearCache(java.lang.ClassLoader loader) { throw new RuntimeException("Stub!"); }
protected abstract  java.lang.Object handleGetObject(java.lang.String key);
public abstract  java.util.Enumeration<java.lang.String> getKeys();
public  boolean containsKey(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.lang.String> keySet() { throw new RuntimeException("Stub!"); }
protected  java.util.Set<java.lang.String> handleKeySet() { throw new RuntimeException("Stub!"); }
protected java.util.ResourceBundle parent;
}
