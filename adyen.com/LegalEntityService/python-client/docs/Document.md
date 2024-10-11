# Document


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachment** | [**Attachment**](Attachment.md) | Object that contains the document. | [optional] 
**attachments** | [**List[Attachment]**](Attachment.md) | Array that contains the document. The array supports multiple attachments for uploading different sides or pages of a document. | 
**creation_date** | **datetime** | The creation date of the document. | [optional] [readonly] 
**description** | **str** | Your description for the document. | 
**expiry_date** | **str** | The expiry date of the document, in YYYY-MM-DD format. | [optional] 
**file_name** | **str** | The filename of the document. | [optional] 
**id** | **str** | The unique identifier of the document. | [optional] [readonly] 
**issuer_country** | **str** | The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code where the document was issued. For example, **US**. | [optional] 
**issuer_state** | **str** | The state or province where the document was issued (AU only). | [optional] 
**modification_date** | **datetime** | The modification date of the document. | [optional] [readonly] 
**number** | **str** | The number in the document. | [optional] 
**owner** | [**OwnerEntity**](OwnerEntity.md) | Contains information about the resource that owns the document. | 
**type** | **str** | Type of document, used when providing an ID number or uploading a document. The possible values depend on the legal entity type.  When providing ID numbers: * For **individual**, the &#x60;type&#x60; values can be **driversLicense**, **identityCard**, **nationalIdNumber**, or **passport**.  When uploading photo IDs: * For **individual**, the &#x60;type&#x60; values can be **identityCard**, **driversLicense**, or **passport**.  When uploading other documents: * For **organization**, the &#x60;type&#x60; values can be **proofOfAddress**, **registrationDocument**, **vatDocument**, **proofOfOrganizationTaxInfo**, **proofOfOwnership**, or **proofOfIndustry**.   * For **individual**, the &#x60;type&#x60; values can be **identityCard**, **driversLicense**, **passport**, **proofOfNationalIdNumber**, **proofOfResidency**, **proofOfIndustry**, or **proofOfIndividualTaxId**.  * For **soleProprietorship**, the &#x60;type&#x60; values can be **constitutionalDocument**, **proofOfAddress**, or **proofOfIndustry**.  * Use **bankStatement** to upload documents for a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id). | 

## Example

```python
from openapi_client.models.document import Document

# TODO update the JSON string below
json = "{}"
# create an instance of Document from a JSON string
document_instance = Document.from_json(json)
# print the JSON string representation of the object
print(Document.to_json())

# convert the object into a dict
document_dict = document_instance.to_dict()
# create an instance of Document from a dict
document_from_dict = Document.from_dict(document_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


