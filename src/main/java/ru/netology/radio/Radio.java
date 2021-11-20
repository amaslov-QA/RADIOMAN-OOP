package ru.netology.radio;

public class Radio {
    private int currentVolume = 0;
    private int radioStation = 0;


    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getRadioStation() {
        return radioStation;
    }

    public int setRadioStation(int newRadioStation) {
        if (newRadioStation < 0) {

            newRadioStation = 9;
        }
        if (newRadioStation > 9) {
            newRadioStation = 0;
        }
        radioStation = newRadioStation;
        return radioStation;
    }

    public int setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume > 10) {
            newCurrentVolume = 10;
        }
        currentVolume = newCurrentVolume;
        return currentVolume;
    }

    public int setStartVolume() {
        int volume = 0;
        if (currentVolume < 10) {
            volume = currentVolume + 1;
        } else {
            volume = 10;

        }
        return volume;
    }


    public int setMinusVolume() {
        int volume = 0;
        if (currentVolume > 0) {
            volume = currentVolume - 1;
        } else {
            volume = 0;

        }
        return volume;
    }

    public int setStartRadioStationMinus() {
        int stan = 0;
        if (radioStation > 0) {
            stan = radioStation - 1;
        } else {
            stan = 9;
        }
        return radioStation;
    }

    public int setStartStation() {
        int stan = 0;
        if (radioStation < 9) {
            stan = radioStation + 1;
        } else {
            stan = 0;

        }
        return stan;

    }

}


