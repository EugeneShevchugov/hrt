package eshevchugov.hrt.code.HRT

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HrtApplication

fun main(args: Array<String>) {
    runApplication<HrtApplication>(*args)
}