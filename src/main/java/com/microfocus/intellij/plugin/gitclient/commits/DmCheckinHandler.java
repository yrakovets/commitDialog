package com.microfocus.intellij.plugin.gitclient.commits;

import com.intellij.openapi.vcs.CheckinProjectPanel;
import com.intellij.openapi.vcs.changes.LocalChangeList;
import com.intellij.openapi.vcs.changes.ui.EditChangelistSupport;
import com.intellij.openapi.vcs.checkin.CheckinHandler;
import com.intellij.ui.EditorTextField;
import com.intellij.util.Consumer;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class DmCheckinHandler extends CheckinHandler implements EditChangelistSupport {
    private static CheckinProjectPanel panel;

    @Override
    public ReturnResult beforeCheckin() {
        panel.setCommitMessage(panel.getCommitMessage() + " some added text");
        return ReturnResult.COMMIT;
    }

    //added some comment
    void setPanel(CheckinProjectPanel panel) {
        DmCheckinHandler.panel = panel;
    }

    //added new comment
    @Override
    public void installSearch(EditorTextField name, EditorTextField comment) {

    }

    @Override
    public Consumer<LocalChangeList> addControls(JPanel bottomPanel, @Nullable LocalChangeList initial) {
        return null;
    }

    @Override
    public void changelistCreated(LocalChangeList changeList) {

    }
}
