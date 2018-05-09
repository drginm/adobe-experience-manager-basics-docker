package co.dlighthouse.aem.basics.docker.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;

@Model(adaptables=Resource.class)
public class Video {
    
    @Inject
    @Optional
    private String key;
    
    public String getKey() {
        return key;
    }
}

