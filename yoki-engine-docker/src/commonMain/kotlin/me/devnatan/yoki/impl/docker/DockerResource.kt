package me.devnatan.yoki.impl.docker

import me.devnatan.yoki.api.*

public class DockerResource internal constructor(docker: Docker) : Resource<DockerConfig> {



    override fun close() {
    }

}