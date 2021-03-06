import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class Test {
  private void test2(@NotNull Object bar) {}

  void println(@Nullable Object o) {}

  private Object test(Object foo, Object bar) {
    if (foo == null) {
      println(<weak_warning descr="Value 'foo' is always 'null'"><caret>foo</weak_warning>);
      println(<weak_warning descr="Value 'foo' is always 'null'">foo</weak_warning>);
      return <warning descr="Expression 'foo' might evaluate to null but is returned by the method which is not declared as @Nullable">foo</warning>;
    }
    if (bar == null) {
      test2(<warning descr="Argument 'bar' might be null">bar</warning>);
    }
    return foo;
  }

  public void testDontReplaceQualifierWithNull(Object bar) {
    if (bar == null) {
      bar.<warning descr="Method invocation 'hashCode' will produce 'NullPointerException'">hashCode</warning>();
    }
  }

  void println(int i) {}

  void testZero(int b) {
    if (b == 0) {
      println(b);
    }
  }

}