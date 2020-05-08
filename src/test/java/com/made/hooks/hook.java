package com.made.hooks;

import com.made.common.Browsers;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hook extends Browsers {
    @Before
    public void setup(){
        launchBrowser("Firefox");
    }
    @After
    public void tearDwon(){
        //closeBrowser();
    }
}
