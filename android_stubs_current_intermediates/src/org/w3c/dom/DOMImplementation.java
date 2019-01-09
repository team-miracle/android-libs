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
public interface DOMImplementation
{
public abstract  boolean hasFeature(java.lang.String feature, java.lang.String version);
public abstract  org.w3c.dom.DocumentType createDocumentType(java.lang.String qualifiedName, java.lang.String publicId, java.lang.String systemId) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.Document createDocument(java.lang.String namespaceURI, java.lang.String qualifiedName, org.w3c.dom.DocumentType doctype) throws org.w3c.dom.DOMException;
public abstract  java.lang.Object getFeature(java.lang.String feature, java.lang.String version);
}
