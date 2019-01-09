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

package org.w3c.dom.ls;
public interface DOMImplementationLS
{
public abstract  org.w3c.dom.ls.LSParser createLSParser(short mode, java.lang.String schemaType) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.ls.LSSerializer createLSSerializer();
public abstract  org.w3c.dom.ls.LSInput createLSInput();
public abstract  org.w3c.dom.ls.LSOutput createLSOutput();
public static final short MODE_ASYNCHRONOUS = 2;
public static final short MODE_SYNCHRONOUS = 1;
}
