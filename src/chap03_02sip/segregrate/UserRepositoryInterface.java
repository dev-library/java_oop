package chap03_02sip.segregrate;

public interface UserRepositoryInterface {
    void createUser();
    User findUserById(Long id);
}
