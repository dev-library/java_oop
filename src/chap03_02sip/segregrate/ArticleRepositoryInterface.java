package chap03_02sip.segregrate;

public interface ArticleRepositoryInterface {
    void createArticle();
    Article findArticleById(Long id);
}
