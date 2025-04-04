package com.tdd.DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenExcel
{

   @Test(dataProvider = "getData",dataProviderClass = utilExcel.class)
    public void test_VWOLogin(String email,String password)
    {
        System.out.println("Email- "+email);
        System.out.println("password- "+password);
    }
}
