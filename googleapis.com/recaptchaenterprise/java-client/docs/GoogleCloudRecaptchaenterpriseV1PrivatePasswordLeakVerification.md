

# GoogleCloudRecaptchaenterpriseV1PrivatePasswordLeakVerification

Private password leak verification info.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**encryptedLeakMatchPrefixes** | **List&lt;byte[]&gt;** | Output only. List of prefixes of the encrypted potential password leaks that matched the given parameters. They must be compared with the client-side decryption prefix of &#x60;reencrypted_user_credentials_hash&#x60; |  [optional] [readonly] |
|**encryptedUserCredentialsHash** | **byte[]** | Optional. Encrypted Scrypt hash of the canonicalized username+password. It is re-encrypted by the server and returned through &#x60;reencrypted_user_credentials_hash&#x60;. |  [optional] |
|**lookupHashPrefix** | **byte[]** | Optional. Exactly 26-bit prefix of the SHA-256 hash of the canonicalized username. It is used to look up password leaks associated with that hash prefix. |  [optional] |
|**reencryptedUserCredentialsHash** | **byte[]** | Output only. Corresponds to the re-encryption of the &#x60;encrypted_user_credentials_hash&#x60; field. It is used to match potential password leaks within &#x60;encrypted_leak_match_prefixes&#x60;. |  [optional] [readonly] |



