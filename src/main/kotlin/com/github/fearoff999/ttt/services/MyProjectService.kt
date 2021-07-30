package com.github.fearoff999.ttt.services

import com.github.fearoff999.ttt.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
