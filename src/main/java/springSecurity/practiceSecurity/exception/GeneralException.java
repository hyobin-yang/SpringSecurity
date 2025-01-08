package springSecurity.practiceSecurity.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import springSecurity.practiceSecurity.apiPayload.code.BaseErrorCode;
import springSecurity.practiceSecurity.apiPayload.code.dto.ErrorReasonDTO;

@Getter
@AllArgsConstructor
public class GeneralException extends RuntimeException{

    private BaseErrorCode code;

    public ErrorReasonDTO getErrorReason(){
        return this.code.getReason();
    }

    public ErrorReasonDTO getErrorReasonHttpStatus(){
        return this.code.getReasonHttpStatus();
    }
}
