

# IdentificationData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cardNumber** | **String** | The card number of the document that was issued (AU only). |  [optional] |
|**expiryDate** | **String** | The expiry date of the document, in YYYY-MM-DD format. |  [optional] |
|**issuerCountry** | **String** | The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code where the document was issued. For example, **US**. |  [optional] |
|**issuerState** | **String** | The state or province where the document was issued (AU only). |  [optional] |
|**nationalIdExempt** | **Boolean** | Applies only to individuals in the US. Set to **true** if the individual does not have an SSN. To verify their identity, Adyen will require them to upload an ID document. |  [optional] |
|**number** | **String** | The number in the document. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of document, used when providing an ID number or uploading a document. The possible values depend on the legal entity type.  When providing ID numbers: * For **individual**, the &#x60;type&#x60; values can be **driversLicense**, **identityCard**, **nationalIdNumber**, or **passport**.  When uploading documents: * For **organization**, the &#x60;type&#x60; values can be **proofOfAddress**, **registrationDocument**, **taxDocument**, **proofOfOwnership**, or **proofOfIndustry**.   * For **individual**, the &#x60;type&#x60; values can be **identityCard**, **driversLicense**, **proofOfNationalIdNumber**, **proofOfResidency**, or **proofOfIndustry**.  * Use **bankStatement** to upload documents for a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id). |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BANK_STATEMENT | &quot;bankStatement&quot; |
| DRIVERS_LICENSE | &quot;driversLicense&quot; |
| IDENTITY_CARD | &quot;identityCard&quot; |
| NATIONAL_ID_NUMBER | &quot;nationalIdNumber&quot; |
| PASSPORT | &quot;passport&quot; |
| PROOF_OF_ADDRESS | &quot;proofOfAddress&quot; |
| PROOF_OF_NATIONAL_ID_NUMBER | &quot;proofOfNationalIdNumber&quot; |
| PROOF_OF_RESIDENCY | &quot;proofOfResidency&quot; |
| REGISTRATION_DOCUMENT | &quot;registrationDocument&quot; |
| TAX_DOCUMENT | &quot;taxDocument&quot; |
| PROOF_OF_INDUSTRY | &quot;proofOfIndustry&quot; |



