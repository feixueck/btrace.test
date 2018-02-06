package com.zuosh.bt;

import com.sun.btrace.annotations.*;
1
import static com.sun.btrace.BTraceUtils.println;

/**
 * Created by zuoshuai on 2018/2/1.
 */
@BTrace
public class Test {
    @OnMethod(clazz = "com.bst.suit.web.action.base.user.UserInfoController"
            , method = "findLoginUser", location = @Location(Kind.RETURN))
    public static void testSay(@Return Object object) {
        println(object.toString());
    }
}
