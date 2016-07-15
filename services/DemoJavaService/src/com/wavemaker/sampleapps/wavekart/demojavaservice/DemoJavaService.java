/*Copyright (c) 2015-2016 WaveMaker.com All Rights Reserved.
 This software is the confidential and proprietary information of WaveMaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with WaveMaker.com*/

package com.wavemaker.sampleapps.wavekart.demojavaservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import com.wavemaker.sampleapps.wavekart.demojavaservice.model.*;
import com.wavemaker.runtime.service.annotations.ExposeToClient;
import com.wavemaker.runtime.service.annotations.HideFromClient;

/**
 * This is a singleton class with all of its public methods exposed to the client via controller.
 * Their return values and parameters will be passed to the client or taken
 * from the client respectively.
 */
@ExposeToClient
public class DemoJavaService {

    private static final Logger logger=LoggerFactory.getLogger(DemoJavaService.class);

    public String sayHello(String name ) {
        return "Hello " + name;
    }

    public String sampleJavaOperation(String name) {
        String result = null;
        try {
            logger.debug("Starting sample operation");
            result = "Hello " + name + "!";
            logger.debug("Returning {}", result);
            return result;
        } catch (Exception e) {
            logger.error("Sample java service operation has failed", e);
            throw e;
        }
    }
    
    public String inputMyPojo(MyPojo mypojo) {
        return "SUCCESS";
    }
    
    public static class MyPojo {
        private int age;
        private String name;
        
        public String getName() {
            return name;
        }
        
        public int getAge() {
            return age;
        }
        
        public void setName(String name) {
            this.name = name;
        }
        
        public void setAge(int age) {
            this.age = age;
        }
    }
}

