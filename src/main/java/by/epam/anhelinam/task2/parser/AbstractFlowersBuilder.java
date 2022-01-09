package by.epam.anhelinam.task2.parser;

import by.epam.anhelinam.task2.entity.Flower;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public abstract class AbstractFlowersBuilder {
    protected Set<Flower> flowers;

    public AbstractFlowersBuilder() {
        flowers = new HashSet<>();
    }

    public AbstractFlowersBuilder(Set<Flower> flowers) {
        this.flowers = flowers;
    }

    public Set<Flower> getFlowers() {
        return flowers;
    }

    public abstract void buildSetFlowers(String filename);
}
