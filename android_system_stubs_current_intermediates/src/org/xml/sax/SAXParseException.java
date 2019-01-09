// SAX exception class.
// http://www.saxproject.org
// No warranty; no copyright -- use this as you will.
// $Id: SAXParseException.java,v 1.11 2004/04/21 13:05:02 dmegginson Exp $

package org.xml.sax;
public class SAXParseException
  extends org.xml.sax.SAXException
{
public  SAXParseException(java.lang.String message, org.xml.sax.Locator locator) { throw new RuntimeException("Stub!"); }
public  SAXParseException(java.lang.String message, org.xml.sax.Locator locator, java.lang.Exception e) { throw new RuntimeException("Stub!"); }
public  SAXParseException(java.lang.String message, java.lang.String publicId, java.lang.String systemId, int lineNumber, int columnNumber) { throw new RuntimeException("Stub!"); }
public  SAXParseException(java.lang.String message, java.lang.String publicId, java.lang.String systemId, int lineNumber, int columnNumber, java.lang.Exception e) { throw new RuntimeException("Stub!"); }
public  java.lang.String getPublicId() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSystemId() { throw new RuntimeException("Stub!"); }
public  int getLineNumber() { throw new RuntimeException("Stub!"); }
public  int getColumnNumber() { throw new RuntimeException("Stub!"); }
}
