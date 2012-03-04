package dojo

class MailBox {

  def handleMsg(msg: PingPongMessage) = msg match{
    case Ping => Pong
    case Pong => Ping
    case _ => None
  }

  def receive(msg: Any) = msg match {
    case msg:String => "stopped"
    case ("echo",response) => response
    case msg:PingPongMessage => handleMsg(msg)
  }

}
