package chap03_02sip.segregrate;

public class ArticleService {
    private ArticleRepositoryInterface repository = new ArticleRepository();

    public void createArticle(){
        repository.createArticle();
    }

    public Article findArticleById(Long id){
        return repository.findArticleById(id);
    }
}
