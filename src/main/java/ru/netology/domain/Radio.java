package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private final int maxRadioStation = 9;
    private final int minRadioStation = 0;
    private int currentRadioStation;
    private int amountRadioStation = 10;
    private int currentVolume;

    public Radio(int amountRadioStation) {
        this.amountRadioStation = amountRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public int getAmountRadioStation() {
        return amountRadioStation;
    }

    public void setAmountRadioStation(int amountRadioStation) {
        this.amountRadioStation = amountRadioStation;
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
        int maxVolume = 100;
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
