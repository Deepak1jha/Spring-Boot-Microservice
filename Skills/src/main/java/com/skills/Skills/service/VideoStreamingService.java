package com.skills.Skills.service;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
public class VideoStreamingService {

        @PostConstruct
        public void doSomeTaskOnInit() {
            log.info("VideoStreamingService Service Bean Initialize");
            log.info("VideoStreamingService Service Bean Initialize");
            log.info("VideoStreamingService Service Bean Initialize");
        }

        @PreDestroy
        public void doSomeTaskOnDestroy() {
            log.info("VideoStreamingService Service Bean Destroy");
            log.info("VideoStreamingService Service Bean Destroy");
            log.info("VideoStreamingService Service Bean Destroy");
        }

}
