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

// $Id: SAXParserFactory.java 884950 2009-11-27 18:46:18Z mrglavas $

package javax.xml.parsers;
public abstract class SAXParserFactory
{
protected  SAXParserFactory() { throw new RuntimeException("Stub!"); }
public static  javax.xml.parsers.SAXParserFactory newInstance() { throw new RuntimeException("Stub!"); }
public static  javax.xml.parsers.SAXParserFactory newInstance(java.lang.String factoryClassName, java.lang.ClassLoader classLoader) { throw new RuntimeException("Stub!"); }
public abstract  javax.xml.parsers.SAXParser newSAXParser() throws javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXException;
public  void setNamespaceAware(boolean awareness) { throw new RuntimeException("Stub!"); }
public  void setValidating(boolean validating) { throw new RuntimeException("Stub!"); }
public  boolean isNamespaceAware() { throw new RuntimeException("Stub!"); }
public  boolean isValidating() { throw new RuntimeException("Stub!"); }
public abstract  void setFeature(java.lang.String name, boolean value) throws javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException;
public abstract  boolean getFeature(java.lang.String name) throws javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException;
public  javax.xml.validation.Schema getSchema() { throw new RuntimeException("Stub!"); }
public  void setSchema(javax.xml.validation.Schema schema) { throw new RuntimeException("Stub!"); }
public  void setXIncludeAware(boolean state) { throw new RuntimeException("Stub!"); }
public  boolean isXIncludeAware() { throw new RuntimeException("Stub!"); }
}
