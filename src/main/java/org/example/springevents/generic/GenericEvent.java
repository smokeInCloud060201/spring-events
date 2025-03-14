package org.example.springevents.generic;

import lombok.Builder;

@Builder
public class GenericEvent<T> {

    private T data;

    private boolean isSuccess;

    private Action.CallBack<?, ?> callBack;

    private Action.Success<?, ?> success;

    private Action.Failed<?, ?> failed;

}
