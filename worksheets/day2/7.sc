
{}

sealed trait Json

case class JsonArray(values: List[Json]) extends Json
case class JsonObject(values: Map[String, Json]) extends Json

case class JsonString(value: String) extends Json
case class JsonNumber(value: Double) extends Json

abstract class JsonBoolean(val value: Boolean) extends Json
case object JsonTrue extends JsonBoolean(true)
case object JsonFalse extends JsonBoolean(false)

case object JsonNull extends Json
