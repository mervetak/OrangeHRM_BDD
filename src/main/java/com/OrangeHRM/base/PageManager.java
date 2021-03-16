package com.OrangeHRM.base;

import com.OrangeHRM.pages.LoginPage;

public class PageManager {

    public static LoginPage loginPage;


    public static void initializePageObjects(){
        loginPage = new LoginPage();
    }



}
