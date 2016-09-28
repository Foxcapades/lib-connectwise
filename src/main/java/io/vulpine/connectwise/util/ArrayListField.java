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
package io.vulpine.connectwise.util;

import java.util.ArrayList;
import java.util.List;

public class ArrayListField < T > extends SimpleObjectField< List < T > > implements ListField < T >
{
  private String wrapper = "string";

  public ArrayListField()
  {
    super("", new ArrayList <>());
  }

  public ArrayListField( String name )
  {
    super(name, new ArrayList <>());
  }

  public ArrayListField( String name, ArrayList < T > value )
  {
    super(name, value);
  }

  public ArrayListField( String name, boolean optional, boolean nullable )
  {
    super(name, new ArrayList <>());

    setOptional(optional);
    setNullable(nullable);
  }

  @Override
  public String getElementWrapper()
  {
    return wrapper;
  }

  @Override
  public ArrayListField < T > setElementWrapper( String s )
  {
    wrapper = s;

    return this;
  }
}
