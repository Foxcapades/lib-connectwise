package io.vulpine.connectwise.api;

import io.vulpine.connectwise.api.request.CwRequest;

import java.io.IOException;
import java.util.regex.Pattern;

public interface ConnectwiseSubApiInterface
{
  Pattern soap = Pattern.compile("</?soap:(Envelope|Body)[^>]*>");
  String send( final CwRequest r ) throws IOException;
}
