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
public interface CharacterData
  extends org.w3c.dom.Node
{
public abstract  java.lang.String getData() throws org.w3c.dom.DOMException;
public abstract  void setData(java.lang.String data) throws org.w3c.dom.DOMException;
public abstract  int getLength();
public abstract  java.lang.String substringData(int offset, int count) throws org.w3c.dom.DOMException;
public abstract  void appendData(java.lang.String arg) throws org.w3c.dom.DOMException;
public abstract  void insertData(int offset, java.lang.String arg) throws org.w3c.dom.DOMException;
public abstract  void deleteData(int offset, int count) throws org.w3c.dom.DOMException;
public abstract  void replaceData(int offset, int count, java.lang.String arg) throws org.w3c.dom.DOMException;
}
