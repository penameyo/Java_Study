//package Chapter10;
//
//public class LoginExample {
//    public static void main(String[] args) {
//        try {
//            login("id", "12345");
//            System.out.println();
//        } catch (WrongPasswordException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    //public static void login(String id, String password) throws NotExistsIdException, WrongPasswordException {
//        if (!id.equals("blue")){
//            //throw new NotExistsIdException("아이디가 존재하지 않습니다.");
//        }
//
//        if (!password.equals("12345")) {
//            throw new WrongPasswordException("패스워드가 틀립니다.");
//        }
//    }
//}
