# IdentificationData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**card_number** | **str** | The card number of the document that was issued (AU only). | [optional] 
**expiry_date** | **str** | The expiry date of the document, in YYYY-MM-DD format. | [optional] 
**issuer_country** | **str** | The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code where the document was issued. For example, **US**. | [optional] 
**issuer_state** | **str** | The state or province where the document was issued (AU only). | [optional] 
**national_id_exempt** | **bool** | Applies only to individuals in the US. Set to **true** if the individual does not have an SSN. To verify their identity, Adyen will require them to upload an ID document. | [optional] 
**number** | **str** | The number in the document. | [optional] 
**type** | **str** | Type of document, used when providing an ID number or uploading a document. The possible values depend on the legal entity type.  When providing ID numbers: * For **individual**, the &#x60;type&#x60; values can be **driversLicense**, **identityCard**, **nationalIdNumber**, or **passport**.  When uploading photo IDs: * For **individual**, the &#x60;type&#x60; values can be **identityCard**, **driversLicense**, or **passport**.  When uploading other documents: * For **organization**, the &#x60;type&#x60; values can be **proofOfAddress**, **registrationDocument**, **vatDocument**, **proofOfOrganizationTaxInfo**, **proofOfOwnership**, or **proofOfIndustry**.   * For **individual**, the &#x60;type&#x60; values can be **identityCard**, **driversLicense**, **passport**, **proofOfNationalIdNumber**, **proofOfResidency**, **proofOfIndustry**, or **proofOfIndividualTaxId**.  * For **soleProprietorship**, the &#x60;type&#x60; values can be **constitutionalDocument**, **proofOfAddress**, or **proofOfIndustry**.  * Use **bankStatement** to upload documents for a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id). | 

## Example

```python
from openapi_client.models.identification_data import IdentificationData

# TODO update the JSON string below
json = "{}"
# create an instance of IdentificationData from a JSON string
identification_data_instance = IdentificationData.from_json(json)
# print the JSON string representation of the object
print(IdentificationData.to_json())

# convert the object into a dict
identification_data_dict = identification_data_instance.to_dict()
# create an instance of IdentificationData from a dict
identification_data_from_dict = IdentificationData.from_dict(identification_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


