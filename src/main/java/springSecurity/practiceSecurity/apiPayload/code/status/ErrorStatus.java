package springSecurity.practiceSecurity.apiPayload.code.status;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import springSecurity.practiceSecurity.apiPayload.code.BaseErrorCode;
import springSecurity.practiceSecurity.apiPayload.code.dto.ErrorReasonDTO;

@Getter
@AllArgsConstructor
public enum ErrorStatus implements BaseErrorCode {

    _BAD_REQUEST(HttpStatus.BAD_REQUEST, "ERROR400", "400 에러"),
    _UNAUTHORIZED(HttpStatus.UNAUTHORIZED, "ERROR401", "401 에러"),
    _FORBIDDEN(HttpStatus.FORBIDDEN, "ERROR403", "403 에러"),
    _NOT_FOUND(HttpStatus.NOT_FOUND, "ERROR404", "404 에러"),

    _INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "ERROR500", "500 에러"),
    _GATEWAY_TIMEOUT(HttpStatus.GATEWAY_TIMEOUT, "ERROR504", "504 에러");

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;

    @Override
    public ErrorReasonDTO getReason() {
        return ErrorReasonDTO.builder()
                .message(message)
                .code(code)
                .isSuccess(true)
                .build();
    }

    @Override
    public ErrorReasonDTO getReasonHttpStatus(){
        return ErrorReasonDTO.builder()
                .message(message)
                .code(code)
                .isSuccess(true)
                .httpStatus(httpStatus)
                .build();
    }

}
