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
package io.vulpine.connectwise.type.def;

import io.vulpine.connectwise.type.company.Address;
import io.vulpine.connectwise.type.def.gen.*;

import java.util.List;

public interface Company
extends
  XmlSerializable,
  HasAccountNumber,
  HasId,
  HasLastUpdated,
  HasStatus,
  HasType,
  HasTerritory
{
  List< Address > addresses();

  Company addresses( List < Address > addresses );

  String companyIdentifier();

  Company companyIdentifier( String s );

  String companyName();

  Company companyName( String s );

  Address defaultAddress();

  Company defaultAddress( Address a );

  Integer defaultBillingContactId();

  Company defaultBillingContactId( Integer i );

  Integer defaultContactId();

  Company defaultContactId( Integer i );

  String faxNumber();

  Company faxNumber( String s );

  String market();

  Company market( String s );

  String phoneNumber();

  Company phoneNumber( String s );

  String webSite();

  Company webSite( String s );
}
