# PciDocumentInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **datetime** | The date the questionnaire was created, in ISO 8601 extended format. For example, 2022-12-18T10:15:30+01:00 | [optional] 
**id** | **str** | The unique identifier of the signed questionnaire. | [optional] 
**valid_until** | **datetime** | The expiration date of the questionnaire, in ISO 8601 extended format. For example, 2022-12-18T10:15:30+01:00 | [optional] 

## Example

```python
from openapi_client.models.pci_document_info import PciDocumentInfo

# TODO update the JSON string below
json = "{}"
# create an instance of PciDocumentInfo from a JSON string
pci_document_info_instance = PciDocumentInfo.from_json(json)
# print the JSON string representation of the object
print(PciDocumentInfo.to_json())

# convert the object into a dict
pci_document_info_dict = pci_document_info_instance.to_dict()
# create an instance of PciDocumentInfo from a dict
pci_document_info_from_dict = PciDocumentInfo.from_dict(pci_document_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


