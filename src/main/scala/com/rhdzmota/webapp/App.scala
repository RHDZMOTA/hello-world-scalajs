package com.rhdzmota.webapp

import org.querki.jquery._
import org.scalajs.dom

object App {

  def main(args: Array[String]): Unit = {
    $(() => setupUI())
  }

  def setupUI(): Unit = {
    $("body").append("<p>Click the button.<p>")
    $("#click-me-button").click(() => addClickedMessage())
  }

  def addClickedMessage(): Unit = {
    $("body").append("<p>Hello World!<p>")
  }

}
