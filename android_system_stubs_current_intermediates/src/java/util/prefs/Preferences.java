/*
* Copyright (C) 2014 The Android Open Source Project
* Copyright (c) 2000, 2013, Oracle and/or its affiliates. All rights reserved.
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

package java.util.prefs;
public abstract class Preferences
{
protected  Preferences() { throw new RuntimeException("Stub!"); }
public static  java.util.prefs.Preferences userNodeForPackage(java.lang.Class<?> c) { throw new RuntimeException("Stub!"); }
public static  java.util.prefs.Preferences systemNodeForPackage(java.lang.Class<?> c) { throw new RuntimeException("Stub!"); }
public static  java.util.prefs.Preferences userRoot() { throw new RuntimeException("Stub!"); }
public static  java.util.prefs.Preferences systemRoot() { throw new RuntimeException("Stub!"); }
public abstract  void put(java.lang.String key, java.lang.String value);
public abstract  java.lang.String get(java.lang.String key, java.lang.String def);
public abstract  void remove(java.lang.String key);
public abstract  void clear() throws java.util.prefs.BackingStoreException;
public abstract  void putInt(java.lang.String key, int value);
public abstract  int getInt(java.lang.String key, int def);
public abstract  void putLong(java.lang.String key, long value);
public abstract  long getLong(java.lang.String key, long def);
public abstract  void putBoolean(java.lang.String key, boolean value);
public abstract  boolean getBoolean(java.lang.String key, boolean def);
public abstract  void putFloat(java.lang.String key, float value);
public abstract  float getFloat(java.lang.String key, float def);
public abstract  void putDouble(java.lang.String key, double value);
public abstract  double getDouble(java.lang.String key, double def);
public abstract  void putByteArray(java.lang.String key, byte[] value);
public abstract  byte[] getByteArray(java.lang.String key, byte[] def);
public abstract  java.lang.String[] keys() throws java.util.prefs.BackingStoreException;
public abstract  java.lang.String[] childrenNames() throws java.util.prefs.BackingStoreException;
public abstract  java.util.prefs.Preferences parent();
public abstract  java.util.prefs.Preferences node(java.lang.String pathName);
public abstract  boolean nodeExists(java.lang.String pathName) throws java.util.prefs.BackingStoreException;
public abstract  void removeNode() throws java.util.prefs.BackingStoreException;
public abstract  java.lang.String name();
public abstract  java.lang.String absolutePath();
public abstract  boolean isUserNode();
public abstract  java.lang.String toString();
public abstract  void flush() throws java.util.prefs.BackingStoreException;
public abstract  void sync() throws java.util.prefs.BackingStoreException;
public abstract  void addPreferenceChangeListener(java.util.prefs.PreferenceChangeListener pcl);
public abstract  void removePreferenceChangeListener(java.util.prefs.PreferenceChangeListener pcl);
public abstract  void addNodeChangeListener(java.util.prefs.NodeChangeListener ncl);
public abstract  void removeNodeChangeListener(java.util.prefs.NodeChangeListener ncl);
public abstract  void exportNode(java.io.OutputStream os) throws java.io.IOException, java.util.prefs.BackingStoreException;
public abstract  void exportSubtree(java.io.OutputStream os) throws java.io.IOException, java.util.prefs.BackingStoreException;
public static  void importPreferences(java.io.InputStream is) throws java.io.IOException, java.util.prefs.InvalidPreferencesFormatException { throw new RuntimeException("Stub!"); }
public static final int MAX_KEY_LENGTH = 80;
public static final int MAX_NAME_LENGTH = 80;
public static final int MAX_VALUE_LENGTH = 8192;
}
