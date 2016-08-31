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

public interface LoggerInterface
{
  void trace( final String message );
  void trace( final String message, final Object argument );
  void trace( final String message, final Object argument1, final Object argument2 );
  void trace( final String message, final Object... arguments );
  void trace( final String message, final Throwable throwable );
  void trace( final Class clazz, final Object... arguments );

  void debug( final String message );
  void debug( final String message, final Object argument );
  void debug( final String message, final Object argument1, final Object argument2 );
  void debug( final String message, final Object... arguments );
  void debug( final String message, final Throwable throwable );

  void info( final String message );
  void info( final String message, final Object argument );
  void info( final String message, final Object argument1, final Object argument2 );
  void info( final String message, final Object... arguments );
  void info( final String message, final Throwable throwable );

  void notice( final String message );
  void notice( final String message, final Object argument );
  void notice( final String message, final Object argument1, final Object argument2 );
  void notice( final String message, final Object... arguments );
  void notice( final String message, final Throwable throwable );

  void warn( final String message );
  void warn( final String message, final Object argument );
  void warn( final String message, final Object argument1, final Object argument2 );
  void warn( final String message, final Object... arguments );
  void warn( final String message, final Throwable throwable );

  void error( final String message );
  void error( final String message, final Object argument );
  void error( final String message, final Object argument1, final Object argument2 );
  void error( final String message, final Object... arguments );
  void error( final String message, final Throwable throwable );

  void fatal( final String message );
  void fatal( final String message, final Object argument );
  void fatal( final String message, final Object argument1, final Object argument2 );
  void fatal( final String message, final Object... arguments );
  void fatal( final String message, final Throwable throwable );
}
