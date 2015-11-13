package com.fcj.slf4j;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by fcj on 11/12/15.
 */
public class SLF4JTest {

    @Test
    public void simple1(){
        Logger logger = LoggerFactory.getLogger(SLF4JTest.class);
        logger.info("Simple Test");
        try{
            int i = 1/0;
        }catch (Exception exception){
            logger.debug("can not divided by zero", exception);
        }
    }



}
