package zxf.java.sensitive.bean.model;

import com.github.houbb.sensitive.annotation.Sensitive;
import com.github.houbb.sensitive.annotation.SensitiveEntry;
import lombok.Data;

import java.util.List;

@Data
public class Order {
    @Sensitive(strategy = CustomerStrategy.class)
    private String orderCode;

    @SensitiveEntry
    private User user;

    @SensitiveEntry
    private List<Product> products;
}
