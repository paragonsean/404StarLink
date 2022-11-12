# PciSigningRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pci_template_references** | **List[str]** | The array of Adyen-generated unique identifiers for the questionnaires. | 
**signed_by** | **str** | The [legal entity ID](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities__resParam_id) of the individual who signs the PCI questionnaire. | 

## Example

```python
from openapi_client.models.pci_signing_request import PciSigningRequest

# TODO update the JSON string below
json = "{}"
# create an instance of PciSigningRequest from a JSON string
pci_signing_request_instance = PciSigningRequest.from_json(json)
# print the JSON string representation of the object
print(PciSigningRequest.to_json())

# convert the object into a dict
pci_signing_request_dict = pci_signing_request_instance.to_dict()
# create an instance of PciSigningRequest from a dict
pci_signing_request_from_dict = PciSigningRequest.from_dict(pci_signing_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


