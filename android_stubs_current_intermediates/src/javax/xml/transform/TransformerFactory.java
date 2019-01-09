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

// $Id: TransformerFactory.java 884963 2009-11-27 19:11:59Z mrglavas $

package javax.xml.transform;
public abstract class TransformerFactory
{
protected  TransformerFactory() { throw new RuntimeException("Stub!"); }
public static  javax.xml.transform.TransformerFactory newInstance() throws javax.xml.transform.TransformerFactoryConfigurationError { throw new RuntimeException("Stub!"); }
public static  javax.xml.transform.TransformerFactory newInstance(java.lang.String factoryClassName, java.lang.ClassLoader classLoader) throws javax.xml.transform.TransformerFactoryConfigurationError { throw new RuntimeException("Stub!"); }
public abstract  javax.xml.transform.Transformer newTransformer(javax.xml.transform.Source source) throws javax.xml.transform.TransformerConfigurationException;
public abstract  javax.xml.transform.Transformer newTransformer() throws javax.xml.transform.TransformerConfigurationException;
public abstract  javax.xml.transform.Templates newTemplates(javax.xml.transform.Source source) throws javax.xml.transform.TransformerConfigurationException;
public abstract  javax.xml.transform.Source getAssociatedStylesheet(javax.xml.transform.Source source, java.lang.String media, java.lang.String title, java.lang.String charset) throws javax.xml.transform.TransformerConfigurationException;
public abstract  void setURIResolver(javax.xml.transform.URIResolver resolver);
public abstract  javax.xml.transform.URIResolver getURIResolver();
public abstract  void setFeature(java.lang.String name, boolean value) throws javax.xml.transform.TransformerConfigurationException;
public abstract  boolean getFeature(java.lang.String name);
public abstract  void setAttribute(java.lang.String name, java.lang.Object value);
public abstract  java.lang.Object getAttribute(java.lang.String name);
public abstract  void setErrorListener(javax.xml.transform.ErrorListener listener);
public abstract  javax.xml.transform.ErrorListener getErrorListener();
}
