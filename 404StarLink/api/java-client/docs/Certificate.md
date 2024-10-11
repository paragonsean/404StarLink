

# Certificate

<p>Describes the full details of an Amazon Lightsail SSL/TLS certificate.</p> <note> <p>To get a summary of a certificate, use the <code>GetCertificates</code> action and ommit <code>includeCertificateDetails</code> from your request. The response will include only the certificate Amazon Resource Name (ARN), certificate name, domain name, and tags.</p> </note>

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**arn** | [**String**](String.md) |  |  [optional] |
|**name** | [**String**](String.md) |  |  [optional] |
|**domainName** | [**String**](String.md) |  |  [optional] |
|**status** | [**CertificateStatus**](CertificateStatus.md) |  |  [optional] |
|**serialNumber** | [**String**](String.md) |  |  [optional] |
|**subjectAlternativeNames** | [**List**](List.md) |  |  [optional] |
|**domainValidationRecords** | [**List**](List.md) |  |  [optional] |
|**requestFailureReason** | [**String**](String.md) |  |  [optional] |
|**inUseResourceCount** | [**Integer**](Integer.md) |  |  [optional] |
|**keyAlgorithm** | [**String**](String.md) |  |  [optional] |
|**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] |
|**issuedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] |
|**issuerCA** | [**String**](String.md) |  |  [optional] |
|**notBefore** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] |
|**notAfter** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] |
|**eligibleToRenew** | [**String**](String.md) |  |  [optional] |
|**renewalSummary** | [**CertificateRenewalSummary**](CertificateRenewalSummary.md) |  |  [optional] |
|**revokedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] |
|**revocationReason** | [**String**](String.md) |  |  [optional] |
|**tags** | [**List**](List.md) |  |  [optional] |
|**supportCode** | [**String**](String.md) |  |  [optional] |



