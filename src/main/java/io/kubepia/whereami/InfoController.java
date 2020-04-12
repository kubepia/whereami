package io.kubepia.whereami;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * InfoController
 */
@RestController
public class InfoController {

    // @Value("#{environment.NODE_NAME")
    // String nodeName = "";

    // @Value("#{environment.HOST_IP")
    // String hostIP = "";

    // @Value("#{environment.POD_IP")
    // String podIP = "";

    // @Value("#{environment.NAEMSPACE")
    // String namespace = "";

    // @Value("#{environment.POD_NAME")
    // String podName = "";
    @Autowired
    InformationVo informationVo;

    @GetMapping(value = "/")
    @ResponseBody
    InformationVo index() {
        return informationVo;
    }

    @GetMapping(value = "/api/health")
    String health() {
        return "{\"status\": \"ok\"}";
    }
}