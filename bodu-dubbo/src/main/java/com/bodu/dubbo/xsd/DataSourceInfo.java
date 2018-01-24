package com.bodu.dubbo.xsd;

/**
 * project: bodu-dubbo
 * author: zhongyp
 * date: 2018/1/24
 * mail: zhongyp001@163.com
 */
public class DataSourceInfo {
    private String url;
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {

        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


}
