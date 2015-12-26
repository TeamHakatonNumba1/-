package ru.siteparsers;

/**
 * Created by npcipav on 02.12.2015.
 */
abstract class AbstractSiteParser {

    protected NewsCollector mCollector;

    public AbstractSiteParser(NewsCollector collector) {
        mCollector = collector;
    }

    abstract void refreshNews();
}
