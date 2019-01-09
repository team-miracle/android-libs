/*
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
package java.beans;
public class PropertyChangeSupport
  implements java.io.Serializable
{
public  PropertyChangeSupport(java.lang.Object sourceBean) { throw new RuntimeException("Stub!"); }
public  void addPropertyChangeListener(java.beans.PropertyChangeListener listener) { throw new RuntimeException("Stub!"); }
public  void removePropertyChangeListener(java.beans.PropertyChangeListener listener) { throw new RuntimeException("Stub!"); }
public  java.beans.PropertyChangeListener[] getPropertyChangeListeners() { throw new RuntimeException("Stub!"); }
public  void addPropertyChangeListener(java.lang.String propertyName, java.beans.PropertyChangeListener listener) { throw new RuntimeException("Stub!"); }
public  void removePropertyChangeListener(java.lang.String propertyName, java.beans.PropertyChangeListener listener) { throw new RuntimeException("Stub!"); }
public  java.beans.PropertyChangeListener[] getPropertyChangeListeners(java.lang.String propertyName) { throw new RuntimeException("Stub!"); }
public  void firePropertyChange(java.lang.String propertyName, java.lang.Object oldValue, java.lang.Object newValue) { throw new RuntimeException("Stub!"); }
public  void firePropertyChange(java.lang.String propertyName, int oldValue, int newValue) { throw new RuntimeException("Stub!"); }
public  void firePropertyChange(java.lang.String propertyName, boolean oldValue, boolean newValue) { throw new RuntimeException("Stub!"); }
public  void firePropertyChange(java.beans.PropertyChangeEvent event) { throw new RuntimeException("Stub!"); }
public  void fireIndexedPropertyChange(java.lang.String propertyName, int index, java.lang.Object oldValue, java.lang.Object newValue) { throw new RuntimeException("Stub!"); }
public  void fireIndexedPropertyChange(java.lang.String propertyName, int index, int oldValue, int newValue) { throw new RuntimeException("Stub!"); }
public  void fireIndexedPropertyChange(java.lang.String propertyName, int index, boolean oldValue, boolean newValue) { throw new RuntimeException("Stub!"); }
public  boolean hasListeners(java.lang.String propertyName) { throw new RuntimeException("Stub!"); }
}
