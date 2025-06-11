package firstService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
/*해당 Application 을 서비스 발견 Client 로 설정하는 Annotation */
@EnableDiscoveryClient
public class Chap02FirstServiceLectureSourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chap02FirstServiceLectureSourceApplication.class, args);
    }

}
