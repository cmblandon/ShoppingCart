package co.com.myshopping.certification.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WomenPage {
    public static final Target WOMEN_TAB = Target.the("Women Tab Page").locatedBy("//*[@id='block_top_menu']//a[contains(text(), 'Women')]");
    public static final Target WOMEN_TOP = Target.the("Women Tops").locatedBy("//*[@id='categories_block_left']//a[contains(text(), 'Tops')]");
    public static final Target WOMEN_BLOUSES = Target.the("Women Blouses").locatedBy("//*[@id='subcategories']//a[contains(text(), 'Blouses')]");
    public static final Target PRODUCT = Target.the("Product name ").located(By.className("product_img_link"));
    public static final Target ADD_TO_CART_BUTTON = Target.the("Add to cart button").locatedBy("//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]");
    public static final Target CONTINUE_SHOPPING_BUTTON = Target.the("Continue shopping button").locatedBy("//*[@id='layer_cart']//span[@title='Continue shopping']");
    public static final Target CATALOG_TITLE = Target.the("Catalog title").located(By.className("title_block"));
    public static final Target WOMEN_DRESSES = Target.the("Women dresses").locatedBy("//*[@id='categories_block_left']//a[contains(text(), 'Dresses')]");
    public static final Target WOMEN_EVENING_DRESSES = Target.the("Women evening dress").locatedBy("//*[@id='categories_block_left']//a[contains(text(), 'Evening Dresses')]");
    public static final Target SUBMIT_BUTTON = Target.the("Add to cart main quick view").located(By.id("add_to_cart"));
    public static final Target CART = Target.the("Cart").locatedBy("//*[@id='header']/div//a/b[contains(text(), 'Cart')]");
    public static final Target COUNT_CART_PRODUCTS = Target.the("Count Cart Products").locatedBy("//*[@id='header']//div/a/span[@class='ajax_cart_quantity']");
    public static final Target ORDER_CART_BUTTON = Target.the("Order cart button").located(By.id("button_order_cart"));
    public static final Target PROCEED_TO_CHECKOUT_BUTTON = Target.the("Proceed to checkout button").locatedBy("//*[@id='center_column']//a/span[contains(text(), 'Proceed to checkout')]");
    public static final Target AUTHENTICATION = Target.the("Authentication").locatedBy("//*[@id='create-account_form']/h3[contains(text(),'Create an account')]");
}