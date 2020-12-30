package com.codecool.wasterecycling;

import java.util.ArrayList;
import java.util.Arrays;

public class Dustbin {

        String color;
        public ArrayList<Garbage> dustbinContent = new ArrayList<>();

        public Dustbin(String color) {
                this.color = color;
        }

        public String getColor() {
                return color;
        }

        public void throwOutGarbage(Garbage waste) {
                DustbinContentException notProperException = new DustbinContentException();
                if (waste instanceof PaperGarbage) {
                        if (((PaperGarbage) waste).isSqueezed()) {
                                this.dustbinContent.add(waste);
                        } else {
                              notProperException.throwSqueezeException();
                        }
                }
                else if (waste instanceof PlasticGarbage) {
                        if (((PlasticGarbage) waste).isClean()) {
                                this.dustbinContent.add(waste);
                        } else {
                                notProperException.throwCleanException();
                        }
                }
                else if (waste instanceof HouseWaste) {
                        this.dustbinContent.add(waste);

                } else {
                        notProperException.throwException();
                }
        }

        public void emptyContents() {
            dustbinContent.clear();
        }

        public void getHousewasteCount() {
                int houseWasteCount = 0;
                for (int i = 0; i < dustbinContent.size(); i++) {
                        if (dustbinContent.get(i) instanceof HouseWaste) {
                                houseWasteCount += 1;
                        }
                }
                System.out.println("Number of house waste in the dustbin: "+houseWasteCount);
        }

        public void getPaperCount() {
                int paperCount = 0;
                for (int i = 0; i < dustbinContent.size(); i++) {
                        if (dustbinContent.get(i) instanceof PaperGarbage) {
                                paperCount += 1;
                        }
                }
                System.out.println("Number of paper garbage in the dustbin: "+paperCount);
        }

        public void getPlasticCount() {
                int plasticCount = 0;
                for (int i = 0; i < dustbinContent.size(); i++) {
                        if (dustbinContent.get(i) instanceof PlasticGarbage) {
                                plasticCount += 1;
                        }
                }
                System.out.println("Number of plastic garbage in the dustbin: "+plasticCount);
        }

        public String toString() {
                int paperItem = 1;
                int plasticItem = 1;
                int hWasteItem = 1;
                int papNr = 1;
                int plastNr = 1;
                int hWasNr = 1;
                System.out.println(color+" Dustbin! ");
                for (int i = 0; i < dustbinContent.size(); i++) {
                        if (dustbinContent.get(i) instanceof PaperGarbage) {
                                System.out.print("\r\n" +"Paper content: "+paperItem+" item(s) ");
                                System.out.print(dustbinContent.get(i).getName()+" nr."+papNr);
                                paperItem++;
                                papNr++;
                        } else if (dustbinContent.get(i) instanceof PlasticGarbage) {
                                System.out.print("\r\n" +"Plastic content: "+plasticItem+" item(s) ");
                                System.out.print(dustbinContent.get(i).getName()+" nr."+plastNr);
                                plasticItem++;
                                plastNr++;
                        } else if (dustbinContent.get(i) instanceof HouseWaste) {
                                System.out.print("\r\n" +"House waste content: "+hWasteItem+" item(s) ");
                                System.out.print(dustbinContent.get(i).getName()+" nr."+hWasNr);
                                hWasteItem++;
                                hWasNr++;
                        }
                }
                        return null;
        }
}
