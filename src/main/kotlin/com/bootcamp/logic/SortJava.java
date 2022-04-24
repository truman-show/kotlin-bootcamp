package com.bootcamp.logic;

import java.util.List;

public interface SortJava<T extends Comparable<T>> {
  List<T> sort(List<T> list);
}
