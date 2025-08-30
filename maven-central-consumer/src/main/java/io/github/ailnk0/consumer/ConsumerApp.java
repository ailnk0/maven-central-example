package io.github.ailnk0.consumer;

// maven-central-example 라이브러리에서 Sample 클래스를 임포트합니다.
import io.github.ailnk0.Sample;

public class ConsumerApp {
    public static void main(String[] args) {
        // Sample 클래스의 인스턴스를 생성합니다.
        Sample sample = new Sample();

        // Sample 클래스의 메소드를 호출하고 결과를 출력합니다.
        String message = sample.sayHello("Maven Central Consumer");
        System.out.println("Message from library: " + message);
    }
}
