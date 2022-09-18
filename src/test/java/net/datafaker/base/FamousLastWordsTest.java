package net.datafaker.base;

import org.junit.jupiter.api.RepeatedTest;

import static org.assertj.core.api.Assertions.assertThat;

class FamousLastWordsTest extends BaseFakerTest {

    @RepeatedTest(1000)
    void testLastWords() {
        assertThat(faker.famousLastWords().lastWords()).matches("^[A-Za-z- .,'!?-…]+$");
    }
}
