// NamespaceSupport.java - generic Namespace support for SAX.
// http://www.saxproject.org
// Written by David Megginson
// This class is in the Public Domain.  NO WARRANTY!
// $Id: NamespaceSupport.java,v 1.15 2004/04/26 17:34:35 dmegginson Exp $

package org.xml.sax.helpers;
public class NamespaceSupport
{
public  NamespaceSupport() { throw new RuntimeException("Stub!"); }
public  void reset() { throw new RuntimeException("Stub!"); }
public  void pushContext() { throw new RuntimeException("Stub!"); }
public  void popContext() { throw new RuntimeException("Stub!"); }
public  boolean declarePrefix(java.lang.String prefix, java.lang.String uri) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] processName(java.lang.String qName, java.lang.String[] parts, boolean isAttribute) { throw new RuntimeException("Stub!"); }
public  java.lang.String getURI(java.lang.String prefix) { throw new RuntimeException("Stub!"); }
public  java.util.Enumeration getPrefixes() { throw new RuntimeException("Stub!"); }
public  java.lang.String getPrefix(java.lang.String uri) { throw new RuntimeException("Stub!"); }
public  java.util.Enumeration getPrefixes(java.lang.String uri) { throw new RuntimeException("Stub!"); }
public  java.util.Enumeration getDeclaredPrefixes() { throw new RuntimeException("Stub!"); }
public  void setNamespaceDeclUris(boolean value) { throw new RuntimeException("Stub!"); }
public  boolean isNamespaceDeclUris() { throw new RuntimeException("Stub!"); }
public static final java.lang.String NSDECL = "http://www.w3.org/xmlns/2000/";
public static final java.lang.String XMLNS = "http://www.w3.org/XML/1998/namespace";
}
