package com.magenta.maxoptra.api.mobile.node.mns0;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;

@XmlTransient
public abstract class Message implements Serializable {

    @XmlElement(name = "Time", required = true)
    private Long time;

    @XmlAnyElement(lax = true)
    private Object objectInfo;

    @XmlElement(name = "Description")
    private String description;

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Object getObjectInfo() {
        return objectInfo;
    }

    public void setObjectInfo(Object objectInfo) {
        this.objectInfo = objectInfo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
