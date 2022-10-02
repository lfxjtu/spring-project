package io.lfxjtu.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    private final List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework Description"),
            new Topic("java", "Java Core", "Java Core Description"),
            new Topic("javascript", "Javascript name", "Javascript Description")
    ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        Optional<Topic> topic = topics.stream().filter(t -> t.getId().equals(id)).findFirst();
        return topic.orElse(null);
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(Topic topic, String id) {
        for (int i = 0; i < topics.size(); i++) {
            if (topics.get(i).getId().equals(id)) {
                topics.set(i, topic);
            }
        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(topic -> topic.getId().equals(id));
    }
}

