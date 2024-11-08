package com.green.day27;

import com.green.day27.noneioc.HarmanSpeaker;
import com.green.day27.noneioc.SamsungTv;

public class Test {

    public static void main(String[] args) {
        HarmanSpeaker hs = new HarmanSpeaker();
        hs.speakerSound();

        System.out.println("-----------");
        Tv tv = new SamsungTv();
        tv.sound();
    }
}
