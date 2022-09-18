package net.datafaker.base;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RobinTest extends BaseFakerTest {

    @Test
    void quote() {
        assertThat(faker.robin().quote()).matches("^(\\w+\\.?-?'?\\s?)+(\\(?)?(\\w+\\s?\\.?)+(\\))?$");
    }
}
