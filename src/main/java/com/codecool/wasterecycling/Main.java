package com.codecool.wasterecycling;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
            Dustbin dustbin = new Dustbin("Green");
            System.out.println(dustbin.getColor());
            System.out.println(dustbin.dustbinContent);

            PaperGarbage failedExam = new PaperGarbage("Failed Exam", false);
            System.out.println(failedExam.isSqueezed());
            dustbin.throwOutGarbage(failedExam);
            failedExam.squeeze();
            System.out.println(failedExam.isSqueezed());
            dustbin.throwOutGarbage(failedExam);
            System.out.println(failedExam.getName());

            HouseWaste rottenTomato = new HouseWaste("Rotten tomato");
            dustbin.throwOutGarbage(rottenTomato);
            System.out.println(rottenTomato.getName());

            PlasticGarbage plasticBottle = new PlasticGarbage("Empty plastic bottle", false);
            System.out.println(plasticBottle.isClean());
            dustbin.throwOutGarbage(plasticBottle);
            plasticBottle.clean();
            System.out.println(plasticBottle.isClean());
            dustbin.throwOutGarbage(plasticBottle);

            dustbin.toString();

//            dustbin.getHousewasteCount();
//            dustbin.getPaperCount();
//            dustbin.getPlasticCount();

    }
}
