package org.parakoopa.screeps.api.memoryDef;

import jsweet.lang.Ambient;
import jsweet.lang.Object;

/**
 * Create your own memory definitions!
 *
 * This is a Ambient javascript object.
 * In JS objects can be created on the fly as hash maps and require no classes.
 * In Java you need classes. This class defines the memory for the specific type of objects.
 *
 * Ambient classes are only for you as a developer to "mark" Javascript hashmaps. They don't
 * actually get compiled to Javascript codes.
 * Ambient classes can NOT contain Methods!!
 *
 * For example if your creep memory has an integer value blabla, add this:
 *      public int blabla;
 *
 * Then whenever you access the creep's memory you can easily access and modify it without
 * $get and $set!
 *      CreepMemory cM = creep.memory;
 *      cM.blabla = 4;
 *
 * Extend this class to your needs.
 *
 * EXAMPLE: If your memory looks like this:
 * creep.memory = {
 *     "test" : 1,
 *     "myCoolStuff": {
 *         "a" : 12,
 *         "b" : 13
 *     }
 * }
 *
 * add two fields to this memory object:
 *      public int test;
 *      public MyCoolStuff myCoolStuff;
 *
 * Now create a new Ambient(!!) Class for myCoolStuff somewhere:
 *      \@Ambient
 *      public class MyCoolStuff extends Object {
 *          public int a;
 *          public int b;
 *      }
 */
@Ambient
public class CreepMemory extends Object {
}
