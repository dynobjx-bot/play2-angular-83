package controllers

import play.api._
import play.api.libs.json.Json
import play.api.mvc._

case class Product(sku: String, title: String)

object Application extends Controller {
  implicit val productWrites = Json.writes[Product]

  def index = Action {
    Ok(views.html.index())
  }

  val products = Seq(
    Product("733733-421", "HP ProLiant DL360p Gen8"),
    Product("7147H2G", "IBM System x x3690 X5"),
    Product("R630-3552", "DELL PowerEdge R630"),
    Product("RX-2280I", "Supermicro RTG RX-2280I"),
    Product("MB449D/A", "Apple Xserve")
  )

  def listProducts = Action {
    Ok(Json.toJson(products))
  }
}