/*
 * Copyright 2016 Elizabeth Harper
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.vulpine.connectwise.util.logging;

public abstract class AbstractLogger implements LoggerInterface
{
  @Override
  public void trace( final Class clazz, final Object... arguments )
  {
    final StackTraceElement[] trace;
    final String method;
    final StringBuilder build;

    trace  = Thread.currentThread().getStackTrace();
    method = trace[Math.min(trace.length, 2)].getMethodName();
    build  = new StringBuilder();

    for ( int i = 0; i < arguments.length; i++ ) {
      if (0 < i) {
        build.append(", ");
      }

      build.append(arguments[i]);
    }

    this.trace(
      "{}::{}( {} ) @ Line {}",
      clazz.getName(),
      method,
      build.toString(),
      trace[Math.min(trace.length, 2)].getLineNumber()
    );
  }
}
