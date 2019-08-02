package com.codegym.task.task03.task0307;

/* 
Hello, StarCraft!

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Zerg zerg1 = new Zerg();
        zerg1.name = "zerg-first";
        Zerg zerg2 = new Zerg();
        zerg2.name = "zerg-second";
        Zerg zerg3 = new Zerg();
        zerg3.name = "zerg-third";
        Zerg zerg4 = new Zerg();
        zerg4.name = "zerg-fourth";
        Zerg zerg5 = new Zerg();
        zerg5.name = "zerg-fifth";

        Protoss protoss1 = new Protoss();
        protoss1.name = "protos-first";
        Protoss protoss2 = new Protoss();
        protoss2.name = "protos-second";
        Protoss protoss3 = new Protoss();
        protoss3.name = "protos-third";

        Terran terran1 = new Terran();
        terran1.name = "terran-first";
        Terran terran2 = new Terran();
        terran2.name = "terran-second";
        Terran terran3 = new Terran();
        terran3.name = "terran-third";
        Terran terran4 = new Terran();
        terran4.name = "terran-fourth";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
