package post;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service // bu class'in business service oldugunu deyirik
public class TopicService {
    private List<TopicPOJO> topics = new ArrayList<>(Arrays.asList(
            new TopicPOJO("1", "Java", "Java Dersi"),
            new TopicPOJO("2", "Spring", "Spring Dersi"),
            new TopicPOJO("3", "SpringBoot", "SpringBoot Dersi"),
            new TopicPOJO("4", "Hayatbilgisi", "Heyat Dersi")
    ));

    public List<TopicPOJO> getAllTopics() {

        return topics;
    }

    public TopicPOJO getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(TopicPOJO topicPOJO) {
        topics.add(topicPOJO);
    }

    public void updateTopic(String id, TopicPOJO topicPOJO) {

        for (int i = 0; i < topics.size(); i++) {
            TopicPOJO t = topics.get(i);
            if (t.getId().equals(id)) {
                topics.set(i, topicPOJO);
                return;
            }


        }
    }
}
