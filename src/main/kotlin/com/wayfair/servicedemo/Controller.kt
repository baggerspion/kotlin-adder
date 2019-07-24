package com.wayfair.servicedemo

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMethod

@RestController
class Controller {
  @RequestMapping("/")
  fun index() = "This is the root!"

  @RequestMapping(value = "/add", method = arrayOf(RequestMethod.POST))
  fun doSum(@RequestBody nums: Nums): Sum {
    val resultSum = Sum (
      result = nums.operand1 + nums.operand2
    )
    return resultSum
  }
}
