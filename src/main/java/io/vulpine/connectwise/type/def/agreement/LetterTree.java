package io.vulpine.connectwise.type.def.agreement;

import io.vulpine.connectwise.util.Field;

import java.util.HashMap;
import java.util.Map;

public class LetterTree < T extends Field >
{
  private final String path;
  private T value = null;
  private Map< Character, LetterTree < T > > branches = null;

  public LetterTree()
  {
    this.path = "";
  }

  private LetterTree( String path, T value )
  {
    this.path = path;
    this.value = value;
  }

  public boolean isLeaf()
  {
    return branches != null;
  }

  public LetterTree push( final T value )
  {
    if(isLeaf()) {
      if (this.value == null) {
        this.value = value;
        return this;
      }

      push(this.value, this.value.getName(), this.value.getName());
      this.value = null;
    }

    push(value, value.getName(), value.getName());
    return this;
  }

  private void push( final T value, final String path, final String remainder )
  {
    final String start = path + remainder.substring(0,1);
    final String end = remainder.substring(1);
    final char current = remainder.charAt(0);

    if (branches == null)
      branches = new HashMap <>();

    if (branches.containsKey(current)) {
      branches.get(current).push(value, start, end);
      return;
    }

    branches.put(current, new LetterTree <>(start, value));
  }

  public T fetch( final String path )
  {
    return fetch(path, path);
  }

  private T fetch( final String path, final String remainder )
  {
    final char b = remainder.charAt(0);
    final String s = path + remainder.substring(0, 1);
    final String e = remainder.substring(1);

    if (isLeaf() && this.path.equals(path)) {
      return this.value;
    }

    if (!branches.containsKey(b))
      return null;

    return branches.get(b).fetch(s, e);
  }
}
