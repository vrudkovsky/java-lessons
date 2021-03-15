package lesson12.warmup;

import java.util.Collections;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * https://www.hackerrank.com/challenges/counting-valleys/problem
 */
public class CountingValleysApp2 {

    static class State {
        final int count;
        final int level;
        final int prev;

        State(int count, int level, int prev) {
            this.count = count;
            this.level = level;
            this.prev = prev;
        }

        static State initial() {
            return new State(0,0,0);
        }

    }

    public static int countingValleys(int steps, String path) {
        int count = 0;
        int level = 0;
        int prev;

        for (char step: path.toCharArray()) {
            prev = level;
            switch (step) {
                case 'U': level++; break;
                case 'D': level--; break;
            }
            if (level == 0 && prev < 0) count++;
        }

//    return count;
        State s0 = State.initial();
        State result = path.chars().boxed()
                .collect(new Collector<Integer, State, State>() {
                    @Override
                    public Supplier<State> supplier() {
                        return () -> State.initial();
                    }

                    @Override
                    public BiConsumer<State, Integer> accumulator() {
                        return null;
                    }

                    @Override
                    public BinaryOperator<State> combiner() {
                        return (state, state2) -> state;
                    }

                    @Override
                    public Function<State, State> finisher() {
                        return a -> a;
                    }

                    @Override
                    public Set<Characteristics> characteristics() {
                        return Collections.singleton(Characteristics.IDENTITY_FINISH);
                    }
                });

        return result.count;
    }

}
