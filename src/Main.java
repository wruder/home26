import java.util.logging.Filter;

public class Main {

    public static void main(String[] args) {
        //создаем пользователя
        Person user1 = new Person("Madlen", 25, UserType.USER);
        Person admin1 = new Person("Alex", 30, UserType.ADMIN);
        //фильтр
        AccessControl accessControl = new AccessControlImpl();

        //проверка доступа
        String[] urls = {
                "http://web-for-user/resourse1",
                "http://example.com/resourse"
        };
        for (String url : urls) {
            System.out.println(user1.getName() +  "(" +  user1.getUserType().getRoleName()+
                    "(trying to access"+url+":"+accessControl.allowAccess(url,user1.getUserType()));
            System.out.println(admin1.getName() + "("+admin1.getUserType().getRoleName() +
                  "(trying to access"+url+":"+ accessControl.allowAccess(url, admin1.getUserType()));

        }

    }


}
