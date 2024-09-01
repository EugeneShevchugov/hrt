package eshevchugov.hrt.code.HRT.controller

import eshevchugov.hrt.code.HRT.service.HrtService
import org.springframework.scheduling.annotation.Async
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hrt")
class HrtController(
        private val hrtService: HrtService
) {

    @GetMapping("/code")
    @Async
    fun getFromScript(@RequestParam message: String) {
        hrtService.onSend(message)
    }
}
