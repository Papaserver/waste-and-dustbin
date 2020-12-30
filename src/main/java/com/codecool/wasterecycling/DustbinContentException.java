package com.codecool.wasterecycling;

public class DustbinContentException extends Exception {
        String exception = "You can't throw this kind of garbage into the dustbin!";
        String notSqueezedEx = "Please squeeze the paper garbage before throw into the dustbin!";
        String notCleanedEx = "Please clean the plastic garbage before throw into the dustbin!";

        public void throwException() {
                System.out.println(exception);
        }

        public void throwSqueezeException() {
                System.out.println(notSqueezedEx);
        }
        public void throwCleanException() {
                System.out.println(notCleanedEx);
        }
}
