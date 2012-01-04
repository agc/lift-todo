package com.iciclelab{
package snippet{

import _root_.scala.xml.{NodeSeq}
import com.iciclelab._
import model._

class Util {
  def in(html: NodeSeq) = 
    if (User.loggedIn_?) html else NodeSeq.Empty

  def out(html: NodeSeq) = 
    if (!User.loggedIn_?) html else NodeSeq.Empty
}

}
}
