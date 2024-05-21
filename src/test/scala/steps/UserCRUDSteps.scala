package steps

import io.cucumber.scala.{EN, ScalaDsl}
import org.scalatest.matchers.should.Matchers
import usercrud.{User, UserCRUD}

class UserCRUDSteps extends ScalaDsl with EN with Matchers {

  var userCRUD: UserCRUD = _
  var user: User = _

  Given("""a new user with id {int}, name {string}, and email {string}""") { (id: Int, name: String, email: String) =>
    user = User(id, name, email)
    userCRUD = new UserCRUD
  }

  Given("""an existing user with id {int}, name {string}, and email {string}""") { (id: Int, name: String, email: String) =>
    user = User(id, name, email)
    userCRUD = new UserCRUD
    userCRUD.createUser(user)
  }

  When("""the user is added to the system""") { () =>
    userCRUD.createUser(user)
  }

  When("""the user's name is changed to {string}""") { (newName: String) =>
    user = user.copy(name = newName)
    userCRUD.updateUser(user)
  }

  When("""the user is removed from the system""") { () =>
    userCRUD.deleteUser(user.id)
  }

  Then("""the system should contain the user with id {int}""") { (id: Int) =>
    userCRUD.readUser(id) should not be empty
  }

  Then("""the system should contain the user with id {int} and name {string}""") { (id: Int, name: String) =>
    val userOpt = userCRUD.readUser(id)
    userOpt should not be empty
    userOpt.get.name should be(name)
  }

  Then("""the system should not contain the user with id {int}""") { (id: Int) =>
    userCRUD.readUser(id) should be(empty)
  }
}
