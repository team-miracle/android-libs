// SAX error handler.
// http://www.saxproject.org
// No warranty; no copyright -- use this as you will.
// $Id: ErrorHandler.java,v 1.10 2004/03/08 13:01:00 dmegginson Exp $

package org.xml.sax;
public interface ErrorHandler
{
public abstract  void warning(org.xml.sax.SAXParseException exception) throws org.xml.sax.SAXException;
public abstract  void error(org.xml.sax.SAXParseException exception) throws org.xml.sax.SAXException;
public abstract  void fatalError(org.xml.sax.SAXParseException exception) throws org.xml.sax.SAXException;
}
