import play.api.libs.json._

object JsDemo {
  def transform(json: JsValue): JsValue = json match {
    case JsNumber(value) => json
  }
}
JsDemo.transform()
