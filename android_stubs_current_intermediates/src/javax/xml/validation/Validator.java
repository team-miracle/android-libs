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
// $Id: Validator.java 888884 2009-12-09 17:36:46Z mrglavas $

package javax.xml.validation;
public abstract class Validator
{
protected  Validator() { throw new RuntimeException("Stub!"); }
public abstract  void reset();
public  void validate(javax.xml.transform.Source source) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  void validate(javax.xml.transform.Source source, javax.xml.transform.Result result) throws org.xml.sax.SAXException, java.io.IOException;
public abstract  void setErrorHandler(org.xml.sax.ErrorHandler errorHandler);
public abstract  org.xml.sax.ErrorHandler getErrorHandler();
public abstract  void setResourceResolver(org.w3c.dom.ls.LSResourceResolver resourceResolver);
public abstract  org.w3c.dom.ls.LSResourceResolver getResourceResolver();
public  boolean getFeature(java.lang.String name) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException { throw new RuntimeException("Stub!"); }
public  void setFeature(java.lang.String name, boolean value) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException { throw new RuntimeException("Stub!"); }
public  void setProperty(java.lang.String name, java.lang.Object object) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException { throw new RuntimeException("Stub!"); }
public  java.lang.Object getProperty(java.lang.String name) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException { throw new RuntimeException("Stub!"); }
}
