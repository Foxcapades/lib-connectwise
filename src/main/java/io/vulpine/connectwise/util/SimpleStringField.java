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

public class SimpleStringField extends SimpleObjectField< String > implements StringField
{
  public SimpleStringField()
  {
  }

  public SimpleStringField( String name )
  {
    super(name);
  }

  public SimpleStringField( String name, String value )
  {
    super(name, value);
  }

  public SimpleStringField( String name, boolean optional, boolean nullable )
  {
    super(name, optional, nullable);
  }

  @Override
  public StringField append( final String s )
  {
    final StringField r = new SimpleStringField();
    r.set(get() + s);
    return r;
  }

  @Override
  public StringField prepend( String s )
  {
    final StringField r = new SimpleStringField();
    r.set(s + get());
    return r;
  }
}
