package com.codecool.wasterecycling;


public class PlasticGarbage extends Garbage {

        boolean clean;

        public PlasticGarbage(String name, boolean clean) {
                super(name);
                this.clean = clean;
        }

        @Override
        public String getName() {
                return super.getName();
        }

        public boolean isClean() {
                return clean;
        }

        public void clean() {
                if (!clean) {
                        this.clean = true;
                }
        }
}
