package net.serenitybdd.demos.actions.steps.actions;

import java.util.concurrent.ThreadLocalRandom;

/**
 * User: YamStranger
 * Date: 2/22/16
 * Time: 10:14 AM
 */
public class SimplestAction {
    public void nothing() {
        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(10, 100));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
