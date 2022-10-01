package io.lfxjtu.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework Description"),
            new Topic("java", "Java Core", "Java Core Description"),
            new Topic("javascript", "Javascript name", "Javascript Description")
    );

    public List<Topic> getAllTopics(){
        return topics;
    }
}

