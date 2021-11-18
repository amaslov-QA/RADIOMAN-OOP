package ru.netology.radio;

public class Radio {
    public int currentRadioStation;
    public int currentVolume;

    public int setCurrentRadioStation(int currentRadioStation) {

        if (currentRadioStation > 9) {
            currentRadioStation = 0;
        }

        if (currentRadioStation < 0) {
            currentRadioStation = 0;
        }

        if (currentRadioStation > 0) {
            this.currentRadioStation = currentRadioStation;
        }

        this.currentRadioStation = currentRadioStation;


        return currentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }


    public void setCurrentVolume(int currentVolume) {

        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 10) {
            currentVolume = currentVolume;
        }

    }

    public void reducerVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            currentVolume = currentVolume;
        }
    }

    public void increaseRadioStation() {

        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation >= 9) {
            currentRadioStation = 0;
        }
    }

    public void reducerRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        }
    }


}


