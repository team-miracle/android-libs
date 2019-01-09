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
public interface DOMConfiguration
{
public abstract  void setParameter(java.lang.String name, java.lang.Object value) throws org.w3c.dom.DOMException;
public abstract  java.lang.Object getParameter(java.lang.String name) throws org.w3c.dom.DOMException;
public abstract  boolean canSetParameter(java.lang.String name, java.lang.Object value);
public abstract  org.w3c.dom.DOMStringList getParameterNames();
}
