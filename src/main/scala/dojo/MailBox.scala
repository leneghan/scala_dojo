package dojo

class MailBox {

  def handleMsg(msg: PingPongMessage) = msg match{
    case _ => None
  }

  def receive(msg: Any) = None

}
