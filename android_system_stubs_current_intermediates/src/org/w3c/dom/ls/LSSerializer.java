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
public interface LSSerializer
{
public abstract  org.w3c.dom.DOMConfiguration getDomConfig();
public abstract  java.lang.String getNewLine();
public abstract  void setNewLine(java.lang.String newLine);
public abstract  boolean write(org.w3c.dom.Node nodeArg, org.w3c.dom.ls.LSOutput destination) throws org.w3c.dom.ls.LSException;
public abstract  boolean writeToURI(org.w3c.dom.Node nodeArg, java.lang.String uri) throws org.w3c.dom.ls.LSException;
public abstract  java.lang.String writeToString(org.w3c.dom.Node nodeArg) throws org.w3c.dom.DOMException, org.w3c.dom.ls.LSException;
}
