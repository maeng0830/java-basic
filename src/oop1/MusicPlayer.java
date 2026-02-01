package oop1;

public class MusicPlayer {
    // 클래스 내부에 데이터와 해당 데이터를 조작하는 메서드를 함께 정의하고, 클래스 외부에 제공하는 개념을 캡슐화라고 한다.

    int volume;
    boolean isOn;
    int maxVolume = 10;

    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 실행합니다.");
    }

    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumeUp() {
        if (volume < maxVolume) volume++;
        System.out.println("볼륨을 올립니다. 현재 볼륨=" + volume);
    }

    void volumeDown() {
        if (volume > 0) volume--;
        System.out.println("볼륨을 내립니다. 현재 볼륨=" + volume);
    }
}
