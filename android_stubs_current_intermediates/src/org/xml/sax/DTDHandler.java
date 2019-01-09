// SAX DTD handler.
// http://www.saxproject.org
// No warranty; no copyright -- use this as you will.
// $Id: DTDHandler.java,v 1.8 2002/01/30 21:13:43 dbrownell Exp $

package org.xml.sax;
public interface DTDHandler
{
public abstract  void notationDecl(java.lang.String name, java.lang.String publicId, java.lang.String systemId) throws org.xml.sax.SAXException;
public abstract  void unparsedEntityDecl(java.lang.String name, java.lang.String publicId, java.lang.String systemId, java.lang.String notationName) throws org.xml.sax.SAXException;
}
