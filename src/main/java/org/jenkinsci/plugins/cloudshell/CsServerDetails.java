package org.jenkinsci.plugins.cloudshell;

public class CsServerDetails {
    public final String serverAddress;
    public final String user;
    public final String pw;
    public final String domain;
    public final int port;


    public CsServerDetails(String serverAddress, String user, String pw, String domain, int port) {
        this.serverAddress = serverAddress;
        this.user = user;
        this.pw = pw;
        this.domain = domain;
        this.port = port;
    }
}