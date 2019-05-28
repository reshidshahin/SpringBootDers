package getObjectById;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service // bu class'in business service oldugunu deyirik
public class TopicService {

    private List<TopicPOJO> topics = Arrays.asList(
            new TopicPOJO("1", "Java", "Java Dersi"),
            new TopicPOJO("2", "Spring", "Spring Dersi"),
            new TopicPOJO("3", "SpringBoot", "SpringBoot Dersi"),
            new TopicPOJO("4", "Hayatbilgisi", "Heyat Dersi")
    );

    public List<TopicPOJO> getAllTopics(){

        return topics;
    }


    public TopicPOJO getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

}
