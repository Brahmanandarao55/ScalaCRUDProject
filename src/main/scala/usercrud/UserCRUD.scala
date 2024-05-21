package usercrud

case class User(id: Int, name: String, email: String)

class UserCRUD {
  
  private var users: Map[Int, User] = Map()

  def createUser(user: User): Unit = {
    users += (user.id -> user)
  }

  def readUser(id: Int): Option[User] = {
    users.get(id)
  }

  def updateUser(user: User): Unit = {
    users.get(user.id) match {
      case Some(_) => users += (user.id -> user)
      case None    => throw new NoSuchElementException("User not found")
    }
  }

  def deleteUser(id: Int): Unit = {
    users -= id
  }

  def listUsers(): List[User] = {
    users.values.toList
  }
}
