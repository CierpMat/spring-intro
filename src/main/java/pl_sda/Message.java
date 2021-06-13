package pl_sda;

import javax.annotation.PostConstruct;

public class Message {
    private String text;

    @PostConstruct
    public void postConstructTest(){
        System.out.println("Post construct test");
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
