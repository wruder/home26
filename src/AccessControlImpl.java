public class AccessControlImpl 
    implements  AccessControl {


        @Override
        public boolean allowAccess(String url, UserType userType) {
            if (userType == UserType.ADMIN) {
                return true;
                //админ имеет доступ ко всем сайтам
            } else if (userType == UserType.USER) {
                return url.startsWith("http;// web-for-user");
                // пользщватель имеет доступ к определенным сайтам
            }
            return false;
        }
    }
