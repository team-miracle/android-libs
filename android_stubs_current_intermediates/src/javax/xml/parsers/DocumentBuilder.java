/*
* Licensed to the Apache Software Foundation (ASF) under one or more
* contributor license agreements.  See the NOTICE file distributed with
* this work for additional information regarding copyright ownership.
* The ASF licenses this file to You under the Apache License, Version 2.0
* (the "License"); you may not use this file except in compliance with
* the License.  You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

// $Id: DocumentBuilder.java 584483 2007-10-14 02:54:48Z mrglavas $

package javax.xml.parsers;
public abstract class DocumentBuilder
{
protected  DocumentBuilder() { throw new RuntimeException("Stub!"); }
public  void reset() { throw new RuntimeException("Stub!"); }
public  org.w3c.dom.Document parse(java.io.InputStream is) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  org.w3c.dom.Document parse(java.io.InputStream is, java.lang.String systemId) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  org.w3c.dom.Document parse(java.lang.String uri) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  org.w3c.dom.Document parse(java.io.File f) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  org.w3c.dom.Document parse(org.xml.sax.InputSource is) throws org.xml.sax.SAXException, java.io.IOException;
public abstract  boolean isNamespaceAware();
public abstract  boolean isValidating();
public abstract  void setEntityResolver(org.xml.sax.EntityResolver er);
public abstract  void setErrorHandler(org.xml.sax.ErrorHandler eh);
public abstract  org.w3c.dom.Document newDocument();
public abstract  org.w3c.dom.DOMImplementation getDOMImplementation();
public  javax.xml.validation.Schema getSchema() { throw new RuntimeException("Stub!"); }
public  boolean isXIncludeAware() { throw new RuntimeException("Stub!"); }
}
