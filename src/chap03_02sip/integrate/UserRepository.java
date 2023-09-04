package chap03_02sip.integrate;

public class UserRepository implements Repository {
    @Override
    public void createUser() {
        // User쪽 관련해서 활용할 로직이 작성됨
    }

    @Override
    public User findUserById(Long id) {
        // User쪽 관련해서 활용할 로직이 작성됨
        return null;
    }

    @Override
    public void createArticle() {
        // 안 쓸건데 구현해야함.
    }

    @Override
    public Article findArticleById(Long id) {
        // 안 쓸건데 구현해야함.
        return null;
    }
}
