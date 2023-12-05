@RepositoryRestResource(collectionResourceRel = "users", path = "users")//this will directly communicate with postman to h2 without usercontrollerclass//this is smart and intelligent

http://localhost:8080/users //same users and users
public interface UserRepository extends JpaRepository<WebsiteUser, Long> {

	
}



POST localhost:8080/users  click raw ,json
GET localhost:8080/users


https://youtu.be/UfOxcrxhC0s?si=Z8xMe70mxr3oZOau