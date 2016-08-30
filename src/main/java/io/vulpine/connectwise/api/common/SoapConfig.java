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

package io.vulpine.connectwise.api.common;

@Deprecated
public class SoapConfig
{
  final String company;
  final String apiUsername;
  final String apiPassword;
  final String apiPath;

  public SoapConfig ( final String company, final String apiUsername, final String apiPassword, final String apiPath )
  {
    this.company = company;
    this.apiUsername = apiUsername;
    this.apiPassword = apiPassword;
    this.apiPath = apiPath;
  }

  public String getCompany ()
  {
    return company;
  }

  public String getApiUsername ()
  {
    return apiUsername;
  }

  public String getApiPassword ()
  {
    return apiPassword;
  }

  public String getApiPath ()
  {
    return apiPath;
  }
}
