package com.green.day27.ioc;

import com.green.day27.Speaker;
import com.green.day27.Woofer;

public class BoseSpeaker implements Speaker {
    private Woofer woofer;

    public BoseSpeaker(Woofer woofer) { //생성자 or setter로 외부에서 값을 넣어줄 수 있다. >> 생성자를 통해 받는 것을 권장함
        this.woofer = woofer;
    }

    @Override
    public void speakerSound() {
        System.out.println("Bose Speaker: 소리가 짱짱하다.");
        woofer.baseSound();
    }
}
