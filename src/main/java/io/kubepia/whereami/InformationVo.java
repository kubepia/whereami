package io.kubepia.whereami;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class InformationVo {
    @Value("#{environment.NODE_NAME}")
    String nodeName = "default";

    @Value("#{environment.HOST_IP}")
    String hostIP = "default";

    @Value("#{environment.POD_IP}")
    String podIP = "default";

    // @Value("#{environment.NAEMSPACE}")
    // String namespace = "default";

    @Value("#{environment.POD_NAME}")
    String podName = "default";

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getHostIP() {
        return hostIP;
    }

    public void setHostIP(String hostIP) {
        this.hostIP = hostIP;
    }

    public String getPodIP() {
        return podIP;
    }

    public void setPodIP(String podIP) {
        this.podIP = podIP;
    }

    // public String getNamespace() {
    // return namespace;
    // }

    // public void setNamespace(String namespace) {
    // this.namespace = namespace;
    // }

    public String getPodName() {
        return podName;
    }

    public void setPodName(String podName) {
        this.podName = podName;
    }
}