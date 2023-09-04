package chap03_02sip.segregrate;

public class UserService {
    private UserRepositoryInterface repository = new UserRepository();

    public void createUser(){
        repository.createUser();
    }

    public User findUserById(Long id){
        return repository.findUserById(id);
    }
}
