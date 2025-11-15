package zxf.java.sensitive.bean;

import com.github.houbb.sensitive.core.api.SensitiveUtil;
import zxf.java.sensitive.bean.model.Order;
import zxf.java.sensitive.bean.model.Product;
import zxf.java.sensitive.bean.model.User;

import java.util.Arrays;

public class SensitiveTests {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("张三");
        user.setId("123456789012345678");
        user.setPassword("123456");
        user.setEmail("abc@163.com");
        user.setAccount1("456-677-8999");
        user.setAccount2("456-677-7887");
        user.setPhone("13812345678");

        System.out.println(SensitiveUtil.desCopy(user).toString());
        System.out.println(SensitiveUtil.desJson(user));

        user.setAdmin(true);
        System.out.println(SensitiveUtil.desCopy(user).toString());
        System.out.println(SensitiveUtil.desJson(user));

        Product product = new Product();
        product.setName("手机");
        product.setPrice(1000);

        Order order = new Order();
        order.setOrderCode("3333333");
        order.setUser(user);
        order.setProducts(Arrays.asList(product));
        System.out.println(SensitiveUtil.desCopy(order).toString());
        System.out.println(SensitiveUtil.desJson(order));
    }
}