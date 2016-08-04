package io.vulpine.connectwise.data.project;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import io.vulpine.connectwise.data.CwObject;

public abstract class AbstractSubProject extends CwObject
{

  @JacksonXmlProperty(localName = "ProjectId")
  protected int projectId;
}
