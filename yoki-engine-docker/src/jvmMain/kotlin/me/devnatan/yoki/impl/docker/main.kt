package me.devnatan.yoki.impl.docker

import kotlinx.coroutines.*
import me.devnatan.yoki.api.external.properties.*
import me.devnatan.yoki.protocol.*

public fun main(): Unit = runBlocking {
    println("Connecting")

    try {
        val docker = Docker {

        }

        docker.container.create(
            mapOf(
                ContainerImage to "busybox",
                ContainerName to "testando"
            )
        )
    } catch (e: Exception) {
        e.printStackTrace()
    } finally {
        println("Closed")
    }
}