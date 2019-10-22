import interfaces.Ads;
import interfaces.Products;

//public class DaoFactory {
//    private static Ads adsDao;
//
//    public static Ads getAdsDao() {
//        if (adsDao == null) {
//            adsDao = new ListAdsDao();
//        }
//        return adsDao;
//    }
//}

public class DaoFactory {
    private static ListProducts productsDao;
    private Products productsDao;

    public static Products getProductsDao() {
        if (productsDao == null) {
            productsDao = new ListProducts();
        }
        return productsDao;
    }
}