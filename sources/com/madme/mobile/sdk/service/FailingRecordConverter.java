package com.madme.mobile.sdk.service;

import java.util.List;

public interface FailingRecordConverter<T> {
    boolean onConvertFailingRecord(long j, byte[] bArr, List<T> list);
}
