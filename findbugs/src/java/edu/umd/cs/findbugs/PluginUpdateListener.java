package edu.umd.cs.findbugs;

import java.util.Collection;

public interface PluginUpdateListener {
    void pluginUpdateCheckComplete(Collection<UpdateChecker.PluginUpdate> updates);
}
