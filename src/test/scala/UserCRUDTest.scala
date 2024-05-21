import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import usercrud.{User, UserCRUD}


class UserCRUDTest extends AnyFlatSpec with Matchers {
  "UserCRUD" should "create, read, update, and delete users" in {
    val crud = new UserCRUD
    val user = User(1, "John Doe", "john.doe@example.com")

    // Create
    crud.createUser(user)
    crud.readUser(1) should be(Some(user))

    // Update
    val updatedUser = user.copy(name = "Jane Doe")
    crud.updateUser(updatedUser)
    crud.readUser(1) should be(Some(updatedUser))

    // Delete
    crud.deleteUser(1)
    crud.readUser(1) should be(None)
  }

  it should "list all users" in {
    val crud = new UserCRUD
    val user1 = User(1, "John Doe", "john.doe@example.com")
    val user2 = User(2, "Jane Doe", "jane.doe@example.com")

    crud.createUser(user1)
    crud.createUser(user2)

    val users = crud.listUsers()
    users should contain theSameElementsAs List(user1, user2)
  }
}
