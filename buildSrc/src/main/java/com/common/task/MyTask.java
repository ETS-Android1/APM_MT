package com.common.task;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class MyTask extends DefaultTask {

    public MyTask() {
        this.setGroup("a_sand");
    }

    @TaskAction
    void run(){
        System.err.println("This is Mytask run");
    }
}
