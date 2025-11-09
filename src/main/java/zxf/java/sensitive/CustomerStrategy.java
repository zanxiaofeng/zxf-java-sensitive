package zxf.java.sensitive;

import com.github.houbb.sensitive.api.IContext;
import com.github.houbb.sensitive.api.IStrategy;

public class CustomerStrategy implements IStrategy {
    @Override
    public Object des(Object original, IContext iContext) {
        String value = (String) original;
        return value.substring(0, 3) + "***" + value.substring(value.length() - 3);
    }
}
