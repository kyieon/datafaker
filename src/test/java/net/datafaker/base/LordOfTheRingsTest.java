package net.datafaker.base;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Luka Obradovic (luka@vast.com)
 */
class LordOfTheRingsTest extends AbstractBaseFakerTest {

    @Test
    void character() {
        assertThat(faker.lordOfTheRings().character()).matches("(?U)([\\w ]+ ?)+");
    }

    @Test
    void location() {
        assertThat(faker.lordOfTheRings().location()).matches("(?U)([\\w'\\- ]+ ?)+");
    }
}