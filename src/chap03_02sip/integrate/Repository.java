package chap03_02sip.integrate;

public interface Repository {
    void createUser(); // 유저 정보 적재(생성)
    User findUserById(Long id);

    void createArticle(); // 아티클 정보 적재(생성)
    Article findArticleById(Long id);
}
