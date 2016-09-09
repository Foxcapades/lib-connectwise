package io.vulpine.connectwise.api.common;

import io.vulpine.connectwise.api.endpoints.Endpoint;

import java.io.IOException;

public interface Request < T >
{
  String getRootName();

  Endpoint getEndpoint();

  T submit() throws IOException;
}
