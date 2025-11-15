package zxf.java.sensitive.bean.model;

import com.github.houbb.sensitive.annotation.Sensitive;
import com.github.houbb.sensitive.annotation.strategy.SensitiveStrategyMaskAll;
import com.github.houbb.sensitive.core.api.strategory.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class User {
    @Sensitive(strategy = StrategyChineseName.class)
    private String username;

    @Sensitive(strategy = StrategyIdNo.class, condition = AdminCondition.class)
    private String id;

    @Sensitive(strategy = StrategyPassword.class)
    private String password;

    @Sensitive(strategy = StrategyPhone.class)
    private String phone;

    @Sensitive(strategy = StrategyEmail.class)
    private String email;

    @SensitiveStrategyMaskAll
    private String account1;

    @Sensitive(strategy = StrategyMaskAll.class)
    private String account2;

    private boolean admin;
}
