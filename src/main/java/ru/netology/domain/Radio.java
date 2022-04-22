package ru.netology.domain;

public class Radio {

    private int currentRadioStation;
    private final int maxRadioStation = 9;
    private final int minRadioStation = 0;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public void next() {
        if (currentRadioStation >= maxRadioStation) {
            this.currentRadioStation = minRadioStation;
            return;
        }
        currentRadioStation = currentRadioStation + 1;
    }

    public void prev() {
        if (currentRadioStation <= minRadioStation) {
            this.currentRadioStation = maxRadioStation;
            return;
        }
        currentRadioStation = currentRadioStation - 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        int maxVolume = 10;
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        int minVolume = 0;
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        }
    }
}
