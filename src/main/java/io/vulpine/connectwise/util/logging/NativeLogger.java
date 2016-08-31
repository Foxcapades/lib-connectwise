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

import java.util.logging.Logger;

public class NativeLogger extends AbstractLogger
{
  final Logger logger;

  public NativeLogger( final String name )
  {
    logger = Logger.getLogger(name);
  }

  @Override
  public void trace( final String message )
  {
    logger.finest(message);
  }

  @Override
  public void trace( final String message, final Object argument )
  {
    logger.finest(String.format(message.replaceAll("\\{\\}", "%s"), argument));
  }

  @Override
  public void trace( final String message, final Object argument1, final Object argument2 )
  {
    logger.finest(String.format(message.replaceAll("\\{\\}", "%s"), argument1, argument2));
  }

  @Override
  public void trace( final String message, final Object... arguments )
  {
    logger.finest(String.format(message.replaceAll("\\{\\}", "%s"), arguments));
  }

  @Override
  public void trace( final String message, final Throwable throwable )
  {
    logger.finest(message);
    logger.finest(throwable.toString());
  }


  @Override
  public void debug( final String message )
  {
    logger.finer(message);
  }

  @Override
  public void debug( final String message, final Object argument )
  {
    logger.finer(String.format(message.replaceAll("\\{\\}", "%s"), argument));
  }

  @Override
  public void debug( final String message, final Object argument1, final Object argument2 )
  {
    logger.finer(String.format(message.replaceAll("\\{\\}", "%s"), argument1, argument2));
  }

  @Override
  public void debug( final String message, final Object... arguments )
  {
    logger.finer(String.format(message.replaceAll("\\{\\}", "%s"), arguments));
  }

  @Override
  public void debug( final String message, final Throwable throwable )
  {
    logger.finer(message);
    logger.finer(throwable.toString());
  }

  @Override
  public void info( final String message )
  {
    logger.info(message);
  }

  @Override
  public void info( final String message, final Object argument )
  {
    logger.info(String.format(message.replaceAll("\\{\\}", "%s"), argument));
  }

  @Override
  public void info( final String message, final Object argument1, final Object argument2 )
  {
    logger.info(String.format(message.replaceAll("\\{\\}", "%s"), argument1, argument2));
  }

  @Override
  public void info( final String message, final Object... arguments )
  {
    logger.info(String.format(message.replaceAll("\\{\\}", "%s"), arguments));
  }

  @Override
  public void info( final String message, final Throwable throwable )
  {
    logger.info(message);
    logger.info(throwable.toString());
  }

  @Override
  public void notice( final String message )
  {
    logger.warning(message);
  }

  @Override
  public void notice( final String message, final Object argument )
  {
    logger.warning(String.format(message.replaceAll("\\{\\}", "%s"), argument));
  }

  @Override
  public void notice( final String message, final Object argument1, final Object argument2 )
  {
    logger.warning(String.format(message.replaceAll("\\{\\}", "%s"), argument1, argument2));
  }

  @Override
  public void notice( final String message, final Object... arguments )
  {
    logger.warning(String.format(message.replaceAll("\\{\\}", "%s"), arguments));
  }

  @Override
  public void notice( final String message, final Throwable throwable )
  {
    logger.warning(message);
    logger.warning(throwable.toString());
  }

  @Override
  public void warn( final String message )
  {
    logger.warning(message);
  }

  @Override
  public void warn( final String message, final Object argument )
  {
    logger.warning(String.format(message.replaceAll("\\{\\}", "%s"), argument));
  }

  @Override
  public void warn( final String message, final Object argument1, final Object argument2 )
  {
    logger.warning(String.format(message.replaceAll("\\{\\}", "%s"), argument1, argument2));
  }

  @Override
  public void warn( final String message, final Object... arguments )
  {
    logger.warning(String.format(message.replaceAll("\\{\\}", "%s"), arguments));
  }

  @Override
  public void warn( final String message, final Throwable throwable )
  {
    logger.warning(message);
    logger.warning(throwable.toString());
  }

  @Override
  public void error( final String message )
  {
    logger.severe(message);
  }

  @Override
  public void error( final String message, final Object argument )
  {
    logger.severe(String.format(message.replaceAll("\\{\\}", "%s"), argument));
  }

  @Override
  public void error( final String message, final Object argument1, final Object argument2 )
  {
    logger.severe(String.format(message.replaceAll("\\{\\}", "%s"), argument1, argument2));
  }

  @Override
  public void error( final String message, final Object... arguments )
  {
    logger.severe(String.format(message.replaceAll("\\{\\}", "%s"), arguments));
  }

  @Override
  public void error( final String message, final Throwable throwable )
  {
    logger.severe(message);
    logger.severe(throwable.toString());
  }

  @Override
  public void fatal( final String message )
  {
    logger.severe(message);
  }

  @Override
  public void fatal( final String message, final Object argument )
  {
    logger.severe(String.format(message.replaceAll("\\{\\}", "%s"), argument));
  }

  @Override
  public void fatal( final String message, final Object argument1, final Object argument2 )
  {
    logger.severe(String.format(message.replaceAll("\\{\\}", "%s"), argument1, argument2));
  }

  @Override
  public void fatal( final String message, final Object... arguments )
  {
    logger.severe(String.format(message.replaceAll("\\{\\}", "%s"), arguments));
  }

  @Override
  public void fatal( final String message, final Throwable throwable )
  {
    logger.severe(message);
    logger.severe(throwable.toString());
  }
}
