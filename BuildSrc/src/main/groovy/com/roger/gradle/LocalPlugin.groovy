package com.roger.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project;

public class LocalPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        System.out.println("roger LocalPlugin:" + project.class);
    }
}