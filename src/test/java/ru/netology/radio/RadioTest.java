package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class RadioTest {

    @Test
public void setTheVolumeTen(){
    Radio radio = new Radio();
    radio.setRadioVolume(10);
    radio.increaseVolume();
    int expected = 10;
    int actual = radio.getRadioVolume();
    assertEquals(expected,actual);
    }
    @Test
    public void  setTheVolumeZero(){
        Radio radio = new Radio();
        radio.setRadioVolume(0);
        radio.increaseVolume();
        int expected = 0;
        int actual = radio.getRadioVolume();
        assertEquals(expected,actual);
    }
    @Test
    public  void setTheVolumeFive(){
        Radio radio = new Radio();
        radio.setRadioVolume(5);
        radio.increaseVolume();
        int expected = 5;
        int actual = radio.getRadioVolume();
        assertEquals(expected,actual);
    }
    @Test
    public void setTheStationNine(){
        Radio radio = new Radio();
        radio.setStationNumber(9);
        radio.increaseStation();
        int expected = 9;
        int actual = radio.getStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void setTheStationZero(){
        Radio radio = new Radio();
        radio.setStationNumber(0);
        radio.increaseStation();
        int expected = 0;
        int actual = radio.getStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void setTheStationSeven(){
        Radio radio = new Radio();
        radio.setStationNumber(7);
        radio.increaseStation();
        int expected = 9;
        int actual = radio.getStationNumber();
        assertEquals(expected, actual);
    }
}