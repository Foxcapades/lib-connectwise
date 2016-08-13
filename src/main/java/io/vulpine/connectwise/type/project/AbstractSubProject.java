package io.vulpine.connectwise.type.project;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import io.vulpine.connectwise.type.CwObject;

public abstract class AbstractSubProject extends CwObject
{

  @JacksonXmlProperty(localName = "ProjectId")
  protected int projectId;
}
