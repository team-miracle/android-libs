// SAX locator interface for document events.
// http://www.saxproject.org
// No warranty; no copyright -- use this as you will.
// $Id: Locator.java,v 1.8 2002/01/30 21:13:47 dbrownell Exp $

package org.xml.sax;
public interface Locator
{
public abstract  java.lang.String getPublicId();
public abstract  java.lang.String getSystemId();
public abstract  int getLineNumber();
public abstract  int getColumnNumber();
}
