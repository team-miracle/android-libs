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
public interface LSParser
{
public abstract  org.w3c.dom.DOMConfiguration getDomConfig();
public abstract  org.w3c.dom.ls.LSParserFilter getFilter();
public abstract  void setFilter(org.w3c.dom.ls.LSParserFilter filter);
public abstract  boolean getAsync();
public abstract  boolean getBusy();
public abstract  org.w3c.dom.Document parse(org.w3c.dom.ls.LSInput input) throws org.w3c.dom.DOMException, org.w3c.dom.ls.LSException;
public abstract  org.w3c.dom.Document parseURI(java.lang.String uri) throws org.w3c.dom.DOMException, org.w3c.dom.ls.LSException;
public abstract  org.w3c.dom.Node parseWithContext(org.w3c.dom.ls.LSInput input, org.w3c.dom.Node contextArg, short action) throws org.w3c.dom.DOMException, org.w3c.dom.ls.LSException;
public abstract  void abort();
public static final short ACTION_APPEND_AS_CHILDREN = 1;
public static final short ACTION_INSERT_AFTER = 4;
public static final short ACTION_INSERT_BEFORE = 3;
public static final short ACTION_REPLACE = 5;
public static final short ACTION_REPLACE_CHILDREN = 2;
}
