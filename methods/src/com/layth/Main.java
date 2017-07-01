package com.layth;

public class Main {
    /**
     * @param args
     * command-line arguments are passed in args
     * Java's main methods do not return a value directly, but one can be passed
     * by using the System.exit() method.
     * Another aspect unique to Java is that the main function must be included
     * within a class, and then called manually by the runtime. This is because in
     * Java everything has to be contained within a class. For instance, a hello world
     * program in Java may look like so:
     *
     *
     * public class HelloWorld {
            public static void main(String[] args) {
                System.out.println("Hello, world!");
            }
    }

     */
    public static void main(String[] args) {
        // launch methods here
        boolean gameOver =  true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        // call the method here
        calculateScore(true, 800, levelCompleted, bonus);
        score = 1000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 100;
            System.out.println("Your final score was " + finalScore);
        }
    }

    /**
     * ||| Public ||| It means that you can call this method from outside of the class you are
     * currently in. This is necessary because this method is being called by the Java runtime
     * system which is not located in your current class.
     *
     * ||| static ||| When the JVM makes call to the main method, there is no object existing for
     * the class being called therefore it has to have a static method to allow invocation from the class.
     *
     * ||| void ||| Java is platform independ language and if it will return some value then the value may mean
     * different things to different platforms. ALso, there are other ways to exit the program on a multithreaded
     * systems.
     *
     * ||| String args[] ||| These are the arguments of type String that your Java Program accepts when you
     * run it.
     */
    public static void calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 100;
            System.out.println("Your final score was " + finalScore);
        }
    }
}
