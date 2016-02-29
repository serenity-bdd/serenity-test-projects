## Repository for test projects based on serenty-rest-petstore-core, serenity-web-todomvc-core  

Here you can find some examples of using Serenity BDD. This repo is used as git submodule for serenity-module-integrations during smoke-tests.

### Structure

 1. web-todomvc-test - project for testing how serenity-bdd works (junit and jbehave modules) during webtesting against [todomvc.com](http://todomvc.com/). It uses chrome and firefox browsers
 2. junit-in-parallel - project for testing how serenity-bdd (junit module) works when tests are executed concurrently. It is used in serenity-module-integrations, where some tests are generated programmatically (to run as more parallel tests as it possible on build machine) 
 3. jbehave-in-parallel - project for testing how serenity-bdd (jbehave module) works when tests are executed concurrently. It is used in serenity-module-integrations, where some tests are generated programmatically (to run as more parallel tests as it possible on build machine)
 4. jbehave-tags - project for testing how serenity-jbehave-module works with tags.
 5. jbehave-advanced - project where all serenity-jbehave features should be covered
 
 

## To build with gradle

To build every project you should:

 - init all submodules with command ```git submodule init ```
 - update all submodule with command ```git submodule update ```
 - init wrapper to be sure that we use same gradle ```gradle wrapper ```
 - run gradle build ```./gradlew clean build ```

## To build with maven

To build every project(with submodules) you should

 - run ``` mvn clean verify``` 