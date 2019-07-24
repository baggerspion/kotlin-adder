package com.wayfair.servicedemo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@EnableAutoConfiguration
@Configuration
class DemoApplication {
	@Bean
	fun controller() = Controller()
}

fun main(args: Array<String>) {
	SpringApplication.run(DemoApplication::class.java, *args)
}
