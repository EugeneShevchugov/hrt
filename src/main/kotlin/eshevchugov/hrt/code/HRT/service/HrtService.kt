package eshevchugov.hrt.code.HRT.service

import api.longpoll.bots.LongPollBot
import mu.KotlinLogging
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.time.ZoneId

@Service
class HrtService: LongPollBot() {

    private val PEER_ID = 2000000001

    fun onSend(message: String) {
        sendMessage(message, PEER_ID)
    }

    override fun getAccessToken(): String {
        return "vk1.a.Jl-fEpgVCC4nN78BmZHw6YQDZHE56GZnbvtc2rfAdotsTmNlijrwCLZlqzLo5KWPioe3wU21DgjNI2YUpmspdCGzoBmMXjOa5aYqVeMrkGPsfP-JBh0AENcmn1L1YX_PyvLy1uhrFlapSqGpt8hOOo0zYC85drBX4NoZaXI_pg1SooRNncBxx5qg7BuPn4OHKdBjbnlRl96UHsvsTR7rEw"
    }

    private fun sendMessage(message: String, peerId: Int) {
        try {
            val moscowTime = LocalDateTime.now(ZoneId.of("Europe/Moscow"))
            val s = if (moscowTime.hour in 10..21) "@all" else "@online"
            vk.messages.send().setPeerId(peerId).setMessage("$message $s").execute()
        } catch (ex: Exception) {
            log.error("Could no send message back!", ex)
        }
    }

    private companion object {
        private val log = KotlinLogging.logger { }
    }
}