package lessons.lesson_14.level_1;

public class AppleRedColorPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return "red".equals(apple.getColor());
    }
}
