package di.constructor03;

public class WriteArticleMgr implements IWriteArticleMgr{
	IArticleDAO articleDAO;
	
	
	public WriteArticleMgr(IArticleDAO articleDAO) {
		super();
		this.articleDAO = articleDAO;
	}
	@Override
	public void write(ArticleDTO article) {
		articleDAO.insert(article);
	}
}
