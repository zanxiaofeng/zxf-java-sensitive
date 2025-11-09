package zxf.java.sensitive.bean.model;

import com.github.houbb.sensitive.api.ICondition;
import com.github.houbb.sensitive.api.IContext;

public class AdminCondition implements ICondition {
    @Override
    public boolean valid(IContext iContext) {
        User user = (User) iContext.getCurrentObject();
        return !user.isAdmin();
    }
}
