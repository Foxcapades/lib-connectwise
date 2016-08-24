package io.vulpine.connectwise.api.def;

import io.vulpine.connectwise.api.request.CwRequest;

import java.io.IOException;
import java.util.regex.Pattern;

public interface ConnectwiseSubApiInterface
{
  String send( final CwRequest r ) throws IOException;
}
