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
public interface DOMError
{
public abstract  short getSeverity();
public abstract  java.lang.String getMessage();
public abstract  java.lang.String getType();
public abstract  java.lang.Object getRelatedException();
public abstract  java.lang.Object getRelatedData();
public abstract  org.w3c.dom.DOMLocator getLocation();
public static final short SEVERITY_ERROR = 2;
public static final short SEVERITY_FATAL_ERROR = 3;
public static final short SEVERITY_WARNING = 1;
}
