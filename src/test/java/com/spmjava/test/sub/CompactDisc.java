package com.spmjava.test.sub;

import org.springframework.stereotype.Component;

/**
 * @author 齐伟超
 * @date 2018-08-03 17:33
 * @since 1.0.0
 **/
public interface CompactDisc {
    void play();
}

@Component
class SgtPeppers implements CompactDisc {

    @Override
    public void play() {
        System.out.println("play..");
    }
}