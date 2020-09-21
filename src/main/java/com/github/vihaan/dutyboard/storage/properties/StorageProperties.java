package com.github.vihaan.dutyboard.storage.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("dutyboard.storage.location")
public class StorageProperties {

    private String text;
    private String json;

    public String getText() {
        return text;
    }
    public void setText(String text) { this.text = text; }

    public String getJson() {
        return json;
    }
    public void setJson(String json) {
        this.json = json;
    }
}
