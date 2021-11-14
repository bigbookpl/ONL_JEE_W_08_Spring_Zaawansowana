package pl.coderslab.day2.interfaces;

public class IntegerFilter<Integer> implements Filter<Integer> {

    public boolean check(Integer v) {
        return (int)v < 20;
    }

}
