package springSecurity.practiceSecurity.apiPayload.code.status;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import springSecurity.practiceSecurity.apiPayload.code.BaseErrorCode;
import springSecurity.practiceSecurity.apiPayload.code.dto.ErrorReasonDTO;

@Getter
@AllArgsConstructor
public enum ErrorStatus implements BaseErrorCode {

    // 서버 에러
    _INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "COMMON500", "서버 에러, 관리자에게 문의 바랍니다."),
    _GATEWAY_TIMEOUT(HttpStatus.GATEWAY_TIMEOUT, "COMMON504", "서버 에러, 관리자에게 문의 바랍니다."),

    // 일반 에러
    _BAD_REQUEST(HttpStatus.BAD_REQUEST, "COMMON400", "잘못된 요청입니다."),
    _UNAUTHORIZED(HttpStatus.UNAUTHORIZED, "COMMON401", "인증이 필요합니다."),
    _FORBIDDEN(HttpStatus.FORBIDDEN, "COMMON403", "금지된 요청입니다."),
    _NOT_FOUND(HttpStatus.NOT_FOUND, "COMMON404", "찾을 수 없는 요청입니다."),

    // 유저 관련 에러
    USER_NOT_FOUND(HttpStatus.BAD_REQUEST, "USER4001", "존재하지 않는 사용자입니다."),
    EMAIL_NOT_EXIST(HttpStatus.BAD_REQUEST, "USER4002", "이메일은 필수입니다."),
    EMAIL_INVALID(HttpStatus.BAD_REQUEST, "USER4003", "잘못된 이메일 형식입니다."),
    PASSWORD_NOT_EXIST(HttpStatus.BAD_REQUEST, "USER4004", "비밀번호는 필수입니다."),
    PASSWORD_INVALID(HttpStatus.BAD_REQUEST, "USER4005", "잘못된 비밀번호입니다.");


    private final HttpStatus httpStatus;
    private final String code;
    private final String message;

    @Override
    public ErrorReasonDTO getReason() {
        return ErrorReasonDTO.builder()
                .message(message)
                .code(code)
                .isSuccess(false)
                .build();
    }

    @Override
    public ErrorReasonDTO getReasonHttpStatus(){
        return ErrorReasonDTO.builder()
                .message(message)
                .code(code)
                .isSuccess(false)
                .httpStatus(httpStatus)
                .build();
    }

}
