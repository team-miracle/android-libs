/*
* Copyright (c) 2004 World Wide Web Consortium,
*
* (Massachusetts Institute of Technology, European Research Consortium for
* Informatics and Mathematics, Keio University). All Rights Reserved. This
* work is distributed under the W3C(r) Software License [1] in the hope that
* it will be useful, but WITHOUT ANY WARRANTY; without even the implied
* warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
*
* [1] http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231
*/

package org.w3c.dom;
public interface NamedNodeMap
{
public abstract  org.w3c.dom.Node getNamedItem(java.lang.String name);
public abstract  org.w3c.dom.Node setNamedItem(org.w3c.dom.Node arg) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.Node removeNamedItem(java.lang.String name) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.Node item(int index);
public abstract  int getLength();
public abstract  org.w3c.dom.Node getNamedItemNS(java.lang.String namespaceURI, java.lang.String localName) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.Node setNamedItemNS(org.w3c.dom.Node arg) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.Node removeNamedItemNS(java.lang.String namespaceURI, java.lang.String localName) throws org.w3c.dom.DOMException;
}
