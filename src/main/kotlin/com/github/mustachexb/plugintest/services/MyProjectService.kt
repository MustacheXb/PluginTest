package com.github.mustachexb.plugintest.services

import com.intellij.openapi.project.Project
import com.github.mustachexb.plugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
