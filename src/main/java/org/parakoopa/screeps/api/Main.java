package org.parakoopa.screeps.api;

import static jsweet.util.Globals.$export;

/**
 * Main entrypoint
 */
public class Main {

    /**
     * This is the main game loop.
     */
    public void loop() {
        System.out.println("Change me.");
    }

    /**
     * Export main class
     * @param args
     */
    public static void main(String[] args) {
        $export("main", new Main());
    }

}