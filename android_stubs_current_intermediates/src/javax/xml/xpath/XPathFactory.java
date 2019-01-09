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
// $Id: XPathFactory.java 888889 2009-12-09 17:43:18Z mrglavas $

package javax.xml.xpath;
public abstract class XPathFactory
{
protected  XPathFactory() { throw new RuntimeException("Stub!"); }
public static final  javax.xml.xpath.XPathFactory newInstance() { throw new RuntimeException("Stub!"); }
public static final  javax.xml.xpath.XPathFactory newInstance(java.lang.String uri) throws javax.xml.xpath.XPathFactoryConfigurationException { throw new RuntimeException("Stub!"); }
public static  javax.xml.xpath.XPathFactory newInstance(java.lang.String uri, java.lang.String factoryClassName, java.lang.ClassLoader classLoader) throws javax.xml.xpath.XPathFactoryConfigurationException { throw new RuntimeException("Stub!"); }
public abstract  boolean isObjectModelSupported(java.lang.String objectModel);
public abstract  void setFeature(java.lang.String name, boolean value) throws javax.xml.xpath.XPathFactoryConfigurationException;
public abstract  boolean getFeature(java.lang.String name) throws javax.xml.xpath.XPathFactoryConfigurationException;
public abstract  void setXPathVariableResolver(javax.xml.xpath.XPathVariableResolver resolver);
public abstract  void setXPathFunctionResolver(javax.xml.xpath.XPathFunctionResolver resolver);
public abstract  javax.xml.xpath.XPath newXPath();
public static final java.lang.String DEFAULT_OBJECT_MODEL_URI = "http://java.sun.com/jaxp/xpath/dom";
public static final java.lang.String DEFAULT_PROPERTY_NAME = "javax.xml.xpath.XPathFactory";
}
