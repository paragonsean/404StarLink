# GetPciQuestionnaireResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **str** | The generated questionnaire in a base64 encoded format. | [optional] 
**created_at** | **datetime** | The date the questionnaire was created, in ISO 8601 extended format. For example, 2022-12-18T10:15:30+01:00 | [optional] 
**id** | **str** | The unique identifier of the signed questionnaire. | [optional] 
**valid_until** | **datetime** | The expiration date of the questionnaire, in ISO 8601 extended format. For example, 2022-12-18T10:15:30+01:00 | [optional] 

## Example

```python
from openapi_client.models.get_pci_questionnaire_response import GetPciQuestionnaireResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetPciQuestionnaireResponse from a JSON string
get_pci_questionnaire_response_instance = GetPciQuestionnaireResponse.from_json(json)
# print the JSON string representation of the object
print(GetPciQuestionnaireResponse.to_json())

# convert the object into a dict
get_pci_questionnaire_response_dict = get_pci_questionnaire_response_instance.to_dict()
# create an instance of GetPciQuestionnaireResponse from a dict
get_pci_questionnaire_response_from_dict = GetPciQuestionnaireResponse.from_dict(get_pci_questionnaire_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


