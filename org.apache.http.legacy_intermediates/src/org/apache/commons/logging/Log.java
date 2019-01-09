/*
* Copyright 2001-2004 The Apache Software Foundation.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/


package org.apache.commons.logging;
@java.lang.Deprecated()
public interface Log
{
public abstract  boolean isDebugEnabled();
public abstract  boolean isErrorEnabled();
public abstract  boolean isFatalEnabled();
public abstract  boolean isInfoEnabled();
public abstract  boolean isTraceEnabled();
public abstract  boolean isWarnEnabled();
public abstract  void trace(java.lang.Object message);
public abstract  void trace(java.lang.Object message, java.lang.Throwable t);
public abstract  void debug(java.lang.Object message);
public abstract  void debug(java.lang.Object message, java.lang.Throwable t);
public abstract  void info(java.lang.Object message);
public abstract  void info(java.lang.Object message, java.lang.Throwable t);
public abstract  void warn(java.lang.Object message);
public abstract  void warn(java.lang.Object message, java.lang.Throwable t);
public abstract  void error(java.lang.Object message);
public abstract  void error(java.lang.Object message, java.lang.Throwable t);
public abstract  void fatal(java.lang.Object message);
public abstract  void fatal(java.lang.Object message, java.lang.Throwable t);
}
