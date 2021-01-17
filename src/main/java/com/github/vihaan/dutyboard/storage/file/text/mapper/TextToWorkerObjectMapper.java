package com.github.vihaan.dutyboard.storage.file.text.mapper;

import com.github.vihaan.dutyboard.elements.worker.Worker;
import com.github.vihaan.dutyboard.elements.worker.presence.Presence;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("worker-mapper")
public class TextToWorkerObjectMapper implements TextToObjectMapper<Worker> {

    @Override
    public Worker mapToObjects(String[] props) {
        String name = props[0];
        String surname = props[1];
        String visibleName = props[2];
        String presenceText = props[3];
        return new Worker(name,surname,visibleName,setWorkerPresence(presenceText));
    }

    private Presence setWorkerPresence(String presenceText){
        return Boolean.parseBoolean(presenceText) ? Presence.PRESENT : Presence.ABSENT;
    }
}
