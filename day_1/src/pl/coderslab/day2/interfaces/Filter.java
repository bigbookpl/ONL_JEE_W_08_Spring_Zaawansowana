package pl.coderslab.day2.interfaces;

@FunctionalInterface
public interface Filter<V> {
	boolean check(V v);
}
