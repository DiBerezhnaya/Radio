package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void numberNewCurrentRadioStation() {
        Radio cond = new Radio(20);

        cond.setCurrentRadioStation(15);
        int expected = 15;
        int actual = cond.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void numberBorderAmountRadioStation() {
        Radio cond = new Radio();

        cond.setAmountRadioStation(5);
        int expected = 5;
        int actual = cond.getAmountRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void numberMoreMaxAmountRadioStation() {
        Radio cond = new Radio();

        cond.setAmountRadioStation(14);
        int expected = 0;
        int actual = cond.getAmountRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void numberLessMinAmountRadioStation() {
        Radio cond = new Radio();

        cond.setAmountRadioStation(-1);
        int expected = 0;
        int actual = cond.getAmountRadioStation();

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
        cond.setCurrentVolume(11);

        cond.increaseVolume();

        int expected = 12;
        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMoreThanMax() {
        Radio cond = new Radio();
        cond.setCurrentVolume(100);

        cond.increaseVolume();

        int expected = 100;
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
    public void decreaseVolumeLessMin() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);

        cond.decreaseVolume();

        int expected = 0;
        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolumeMax() {
        Radio cond = new Radio();
        cond.setCurrentVolume(101);

        int expected = 0;
        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolumeMin() {
        Radio cond = new Radio();
        cond.setCurrentVolume(-1);

        int expected = 0;
        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStationMax() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(10);

        int expected = 0;
        int actual = cond.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStationMin() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = cond.getCurrentRadioStation();

        assertEquals(expected, actual);
    }
}
