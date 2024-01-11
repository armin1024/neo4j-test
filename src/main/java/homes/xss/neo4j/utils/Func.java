package homes.xss.neo4j.utils;

import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.Collection;

public class Func {

    /**
     * 判断对象是否为空
     *
     * @param value 对象
     * @return true-空；false-非空
     */
    public static boolean isEmpty(Object value) {
        if (value != null) {
            if (value instanceof Collection) {
                Collection<?> collection = (Collection<?>) value;
                return CollectionUtils.isEmpty(collection);
            } else if (value instanceof String) {
                return StringUtils.isEmpty(value);
            }
            return false;
        }
        return true;
    }

    /**
     * 对象非空判断
     *
     * @param value 对象
     * @return true-非空；false-空
     */
    public static boolean isNotEmpty(Object value) {
        return !isEmpty(value);
    }
}
