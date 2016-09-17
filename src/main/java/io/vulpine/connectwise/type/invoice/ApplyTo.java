package io.vulpine.connectwise.type.invoice;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.vulpine.connectwise.type.ConnectwiseCommon;

@JsonIgnoreProperties( { "UpdatedBy", "LastUpdated", "LastUpdate", "Description" } )
public class ApplyTo extends ConnectwiseCommon
{
  private ApplyToType type;

  @JsonGetter( "Type" )
  public ApplyToType type()
  {
    return this.type;
  }

  @JsonSetter( "Type" )
  public ApplyTo type( final ApplyToType type )
  {
    this.type = type;
    return this;
  }

}
