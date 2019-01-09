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
public interface LSOutput
{
public abstract  java.io.Writer getCharacterStream();
public abstract  void setCharacterStream(java.io.Writer characterStream);
public abstract  java.io.OutputStream getByteStream();
public abstract  void setByteStream(java.io.OutputStream byteStream);
public abstract  java.lang.String getSystemId();
public abstract  void setSystemId(java.lang.String systemId);
public abstract  java.lang.String getEncoding();
public abstract  void setEncoding(java.lang.String encoding);
}
