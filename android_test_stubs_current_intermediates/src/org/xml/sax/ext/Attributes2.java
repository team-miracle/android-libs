// Attributes2.java - extended Attributes
// http://www.saxproject.org
// Public Domain: no warranty.
// $Id: Attributes2.java,v 1.6 2004/03/08 13:01:00 dmegginson Exp $

package org.xml.sax.ext;
public interface Attributes2
  extends org.xml.sax.Attributes
{
public abstract  boolean isDeclared(int index);
public abstract  boolean isDeclared(java.lang.String qName);
public abstract  boolean isDeclared(java.lang.String uri, java.lang.String localName);
public abstract  boolean isSpecified(int index);
public abstract  boolean isSpecified(java.lang.String uri, java.lang.String localName);
public abstract  boolean isSpecified(java.lang.String qName);
}
