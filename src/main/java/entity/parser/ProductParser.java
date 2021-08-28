package entity.parser;

import entity.Boots;
import entity.Cloth;
import entity.Product;

public class ProductParser {

    public static Product stringToProduct(String productStr, String productType) {
        if (productType.equals("PRODUCT")) {
            return convertToProduct(productStr);
        } else if (productType.equals("CLOTH")) {
            return convertToCloth(productStr);
        } else if (productType.equals("BOOTS")) {
            return convertToBoots(productStr);
        }

        return null;
    }

    private static Boots convertToBoots(String productStr) {
        String [] productInformations = productStr.split(Product.PRODUCT_SEPARATOR);

        Long id = Long.parseLong(productInformations[0]);
        String productName = productInformations[1];
        Float price = Float.parseFloat(productInformations[2]);
        Float weight = Float.parseFloat(productInformations[3]);
        String color = productInformations[4];
        Integer productCount = Integer.parseInt(productInformations[5]);
        Integer size = Integer.parseInt(productInformations[6]);
        Boolean isNaturalSkin = Boolean.parseBoolean(productInformations[7]);

        return new Boots(id, productName, price, weight, color, productCount, size, isNaturalSkin);
    }

    private static Cloth convertToCloth(String productStr) {
        String [] productInformations = productStr.split(Product.PRODUCT_SEPARATOR);

        Long id = Long.parseLong(productInformations[0]);
        String productName = productInformations[1];
        Float price = Float.parseFloat(productInformations[2]);
        Float weight = Float.parseFloat(productInformations[3]);
        String color = productInformations[4];
        Integer productCount = Integer.parseInt(productInformations[5]);
        String size = productInformations[6];
        String material = productInformations[7];

        return new Cloth(id, productName, price, weight, color, productCount, size, material);
    }

    private static Product convertToProduct(String productStr) {
        String [] productInformations = productStr.split(Product.PRODUCT_SEPARATOR);

        Long id = Long.parseLong(productInformations[0]);
        String productName = productInformations[1];
        Float price = Float.parseFloat(productInformations[2]);
        Float weight = Float.parseFloat(productInformations[3]);
        String color = productInformations[4];
        Integer productCount = Integer.parseInt(productInformations[5]);

        return new Product(id, productName, price, weight, color, productCount);
    }
}