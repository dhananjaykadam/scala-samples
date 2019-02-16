{}

object @@ {
    def unapply(arg: String): Option[(String, String)] =
      arg.split("@") match {
        case Array(user, domain) => Some((user, domain))
        case _                   => None
      }
  }

def hello(string: String) = string match {
    case user @@ domain => s"Hello $user from $domain"
    case _                 => "can not say hello"
  }

hello("mushtaq@tw.com")
hello("mushtaq@tw.com@asdas")
hello("mushtaq")
