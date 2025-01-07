package springSecurity.practiceSecurity.apiPayload.code;

import springSecurity.practiceSecurity.apiPayload.code.dto.ErrorReasonDTO;

public interface BaseErrorCode {
    ErrorReasonDTO getReason();
    ErrorReasonDTO getReasonHttpStatus();
}
