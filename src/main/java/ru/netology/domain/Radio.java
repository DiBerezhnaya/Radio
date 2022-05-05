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
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;


    public Radio(int amountRadioStation) {
        this.amountRadioStation = amountRadioStation;
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

    public void setAmountRadioStation(int amountRadioStation) {
        if (amountRadioStation < 0) {
            return;
        }
        if (amountRadioStation > 10) {
            return;
        }
        this.amountRadioStation = amountRadioStation;
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
