package com.naya.borisov.method_implicit

import java.time.LocalDateTime

trait Event {
  def index: Int

  def name: String

  def timestamp: LocalDateTime
}
