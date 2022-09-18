package net.datafaker.base;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TheItCrowdTest extends BaseFakerTest {

    @Test
    void actors() {
        assertThat(faker.theItCrowd().actors()).isNotEmpty();
    }

    @Test
    void characters() {
        assertThat(faker.theItCrowd().characters()).isNotEmpty();
    }

    @Test
    void emails() {
        assertThat(faker.theItCrowd().emails()).isNotEmpty();
    }

    @Test
    void quotes() {
        assertThat(faker.theItCrowd().quotes()).isNotEmpty();
    }

}
