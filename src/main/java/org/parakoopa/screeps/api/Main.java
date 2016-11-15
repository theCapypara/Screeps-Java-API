package org.parakoopa.screeps.api;

import static jsweet.util.Globals.$export;

/**
 * Main entrypoint
 */
public class Main {

    /**
     * This is the main game loop.
     * You have to hook into this method by calling your own loop method
     * eg. new MyGreatImplementation().loop();
     */
    public void loop() {

        // Insert your code here.

        //For future testing:
        //HashMap<String, Integer> testmap = new HashMap<>();
        //testmap.put("Test",3);
        //System.out.println(testmap);
        //new TutorialExample().loop();
    }

    /**
     * Export main class
     * Don't change this!
     * @param args ...
     */
    public static void main(String[] args) {
        $export("main", new Main());
    }

}