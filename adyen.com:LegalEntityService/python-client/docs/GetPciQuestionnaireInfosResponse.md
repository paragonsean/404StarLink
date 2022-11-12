# GetPciQuestionnaireInfosResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**List[PciDocumentInfo]**](PciDocumentInfo.md) | Information about the signed PCI questionnaires. | [optional] 

## Example

```python
from openapi_client.models.get_pci_questionnaire_infos_response import GetPciQuestionnaireInfosResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetPciQuestionnaireInfosResponse from a JSON string
get_pci_questionnaire_infos_response_instance = GetPciQuestionnaireInfosResponse.from_json(json)
# print the JSON string representation of the object
print(GetPciQuestionnaireInfosResponse.to_json())

# convert the object into a dict
get_pci_questionnaire_infos_response_dict = get_pci_questionnaire_infos_response_instance.to_dict()
# create an instance of GetPciQuestionnaireInfosResponse from a dict
get_pci_questionnaire_infos_response_from_dict = GetPciQuestionnaireInfosResponse.from_dict(get_pci_questionnaire_infos_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


