// ContentHandler.java - handle main document content.
// http://www.saxproject.org
// Written by David Megginson
// NO WARRANTY!  This class is in the public domain.
// $Id: ContentHandler.java,v 1.13 2004/04/26 17:50:49 dmegginson Exp $

package org.xml.sax;
public interface ContentHandler
{
public abstract  void setDocumentLocator(org.xml.sax.Locator locator);
public abstract  void startDocument() throws org.xml.sax.SAXException;
public abstract  void endDocument() throws org.xml.sax.SAXException;
public abstract  void startPrefixMapping(java.lang.String prefix, java.lang.String uri) throws org.xml.sax.SAXException;
public abstract  void endPrefixMapping(java.lang.String prefix) throws org.xml.sax.SAXException;
public abstract  void startElement(java.lang.String uri, java.lang.String localName, java.lang.String qName, org.xml.sax.Attributes atts) throws org.xml.sax.SAXException;
public abstract  void endElement(java.lang.String uri, java.lang.String localName, java.lang.String qName) throws org.xml.sax.SAXException;
public abstract  void characters(char[] ch, int start, int length) throws org.xml.sax.SAXException;
public abstract  void ignorableWhitespace(char[] ch, int start, int length) throws org.xml.sax.SAXException;
public abstract  void processingInstruction(java.lang.String target, java.lang.String data) throws org.xml.sax.SAXException;
public abstract  void skippedEntity(java.lang.String name) throws org.xml.sax.SAXException;
}
