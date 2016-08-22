package io.vulpine.connectwise.type.project;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import io.vulpine.connectwise.type.ConnectwiseCommon;

class _Common extends ConnectwiseCommon
{
  @JacksonXmlProperty(localName = "ProjectId")
  protected int projectId;

  public int getProjectId()
  {
    return projectId;
  }

  public void setProjectId( final int projectId )
  {
    this.projectId = projectId;
  }
}
