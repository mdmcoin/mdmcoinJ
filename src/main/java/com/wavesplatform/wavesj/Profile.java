package com.wavesplatform.wavesj;

import java.net.URI;
import java.net.URISyntaxException;

public enum Profile {
    MAINNET("https://nodes.mdmcoin.com"),
    TESTNET("https://tstnode.mdmcoin.com"),
    LOCAL("http://127.0.0.1:7879");

    private final URI uri;

    Profile(String url) {
        try {
            this.uri = new URI(url);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public URI uri() {
        return uri;
    }
}
