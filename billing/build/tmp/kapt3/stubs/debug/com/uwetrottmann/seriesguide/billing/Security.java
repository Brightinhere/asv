package com.uwetrottmann.seriesguide.billing;

import java.lang.System;

/**
 * Security-related methods. For a secure implementation, all of this code should be implemented on
 * a server that communicates with the application on the device.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002J\u001e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/uwetrottmann/seriesguide/billing/Security;", "", "()V", "KEY_FACTORY_ALGORITHM", "", "SIGNATURE_ALGORITHM", "generatePublicKey", "Ljava/security/PublicKey;", "encodedPublicKey", "verify", "", "publicKey", "signedData", "signature", "verifyPurchase", "base64PublicKey", "billing_debug"})
public final class Security {
    @org.jetbrains.annotations.NotNull()
    public static final com.uwetrottmann.seriesguide.billing.Security INSTANCE = null;
    private static final java.lang.String KEY_FACTORY_ALGORITHM = "RSA";
    private static final java.lang.String SIGNATURE_ALGORITHM = "SHA1withRSA";
    
    private Security() {
        super();
    }
    
    /**
     * Verifies that the data was signed with the given signature
     *
     * @param base64PublicKey the base64-encoded public key to use for verifying.
     * @param signedData the signed JSON string (signed, not encrypted)
     * @param signature the signature for the data, signed with the private key
     * @throws IOException if encoding algorithm is not supported or key specification
     * is invalid
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    public final boolean verifyPurchase(@org.jetbrains.annotations.NotNull()
    java.lang.String base64PublicKey, @org.jetbrains.annotations.NotNull()
    java.lang.String signedData, @org.jetbrains.annotations.NotNull()
    java.lang.String signature) throws java.io.IOException {
        return false;
    }
    
    /**
     * Generates a PublicKey instance from a string containing the Base64-encoded public key.
     *
     * @param encodedPublicKey Base64-encoded public key
     * @throws IOException if encoding algorithm is not supported or key specification
     * is invalid
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    private final java.security.PublicKey generatePublicKey(java.lang.String encodedPublicKey) throws java.io.IOException {
        return null;
    }
    
    /**
     * Verifies that the signature from the server matches the computed signature on the data.
     * Returns true if the data is correctly signed.
     *
     * @param publicKey public key associated with the developer account
     * @param signedData signed data from server
     * @param signature server signature
     * @return true if the data and signature match
     */
    private final boolean verify(java.security.PublicKey publicKey, java.lang.String signedData, java.lang.String signature) {
        return false;
    }
}