package kr.scalar.api.common;
import java.util.Date;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.stereotype.Component;
public class LambdaUtils {
    public static Consumer<String> print = System.out::print;

    public static Function<Object, String> string = String::valueOf;

    public static Function<String, Integer> str2int = Integer::parseInt;
    // public Function<Integer, String> int2str = Integer::parseInt;

    public static Function<Double, Double> absD = Math::abs;
    public static Function<Float, Float> absF = Math::abs;
    public static Function<Integer, Integer> absI = Math::abs;
    public static Function<Long, Long> absL = Math::abs;

    public static Function<Double, Double> ceil = Math::ceil;

    public static Function<Double, Double> floor = Math::floor;

    public static BiFunction<Double, Double, Double> maxD = Math::max;
    public static BiFunction<Float, Float, Float> maxF = Math::max;
    public static BiFunction<Integer, Integer, Integer> maxI = Math::max;
    public static BiFunction<Long, Long, Long> maxL = Math::max;

    public static BiFunction<Double, Double, Double> minD = Math::min;
    public static BiFunction<Float, Float, Float> minF = Math::min;
    public static BiFunction<Integer, Integer, Integer> minI = Math::min;
    public static BiFunction<Long, Long, Long> minL = Math::min;

    public Supplier<Double> randomD = Math::random;
    public static BiFunction<Integer, Integer, Integer> rangeUnderRandom = (t, u) -> (int) (Math.random() * (u - t))
            + t;
    public static BiFunction<Integer, Integer, Integer> rangeBelowRandom = (t, u) -> (int) (Math.random() * u) + t;
    // (int)(Math.random()*(u-t)) + t ;

    public static Function<Double, Double> rintD = Math::rint;

    public static Function<Double, Long> roundD = Math::round;
    public static Function<Float, Integer> roundF = Math::round;
    public static Supplier<Date> regdate = Date::new;
}
