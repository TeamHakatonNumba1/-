package ru.siteparsers;


/**
 * Created by npcipav on 29.11.2015.
 *
 * Checks relation to user for news.
 */
class NewsRelationChecker {

    public static void setLocation(String location) {}

    /**
     * Returns true if location is in the same region that user set in
     * setLocation().
     */
    public static boolean isRelatedToUser(String location) {
	// TODO! Using NewsCollector::getUserLocation method, check if news is
	// related to user.
        return false;
    }
}
