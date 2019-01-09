// SAX entity resolver.
// http://www.saxproject.org
// No warranty; no copyright -- use this as you will.
// $Id: EntityResolver.java,v 1.10 2002/01/30 21:13:44 dbrownell Exp $

package org.xml.sax;
public interface EntityResolver
{
public abstract  org.xml.sax.InputSource resolveEntity(java.lang.String publicId, java.lang.String systemId) throws org.xml.sax.SAXException, java.io.IOException;
}
