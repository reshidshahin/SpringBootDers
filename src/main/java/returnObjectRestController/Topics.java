package returnObjectRestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Topics {

    @RequestMapping("/topics")
    public List<TopicPOJO> getAllTopics(){
        return Arrays.asList(
                new TopicPOJO(1,"Java","Java Dersi"),
                new TopicPOJO(2,"Spring","Spring Dersi"),
                new TopicPOJO(3,"SpringBoot","SpringBoot Dersi")
        );
    }

}
