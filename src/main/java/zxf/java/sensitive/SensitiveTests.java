package zxf.java.sensitive;

import com.github.houbb.sensitive.core.api.SensitiveUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class SensitiveTests {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("张三");
        user.setIdCard("123456789012345678");
        user.setPassword("123456");
        user.setPhone("13812345678");

        log.info("User: {}", user);
        System.out.println(SensitiveUtil.desCopy(user).toString());

        user.setAdmin(true);
        log.info("User: {}", user);
        System.out.println(SensitiveUtil.desCopy(user).toString());

        Product product = new Product();
        product.setName("手机");
        product.setPrice(1000);

        Order order = new Order();
        order.setOrderCode("3333333");
        order.setUser(user);
        order.setProducts(Arrays.asList(product));
        log.info("Order: {}", order);
        System.out.println(SensitiveUtil.desCopy(order).toString());
    }
}