package controllers

import play.api.mvc.{Action, Controller}

/**
  * Created by Lenovo on 2/18/2017.
  */
object Contacts extends Controller{
  def index  = Action{
    val names = List("Divya","Kavya","Oviya","pavya")
    Ok(views.html.index("hello world again..", names))
  }
  def create = TODO
  def edit(id:Long) = TODO
  def update(id:Long) = TODO
  def delete(id:Long) = TODO

}
