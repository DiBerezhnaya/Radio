package ru.netology.domain;

public class Radio {

    private final int minRadioStation = 0;
    private final int maxVolume = 100;
    private final int minVolume = 0;
    private final int minAmountRS = 0;
    private final int maxAmountRS = 10;
    private int maxRadioStation = 9;
    private int currentRadioStation;
    private int amountRadioStation;
    private int currentVolume;

    public Radio(int amountRadioStation) {
        this.maxRadioStation = amountRadioStation - 1;

    }

    public Radio() {

    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getAmountRadioStation() {
        return amountRadioStation;
    }

    public void setAmountRadioStation(int amountRadioStation) {
        if (amountRadioStation < minAmountRS) {
            return;
        }
        if (amountRadioStation > maxAmountRS) {
            return;
        }
        this.amountRadioStation = amountRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
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

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        }
    }
}
