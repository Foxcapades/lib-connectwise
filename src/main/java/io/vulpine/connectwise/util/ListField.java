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
package io.vulpine.connectwise.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * = Field Representing a List
 *
 * @param <T> Type of the elements in the List
 *
 * @since 0.1.0
 * @version 1.0.0
 * @author https://github.com/elliefops[Elizabeth Harper]
 */
public interface ListField< T > extends Field < List < T > >, List < T >
{
  String getElementWrapper();

  ListField < T > setElementWrapper( String s );

  /*

  Default Implementations

   */
  @Override
  default int size()
  {
    return get().size();
  }

  @Override
  default boolean isEmpty()
  {
    return get().isEmpty();
  }

  @Override
  default boolean contains( Object o )
  {
    return get().contains(o);
  }

  @Override
  default Iterator < T > iterator()
  {
    return get().iterator();
  }

  @Override
  default Object[] toArray()
  {
    return get().toArray();
  }

  @Override
  default < R > R[] toArray( R[] a )
  {
    return get().toArray(a);
  }

  @Override
  default boolean add( T t )
  {
    return get().add(t);
  }

  @Override
  default boolean remove( Object o )
  {
    return get().remove(o);
  }

  @Override
  default boolean containsAll( Collection < ? > c )
  {
    return get().containsAll(c);
  }

  @Override
  default boolean addAll( Collection < ? extends T > c )
  {
    return get().addAll(c);
  }

  @Override
  default boolean addAll( int index, Collection < ? extends T > c )
  {
    return get().addAll(index, c);
  }

  @Override
  default boolean removeAll( Collection < ? > c )
  {
    return get().removeAll(c);
  }

  @Override
  default boolean retainAll( Collection < ? > c )
  {
    return get().retainAll(c);
  }

  @Override
  default void clear()
  {
    get().clear();
  }

  @Override
  default T get( int index )
  {
    return get().get(index);
  }

  @Override
  default T set( int index, T element )
  {
    return get().set(index, element);
  }

  @Override
  default void add( int index, T element )
  {
    get().add(index, element);
  }

  @Override
  default T remove( int index )
  {
    return get().remove(index);
  }

  @Override
  default int indexOf( Object o )
  {
    return get().indexOf(o);
  }

  @Override
  default int lastIndexOf( Object o )
  {
    return get().lastIndexOf(o);
  }

  @Override
  default ListIterator < T > listIterator()
  {
    return get().listIterator();
  }

  @Override
  default ListIterator < T > listIterator( int index )
  {
    return get().listIterator(index);
  }

  @Override
  default List < T > subList( int fromIndex, int toIndex )
  {
    return get().subList(fromIndex, toIndex);
  }
}
