package org.jenkinsci.plugins.cloudshell.action;

import com.quali.cloudshell.QsServerDetails;
import hudson.model.Action;

import java.io.Serializable;
import java.util.ArrayList;

public class SandboxLaunchAction implements Action, Serializable, Cloneable{

    private QsServerDetails serverDetails;
    private ArrayList<String> runningSandboxes = new ArrayList<String>();

    public SandboxLaunchAction(QsServerDetails serverDetails){

        this.serverDetails = serverDetails;
    }

    public String getIconFileName() {
        return null;
    }

    public String getDisplayName() {
        return null;
    }

    public String getUrlName() {
        return null;
    }

    public QsServerDetails getServerDetails(){
        return this.serverDetails;
    }

    public void started(String sandboxId) {
        runningSandboxes.add( sandboxId );
    }

    public void stopped(String sandboxId) {
        runningSandboxes.remove( sandboxId );
    }

    public Iterable<String> getRunning() {
        return runningSandboxes;
    }
}
