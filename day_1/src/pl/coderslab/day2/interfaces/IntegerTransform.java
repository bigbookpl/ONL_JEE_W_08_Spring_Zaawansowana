package pl.coderslab.day2.interfaces;

public class IntegerTransform implements Transform<String, Integer>{

    @Override
    public String transform(Integer integer) {
        return String.valueOf(integer - 1);
    }
}
