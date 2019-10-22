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
    private static Ads adsDao;

    // For Products
    public static Products getProductsDao() {
        if (productsDao == null) {
            productsDao = new ListProducts();
        }
        return productsDao;
    }

    // For Ads DAO
    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new ListAdsDao();
        }
        return adsDao;
    }
}

