# PciSigningResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pci_questionnaire_ids** | **List[str]** | The unique identifiers of the signed PCI documents. | [optional] 
**signed_by** | **str** | The [legal entity ID](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities__resParam_id) of the individual who signed the PCI questionnaire. | [optional] 

## Example

```python
from openapi_client.models.pci_signing_response import PciSigningResponse

# TODO update the JSON string below
json = "{}"
# create an instance of PciSigningResponse from a JSON string
pci_signing_response_instance = PciSigningResponse.from_json(json)
# print the JSON string representation of the object
print(PciSigningResponse.to_json())

# convert the object into a dict
pci_signing_response_dict = pci_signing_response_instance.to_dict()
# create an instance of PciSigningResponse from a dict
pci_signing_response_from_dict = PciSigningResponse.from_dict(pci_signing_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


