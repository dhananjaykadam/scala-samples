package data

import play.api.libs.json._

object JsDemo {
  def transform(json: JsValue): JsValue = json match {
    case JsNumber(value)  => JsNumber(value * value)
    case JsArray(values)  => JsArray(values.map(transform))
    case JsObject(values) => JsObject(values.view.mapValues(transform).toMap)
    case JsNull           => JsString("empty")
    case _                => json
  }
}
