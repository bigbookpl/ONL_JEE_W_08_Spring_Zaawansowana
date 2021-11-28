package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.shop.Cart;
import pl.coderslab.shop.CartItem;
import pl.coderslab.shop.Product;

import java.util.Random;

@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired
    Cart cart;

    @RequestMapping("/addtocart")
    @ResponseBody
    public String addtocart() {
        Random rand = new Random();
        cart.addToCart(new CartItem(1, new Product("prod" + rand.nextInt(10), rand.nextDouble())));
        return "addtocart";
    }

    @RequestMapping("/list")
    @ResponseBody
    public String listCartItems() {
        return cart.getCartItemList().toString();
    }

}
