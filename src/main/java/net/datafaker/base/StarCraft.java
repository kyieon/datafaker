package net.datafaker.base;

/**
 * @since 0.8.0
 */
public class StarCraft extends AbstractProvider<IProviders> {

    protected StarCraft(final BaseFaker faker) {
        super(faker);
    }

    public String unit() {
        return resolve("starcraft.units");
    }

    public String building() {
        return resolve("starcraft.buildings");
    }

    public String character() {
        return resolve("starcraft.characters");
    }

    public String planet() {
        return resolve("starcraft.planets");
    }

}