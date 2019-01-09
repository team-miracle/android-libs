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

// $Id: SAXParser.java 584483 2007-10-14 02:54:48Z mrglavas $

package javax.xml.parsers;
public abstract class SAXParser
{
protected  SAXParser() { throw new RuntimeException("Stub!"); }
public  void reset() { throw new RuntimeException("Stub!"); }
public  void parse(java.io.InputStream is, org.xml.sax.HandlerBase hb) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void parse(java.io.InputStream is, org.xml.sax.HandlerBase hb, java.lang.String systemId) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void parse(java.io.InputStream is, org.xml.sax.helpers.DefaultHandler dh) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void parse(java.io.InputStream is, org.xml.sax.helpers.DefaultHandler dh, java.lang.String systemId) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void parse(java.lang.String uri, org.xml.sax.HandlerBase hb) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void parse(java.lang.String uri, org.xml.sax.helpers.DefaultHandler dh) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void parse(java.io.File f, org.xml.sax.HandlerBase hb) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void parse(java.io.File f, org.xml.sax.helpers.DefaultHandler dh) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void parse(org.xml.sax.InputSource is, org.xml.sax.HandlerBase hb) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void parse(org.xml.sax.InputSource is, org.xml.sax.helpers.DefaultHandler dh) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  org.xml.sax.Parser getParser() throws org.xml.sax.SAXException;
public abstract  org.xml.sax.XMLReader getXMLReader() throws org.xml.sax.SAXException;
public abstract  boolean isNamespaceAware();
public abstract  boolean isValidating();
public abstract  void setProperty(java.lang.String name, java.lang.Object value) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException;
public abstract  java.lang.Object getProperty(java.lang.String name) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException;
public  javax.xml.validation.Schema getSchema() { throw new RuntimeException("Stub!"); }
public  boolean isXIncludeAware() { throw new RuntimeException("Stub!"); }
}
