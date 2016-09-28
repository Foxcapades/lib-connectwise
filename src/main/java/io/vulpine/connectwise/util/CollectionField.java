package io.vulpine.connectwise.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * = Field Representing a Collection
 *
 * @param <T> Type of the elements in the collection
 *
 * @since 0.1.0
 * @version 1.0.0
 * @author https://github.com/elliefops[Elizabeth Harper]
 */
public interface CollectionField < T > extends Field < Collection < T > >, Collection < T >
{
  String getElementWrapper();
  CollectionField < T > setElementWrapper( String s );

  /*

  Default Implementations

   */
  @Override default int size() { return get().size(); }
  @Override default boolean isEmpty() { return get().isEmpty(); }
  @Override default boolean add( T t ) { return get().add(t); }
  @Override default boolean remove( Object o ) { return get().remove(o); }
  @Override default boolean containsAll( Collection < ? > c ) { return get().containsAll(c); }
  @Override default boolean addAll( Collection < ? extends T > c ) { return get().addAll(c); }
  @Override default boolean removeAll( Collection < ? > c ) { return get().removeAll(c); }
  @Override default boolean contains( Object o ) { return get().contains(o); }
  @Override default boolean retainAll( Collection < ? > c ) { return get().retainAll(c); }
  @Override default Iterator< T > iterator() { return get().iterator(); }
  @Override default Object[] toArray() { return get().toArray(); }
  @Override default < R > R[] toArray( R[] a ) { return get().toArray(a); }
  @Override default void clear() { get().clear(); }
}
