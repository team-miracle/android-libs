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
// $Id: XPathExpression.java 446598 2006-09-15 12:55:40Z jeremias $

package javax.xml.xpath;
public interface XPathExpression
{
public abstract  java.lang.Object evaluate(java.lang.Object item, javax.xml.namespace.QName returnType) throws javax.xml.xpath.XPathExpressionException;
public abstract  java.lang.String evaluate(java.lang.Object item) throws javax.xml.xpath.XPathExpressionException;
public abstract  java.lang.Object evaluate(org.xml.sax.InputSource source, javax.xml.namespace.QName returnType) throws javax.xml.xpath.XPathExpressionException;
public abstract  java.lang.String evaluate(org.xml.sax.InputSource source) throws javax.xml.xpath.XPathExpressionException;
}
