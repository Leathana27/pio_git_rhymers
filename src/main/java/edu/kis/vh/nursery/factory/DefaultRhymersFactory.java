package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

/**
 * Klasa DefaultRhymersFactory implementuje interfejs Rhymersfactory.
 * Zawiera w sobie gettery które zwracają nowe obiekty klas:
 * - DefaultCountingOutRhymer
 * - FIFORhymer
 * - HanoiRhymer.
 */
public class DefaultRhymersFactory implements Rhymersfactory {

    @Override
    public DefaultCountingOutRhymer getStandardRhymer() {
        return new DefaultCountingOutRhymer();
    }

    @Override
    public DefaultCountingOutRhymer getFalseRhymer() {
        return new DefaultCountingOutRhymer();
    }

    @Override
    public DefaultCountingOutRhymer getFIFORhymer() {
        return new FIFORhymer();
    }

    @Override
    public DefaultCountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }

}
