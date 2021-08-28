
import api.ProductDao;
import api.UserDao;
import dao.ProductDaoImpl;
import dao.UserDaoImpl;
import entity.Boots;
import entity.Cloth;
import entity.User;
import service.ProductServiceImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        User user = new User(1l, "admin", "admin");
        Cloth cloth = new Cloth(1l, "T-shirt", 35.9f, 0.3f, "Black", 10,"XL", "Cotton");
        Boots boots = new Boots(1l, "High heels", 99.9f, .5f, "Red", 12, 35, true);

        ProductDao productClothDao = new ProductDaoImpl("clothes", "CLOTH");
        productClothDao.saveProduct(cloth);

        ProductDao productBootsDao = new ProductDaoImpl("boots", "BOOTS");
        productBootsDao.saveProduct(boots);

        UserDao userDao = new UserDaoImpl("users");
        userDao.saveUser(user);
    }
}