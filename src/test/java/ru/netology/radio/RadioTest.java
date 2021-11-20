package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio service = new Radio(30);
    Radio manager = new Radio();

    @Test
    void shouldGetCurrentVolume() {
        int expected = 10;
        int actual = service.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    void shouldGetStation() {
        int expected = 0;
        int actual = service.getStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetRadioStationOne() {
        int expected = 0;
        int actual = service.setRadioStation(0);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetRadioStationTwo() {
        int expected = 30;
        int actual = service.setRadioStation(-1);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationThree() {
        int expected = 0;
        int actual = service.setRadioStation(31);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeOne() {
        int expected = 50;
        int actual = service.setCurrentVolume(50);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeTwo() {
        int expected = 0;
        int actual = service.setCurrentVolume(-1);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeThree() {
        int expected = 100;
        int actual = service.setCurrentVolume(101);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetIncreaseVolumeOne() {
        int expected = 51;
        int actual = service.setIncreaseVolume(50);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetIncreaseVolumeTwo() {
        int v = service.setCurrentVolume(101);
        int expected = 100;
        int actual = service.setIncreaseVolume(v);
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeThree() {
        int v = service.setCurrentVolume(-1);
        int expected = 1;
        int actual = service.setIncreaseVolume(v);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetMinusVolumeOne() {
        int v = service.setCurrentVolume(-1);
        int expected = 0;
        int actual = service.setMinusVolume(v);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCetMinusVolumeTwo() {
        int v = service.setCurrentVolume(0);
        int expected = 0;
        int actual = service.setMinusVolume(v);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCetMinusVolumeThree() {
        int v = service.setCurrentVolume(10);
        int expected = 9;
        int actual = service.setMinusVolume(v);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationMinusOne() {
        int s = service.setRadioStation(0);
        int expected = 30;
        int actual = service.setRadioStationMinus(s);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationMinusTwo() {
        int s = service.setRadioStation(1);
        int expected = 0;
        int actual = service.setRadioStationMinus(s);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationMinusThree() {
        int s = service.setRadioStation(20);
        int expected = 19;
        int actual = service.setRadioStationMinus(s);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetIncreaseStationOne() {
        int s = service.setRadioStation(30);
        int expected = 0;
        int actual = service.setIncreaseStation(s);
        assertEquals(expected, actual);
    }

    @Test
    void SetIncreaseStationTwo() {
        int s = service.setRadioStation(0);
        int expected = 1;
        int actual = service.setIncreaseStation(s);
        assertEquals(expected, actual);
    }

    @Test
    void SetIncreaseStationThree() {
        int s = service.setRadioStation(-1);
        int expected = 0;
        int actual = service.setIncreaseStation(s);
        assertEquals(expected, actual);
    }

    @Test
    void SetIncreaseStationFour() {
        int s = service.setRadioStationMinus(service.setRadioStationMinus(service.setRadioStationMinus(service.setRadioStationMinus(service.setRadioStation(30)))));
        int expected = 25;
        int actual = service.setRadioStationMinus(s);
        assertEquals(expected, actual);
    }
}