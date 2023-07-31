package com.more.server.sampleserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SampleServerApplication

fun main(args: Array<String>) {
	runApplication<SampleServerApplication>(*args)
}
