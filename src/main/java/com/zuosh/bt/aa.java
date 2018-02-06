import com.mysql.jdbc.StatementImpl;
import com.sun.btrace.AnyType;
import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.*;

import static com.sun.btrace.BTraceUtils.*;

/**
 * Created by zuoshuai on 2018/2/1.
 */
@BTrace
public class aa {
    @OnMethod(clazz = "com.bst.suit.Main"
            , method = "say", location = @Location(Kind.RETURN))
    public static void say(@Self Object self, String parm, @ProbeMethodName String pmn, @Duration long time) {
//        Class clazz = BTraceUtils.Reflective.classOf(self);
//        int counter = getInt(field(clazz, "counter"), self);
//        println("counter value is " + counter + "    ProbeMethodName is " + pmn);
        println(parm + " [ time:" + time + " ]");
//        println(pmn);
    }

//    @OnMethod(clazz = "com.mysql.jdbc.ConnectionImpl"
//            , method = "/prepare.*/")
//    public static void findUser(@Self Object self, @ProbeMethodName String methodName, @ProbeClassName String className, StatementImpl statement) {
//        if (self != null) {
////            println(str(self));
//            printFields(self);
//        }
//        if (statement != null) {
//            println(statement);
//        }
////        int counter = getInt(field(clazz, "counter"), self);
////        println("counter value is " + counter + "    ProbeMethodName is " + pmn);
//        println("========================over==============================");
//    }

//    @OnMethod(clazz = "com.mysql.jdbc.ConnectionImpl"
//            , method = "/prepare.*/")
//    public static void ConnectionImpl(AnyType[] args, @ProbeClassName String pcn, @ProbeMethodName String pmn) {
//        printArray(args);
//        Threads.jstack();
////        println(pcn + "==>" + pmn);
////        int counter = getInt(field(clazz, "counter"), self);
////        println("counter value is " + counter + "    ProbeMethodName is " + pmn);
//        println("========================ConnectionImpl over==============================");
//    }

    @OnMethod(clazz = "com.alibaba.druid.filter.logging.Log4jFilter"
            , method = "statementLog")
    public static void logTest(String message) {
        if ((Strings.indexOf(message, "executed.") > 0) && (Strings.indexOf(message,"?") < 1)) {
            println(message);
            println("=========================druid sql=========================================");
        }
    }

//    @OnMethod(clazz = "com.mysql.jdbc.ConnectionImpl"
//            , method = "/exec.*/")
//    public static void exec(AnyType[] args, @ProbeClassName String pcn, @ProbeMethodName String pmn) {
//        printArray(args);
//        println(pcn + "==>" + pmn);
////        int counter = getInt(field(clazz, "counter"), self);
////        println("counter value is " + counter + "    ProbeMethodName is " + pmn);
//        println("========================exec over==============================");
//    }

//    @OnMethod(clazz = "+java.sql.Connection", method = "/prepare.*/")
//    public static void onPrepare(AnyType[] args) {
//        printArray(args);
//        println("========================onPrepare over========================");
//    }


//    @OnMethod(clazz = "com.bst.suit.web.action.base.user.UserInfoController"
//            , method = "login", location = @Location(Kind.RETURN))
//    public static void findUser(@Self Object self, @ProbeMethodName String pmn, AnyType[] args, @ProbeClassName String className, @Duration long time) {
//        if (self != null) {
////            println(str(self));
//            printFields(self);
//        }
//        if (args != null) {
////            printArray(args);
//        }
////        int counter = getInt(field(clazz, "counter"), self);
////        println("counter value is " + counter + "    ProbeMethodName is " + pmn);
//        println(className + "=>" + pmn + " [ time:" + time + " ]");
//        println("========================over==============================");
////        println(pmn);
//    }

//    @OnMethod(clazz = "com.bst.suit.http.LoginUserInfoHelper"
//            , method = "getCurrentLoginUser", location = @Location(Kind.RETURN))
//    public static void monitorServices(@Self Object self, @ProbeMethodName String pmn, @ProbeClassName String className, @Duration long time
//            , @Return UserBO userBO) {
//        if (self != null) {
////            println(JSON.toJSONString(self));
//        }
//        if (userBO != null) {
////            println(str(object));
//            printFields(userBO);
//        }
//        println("getCurrentLoginUser:time:" + pmn + "->" + time);
//        println("=============getCurrentLoginUser over ================");
//    }

//    @OnMethod(clazz = "com.bst.suit.web.action.base.user.UserInfoController"
//            , method = "findLoginUser", location = @Location(Kind.RETURN))
//    public static void findWhoCalls(@Self Object self, @ProbeMethodName String pmn, @ProbeClassName String className, @Duration long time
//            , @Return Object object) {
//        if (self != null) {
////            println(JSON.toJSONString(self));
//        }
//        if (object != null) {
//        }
//        println("findLoginUser:time:" + pmn + "->" + time);
//    }

    @OnMethod(clazz = "java.lang.System"
            , method = "gc", location = @Location(Kind.ENTRY))
    public static void onGc() {
        print("SystemGc");
        jstack();
    }


}
