package com.rhdzmota.webapp

import utest._
import org.querki.jquery._

object AppTest extends TestSuite {

  App.setupUI() // Initialize App

  override def tests = Tests {
    'HelloWorld - {
      assert($("p:contains('Click the button')").length == 1)
    }
  }

}
