package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void numberStation() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(8);

        int expected = 8;
        int actual = cond.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void next() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(9);

        cond.next();

        int expected = 0;
        int actual = cond.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void nextBorders() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(5);

        cond.next();

        int expected = 6;
        int actual = cond.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevBorders() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(1);

        cond.prev();

        int expected = 0;
        int actual = cond.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prev() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(0);

        cond.prev();

        int expected = 9;
        int actual = cond.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeBorders() {
        Radio cond = new Radio();
        cond.setCurrentVolume(5);

        cond.increaseVolume();

        int expected = 6;
        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(11);

        cond.increaseVolume();

        int expected = 10;
        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeBorders() {
        Radio cond = new Radio();
        cond.setCurrentVolume(5);

        cond.decreaseVolume();

        int expected = 4;
        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);

        cond.decreaseVolume();

        int expected = 0;
        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }
}
