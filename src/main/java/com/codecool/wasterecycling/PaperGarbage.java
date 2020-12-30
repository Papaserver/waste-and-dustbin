package com.codecool.wasterecycling;


public class PaperGarbage extends Garbage {

        boolean squeezed;

        public PaperGarbage(String name, boolean squeezed) {
                super(name);
                this.squeezed = squeezed;
        }

        @Override
        public String getName() {
                return super.getName();
        }

        public boolean isSqueezed() {
                return squeezed;
        }

        public void squeeze() {
                if (!squeezed) {
                        this.squeezed = true;
                }
        }
}
