package com.hsenidmobile.performancemeasurementmeter.model;

/**
 * Created by buddika on 4/7/16.
 */
public class WebTestRunnerMod {

    private short applicationPort;
    private float timePeriodSSH;
    private String applicationPath,acceptType,requestType,applicationURL,serverDetails,hostNameSSH,userNameSSH,passwordSSH,commandsSSH;




    public short getApplicationPort() {
        return applicationPort;
    }

    public float getTimePeriodSSH() {
        return timePeriodSSH;
    }

    public String getApplicationPath() {
        return applicationPath;
    }

    public String getAcceptType() {
        return acceptType;
    }

    public String getRequestType() {
        return requestType;
    }

    public String getApplicationURL() {
        return applicationURL;
    }

    public String getServerDetails() {
        return serverDetails;
    }

    public String getHostNameSSH() {
        return hostNameSSH;
    }

    public String getUserNameSSH() {
        return userNameSSH;
    }

    public String getPasswordSSH() {
        return passwordSSH;
    }

    public String getCommandsSSH() {
        return commandsSSH;
    }


    public void setApplicationPort(short applicationPort) {
        this.applicationPort = applicationPort;
    }

    public void setTimePeriodSSH(float timePeriodSSH) {
        this.timePeriodSSH = timePeriodSSH;
    }

    public void setApplicationPath(String applicationPath) {
        this.applicationPath = applicationPath;
    }

    public void setAcceptType(String acceptType) {
        this.acceptType = acceptType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public void setApplicationURL(String applicationURL) {
        this.applicationURL = applicationURL;
    }

    public void setServerDetails(String serverDetails) {
        this.serverDetails = serverDetails;
    }

    public void setHostNameSSH(String hostNameSSH) {
        this.hostNameSSH = hostNameSSH;
    }

    public void setUserNameSSH(String userNameSSH) {
        this.userNameSSH = userNameSSH;
    }

    public void setPasswordSSH(String passwordSSH) {
        this.passwordSSH = passwordSSH;
    }

    public void setCommandsSSH(String commandsSSH) {
        this.commandsSSH = commandsSSH;
    }
}
