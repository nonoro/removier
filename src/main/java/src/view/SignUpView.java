package src.view;

import src.dto.request.SignUpRequest;
import src.type.MovieGenreCode;
import src.utils.ViewUtil;

public class SignUpView {
    public static final int GENRE_DEFAULT_SIZE = 4;

    public static SignUpRequest signUp() {
        ViewUtil.printMessage("==================================================================");
        ViewUtil.printMessage("============================ 회원가입 ============================");
        ViewUtil.printMessage("==================================================================");

        String id = ViewUtil.input("ID > ");
        String password = ViewUtil.input("PW > ");
        String name = ViewUtil.input("이름 > ");
        String favoriteActor = ViewUtil.input("좋아하는 배우 > ");
        ViewUtil.printMessage("========= 해당하는 번호를 하나 입력하세요 ===========");
        ViewUtil.printMessage(MovieGenreCode.getItems(4));
        ViewUtil.printMessage("=====================================================");
        String favoriteGenre = ViewUtil.input("좋아하는 장르 > ");
        String phoneNumber = ViewUtil.input("연락처 > ");

        return new SignUpRequest(id, password, name, favoriteActor, favoriteGenre, phoneNumber);
//        ViewUtil.printMessage("회원가입이 완료되었습니다."); 성공뷰출력으로 빼기 실패시 아이디중복되었다고하고 다시 가입하라고 뜨기
    }


}
