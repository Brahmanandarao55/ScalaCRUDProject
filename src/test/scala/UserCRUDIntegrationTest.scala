import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class UserCRUDIntegrationTest extends AnyFlatSpec with Matchers {
  "UserCRUD" should "handle a full user lifecycle" in {
    val crud = new UserCRUD
    val user = User(1, "John Doe", "john.doe@example.com")

    // Full lifecycle test
    crud.createUser(user)
    crud.readUser(1) should be(Some(user))
    val updatedUser = user.copy(email = "john.doe@newdomain.com")
    crud.updateUser(updatedUser)
    crud.readUser(1) should be(Some(updatedUser))
    crud.deleteUser(1)
    crud.readUser(1) should be(None)
  }
}
