package com.github.xsfelvis.newtemplate.services

import com.github.xsfelvis.newtemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
