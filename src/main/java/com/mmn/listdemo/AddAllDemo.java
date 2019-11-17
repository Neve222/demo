package com.mmn.listdemo;

import java.util.*;

/**
 * @author mmn
 * @date 2019-09-08 18:09
 */
public class AddAllDemo {

    static class Snow{}

    static class Power extends Snow{}

    static class Light extends Power{}

    static class Heavy extends Snow{}

    static class Crusty extends Snow{}

    static class Slush extends Snow{}

    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(
                new Crusty(), new Slush(),new Power()
        );

        List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());


        List<Snow> snow3 = new ArrayList<Snow>();
        Collections.addAll(snow3, new Light(), new Heavy());

        List<Snow> snow4 = Arrays.asList(new Light(), new Heavy());


    }
}
