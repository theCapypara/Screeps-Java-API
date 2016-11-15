package org.parakoopa.screeps.api;

import def.screeps.Opts;

import java.util.function.Function;

import static jsweet.util.Globals.function;
import static jsweet.util.Globals.union;

/**
 * General helper methods for making the access to common
 * Screeps tasks easier.
 */
public class Helper {
    /**
     * Create a find filter by string.
     * Example Usage:
     * creep.room.find(FIND_STRUCTURES, findFilter("blabla"));
     * @param name The name of the filter method
     * @return The options object for the *.find(...) methods
     */
    public static Opts findFilter(String name) {
        Opts opts = new Opts();
        opts.filter = union(name);
        return opts;
    }

    /**
     * Create a find filter by filtering function.
     * Example Usage:
     * Structure[] targets = creep.room.find(FIND_STRUCTURES, findFilter((Structure structure) -> {
     *     return (structure.structureType == STRUCTURE_EXTENSION ||
     *     structure.structureType == STRUCTURE_SPAWN ||
     *     structure.structureType == STRUCTURE_TOWER) && ((StructureTower) structure).energy < ((StructureTower) structure).energyCapacity;
     * }));
     * @param func the (lambda) function to filter by
     * @return The options object for the *.find(...) methods
     */
    public static Opts findFilter(Function<?,Boolean> func) {
        Opts opts = new Opts();
        opts.filter = union(function(func));
        return opts;
    }
}
