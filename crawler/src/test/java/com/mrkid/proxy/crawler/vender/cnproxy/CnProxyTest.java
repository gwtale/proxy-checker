package com.mrkid.proxy.crawler.vender.cnproxy;

import org.junit.Test;

/**
 * User: xudong
 * Date: 15/12/2016
 * Time: 7:06 PM
 */
public class CnProxyTest {
    @Test
    public void test() throws Exception {
        System.out.println(new CnProxyFetcher().crawl());
    }
}
