package org.baggerspion.servicedemo

import com.fasterxml.jackson.annotation.JsonCreator

data class Nums @JsonCreator constructor (
  val operand1: Int,
  val operand2: Int
)

data class Sum (
  val result: Int
)
