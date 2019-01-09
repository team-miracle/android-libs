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
public abstract class AbstractPreferences
  extends java.util.prefs.Preferences
{
protected  AbstractPreferences(java.util.prefs.AbstractPreferences parent, java.lang.String name) { throw new RuntimeException("Stub!"); }
public  void put(java.lang.String key, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  java.lang.String get(java.lang.String key, java.lang.String def) { throw new RuntimeException("Stub!"); }
public  void remove(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  void clear() throws java.util.prefs.BackingStoreException { throw new RuntimeException("Stub!"); }
public  void putInt(java.lang.String key, int value) { throw new RuntimeException("Stub!"); }
public  int getInt(java.lang.String key, int def) { throw new RuntimeException("Stub!"); }
public  void putLong(java.lang.String key, long value) { throw new RuntimeException("Stub!"); }
public  long getLong(java.lang.String key, long def) { throw new RuntimeException("Stub!"); }
public  void putBoolean(java.lang.String key, boolean value) { throw new RuntimeException("Stub!"); }
public  boolean getBoolean(java.lang.String key, boolean def) { throw new RuntimeException("Stub!"); }
public  void putFloat(java.lang.String key, float value) { throw new RuntimeException("Stub!"); }
public  float getFloat(java.lang.String key, float def) { throw new RuntimeException("Stub!"); }
public  void putDouble(java.lang.String key, double value) { throw new RuntimeException("Stub!"); }
public  double getDouble(java.lang.String key, double def) { throw new RuntimeException("Stub!"); }
public  void putByteArray(java.lang.String key, byte[] value) { throw new RuntimeException("Stub!"); }
public  byte[] getByteArray(java.lang.String key, byte[] def) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] keys() throws java.util.prefs.BackingStoreException { throw new RuntimeException("Stub!"); }
public  java.lang.String[] childrenNames() throws java.util.prefs.BackingStoreException { throw new RuntimeException("Stub!"); }
protected final  java.util.prefs.AbstractPreferences[] cachedChildren() { throw new RuntimeException("Stub!"); }
public  java.util.prefs.Preferences parent() { throw new RuntimeException("Stub!"); }
public  java.util.prefs.Preferences node(java.lang.String path) { throw new RuntimeException("Stub!"); }
public  boolean nodeExists(java.lang.String path) throws java.util.prefs.BackingStoreException { throw new RuntimeException("Stub!"); }
public  void removeNode() throws java.util.prefs.BackingStoreException { throw new RuntimeException("Stub!"); }
public  java.lang.String name() { throw new RuntimeException("Stub!"); }
public  java.lang.String absolutePath() { throw new RuntimeException("Stub!"); }
public  boolean isUserNode() { throw new RuntimeException("Stub!"); }
public  void addPreferenceChangeListener(java.util.prefs.PreferenceChangeListener pcl) { throw new RuntimeException("Stub!"); }
public  void removePreferenceChangeListener(java.util.prefs.PreferenceChangeListener pcl) { throw new RuntimeException("Stub!"); }
public  void addNodeChangeListener(java.util.prefs.NodeChangeListener ncl) { throw new RuntimeException("Stub!"); }
public  void removeNodeChangeListener(java.util.prefs.NodeChangeListener ncl) { throw new RuntimeException("Stub!"); }
protected abstract  void putSpi(java.lang.String key, java.lang.String value);
protected abstract  java.lang.String getSpi(java.lang.String key);
protected abstract  void removeSpi(java.lang.String key);
protected abstract  void removeNodeSpi() throws java.util.prefs.BackingStoreException;
protected abstract  java.lang.String[] keysSpi() throws java.util.prefs.BackingStoreException;
protected abstract  java.lang.String[] childrenNamesSpi() throws java.util.prefs.BackingStoreException;
protected  java.util.prefs.AbstractPreferences getChild(java.lang.String nodeName) throws java.util.prefs.BackingStoreException { throw new RuntimeException("Stub!"); }
protected abstract  java.util.prefs.AbstractPreferences childSpi(java.lang.String name);
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  void sync() throws java.util.prefs.BackingStoreException { throw new RuntimeException("Stub!"); }
protected abstract  void syncSpi() throws java.util.prefs.BackingStoreException;
public  void flush() throws java.util.prefs.BackingStoreException { throw new RuntimeException("Stub!"); }
protected abstract  void flushSpi() throws java.util.prefs.BackingStoreException;
protected  boolean isRemoved() { throw new RuntimeException("Stub!"); }
public  void exportNode(java.io.OutputStream os) throws java.io.IOException, java.util.prefs.BackingStoreException { throw new RuntimeException("Stub!"); }
public  void exportSubtree(java.io.OutputStream os) throws java.io.IOException, java.util.prefs.BackingStoreException { throw new RuntimeException("Stub!"); }
protected final java.lang.Object lock;
protected boolean newNode;
}
