package org.example.springevents.generic;

public interface Action {
    interface CallBack<R, P> {
        R callBack(P payload);
    }

    interface Success<R, P> {
        R onSuccess(P payload);
    }

    interface Failed<R, P> {
        R onFailed(P payload);
    }
}
