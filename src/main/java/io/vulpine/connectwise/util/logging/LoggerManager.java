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

import java.util.HashMap;
import java.util.Map;

public class LoggerManager
{
  private final static Map< String, LoggerInterface > loggers = new HashMap < String, LoggerInterface >();

  public static LoggerInterface getLogger( final String name )
  {
    if (!loggers.containsKey(name)) {
      loggers.put(name, fetchImplementation(name));
    }

    return loggers.get(name);
  }

  private static LoggerInterface fetchImplementation( final String name )
  {
    final LoggerInterface logger;

    try {
      return trySlf4j(name);
    } catch ( ClassNotFoundException ignored ) {
    }

    logger = new NativeLogger(name);
    return logger;
  }

  private static LoggerInterface trySlf4j( final String name ) throws ClassNotFoundException
  {
    final LoggerInterface logger;

    Class.forName("org.slf4j.Logger");
    logger = new Slf4jLogger(name);
    logger.info("Logging using SLF4J");

    return logger;
  }
}
