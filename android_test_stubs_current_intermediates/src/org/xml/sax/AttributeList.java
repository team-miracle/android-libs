// SAX Attribute List Interface.
// http://www.saxproject.org
// No warranty; no copyright -- use this as you will.
// $Id: AttributeList.java,v 1.7 2004/04/26 17:34:34 dmegginson Exp $

package org.xml.sax;
@java.lang.Deprecated()
public interface AttributeList
{
public abstract  int getLength();
public abstract  java.lang.String getName(int i);
public abstract  java.lang.String getType(int i);
public abstract  java.lang.String getValue(int i);
public abstract  java.lang.String getType(java.lang.String name);
public abstract  java.lang.String getValue(java.lang.String name);
}
