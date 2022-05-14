package pixar.toystory;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringTest {
    @Test
    void isEmpty(){
        Assertions.assertThat("".isEmpty()).isTrue();
        Assertions.assertThat(" ".isEmpty()).isFalse();
        Assertions.assertThat("a".isEmpty()).isFalse();
    }

    @Test
    void lastIndexOf(){
        Assertions.assertThat("abcde".lastIndexOf("b")).isEqualTo(1);
    }
}
