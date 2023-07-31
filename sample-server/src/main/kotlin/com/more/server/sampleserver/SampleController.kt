package com.more.server.sampleserver

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/sample")
class SampleController {

    @GetMapping("/greeting")
    fun greeting(): String {
        return "Hello"
    }
}