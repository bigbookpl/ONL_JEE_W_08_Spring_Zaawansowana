package pl.coderslab.day2.interfaces;

@FunctionalInterface

public interface Transform<T, S> {


	T transform(S s);

}