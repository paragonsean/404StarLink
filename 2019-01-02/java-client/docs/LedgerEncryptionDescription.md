

# LedgerEncryptionDescription

<p>Information about the encryption of data at rest in an Amazon QLDB ledger. This includes the current status, the key in Key Management Service (KMS), and when the key became inaccessible (in the case of an error).</p> <p>For more information, see <a href=\"https://docs.aws.amazon.com/qldb/latest/developerguide/encryption-at-rest.html\">Encryption at rest</a> in the <i>Amazon QLDB Developer Guide</i>.</p>

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**kmsKeyArn** | [**String**](String.md) |  |  |
|**encryptionStatus** | [**EncryptionStatus**](EncryptionStatus.md) |  |  |
|**inaccessibleKmsKeyDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] |



