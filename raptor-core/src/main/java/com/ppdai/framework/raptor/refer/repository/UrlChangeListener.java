package com.ppdai.framework.raptor.refer.repository;

import com.ppdai.framework.raptor.rpc.URL;

public interface UrlChangeListener {

    void onChange(String key, URL newUrl);
}
