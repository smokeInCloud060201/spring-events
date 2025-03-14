package org.example.springevents.generic;

import lombok.Builder;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

import java.io.Serializable;
import java.util.function.Function;

@Getter
public class GenericEvent<T> extends ApplicationEvent implements Serializable {

    private final T data;

    private final boolean isSuccess;

    private final SerializableFunction<?, ?> callBack;

    private final SerializableFunction<?, ?> success;

    private final SerializableFunction<?, ?> failed;

    @Builder
    public GenericEvent(Object source, T data, boolean success, SerializableFunction<?, ?> callBack,
                        SerializableFunction<?, ?> successCallback, SerializableFunction<?, ?> failedCallback) {
        super(source);
        this.data = data;
        this.isSuccess = success;
        this.callBack = callBack;
        this.success = successCallback;
        this.failed = failedCallback;
    }

    @FunctionalInterface
    public interface SerializableFunction<T, R> extends Function<T, R>, Serializable {
    }
}
