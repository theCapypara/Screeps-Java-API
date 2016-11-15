package org.parakoopa.screeps.api;

import jsweet.lang.Array;
import jsweet.lang.Object;

import java.util.Collection;
import java.util.HashMap;
import java.util.function.Function;

/**
 * Javascript proterty mapper.
 * This helps you to iterate over all javascript object fields.
 * Short explanation:
 * - In JavaScript objects and HashMaps basicly are the exact same thing.
 *   The JSweet API used to bridge Java and JavaScript doesn't allow you to easily
 *   iterate over all fields of a JavaScript HashMap (=Object).
 *   Using this map you will have an easy way of dealing with these.
 *
 * Example usages using Game.creeps are below in the method annotations.
 */
public class Mapper<T> {

    private final Object object;

    /**
     * Creates a new Mapper object.
     *
     * You have two options when using this constructor:
     * 1. Call it without specifying the generic type:
     *    -  new Mapper(Game.creeps)
     *       Use this if you just need to get the keys using toKeys() or if the types
     *       of the Javascript object fields are not always the same.
     *       For example if you know you have an object like this:
     *       {
     *           "test" : "hello",
     *           "test2": 2
     *       }
     *       then you have a JavaScript object with two different types and you can only
     *       use the general Object type when mapping. However if all fields were known to be
     *       Strings, you could use the second option.
     *  2. Call it with a generic type:
     *     - new Mapper<\Creep>(Game.creeps)
     *       In this case you know all objects in Game.creeps are creeps. This means if you iterate
     *       over the objects for example Java will now also show them as creeps instead of showing
     *       "Object" as the type. This makes working with it a lot easier.
     *
     * @param object The JavaScript object you want to map
     */
    public Mapper(Object object) {
        this.object = object;
    }

    /**
     * Converts the Javascript Object into a HashMap.
     * Example:
     *       {
     *           "test" : "hello",
     *           "test2": 2
     *       }
     *  will return a hashmap with exactly this content.
     * @return A HashMap representing the Object
     */
    @SuppressWarnings("unchecked")
    public HashMap<String, T> toMap() {
        String[] keys = Object.keys(object);
        HashMap<String, T> map = new HashMap<>();
        for (String key : keys) {
            map.put(key, (T)object.$get(key));
        }
        return map;
    }

    /**
     * Get the keys of the JavaScript object
     * Example:
     *       {
     *           "test" : "hello",
     *           "test2": 2
     *       }
     *  will return a String array with the content ["test","test2"]
     * @return A String array containing the object keys
     */
    @SuppressWarnings("unchecked")
    public String[] getKeys() {
        return Object.keys(object);
    }


    /**
     * Get the values of the JavaScript object as a Java
     * Example:
     *       {
     *           "test" : "hello",
     *           "test2": 2
     *       }
     *  will return a typed JavaScript Array [Java Class Array] with the content ["hello",2].
     * @return A typed JavaScript Array with all values in it
     */
    @SuppressWarnings("unchecked")
    public Array<T> toArray() {
        String[] keys = Object.keys(object);
        Array<T> ary = new Array<>();
        for (String key : keys) {
            ary.push((T)object.$get(key));
        }
        return ary;
    }

    /**
     * Alias for toArray
     * @return A typed collection with all values in it
     */
    @SuppressWarnings("unchecked")
    public Array<T>  getVals() {
        return this.toArray();
    }

    /**
     * Filter the Object by the requested filter method and return only matching results.
     * Example:
     * Creep[] harvesters = new Mapper<\Creep>(Game.creeps).filter(
     *   (Creep creep) -> creep.memory.$get("role") == "harvester"
     * );
     * @param filterFunc The (lambda) function to filter by. Only true's will lead the element being included.
     * @return The filtered array result [Java Array!]
     */
    @SuppressWarnings("unchecked")
    public T[] filter(Function<T, Boolean> filterFunc) {
        return toArray().filter((T obj, Double index, T[] arr) -> filterFunc.apply(obj));
    }
}
